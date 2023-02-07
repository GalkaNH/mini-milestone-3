package org.example;

public class  Transport {
    private  String identifier;
    private String registrationNumber;
    private int maxCapacity;
    private Status status;
    private int serviceDate;

    public Transport(String identifier, String registrationNumber, int maxCapacity, Status status, int serviceDate) {
        this.identifier = identifier;
        this.registrationNumber = registrationNumber;
        this.maxCapacity = maxCapacity;
        this.status = status;
        this.serviceDate = serviceDate;
    }

    public String getIdentifier() {
        return identifier;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public Status getStatus() {
        return status;
    }

    public int getServiceDate() {
        return serviceDate;
    }

    public void view() {
        System.out.println(identifier + " " + registrationNumber + " " + maxCapacity + " " + status + " " +
                serviceDate);
    }




}

