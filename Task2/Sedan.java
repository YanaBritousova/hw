package Task2;

public class Sedan extends Car {
    @Override
    public int getNumberOfDoors() {
        return 4;
    }

    @Override
    public String getTrunkCapacity() {
        return "400-500 liters";
    }
    public String getLuxuryLevel(){
        return "Luxury level is 5";
    }
}
