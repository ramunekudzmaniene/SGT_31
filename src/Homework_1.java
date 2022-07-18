import java.util.Scanner;

public class Homework_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Please, enter your daughters name");
        String name = scanner.nextLine();

        System.out.println("Please, enter your daughters birth date");
        int age = scanner.nextInt();

        System.out.println("Your daughters name is " + name + " and she is " + (2022-age) + " years old.");
    }
}
