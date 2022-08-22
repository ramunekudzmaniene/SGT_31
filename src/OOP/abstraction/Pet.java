package OOP.abstraction;

public abstract class Pet {
    protected String color;
    protected String eat;
    protected String place;
    protected int age;

    public abstract void printPetInfo();

    //custom constructor
    public Pet(String color, String eat, String place, int age){
        this.color = color;
        this.eat = eat;
        this.place = place;
        this.age = age;
    }
    //public Pet(){

   // }
}
