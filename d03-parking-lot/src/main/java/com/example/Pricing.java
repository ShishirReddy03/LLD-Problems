package com.example;

import com.example.Vehicle.VehicleType;

public class Pricing {
    public static int calculatePrice(long hours, VehicleType vehicleType) {
        if(vehicleType == VehicleType.BIKE) {
            return (int)hours*20;
        }
        else if(vehicleType == VehicleType.CAR) {
            return (int)hours*50;
        }
        else if(vehicleType == VehicleType.TRUCK) {
            return (int)hours*100;
        }
        else {
            return -1;
        }
    }
}
