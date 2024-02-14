package Garage.water;

public class Kayak extends Vehicle {

    private int numberOfPaddles;

    public Kayak(float weight, int maxSpeed){
        super(weight, maxSpeed);
        this.numberOfPaddles = 1;
    }

    public int getNumberOfPaddles() {
        return numberOfPaddles;
    }

    public void setNumberOfPaddles(int numberOfPaddles) {
        this.numberOfPaddles = numberOfPaddles;
    }
}
