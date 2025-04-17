/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project;

import java.io.IOException;
import java.net.InetAddress;
import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;

/**
 *
 * @author alvar
 */
// This code is adapted from https://github.com/jmdns/jmdns
public class ServiceRegistration {
    public static void main(String[] args) throws InterruptedException {

        try {
            // Create a JmDNS instance
            JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());
            System.out.println("Registration: InetAddress.getLocalHost():" + InetAddress.getLocalHost());

            // Register a service
            // Note that this code does not start the service. 
            ServiceInfo service1 = ServiceInfo.create("_grpc._tcp.local.", "server1", 50051, " ");
            jmdns.registerService(service1);
            System.out.println("Registered service. Waiting...");

            // Wait a bit
            Thread.sleep(20000);
            
            ServiceInfo service2 = ServiceInfo.create("_grpc._tcp.local.", "server2", 50052, " ");
            jmdns.registerService(service2);
            System.out.println("Registered service. Waiting...");
            
            // Wait a bit
            Thread.sleep(20000);
            
            ServiceInfo service3 = ServiceInfo.create("_grpc._tcp.local.", "server3", 50053, " ");
            jmdns.registerService(service3);
            System.out.println("Registered service. Waiting...");

            // Unregister all services
            //jmdns.unregisterAllServices();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
