package OOP;

import java.util.Scanner;

public class CallingCat {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.println("Enter cat's breed");
        String breed = scanner.nextLine();
        System.out.println("Enter cat's name");
        String name = scanner.nextLine();
        System.out.println("Enter cat's weight");
        int weight = scanner.nextInt();

        Cat myCat = new Cat();
        myCat.setBreed(breed);
        myCat.setName(name);
        myCat.setWeight(weight);

        myCat.PrintCatsInfo();
    }

}
