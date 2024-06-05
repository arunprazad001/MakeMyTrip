package com.masai.makeMyTrip.Pojos;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class HolidayPackage {
    private int packageId;
    private String packageName;
    private int duration;
    private double price;
}
