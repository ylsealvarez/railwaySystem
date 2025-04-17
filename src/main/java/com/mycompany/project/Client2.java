/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project;


import generated.grpc.railwayservice2.AvailabilityResponse;
import generated.grpc.railwayservice2.RailwayService2Grpc;
import generated.grpc.railwayservice2.SeatBookingRequest;
import generated.grpc.railwayservice2.SeatBookingResponse;
import generated.grpc.railwayservice2.BookingRequest;
import io.grpc.Context;
import io.grpc.Context.CancellableContext;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import java.util.concurrent.atomic.AtomicReference;

/**
 *
 * @author alvar
 */
public class Client2 {
    
    private static RailwayService2Grpc.RailwayService2Stub asyncStub;
    private static RailwayService2Grpc.RailwayService2BlockingStub syncStub;
    private CancellableContext cancellableContext;
    ManagedChannel channel;

    public Client2() {
        
                channel = ManagedChannelBuilder
                .forAddress("localhost", 50052)
                .usePlaintext()
                .build();

        asyncStub = RailwayService2Grpc.newStub(channel);  //non-blocking stub is for asynchronous calls
        syncStub= RailwayService2Grpc.newBlockingStub(channel);
    }
    
    public StreamObserver<BookingRequest> getPassengersBooking(StreamObserver<AvailabilityResponse> responseObserver){
        cancellableContext = Context.current().withCancellation();
        AtomicReference<StreamObserver<BookingRequest>> requestObserver = new AtomicReference<>();
                
        cancellableContext.run(() -> {        
            requestObserver.set(asyncStub.passengersBooking(responseObserver));
        });

        return requestObserver.get();
    }
    
    public void cancelBooking() {
        if (cancellableContext != null) {
            cancellableContext.cancel(null); // it's invoked with cancelBooking Button
        }
    }
        
        
    public SeatBookingResponse getSeatBooking(int passengerID, String destination, String origen){
        int value1 = passengerID;
        String value2 = destination;
        String value3 = origen;

        SeatBookingRequest book = SeatBookingRequest.newBuilder()
                               .setPassengerID(value1)
                               .setDestination(value2)
                               .setOrigen(value3)
                               .build();
       SeatBookingResponse response = syncStub.seatBooking(book);
       System.out.println("PassengerID: " + book.getPassengerID() + ", Origin: " + book.getOrigen() + ", Destination: " + book.getDestination());
       System.out.println("Please note your BookingID: " + response.getBookingID() + ", Status: " + response.getConfirmation() + "\n");

      return response;
   }
        
    // method used for AUTHENTICATION implementation
    private static String getJwt() {
        return Jwts.builder()
                .setSubject("ylsealvarez") // client's identifier
                .signWith(SignatureAlgorithm.HS256, Constants.JWT_SIGNING_KEY)
                .compact();
    } 
        
     public static void main(String[] args) {
        
        Client2 client2 = new Client2();
    }
}
