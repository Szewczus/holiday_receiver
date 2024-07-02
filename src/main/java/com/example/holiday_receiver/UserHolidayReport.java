package com.example.holiday_receiver;

import lombok.Data;

@Data
public class UserHolidayReport {
    private String travelDestination;
    private String destinationAddress;
    private String description;
    private String arriveDate;
    private String departureDate;
    private Double accomodationCost;

    @Override
    public String toString() {
        return "MyJsonObject{" +
                "travelDestination='" + travelDestination + '\'' +
                ", destinationAddress='" + destinationAddress + '\'' +
                ", description='" + description + '\'' +
                ", arriveDate='" + arriveDate + '\'' +
                ", departureDate='" + departureDate + '\'' +
                ", accomodationCost=" + accomodationCost +
                '}';
    }
}
