/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project;

import static com.mycompany.project.StationCoordinatesMap.getRandomNumber;
import generated.grpc.railwayservice1.PositionResponse;
import generated.grpc.railwayservice1.RailwayService1Grpc.RailwayService1ImplBase;
import generated.grpc.railwayservice1.StationRequest;
import generated.grpc.railwayservice1.StatusResponse;
import generated.grpc.railwayservice1.StatusResponse.TrainStatus;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

/**
 *
 * @author alvar
 */
public class Service1 extends RailwayService1ImplBase{
    
    private static final Logger logger = Logger.getLogger(Service1.class.getName());

    public static void main(String[] args) {

        Service1 server1 = new Service1();

        int port = 50051;

        try {
            Server server = ServerBuilder.forPort(port)
                    .addService(server1)
                    .build()
                    .start();
            logger.info("Server1 started, listening on " + port);
            System.out.println("***** Server1 started, listening on" + port);
            server.awaitTermination();

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();

        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
    
    
     /*
     * UNARY
     * for a specific train get the status in that location right now
     * @param responseObserver - response to the client is return via this
     * object
     * @return
     */
    @Override
    public void trainStatus(StationRequest request, StreamObserver<StatusResponse> responseObserver) {
        
        int randomStatus = getRandomNumber();
        TrainStatus status = null;
        
        switch (randomStatus) {  
            case 0:
                status = TrainStatus.DELAYED;
                break;

            case 1:
                status = TrainStatus.ON_TIME;
                break;

            case 2:
                status = TrainStatus.CANCELLED;
                break;

            case 3:
                status = TrainStatus.ARRIVED;
                break;  

        }
        
             
       StatusResponse response = StatusResponse.newBuilder().setTrainStatus(status).build();
       responseObserver.onNext(response);
       responseObserver.onCompleted();
       
       /*TemperatureLocationMap tlm = new TemperatureLocationMap();
        // gets all the temperatures recorded for the location and returns the first one on the list
        Double tempResponse = tlm.getCurrentTemperatureByLocation(request.getLocation());
       Temperature temperature = Temperature.newBuilder().setTempValue(tempResponse).build();
        response.onNext(temperature);
        response.onCompleted();*/
        
      
    }
    
     /*
     * ServerSTREAMING
     * for a specific train get a stream of updates on the current positioning in GPS coordinates
     * @param request
     * @param response
     */
    
    public void monitorPositioning(StationRequest request, StreamObserver<PositionResponse> responseObserver){
        
        try{
            
            /*try {
               Thread.sleep(10000);
            } catch (InterruptedException e) {
               e.printStackTrace();
            }*/ // with this wait we can see the exxception created StatusRuntimeException
        
            StationCoordinatesMap stm = new StationCoordinatesMap();

            List<String> coorResponse = stm.getAllCoordinatesByDestination(request.getTrainStation());

            Iterator<String> i = coorResponse.iterator();
            while (i.hasNext()){
                String msg = request.getTrainStation();
                String gps = i.next();
                PositionResponse gps_message = PositionResponse
                                                .newBuilder()
                                                .setGpsCoordinates(gps)
                                                .setMessage(msg)
                                                .build();
                
                responseObserver.onNext(gps_message);
                try {	
                    Thread.sleep(100);//wait for a second
		} catch (InterruptedException e) {
                    e.printStackTrace();
                }    
            }
            responseObserver.onCompleted();
            
        }catch (Exception e){
            System.err.println("Server error: ");
        }
    }
        
   /*   monitorTheTemperature(Location request, StreamObserver<Temperature> response)  
        TemperatureLocationMap tlm = new TemperatureLocationMap();

        // the TemperatureLocationMap returns a list of values for the requested location
        // the server returns these as a stream to the client
    
        List<Double> tempResponse = tlm.getAllTemperaturesByLocation(request.getLocation());
        Iterator<Double> i = tempResponse.iterator();
        while (i.hasNext()) {
            Double value = i.next();
            Temperature temperature = Temperature.newBuilder().setTempValue(value).build();
            response.onNext(temperature);
        }
        response.onCompleted();*/
    
}
