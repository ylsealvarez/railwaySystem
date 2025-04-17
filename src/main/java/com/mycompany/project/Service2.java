/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project;

import static com.mycompany.project.StationCoordinatesMap.getRandomID;
import generated.grpc.railwayservice2.AvailabilityResponse;
import generated.grpc.railwayservice2.BookingRequest;
import generated.grpc.railwayservice2.RailwayService2Grpc.RailwayService2ImplBase;
import generated.grpc.railwayservice2.SeatBookingRequest;
import generated.grpc.railwayservice2.SeatBookingResponse;
import io.grpc.Context;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import java.io.IOException;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/**
 *
 * @author alvar
 */
public class Service2 extends RailwayService2ImplBase{
    
    private static final Logger logger = Logger.getLogger(Service2.class.getName());

    public static void main(String[] args) {
        Service2 server2 = new Service2();
        int port = 50052;

        try {
            Server server = ServerBuilder.forPort(port)
                    .addService(server2)
                    .build()
                    .start();
            
            logger.info("Server2 started, listening on " + port);
            System.out.println("***** Server2 started, listening on " + port);
            
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
        
    
    /*// ClientStreaming- the availability on trains is obtained after the control of each passenger
    */ 
    
    public StreamObserver<BookingRequest> passengersBooking(StreamObserver<AvailabilityResponse> responseObserver){
        Context.Key<String> clientId = Constants.CLIENT_ID_CONTEXT_KEY;
        System.out.println("Processing request from " + clientId);
        
        return new StreamObserver<BookingRequest>(){
            
            ArrayList<BookingRequest> passlist = new ArrayList();
            
            @Override
            // when a new number arrives , put it into the array
            public void onNext(BookingRequest request) {
                BookingRequest book = BookingRequest.newBuilder()
                                    .setPassengerID(request.getPassengerID())
                                    .setBookingID(request.getBookingID())
                                    .build(); 
                passlist.add(book);
            }
            
            @Override
            public void onError(Throwable t) {
                // TODO Auto-generated method stub
            }
            
            @Override
            public void onCompleted() {
                System.out.printf(LocalTime.now().toString() + ": NumberMessage stream complete \n");

                int totalSeats = 100;
                int avaSeats = totalSeats - passlist.size();
                int occupSeats = passlist.size();

                AvailabilityResponse reply = AvailabilityResponse.newBuilder()
                        .setAvailableSeats(avaSeats)
                        .setOccupiedSeats(occupSeats)
                        .build();

                System.out.println("Available Seats: " + avaSeats);
                System.out.println("Ocuppied Seats: " + occupSeats);
                // the server calls onNext one time only on the response observer
                // calling onNext() more than once will result in a runtime error
                // the gRPC infrastructure know that in client streaming the server must send only
                // one reply
                responseObserver.onNext(reply);

                // the server signals that it is finished
                responseObserver.onCompleted();
            }
         
        };
    }
    
     /*
     * UNARY for each seat booking is sent a message with info about confirmation and bookingID
     * @param responseObserver - response to the client is return via this object
     * @return
     */
    
    public void seatBooking(SeatBookingRequest request,StreamObserver<SeatBookingResponse> response) {
        Context.Key<String> clientId = Constants.CLIENT_ID_CONTEXT_KEY;
        System.out.println("Processing request from " + clientId);

        int bookingid = getRandomID();
        String conf = "CONFIRMED";

        SeatBookingResponse sbr = SeatBookingResponse.newBuilder()
               .setBookingID(bookingid)
               .setConfirmation(conf)
               .build();
        response.onNext(sbr);
        response.onCompleted();

    }
    
    
}
