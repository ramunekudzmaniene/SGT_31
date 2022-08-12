package homework;

import java.util.Arrays;

public class HW_Max_Min {
    public static void main(String[] args) {

        int [] arrayA = {25, 14, 56, 15, 36, 56, 77, 18, 29, 100};
        System.out.println("Original array: " + Arrays.toString(arrayA));
        System.out.println("Maximum value for the above array = " + max(arrayA));
        System.out.println("Minimum value for the above array = " + min(arrayA));

    }
    public static int max(int [] arrayA){
        int maxValue = arrayA[0];
        for(int i = 1; i < arrayA.length; i++){
            if (arrayA[i] > maxValue){
                maxValue = arrayA[i];
            }
        }
        return maxValue;
    }
    public static int min(int [] arrayA){
        int minValue = arrayA[0];
        for(int i = 1; i < arrayA.length; i++){
            if (arrayA[i] < minValue){
                minValue = arrayA[i];
            }
        }
        return minValue;
    }
}
