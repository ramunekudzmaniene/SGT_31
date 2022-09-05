package OOP.maximumDistance;

public class HW_Vehicle {
    //fields
    protected float fuel;
    protected float fuelUsage;
    protected int passengers;

    //Constructor
    public HW_Vehicle(float fuel, float fuelUsage, int passengers) {
        this.fuel = fuel;
        this.fuelUsage = fuelUsage;
        this.passengers = passengers;
    }

    //Method
    public float maxDistance(){
        float maxDistance = fuel/(fuelUsage+(passengers*5*fuelUsage)/100)*100;
        //return fuel / (fuelUsage*(1+passengers * 0.05f))*100;
        System.out.printf("%.2f", maxDistance);
        return maxDistance;

    }
}



