package com.masai.makeMyTrip.Pojos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class HolidayPlanner {
    private Map<Hotel,HolidayPackage> theMap;

    @Autowired
    public void setTheMap(Map<Hotel, HolidayPackage> theMap) {
        this.theMap = theMap;
    }

    public void initialize() {
        System.out.println("Inside initialize method");
    }

    public void terminate() {
        System.out.println("Inside terminate method");
    }

    public void displayDetails() {
        System.out.println("Inside displayDetails of HolidayPlanner class");
        for (Map.Entry<Hotel,HolidayPackage> entry : theMap.entrySet()) {
            System.out.println("Hotel: " + entry.getKey());
            System.out.println("Package: " + entry.getValue());
        }
    }
}
