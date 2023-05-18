package com.example.distr2;

public class Broker1 {

    public static void main(String[] args) {

        System.out.println("Creating Broker #1");
        new Broker(Node.brokers_consumer_ports.get(0).getIp(), Node.brokers_consumer_ports.get(0).getPort(),
                   Node.brokers_publisher_ports.get(0).getPort());

    }

}
