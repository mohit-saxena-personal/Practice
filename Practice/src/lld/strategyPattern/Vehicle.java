package lld.strategyPattern;

public class Vehicle {

    public void drive(){
        driveStrategy.drive();
    }
    DriveStrategy driveStrategy;
    Vehicle(DriveStrategy driveStrategy){
        this.driveStrategy = driveStrategy;
    }

}
