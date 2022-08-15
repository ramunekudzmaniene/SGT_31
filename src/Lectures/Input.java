package Lectures;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name = scanner.nextLine();
        System.out.println("Your name is " + name);
        System.out.println("Please enter your daughters age");
        int age = scanner.nextInt();
        System.out.println("Your daughter is " + age + " old");
    }
}
