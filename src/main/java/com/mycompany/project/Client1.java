/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project;

import generated.grpc.railwayservice1.PositionResponse;
import generated.grpc.railwayservice1.RailwayService1Grpc;
import generated.grpc.railwayservice1.RailwayService1Grpc.RailwayService1BlockingStub;
import generated.grpc.railwayservice1.RailwayService1Grpc.RailwayService1Stub;
import generated.grpc.railwayservice1.StationRequest;
import generated.grpc.railwayservice1.StatusResponse;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import java.time.LocalTime;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alvar
 */
public class Client1 {

    
    private static final Logger logger = Logger.getLogger(Client1.class.getName());/// buscar de donde saque esto
    private static RailwayService1Stub asyncStub;
    private static RailwayService1BlockingStub syncStub;
    ManagedChannel channel;

    public Client1() throws InterruptedException{
        
                channel = ManagedChannelBuilder
                .forAddress("localhost", 50051) 
                .usePlaintext()
                .build();
                      
        String jwt = getJwt();
        BearerToken token = new BearerToken(getJwt());


        asyncStub = RailwayService1Grpc.newStub(channel); //non-blocking stub is for asynchronous calls
        syncStub= RailwayService1Grpc.newBlockingStub(channel)
                .withCallCredentials(token); 
    }
           
    public StatusResponse getTrainStatus(String trainStation, int trainID) {
        String value1 = trainStation;
        int value2 = trainID;

        StationRequest req = StationRequest.newBuilder()
                .setTrainStation(value1)
                .setTrainID(value2)
                .build();
        StatusResponse response = syncStub.trainStatus(req);
        System.out.print(LocalTime.now().toString() + " " + "Train to " + req.getTrainStation() + " and TrainID ");
        System.out.println(" is " + response.getTrainStatus() + "\n");

        return response; 
    }
        
    public Iterator<PositionResponse> getMonitorPositioning(String trainStation, int trainID) {

        StationRequest train = StationRequest.newBuilder()
                .setTrainStation(trainStation)
                .setTrainID(trainID)
                .build();

        Iterator<PositionResponse> responses = null;
        try{          
            responses = syncStub.withDeadlineAfter(2, TimeUnit.SECONDS).monitorPositioning(train); //Timeout example

        } catch (StatusRuntimeException e) {
            logger.log(Level.WARNING, "RPC failed: {0}",e.getStatus());
            return null;

        }
    return responses;

    }
            
    // method used for AUTHENTICATION implementation
    private static String getJwt() {
        return Jwts.builder()
                .setSubject("ylsealvarez") // client's identifier
                .signWith(SignatureAlgorithm.HS256, Constants.JWT_SIGNING_KEY)
                .compact();
    }        
        
    public static void main(String[] args) throws InterruptedException {
        
        Client1 client1 = new Client1();
        
        String trainStation = "Connolly Station";
        int trainID = 2525;
       
    }

 
    


}
