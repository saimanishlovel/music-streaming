package com.example.distr2;

public class Broker2 {

    public static void main(String[] args) {

        System.out.println("Creating Broker #2");
        new Broker(Node.brokers_consumer_ports.get(1).getIp(), Node.brokers_consumer_ports.get(1).getPort(),
                   Node.brokers_publisher_ports.get(1).getPort());

    }

}
