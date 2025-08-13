package lld.strategyPattern;

public class SportsVehicle extends Vehicle{

    SportsVehicle() {
        super(new SpecialDriveStrategy());
    }
}
