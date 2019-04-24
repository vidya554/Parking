package com.cognizant.parking;

public class Car {

    private String regNo;
    private int year;
    private boolean parkingPass;

    public Car(String tag, int model, boolean pass) {
        regNo = tag;
        year = model;
        parkingPass = pass;
    }


    public String getCarRegNo() {
        return regNo;
    }
    public int getYear() {
        return year;
    }
    public boolean getParkingPass() {
        return parkingPass;
    }
}
