package homework;

import java.util.Scanner;

public class HW_4_ArraySumOfElements {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the required size of the array :");
            int size = scanner.nextInt();
            float sum = 0;

            float[] myArray = new float[size];

            System.out.println("Enter the elements of the array one by one");
            //int j = 1;
            for(int i = 0; i < size; i++) {
                System.out.println("Please enter element number:" + (i+1));
                //j++;
                myArray[i] = scanner.nextInt();
                sum += myArray[i];

            }

            System.out.print("Source Array: ");
            for(int i = 0; i < size; i++) {
                System.out.print(myArray[i] + " ");
            }
        //System.out.println();
            System.out.println();
            System.out.println("Sum of elements: " + sum);
            System.out.println("Averige: " + sum/myArray.length);
     }
}


