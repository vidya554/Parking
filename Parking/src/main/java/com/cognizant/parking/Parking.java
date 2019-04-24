package com.cognizant.parking;

import java.util.Date;
import  java.util.Calendar;
import java.util.HashMap;

public class Parking {

    public int capacity = 100;
    public int carCount = 0;


    private HashMap<Car, Date> car = new HashMap<>();

    public HashMap<Car, Date> getCar() {
        return car;
    }

    public void setCar(HashMap<Car, Date> cart) {
        this.car = car;
    }

    public Date addHoursToJavaUtilDate(Date date, int hours) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.HOUR_OF_DAY, hours);
        return calendar.getTime();
    }

    public void addCar(Car car1, Date s) {
        car.put(car1, s);
        capacity -= 1;
        carCount +=1;
    }

    public void getTotal(Date totalTime) {
    }
}
