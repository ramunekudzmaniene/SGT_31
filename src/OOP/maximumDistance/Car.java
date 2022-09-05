package OOP.maximumDistance;

public class Car extends HW_Vehicle{

    boolean airConditioner;

    public Car(float fuel, float fuelUsage, int passengers, boolean airConditioner){
        //super constructor
        super(fuel, fuelUsage, passengers);
        this.airConditioner = airConditioner;
    }
    public float maxDistance() {
        float airConditionerAdd;
        if (airConditioner) {
            airConditionerAdd = 1.1f;
        } else {
            airConditionerAdd = 1f;
        }

        float usage = fuelUsage * (1 + passengers * 0.05f);
        float maxDistance = fuel / (usage * airConditionerAdd) * 100;
        return maxDistance;
    }
}
