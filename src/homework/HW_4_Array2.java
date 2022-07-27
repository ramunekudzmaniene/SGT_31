package homework;

import java.util.Scanner;

public class HW_4_Array2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the required size of the array :");
        int size = scanner.nextInt();

        int[] myArray = new int[size];

        System.out.println("Enter the elements of the array one by one");
        //int j = 1;
        for(int i = 0; i < size; i++) {
            System.out.println("Please enter element number:" + (i+1));
            //j++;
            myArray[i] = scanner.nextInt();

        }
        System.out.print("Source Array: ");
        for(int i = 0; i < size; i++) {
            System.out.print(myArray[i] + " ");
        }
        System.out.println();

        //Printing out array's elements
        System.out.print("Source Array2: ");
        for(int temp : myArray) {
            System.out.print(temp);
        }
    }
}

