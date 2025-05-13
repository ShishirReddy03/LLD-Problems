package com.example;

import com.example.Vehicle.Vehicle;

public class ParkingSlot {
    private SlotType slotType;
    private boolean isEmpty;
    private Vehicle parkedVehicle;

    public ParkingSlot(SlotType slotType) {
        this.slotType = slotType;
        isEmpty = true;
        parkedVehicle = null;
    }

    public SlotType getSlotType() {
        return slotType;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void park(Vehicle vehicle) {
        parkedVehicle = vehicle;
        isEmpty = false;
    }

    public void unpark() {
        parkedVehicle = null;
        isEmpty = true;
    }

    public Vehicle getParkedVehicle() {
        return parkedVehicle;
    }
}
