package com.example;

import java.time.LocalTime;

import com.example.Vehicle.Bike;
import com.example.Vehicle.Car;
import com.example.Vehicle.Vehicle;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ParkingLot lot = new ParkingLot();
        lot.addSlot(new ParkingSlot(SlotType.BIKE));
        lot.addSlot(new ParkingSlot(SlotType.COMPACT));

        Vehicle bike1 = new Bike("Bike1");
        Vehicle bike2 = new Bike("Bike2");
        Vehicle car1 = new Car("Car1");

        Ticket ticket1 = lot.parkVehicle(bike1, LocalTime.of(1, 30));
        System.out.println(ticket1);
        lot.unparkVehicle(ticket1, LocalTime.of(3, 45));
        Ticket ticket2 = lot.parkVehicle(bike2, LocalTime.of(5, 30));
        System.out.println(ticket2);
        Ticket ticket3 = lot.parkVehicle(car1, LocalTime.of(4, 05));
        System.out.println(ticket3);    
        lot.unparkVehicle(ticket3, LocalTime.of(5, 20));
    }
}
/*
 * Vehicle --> Car, Bike, Truck 3 Classes
 * Parking Slot --> Slot type: BIKE, COMPACT, LARGE
 * Plarking Lot --> List<Slot>
 * Payments while unparking. -> Strategy
 * Ticket -> Generate Ticket while parking, and based on exit time, charge them.
 */