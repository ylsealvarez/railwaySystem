/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 *
 * @author alvar
 */
public class StationCoordinatesMap {

    Map mapStation;
    
    public StationCoordinatesMap(){
    
        mapStation = new HashMap <String, List<String>>();
        
        List<String> firstList = new ArrayList<>();
        firstList.add("53.349805, -6.26031");
        firstList.add("53.200184, -6.100755");
        firstList.add("52.728527, -6.042999");
        firstList.add("52.779492, -6.134859");
        firstList.add("52.669473, -6.156368");
        firstList.add("52.257113, -6.341211");
        
        mapStation.put("Connolly Station", firstList);
        
        /*String connolly = "53.349805, -6.26031";  // Connolly Station, Dublín
        String bray = "53.200184, -6.100755";  // Bray Station
        String greystones = "52.728527, -6.042999";  // Greystones Station
        String arklow = "52.779492, -6.134859";  // Arklow Station
        String gorey = "52.669473, -6.156368";  // Gorey Station
        String rosslare = "52.257113, -6.341211";  // Rosslare Station*/
        
        List<String> secondList = new ArrayList<>();
        secondList.add("53.3448,-6.2603");
        secondList.add("53.1497,-7.3089");
        secondList.add("53.2739,-7.5028");
        secondList.add("53.4236,-7.9395");
        secondList.add("53.2814,-8.5978");
        secondList.add("53.2707,-9.0492");
        
        mapStation.put("Heuston Station", secondList);
        
        /*"Heuston (Dublín): 53.3448,-6.2603",
        "Portarlington: 53.1497,-7.3089",
        "Tullamore: 53.2739,-7.5028",
        "Athlone: 53.4236,-7.9395",
        "Athenry: 53.2814,-8.5978",1984
        "Galway: 53.2707,-9.0492"*/
    }
    
    public List<String> getAllCoordinatesByDestination(String trainStation) {
        return (List<String>) mapStation.get(trainStation);
    }
    
    public static int getRandomNumber(){
        Random rand = new Random();
        return rand.nextInt(4);
    }
    
    public static int getRandomID(){
        Random rand = new Random();
        return rand.nextInt(12345, 56789);
    }
    
    public int getStatusbyTrain(String trainStation){ 
       // int randomStatus = getRandomNumber();
        return getRandomNumber(); 
    }
    
    
       public static void main (String args[] ) {
       StationCoordinatesMap tml = new StationCoordinatesMap();
       
       List<String> answerList = tml.getAllCoordinatesByDestination("Connolly Station");
       Iterator i = answerList.iterator();
       while (i.hasNext()) {
           System.out.println("got one" + i.next());
       }
       
       int rn = getRandomNumber();
           System.out.println("this " + rn);
           
       int ri = getRandomID();
           System.out.println("this " + ri);
   }
    
    
}
