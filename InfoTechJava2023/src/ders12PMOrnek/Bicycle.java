package ders12PMOrnek;

public class Bicycle {
    public Bicycle() {
    }

    public Bicycle(int startCadence, int startSpeed, int startGear) {
        this.startCadence = startCadence;
        this.startSpeed = startSpeed;
        this.startGear = startGear;
    }

    private int startCadence;
    private int startSpeed;
    private int startGear;


    public int getStartCadence() {
        return startCadence;
    }

    public void setStartCadence(int startCadence) {
        this.startCadence = startCadence;
    }

    public int getStartSpeed() {
        return startSpeed;
    }

    public void setStartSpeed(int startSpeed) {
        this.startSpeed = startSpeed;
    }

    public int getStartGear() {
        return startGear;
    }

    public void setStartGear(int startGear) {
        this.startGear = startGear;
    }

    public void printDescription(){
        System.out.println("\nBike is " + "in gear " + this.startGear
                + " with a cadence of " + this.startCadence +
                " and travelling at a speed of " + this.startSpeed + ". ");
    }
}
