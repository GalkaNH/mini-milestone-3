package org.example;

import java.util.Objects;
public class TransportService {

    private Transport[] transports;

    public TransportService(int size) {
        transports = new Transport[size];
    }

    public void addTransport(Transport transport) {
        for (int i = 0; i < transports.length; i++) {
            if(Objects.isNull(transports[i])) {
                transports[i] = transport;
                System.out.println("Bus add" + transport.getIdentifier()+ "added");
                break;
            }
        }
    }
    public void showAllTransports() {
        for (Transport t : transports) {
            if (Objects.nonNull(t)){
                t.view();
            }
        }
    }

}

