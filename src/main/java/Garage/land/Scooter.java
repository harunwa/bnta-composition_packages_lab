package Garage.land;

import Garage.Vehicle;
import Garage.land.ILandVehicle;

public class Scooter extends Vehicle implements ILandVehicle {

    private int numberOfWheels;

    public Scooter(float weight, int maxSpeed){
        super(weight, maxSpeed);
        this.numberOfWheels = 2;
    }

    public void doTailWhip(){
        System.out.println("Doing some rad moves");
    }

    @Override
    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    @Override
    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }
}
