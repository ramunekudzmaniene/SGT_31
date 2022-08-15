package homework;

import java.util.Arrays;

public class HW_Max_Min {
    public static void main(String[] args) {

        int [] arrayA = {25, 14, 56, 15, 36, 56, 77, 18, 29, 100};
        System.out.println("Original array: " + Arrays.toString(arrayA));
        System.out.println("Maximum value for the above array = " + max(arrayA));
        System.out.println("Minimum value for the above array = " + min(arrayA));

    }
    public static int max(int [] array){
        int maxValue = array[0];
        for(int i = 1; i < array.length; i++){
            if (array[i] > maxValue){
                maxValue = array[i];
            }
        }
        return maxValue;
    }
    public static int min(int [] array){
        int minValue = array[0];
        for(int i = 1; i < array.length; i++){
            if (array[i] < minValue){
                minValue = array[i];
            }
        }
        return minValue;
    }
}
