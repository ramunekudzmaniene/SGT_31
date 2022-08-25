package Collections;

import java.util.ArrayList;

public class ListInterfaceExample {
    public static void main(String[] args) {

        //ArrayList Decoration
        ArrayList<String> car = new ArrayList<String>();

        //Add elements
        car.add("Volvo");
        car.add("Mercedes");
        car.add("BMW");
        car.add("Jeep");
        car.add("Opel");

        System.out.println(car);

        //get elements by index
        System.out.println(car.get(1));

        //Insert element at specific index
        car.add(2,"Ford");

        //Change elements
        car.set(3,"Toyota");
        System.out.println(car);

        //Remove elements
        car.remove(0);
        System.out.println(car);

        //Delete all elements
        car.clear();
        System.out.println(car);


    }

}
