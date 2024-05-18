package Task2;

public abstract class Car implements Vehicle{
    @Override
    public void start() {
        System.out.println("Car Start");
    }

    @Override
    public void stop() {
        System.out.println("Car Stop");
    }

    @Override
    public void getFuelType() {
        System.out.println("Petrol");
    }
    public abstract int getNumberOfDoors();
    public abstract String getTrunkCapacity();
}
