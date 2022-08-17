package OOP;

public class CallingAnimal {
    public static void main(String[] args) {

        Animal animal1 = new Animal("cat", "Main Coon", 10.4f, 15);
        animal1.printAnimalInfo();

        Animal animal2 = new Animal("dog", "Toy Poole", 3.1f );
        animal2.printAnimalInfo();
    }

}
