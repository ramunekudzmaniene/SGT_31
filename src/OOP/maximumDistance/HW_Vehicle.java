package OOP.maximumDistance;

public class HW_Vehicle {
    //fields
    private float fuel;
    private float fuelUsage;
    private int passengers;

    //Constructor
    public HW_Vehicle(float fuel, float fuelUsage, int passengers) {
        this.fuel = fuel;
        this.fuelUsage = fuelUsage;
        this.passengers = passengers;
    }

    //Method
    public void maxDistance(){
        float maxDistance = fuel/(fuelUsage+(passengers*5*fuelUsage)/100)*100;
        System.out.printf("%.2f", maxDistance);

    }
}



