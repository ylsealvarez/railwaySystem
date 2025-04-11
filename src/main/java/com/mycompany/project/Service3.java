/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project;

import static com.mycompany.project.FailuresMap.getRandomFailureID;
import generated.grpc.railwayservice3.FailureRequest;
import generated.grpc.railwayservice3.FailureResponse;
import generated.grpc.railwayservice3.RailwayService3Grpc.RailwayService3ImplBase;
import io.grpc.Context;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import java.io.IOException;
import java.time.LocalTime;
import java.util.logging.Logger;

/**
 *
 * @author alvar
 */
public class Service3 extends RailwayService3ImplBase{
        private static final Logger logger = Logger.getLogger(Service3.class.getName());

    public static void main(String[] args) {

        Service3 server3 = new Service3();

        int port = 50053;

        try {
            Server server = ServerBuilder.forPort(port)
                    .addService(server3)
                    .build()
                    .start();
            logger.info("Server3 started, listening on " + port);
            System.out.println("***** Server3 started, listening on" + port + "\n");
            server.awaitTermination();

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();

        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
    // BI-DI for each reported failure or incident, a report with an emergency call-out or maintenance schedule is generated.
 
        
    public StreamObserver<FailureRequest> failureReport(StreamObserver<FailureResponse> responseObserver) {
        Context.Key<String> clientId = Constants.CLIENT_ID_CONTEXT_KEY;
        System.out.println("Processing request from " + clientId);

        return new StreamObserver<FailureRequest>(){

            FailuresMap fm = new FailuresMap();  

            @Override
            public void onNext(FailureRequest request) {

            int failureID = getRandomFailureID();
            System.out.println("Report received from TrainID: " + request.getTrainID() 
                    + " passing by " + request.getLocation() 
                    + ", Failure/Incident " + request.getDescription()
                    + ", Severity " + request.getSeverity());
           
                switch(request.getSeverity()){
                    case LOW:
                    case MEDIUM:
                        String theActions = (String) fm.getCalls(request.getDescription());
                        FailureResponse response = FailureResponse.newBuilder().setFailureID(failureID)
                                                .setMaintenCall(theActions).setEmergencyCall("").build();
                        responseObserver.onNext(response);
                        System.out.println("FailureID " + failureID + " Action: " + theActions + "\n");
                        break;

                    case HIGH:
                    case CRITICAL:
                        String theAction = (String) fm.getCalls(request.getDescription());
                        FailureResponse response1 = FailureResponse.newBuilder().setFailureID(failureID)
                                .setMaintenCall(theAction).setEmergencyCall("Emergency officials have been called in").build();
                        responseObserver.onNext(response1);
                        System.out.println("FailureID " + failureID + " Action: " + theAction);
                        System.out.println("Emergency officials have been called in\n");
                        break;
                }    
            }

            @Override
            public void onError(Throwable t) {
                // TODO Auto-generated method stub
            }

            @Override
            // when there are no more messages coming from the client( the client calls onCompleted() on the message stream ) ,
            // calculate the average, 
            // create the response and send to the client via  responseObserver.onNext()
            // as the server is only going to send one response, it also does responseObserver.onCompleted() 

            public void onCompleted() {
                System.out.printf(LocalTime.now().toString() + ": Message stream complete \n");
                // the server signals that it is finished
                responseObserver.onCompleted();
            }  
        }; 
    }
}
