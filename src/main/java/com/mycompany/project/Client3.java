/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project;

import generated.grpc.railwayservice3.FailureRequest;
import generated.grpc.railwayservice3.FailureResponse;
import generated.grpc.railwayservice3.RailwayService3Grpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import java.time.LocalTime;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alvar
 */
public class Client3 {
    
    private static RailwayService3Grpc.RailwayService3Stub asyncStub;
    private static RailwayService3Grpc.RailwayService3BlockingStub syncStub;

    public Client3(){
                ManagedChannel channel = ManagedChannelBuilder
                .forAddress("localhost", 50051)
                .usePlaintext()
                .build();

        //non-blocking stub is for asynchronous calls
        //client does not wait for server to complete before starting to read responses
        //must use non-blocking stub for client streaming and bidirectional streaming
        //can also use for Server Streaming asynchronously 
        asyncStub = RailwayService3Grpc.newStub(channel);
        syncStub= RailwayService3Grpc.newBlockingStub(channel);
    
        
        //getFailureReport();
    }
    
    
    public StreamObserver<FailureRequest> getFailureReport(StreamObserver<FailureResponse> responseObserver){
        
        responseObserver = new StreamObserver<FailureResponse>() {
             
                public void onNext(FailureResponse response){
                   System.out.println(LocalTime.now().toString() + " FailureID " + response.getFailureID() 
                           + " Action " + response.getMaintenCall() + "\n" + response.getEmergencyCall());
                }
                
                @Override
                public void onError(Throwable t) {
                    t.printStackTrace();
                }

                @Override
                public void onCompleted() {
                    System.out.println(LocalTime.now().toString() + ": stream is completed.");
                }
        };
        
        StreamObserver<FailureRequest> requestObserver = asyncStub.failureReport(responseObserver);
        //FailureRequest.Severity.LOW
        /*try{
            /*requestObserver.onNext(Location.newBuilder().setLocation("Monkey House").build());
            request.onNext(FailureRequest.newBuilder()
                    .setDescription("Heating")
                    .setLocation("Bray Station")
                    .setTrainID("58741")
                    .setSeverity(FailureRequest.Severity.LOW)
                    .build());
        
            Thread.sleep(1000);
            
            request.onNext(FailureRequest.newBuilder()
                    .setDescription("Route Obstruction")
                    .setLocation("Rosslare Station")
                    .setTrainID("87452")
                    .setSeverity(FailureRequest.Severity.CRITICAL)
                    .build());
            
            request.onCompleted();
        
            
            
            
        } catch (RuntimeException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        return requestObserver;
    }
    
    public static void main(String[] args) {
        Client3 client3 = new Client3();
    }
      
}
