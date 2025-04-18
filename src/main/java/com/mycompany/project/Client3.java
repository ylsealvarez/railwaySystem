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
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;


/**
 * This class defines the 3rd Service about "Failures Information System"
 * a Bi-Directional method is implemented
 * @author alvar
 */
public class Client3 {
    
    private static RailwayService3Grpc.RailwayService3Stub asyncStub;
    private static RailwayService3Grpc.RailwayService3BlockingStub syncStub;

    public Client3(){
                ManagedChannel channel = ManagedChannelBuilder
                .forAddress("localhost", 50053)
                .usePlaintext()
                .build();
                
        String jwt = getJwt();
        BearerToken token = new BearerToken(getJwt());
          
        asyncStub = RailwayService3Grpc.newStub(channel)
                .withCallCredentials(token); //non-blocking stub is for asynchronous calls
        syncStub= RailwayService3Grpc.newBlockingStub(channel);
    
    }
    
    /*
    * BI-DIrectional 
    * for each reported failure or incident, a report with an emergency or maintenance call is generated.
    * rpc FailureReport(stream FailureRequest) returns (stream FailureResponse) {}
    */
    public StreamObserver<FailureRequest> getFailureReport(StreamObserver<FailureResponse> responseObserver){
        System.out.println("Bi-Directional Streaming - requestFailureReport ");
        
        return asyncStub.failureReport(responseObserver);

    }
    
    // method used for AUTHENTICATION implementation
    private static String getJwt() {
        return Jwts.builder()
                .setSubject("ylsealvarez") // client's identifier
                .signWith(SignatureAlgorithm.HS256, Constants.JWT_SIGNING_KEY)
                .compact();
    } 

    
    public static void main(String[] args) {
        Client3 client3 = new Client3();
    }
      
}

