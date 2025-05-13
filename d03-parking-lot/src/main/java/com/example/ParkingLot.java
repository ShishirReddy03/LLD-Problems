package com.example;

import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import com.example.Vehicle.Vehicle;
import com.example.Vehicle.VehicleType;

public class ParkingLot {
    private List<ParkingSlot> slots;

    public ParkingLot() {
        slots = new ArrayList<>();
    }

    public void addSlot(ParkingSlot slot) {
        slots.add(slot);
    }

    public Ticket parkVehicle(Vehicle vehicle, LocalTime entryTime) {
        for (ParkingSlot slot : slots) {
            if (!slot.isEmpty())
                continue;
            if (slot.getSlotType() == SlotType.BIKE && vehicle.getVehicleType() == VehicleType.BIKE) {
                slot.park(vehicle);
                return new Ticket(vehicle.getNumberPlate(), vehicle.getVehicleType(), entryTime, slot);
            } else if (slot.getSlotType() == SlotType.COMPACT && vehicle.getVehicleType() == VehicleType.CAR) {
                slot.park(vehicle);
                return new Ticket(vehicle.getNumberPlate(), vehicle.getVehicleType(), entryTime, slot);
            } else if (slot.getSlotType() == SlotType.LARGE && vehicle.getVehicleType() == VehicleType.TRUCK) {
                slot.park(vehicle);
                return new Ticket(vehicle.getNumberPlate(), vehicle.getVehicleType(), entryTime, slot);
            }
        }
        System.out.println("Parking slot NOT available!");
        // throw new RuntimeException("No free slots");
        return null;
    }

    public void unparkVehicle(Ticket ticket, LocalTime exitTime) {
        Duration duration = Duration.between(ticket.getEntryTime(), exitTime);
        long hours = duration.toHours();
        if (duration.toMinutes() != 0 || duration.toSeconds() != 0 || duration.toMillis() != 0)
            hours++;
        int parkingCost = Pricing.calculatePrice(hours, ticket.getVehicleType());
        System.out.println("Parking price: " + parkingCost);
        ticket.getSlot().unpark();
    }
}
