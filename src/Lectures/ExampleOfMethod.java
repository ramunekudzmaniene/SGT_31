package Lectures;

import java.util.Scanner;

public class ExampleOfMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter a year as integer number");
        int y = scanner.nextInt();

        determineLeapYear(y);
        determineLeapYear(2004);
        System.out.println(determineLeapYear1(y));
        }
     public static void determineLeapYear(int y){
        if (y % 400 == 0) {
                System.out.println(y + " year is the Leap year");
            } else if (y % 4 == 0 && y % 100 != 0) {
                System.out.println(y + " year is the Leap year");
            } else
                System.out.println(y + " is not a Leap year");

    }
    public static String determineLeapYear1(int y) {
        if ((y % 4 == 0 && y % 100 !=0) ||y % 400 == 0) {
            return (y + " year is the Leap year2");
        } else
            return (y + " is not a Leap year2");

    }
}