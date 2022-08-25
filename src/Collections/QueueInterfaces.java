package Collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueInterfaces {
    public static void main(String[] args) {

        Queue<String> car = new LinkedList<>();
        car.add("Volvo");
        System.out.println(car);

        System.out.println(car.offer("Toyota"));
        System.out.println(car);

        System.out.println(car.peek());
        System.out.println(car);

        System.out.println(car.poll());// removes
        System.out.println(car);
    }
}
