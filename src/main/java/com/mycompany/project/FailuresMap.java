/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project;

import static com.mycompany.project.StationCoordinatesMap.getRandomID;
import static com.mycompany.project.StationCoordinatesMap.getRandomNumber;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 * This class defines the Map to implement the 3rd Service
 * @author alvar
 */
public class FailuresMap {
    
    Map mapFailures;
    
    public FailuresMap(){
    
        mapFailures = new HashMap <String, String>();
                
        mapFailures.put("Heating", "Maintenance has been scheduled");
        mapFailures.put("Microphone", "Maintenance has been scheduled");
        mapFailures.put("Adverse Weather", "Slow down and keep reporting");
        mapFailures.put("Visibility", "Slow down and keep reporting");
        mapFailures.put("Signalling", "Slow down and keep reporting");
        mapFailures.put("Communication", "Stop at the next station");
        mapFailures.put("Engine", "Stop at the next station");
        mapFailures.put("Electrical System", "Stop at the next station");
        mapFailures.put("Route Obstruction", "Stop the train, an emergency call has been activated");
        mapFailures.put("Brakes", "Stop the train, an emergency call has been activated");
        mapFailures.put("Collision", "Stop the train, an emergency call has been activated");
        mapFailures.put("Derailment", "Stop the train, an emergency call has been activated");
    }
    
    public String getCalls(String description) {
        return (String) mapFailures.get(description);
    }
    
    public static int getRandomFailureID(){
        Random rand = new Random();
        return rand.nextInt(2500, 2999);
    }
    
    public static void main (String args[] ) {
        
       FailuresMap fm = new FailuresMap();
       
       String answer = fm.getCalls("Heating");
       
       System.out.println("Call: " + answer);
           
       int rf = getRandomFailureID();
           System.out.println("this " + rf);
   }
}
