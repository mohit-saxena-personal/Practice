package lld.strategyPattern;

public class OffRoadVehicle extends Vehicle {

    OffRoadVehicle() {
        super(new SpecialDriveStrategy());
    }
}
