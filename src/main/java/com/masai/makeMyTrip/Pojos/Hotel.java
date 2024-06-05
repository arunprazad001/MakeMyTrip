package com.masai.makeMyTrip.Pojos;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class Hotel {
    private int hotelId;
    private String hotelName;
    private String location;
    private int rating;
}
