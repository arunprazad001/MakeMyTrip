package com.masai.makeMyTrip.Config;

import com.masai.makeMyTrip.Pojos.HolidayPackage;
import com.masai.makeMyTrip.Pojos.HolidayPlanner;
import com.masai.makeMyTrip.Pojos.Hotel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class AppConfig {
    @Bean
    public Hotel sheraton() {
        return new Hotel(1, "Sheraton", "Bangalore", 4);
    }

    @Bean
    public Hotel hilton() {
        return new Hotel(2, "Hilton", "Delhi", 4);
    }

    @Bean
    public Hotel marriott() {
        return new Hotel(3, "Marriott", "Kochi", 5);
    }

    @Bean
    public HolidayPackage sheratonPackage() {
        return new HolidayPackage(101, "Sheraton Package", 3, 500.0);
    }

    @Bean
    public HolidayPackage hiltonPackage() {
        return new HolidayPackage(102, "Hilton Package", 4, 600.0);
    }

    @Bean
    public HolidayPackage marriottPackage() {
        return new HolidayPackage(103, "Marriott Package", 5, 700.0);
    }

    @Bean
    public Map<Hotel, HolidayPackage> hotelPackageMap() {
        Map<Hotel, HolidayPackage> map = new HashMap<>();
        map.put(sheraton(), sheratonPackage());
        map.put(hilton(), hiltonPackage());
        map.put(marriott(), marriottPackage());
        return map;
    }
    @Bean(initMethod = "initialize", destroyMethod = "terminate")
    @Scope("singleton")
    public HolidayPlanner holidayPlanner() {
        HolidayPlanner planner = new HolidayPlanner();
        planner.setTheMap(hotelPackageMap());
        return planner;
    }
}
