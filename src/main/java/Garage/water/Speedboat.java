package Garage.water;

public class Speedboat extends Vehicle {

    private boolean needsCrew;

    public Speedboat(float weight, int maxSpeed, boolean needsCrew){
        super(weight, maxSpeed);
        this.needsCrew = needsCrew;
    }

    public boolean getNeedsCrew() {
        return needsCrew;
    }

    public void setNeedsCrew(boolean needsCrew) {
        this.needsCrew = needsCrew;
    }

}
