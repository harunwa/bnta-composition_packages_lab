package Garage.water;

public class CargoShip extends Vehicle {

    private int numberOfContainers;

    public CargoShip(float weight, int maxSpeed, int numberOfContainers){
        super(weight, maxSpeed);
        this.numberOfContainers = numberOfContainers;
    }

    public int getNumberOfContainers() {
        return numberOfContainers;
    }

    public void setNumberOfContainers(int numberOfContainers) {
        this.numberOfContainers = numberOfContainers;
    }
}
