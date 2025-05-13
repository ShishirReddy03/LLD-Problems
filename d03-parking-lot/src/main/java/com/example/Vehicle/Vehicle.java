package com.example.Vehicle;

public abstract class Vehicle {
    private VehicleType vehicleType;
    private boolean isParked;
    private String numberPlate;

    public Vehicle(VehicleType vehicleType, String numberPlate) {
        this.vehicleType = vehicleType;
        this.numberPlate = numberPlate;
        isParked = false;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public boolean isParked() {
        return isParked;
    }

    public String getNumberPlate() {
        return numberPlate;
    }
}
