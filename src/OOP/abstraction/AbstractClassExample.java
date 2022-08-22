package OOP.abstraction;

abstract class Animal{
    protected String name;
    public void sleep(){
        System.out.println("zzzzz");
    }
    public abstract void animalSound();//abstract method has no body
}

class Pig extends Animal{
    public void animalSound(){
        System.out.println("Quik");
    }
}
class Dog extends Animal{
    public void animalSound(){
        System.out.println("Au");
    }
}

public class AbstractClassExample {
    public static void main(String[] args) {
        Pig pig = new Pig();
        Dog dog = new Dog();
        pig.sleep();
        pig.name = "Pepe";
        pig.animalSound();
        dog.animalSound();

    }
}
