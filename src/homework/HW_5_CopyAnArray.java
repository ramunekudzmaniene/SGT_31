package homework;

import java.util.Arrays;

public class HW_5_CopyAnArray {
    public static void main(String[] args) {

        //initialize an arrayA
        int [] arrayA = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        System.out.println("Original array: " + Arrays.toString(arrayA));
        //System.out.println();


        //new arrayB
        int [] arrayB = new int[arrayA.length];
        //Copy elements from arrayA to arrayB
        for(int i = 0; i < arrayA.length; i++) {
            arrayB[i] = arrayA[i];
        }
        //Print elements of arrayB
        System.out.print("New Array: " + Arrays.toString(arrayB));

    }
}
