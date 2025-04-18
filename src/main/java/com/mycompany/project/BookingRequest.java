/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project;

/**
 * We create a class BookingRequest for managing our 2nd service
 * we define the attributes for this class
 * @author alvar
 */
public class BookingRequest {
    private int passengerID;
    private int bookingID;
    
    public BookingRequest(int passengerID, int bookingID){
        this.passengerID = passengerID;
        this.bookingID = bookingID;
    }
    
    public void setPassengerID(int passengerID){
        this.passengerID = passengerID;
    }
    
    public int getPassengerID(){
        return passengerID;
    }
    
    public void setBookingID(int bookingID){
        this.bookingID = bookingID;
    }
    
    public int getBookingID(){
        return bookingID;
    }
    
    @Override
    public String toString(){
        return "PassengerID " + passengerID + "BookingID " + bookingID;
    }
    
}
