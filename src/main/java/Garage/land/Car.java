package Garage.land;

import Garage.Vehicle;
import Garage.engine.IEngine;
import Garage.land.ILandVehicle;

public class Car extends Vehicle implements ILandVehicle {

    private String type;
    private int numberOfWheels;
    private IEngine engine;

    public Car(float weight, int maxSpeed, String type, IEngine engine){
        super(weight, maxSpeed);
        this.type = type;
        this.numberOfWheels = 4;
        this.engine = engine;
    }

    public int getHorsePower(){
        return this.engine.getHorsePower();
    }

    public void setHorsePower(int horsePower){
        this.engine.setHorsePower(horsePower);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
