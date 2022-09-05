package OOP.maximumDistance;

import java.util.Scanner;

public class VehicleCalling {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(("Enter fuel"));
        float fuel = scanner.nextFloat();

        System.out.println("Enter usage");
        float fuelUsage = scanner.nextFloat();

        System.out.println("enter passengers");
        int passengers = scanner.nextInt();

        HW_Vehicle vehicle = new HW_Vehicle(fuel, fuelUsage, passengers);
        //System.out.printf("Your vehicle %.2f fuel", vehicle.maxDistance());
        vehicle.maxDistance();


    }

}
