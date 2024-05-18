package Task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[]args){

        Sedan s1 = new Sedan();
        s1.start();
        s1.getFuelType();
        s1.stop();
        System.out.println(s1.getNumberOfDoors());
        System.out.println(s1.getTrunkCapacity());
        System.out.println(s1.getLuxuryLevel());

        Truck t1 = new Truck();
        t1.start();
        t1.getFuelType();
        t1.stop();
        System.out.println(t1.getNumberOfDoors());
        System.out.println(t1.getTrunkCapacity());
        System.out.println(t1.getMaxLoadCapacity());

        MutablePerson mp1 = new MutablePerson("Yana",20, Arrays.asList("Reading books","Sport","Programming"));
        System.out.println(mp1.toString());
        mp1.setAge(100);
        mp1.setName("Ann");
        mp1.setHobbies(Arrays.asList("Watching TV","Swimming"));
        System.out.println(mp1.toString());

        List<String>hobbies1 = new ArrayList<>();
        hobbies1.add("Reading books");
        hobbies1.add("Sport");
        hobbies1.add("Programming");
        ImmutablePerson ip1 = new ImmutablePerson("Yana",20, hobbies1);
        String name = ip1.getName();
        name = "Ann";
        System.out.println(ip1.toString());
        List<String> hobbies = ip1.getHobbies();
        hobbies.add("Swimming");
        System.out.println(ip1.toString());

        Computer.Processor processor = new Computer.Processor();
        System.out.println(processor.getDetails());

        Computer c1 = new Computer();
        Computer.RAM ram  = c1.new RAM("8 Gb");
        System.out.println(ram.getDetails());




    }
}
