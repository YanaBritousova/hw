package Task2;

public class Truck extends Car{
    @Override
    public int getNumberOfDoors() {
        return 2;
    }

    @Override
    public String getTrunkCapacity() {
        return "12000-20000 liters";
    }
    public String getMaxLoadCapacity(){
        return "25 tons";
    }
}
