package com.cognizant.parking;

import org.junit.Assert;
import org.junit.Test;

import javax.swing.*;
import java.util.Date;
import java.util.HashMap;

public class TestsParking {
    Parking pr = new Parking();
    @Test
    public void addCar(){

        Car car1 = new Car("NC123", 2000, true);
        String expected = "NC123";

        //Execute
        pr.addCar(car1, new Date());
        HashMap<Car, Date> parkingLot = pr.getCar();
        for(Car car : parkingLot.keySet()){
            System.out.println("Registration : " + car.getCarRegNo() + ", Year : " + car.getYear() + ", Parking Pass : " + car.getParkingPass() + " Start Time : " + parkingLot.get(car));
        }
        System.out.println("Added a car");
        System.out.println("Space Remaining for " +pr.capacity + " vehicles");
        String actual = car1.getCarRegNo();

        //Assert
        Assert.assertEquals(actual, expected);

    }
    @Test
    public void CalculateTotal() {

        //setup
        Date inTime = new Date();
        Date outTime = pr.addHoursToJavaUtilDate(inTime,5);
        long totalTime = outTime.getTime() - inTime.getTime();
        System.out.println("The current time is : " +new Date());
//        System.out.println("New time is : " +pr.addHoursToJavaUtilDate(new Date(), 3));

        //Execute
//        pr.getTotal(totalTime);
    }

}
