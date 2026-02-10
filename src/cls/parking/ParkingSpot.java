package src.cls.parking;

import java.lang.ref.WeakReference;
import src.abs.*; // Uses all

public class ParkingSpot {

    WeakReference<Vehicle> vehicle = new WeakReference<Vehicle>(null);
    SpotTypes type;

    public void setVehicle(WeakReference<Vehicle> vehicle) {
        switch (type) {
            case Compact:
                break;
            case Regular:
                break;
            case Handicapped:
                break;
            case Reserved:
                break;
        }
    }

    public boolean status() {
        return this.vehicle.get() != null;
    }
}
