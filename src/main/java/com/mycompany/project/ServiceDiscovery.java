/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import javax.jmdns.JmDNS;
import javax.jmdns.ServiceEvent;
import javax.jmdns.ServiceInfo;
import javax.jmdns.ServiceListener;

/**
 * It has the methods for the discovery of services
 * @author alvar
 */
public class ServiceDiscovery {
    private static class SampleListener implements ServiceListener {
		
		
        public void serviceAdded(ServiceEvent event) {
            System.out.println("Service added: " + event.getInfo());
        }

        public void serviceRemoved(ServiceEvent event) {
            System.out.println("Service removed: " + event.getInfo());
        }

        public void serviceResolved(ServiceEvent event) {
            System.out.println("Service resolved: " + event.getInfo());

            ServiceInfo info = event.getInfo();
            int port = info.getPort();                
        }
    }

    public static void main(String[] args) throws InterruptedException {
        try {

            // Create a JmDNS instance
            JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());
            System.out.println("Client: InetAddress.getLocalHost():" + InetAddress.getLocalHost());
            // Add a service listener
            jmdns.addServiceListener("_grpc._tcp.local.", new SampleListener());

            // Wait a bit
            Thread.sleep(20000);
			
        } catch (UnknownHostException e) {
                System.out.println(e.getMessage());
        } catch (IOException e) {
                System.out.println(e.getMessage());
        }
    }
}
