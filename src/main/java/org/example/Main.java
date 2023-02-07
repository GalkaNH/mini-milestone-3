package org.example;

public class Main {
    public static void main(String[] args) {
        TransportService transportservice = new TransportService(10);

        transportservice.addTransport(new Transport("WSC", "WW5643", 100, Status.NEED_REPAIR, 2021-12-01));
        transportservice.addTransport(new Transport("WAZ", "WW5644", 120, Status.IN_OPERATION, 2021-11-01));
        transportservice.addTransport(new Transport("WDC", "WW5645", 150, Status.IN_OPERATION, 2021-10-01));
    }

}