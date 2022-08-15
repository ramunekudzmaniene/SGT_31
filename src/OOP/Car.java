package OOP;

public class Car {

    //Fields
    private String color;
    private String brand;
    private int maxSpeed;

    //Methods
    //setters Methods

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setColor(String color){
        this.color = color;
    }
    //getters Methods
    public String getColor(){
        return color;
    }

    public String getBrand() {
        return brand;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void printCarInfo(){
        System.out.println("Car info");
        System.out.println("Brand " + brand);
        System.out.println("Color " + color);
        System.out.println("Max speed " + maxSpeed);
    }

}
