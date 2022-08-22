package OOP.abstraction;

public class Fish extends Pet {
    private int waterChangesInWeek;

    public void printPetInfo(){
        System.out.println("Color: " + color);
        System.out.println("Eat: " + eat);
        System.out.println("Place: " + place);
        System.out.println("Age " + age);
        System.out.println("Water changes per week " + waterChangesInWeek);
    }
    //constructor
    public Fish(String color, String eat, String place, int age, int waterChangesInWeek){
        //super constructor
        super(color,eat,place, age);
        this.waterChangesInWeek = waterChangesInWeek;
    }

}
