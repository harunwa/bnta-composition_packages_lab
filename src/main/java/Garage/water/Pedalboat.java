package Garage.water;

public class Pedalboat extends Vehicle {


    private int numberOfSeats;

    public Pedalboat(float weight, int maxSpeed, int numberOfSeats){
        super(weight, maxSpeed);
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }
}
