package src.abs;

import src.cls.logic.Ticket;

public abstract class Vehicle {

    // No getter and setter to reduce complexity
    protected String plate;

    protected Ticket ticket;

    Vehicle(String plate) {}
}
