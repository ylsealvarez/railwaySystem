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
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import java.time.LocalTime;

/**
 *
 * @author alvar
 */
public class Client2 {

    
    private static RailwayService2Grpc.RailwayService2Stub asyncStub;
    private static RailwayService2Grpc.RailwayService2BlockingStub syncStub;
    ManagedChannel channel;

    public Client2() {
        
                channel = ManagedChannelBuilder
                .forAddress("localhost", 50052)
                .usePlaintext()
                .build();

        //non-blocking stub is for asynchronous calls
        //client does not wait for server to complete before starting to read responses
        //must use non-blocking stub for client streaming and bidirectional streaming
        //can also use for Server Streaming asynchronously 
        asyncStub = RailwayService2Grpc.newStub(channel);
        syncStub= RailwayService2Grpc.newBlockingStub(channel);
        
        //getPassengersBooking();
        //getSeatBooking();
    }
    
    public StreamObserver<BookingRequest> getPassengersBooking(StreamObserver<AvailabilityResponse> responseObserver){

        StreamObserver<BookingRequest> requestObserver = asyncStub.passengersBooking(responseObserver);

        return requestObserver;
    }
        
        /*private static void getSeatBooking(){
        
            System.out.println("Unary - getSeatBooking ");
            
            SeatBookingRequest book = SeatBookingRequest.newBuilder()
                                    .setPassengerID(654548)
                                    .setDestination("Rosslare")
                                    .setOrigen("Connolly Station")
                                    .build();
            
            SeatBookingResponse response = syncStub.seatBooking(book);
            
            System.out.println("PassengerID: " + book.getPassengerID() + ", Origin: " + book.getOrigen() + ", Destination: " + book.getDestination());
            System.out.println("Please note your BookingID: " + response.getBookingID() + ", Status: " + response.getConfirmation() + "\n");
            
            /*SeatBookingRequest request,StreamObserver<SeatBookingResponse> response
                         int32 passenger_ID = 1;
                         string destination  = 2;
                         string origen = 3;*/
            
            /*StationRequest request, StreamObserver<StatusResponse> response*/
            
            /*StationRequest train = StationRequest.newBuilder().setTrainStation("Connolly Station").build();
            StatusResponse response = syncStub.trainStatus(train);
            System.out.print(LocalTime.now().toString() + " " + "Train to " + train.getTrainStation());
            System.out.println(" is " + response.getTrainStatus() + "\n");*/
            
            /*Location request = Location.newBuilder().setLocation("Cafeteria").build();
            Temperature response = syncStub.currentTemperature(request);
            System.out.println("Client received " + response.getTempValue() + "for Cafeteria");
        }*/
        
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
        
    
        
        //client1.getTrainStatus("Connolly Station");
    }
     
    /*    public StreamObserver<BookingRequest> getPassengersBooking(StreamObserver<AvailabilityResponse> responseObserver){

        System.out.println("Client Streaming - getPassengersBooking ");

        StreamObserver<AvailabilityResponse> response = new StreamObserver<AvailabilityResponse>(){

            @Override
            public void onNext(AvailabilityResponse response){
                System.out.print(LocalTime.now().toString() + "  Available Seats: " + response.getAvailableSeats());
                System.out.println(", Occupied Seats: " + response.getOccupiedSeats());
            }

            @Override
            public void onError(Throwable t) {
                t.printStackTrace();
            }

            @Override
            public void onCompleted() {
                System.out.println(LocalTime.now().toString() + ": stream is completed.\n");
            }
                /*Client Streaming - getPassengersBooking 
                Unary - getSeatBooking 
                16:45:19.736351700
                Available Seats: 246Occupied Seats: 4
                PassengerID: 654548, Origin: Connolly Station, Destination: Rosslare
                16:45:19.736351700: stream is completed.
                Please note your BookingID: 13514, Status: CONFIRMED
        };

        StreamObserver<BookingRequest> requestObserver = asyncStub.passengersBooking(response);
        try{
            requestObserver.onNext(BookingRequest.newBuilder().setPassengerID(1).setBookingID(11).build());
            Thread.sleep(500);

            requestObserver.onNext(BookingRequest.newBuilder().setPassengerID(2).setBookingID(22).build());
            Thread.sleep(500);

            requestObserver.onNext(BookingRequest.newBuilder().setPassengerID(3).setBookingID(33).build());
            Thread.sleep(500);

            requestObserver.onNext(BookingRequest.newBuilder().setPassengerID(4).setBookingID(44).build());
            Thread.sleep(500);

            requestObserver.onCompleted();
            Thread.sleep(1000);

        } catch (RuntimeException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }*/
}
