package Garage.land;

import Garage.Vehicle;
import Garage.engine.IEngine;
import Garage.land.ILandVehicle;

public class Bus extends Vehicle implements ILandVehicle, IEngine {

    private boolean isDoubleDecker;
    private int numberOfWheels;
    private IEngine engine;

    public Bus(float weight, int maxSpeed, boolean isDoubleDecker, IEngine engine){
        super(weight, maxSpeed);
        this.isDoubleDecker = isDoubleDecker;
        this.numberOfWheels = 8;
        this.engine = engine;
    }

    public int getHorsePower(){
        return this.engine.getHorsePower();
    }

    public void setHorsePower(int horsePower){
        this.engine.setHorsePower(horsePower);
    }

    public boolean getIsDoubleDecker() {
        return isDoubleDecker;
    }

    public void setDoubleDecker(boolean doubleDecker) {
        isDoubleDecker = doubleDecker;
    }

    @Override
    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    @Override
    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public IEngine getEngine() {
        return engine;
    }

    public void setEngine(IEngine engine) {
        this.engine = engine;
    }
}
