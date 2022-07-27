package homework;

import java.util.Scanner;

public class HW_4_ArraysSizeAndElements {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the required size of the array :");
        int size = scanner.nextInt();

        int[] myArray = new int[size];

        System.out.println("Enter the elements of the array one by one");
        int j = 1;
        for(int i = 0; i < size; i++) {
            System.out.println("Please enter element number:" + j);
            j++;
            myArray[i] = scanner.nextInt();

        }
        System.out.print("Source Array: ");
        for(int i = 0; i < size; i++) {
            System.out.print(myArray[i] + " ");
        }

    }
}
