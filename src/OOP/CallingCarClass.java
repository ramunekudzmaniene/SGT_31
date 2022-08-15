package OOP;

public class CallingCarClass {
    public static void main(String[] args) {

        //Create a new object from Car class template
        //Set field values
        //Call printCarInfo method to check field values

        Car car1 = new Car();
        //car1.brand = "BMW";
        //car1.maxSpeed = 150;
        //car1.color = "Black";
        car1.setColor("Black");
        car1.setBrand("Audi");
        car1.setMaxSpeed(280);

        car1.printCarInfo();
        System.out.println("___________");

        //Access individual fields
        System.out.println("Max speed is " + car1.getMaxSpeed());
        System.out.println("Car's color is " + car1.getColor());

    }
}