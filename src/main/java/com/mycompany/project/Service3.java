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
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/**
 * Service 3 - "Failures Information System"
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
            System.out.println("***** Server3 started, listening on " + port + "\n");
            
            //  to ensure clean shutting down of the server
            Runtime.getRuntime().addShutdownHook(new Thread(() -> {
                System.err.println("Shutting down gRPC server");
                try {
                    server.shutdown().awaitTermination(20, TimeUnit.SECONDS);
                } catch (InterruptedException e) {
                    e.printStackTrace(System.err);
                }
            }));
            
            server.awaitTermination();

        } catch (IOException | InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
    /*BI-DIrectional Streaming 
    * for each reported failure or incident, a report with an emergency or maintenance call is generated.
    * @param request
    * @param responseObserver
    */
 
        
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
           
                // depends on the severity, the emergency call might be sent or not
                switch(request.getSeverity()){
                    case LOW:
                    case MEDIUM:
                        String theActions = (String) fm.getCalls(request.getDescription());
                        FailureResponse response = FailureResponse.newBuilder().setFailureID(failureID)
                                                .setMaintenCall(theActions).setEmergencyCall("None").build();
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
            public void onCompleted() {
                System.out.printf(LocalTime.now().toString() + ": Message stream complete \n");
                // the server signals that it is finished
                responseObserver.onCompleted();
            }  
        }; 
    }
}
