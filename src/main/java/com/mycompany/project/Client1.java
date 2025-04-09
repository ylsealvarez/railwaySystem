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

    private static final Logger logger = Logger.getLogger(Client1.class.getName());
    private static RailwayService1Stub asyncStub;
    private static RailwayService1BlockingStub syncStub;
    ManagedChannel channel;

    public Client1(){
        
                channel = ManagedChannelBuilder
                .forAddress("localhost", 50051) 
                .usePlaintext()
                .build();

        //non-blocking stub is for asynchronous calls
        //client does not wait for server to complete before starting to read responses
        //must use non-blocking stub for client streaming and bidirectional streaming
        //can also use for Server Streaming asynchronously 
        asyncStub = RailwayService1Grpc.newStub(channel);
        syncStub= RailwayService1Grpc.newBlockingStub(channel);
        
        //getTrainStatus();
        //getMonitorPositioning();
        
    }
    
        /*private static void getTrainStatus() {
            //StationRequest request, StreamObserver<StatusResponse> response
            System.out.println("Unary - getTrainStatus ");
            StationRequest train = StationRequest.newBuilder().setTrainStation("Connolly Station").build();
            StatusResponse response = syncStub.trainStatus(train);
            System.out.print(LocalTime.now().toString() + " " + "Train to " + train.getTrainStation());
            System.out.println(" is " + response.getTrainStatus() + "\n");
            
            //Location request = Location.newBuilder().setLocation("Cafeteria").build();
            //Temperature response = syncStub.currentTemperature(request);
            //System.out.println("Client received " + response.getTempValue() + "for Cafeteria");
        }*/
        
        public StatusResponse getTrainStatus(String trainStation, int trainID) {
            
            String value1 = trainStation;
            int value2 = trainID;
            StationRequest req = StationRequest.newBuilder().setTrainStation(value1).setTrainID(value2).build();
            StatusResponse response = syncStub.trainStatus(req);
            System.out.print(LocalTime.now().toString() + " " + "Train to " + req.getTrainStation() + " and TrainID ");
            System.out.println(" is " + response.getTrainStatus() + "\n");
            
            
            return response; 
        }
        
        public Iterator<PositionResponse> getMonitorPositioning(String trainStation, int trainID) {
            
            StationRequest train = StationRequest.newBuilder().setTrainStation(trainStation).setTrainID(trainID).build();
            
            Iterator<PositionResponse> responses = null;
            try{          
                responses = syncStub.withDeadlineAfter(2, TimeUnit.SECONDS).monitorPositioning(train); //Timeout example
                
            } catch (StatusRuntimeException e) {
                logger.log(Level.WARNING, "RPC failed: {0}",e.getStatus());
                return null;
        
            }
        return responses;
            
        }
            
            /*private static void getMonitorPositioning() {
            
            System.out.println("Server Streaming Synchronous - getMonitorPositioning ");
            
            try{
            
                StationRequest train = StationRequest.newBuilder().setTrainStation("Connolly Station").build();

                Iterator<PositionResponse> gpss = syncStub.monitorPositioning(train);
                
                while (gpss.hasNext()){
                    Thread.sleep(10);
                    PositionResponse gps_message = gpss.next();
                    System.out.print(LocalTime.now().toString() + " The train with destination " + gps_message.getMessage());
                    System.out.println(" is arriving at " + gps_message.getGpsCoordinates());
                }
            } catch (RuntimeException e) {
                e.printStackTrace();
            } catch(InterruptedException e){
                e.printStackTrace();
            }*/            
            
        
    public static void main(String[] args) {
        
        Client1 client1 = new Client1();
        
        String trainStation = "Connolly Station";
        int trainID = 2525;
        
        //client1.getTrainStatus("Connolly Station");
    }

}
