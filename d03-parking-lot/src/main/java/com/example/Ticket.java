package com.example;

import java.time.LocalTime;
import java.util.UUID;

import com.example.Vehicle.VehicleType;

public class Ticket {
    private String ticketId;
    private String numberPlate;
    private VehicleType vehicleType;
    private ParkingSlot slot;
    private LocalTime entryTime;

    public Ticket(String numberPlate, VehicleType vehicleType, LocalTime entryTime, ParkingSlot slot) {
        ticketId = UUID.randomUUID().toString();
        this.numberPlate = numberPlate;
        this.vehicleType = vehicleType;
        this.entryTime = entryTime;
        this.slot = slot;
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public LocalTime getEntryTime() {
        return entryTime;
    }

    public String getTicketId() {
        return ticketId;
    }

    public ParkingSlot getSlot() {
        return slot;
    }

    @Override
    public String toString() {
        return "Ticket [ticketId=" + ticketId + ", numberPlate=" + numberPlate + ", vehicleType=" + vehicleType
                + ", slot=" + slot + ", entryTime=" + entryTime + "]";
    }
}
