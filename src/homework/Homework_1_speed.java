package homework;

import java.util.Scanner;

public class Homework_1_speed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter speed in miles/h");
        float speed = scanner.nextFloat();

        System.out.println(speed + "mp/h would be equal to " + speed*1.6 + "km/h");
    }
}
