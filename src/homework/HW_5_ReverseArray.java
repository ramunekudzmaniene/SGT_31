package homework;
import java.util.Arrays;
public class HW_5_ReverseArray {
    public static void main(String[] args) {
        //initialize an arrayA
        int[] arrayA = new int[]{25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        System.out.print("Original array: " + Arrays.toString(arrayA));
        System.out.println();

        //For loop to switch places of elements
        for(int i = 0; i < arrayA.length/2; i++){
            //Temp is needed to store element which is replaced
            int temp = arrayA[i];
            arrayA[i]= arrayA[arrayA.length - i - 1];
            arrayA[arrayA.length - i - 1] = temp;
        }
        System.out.println("Reverse array: " + Arrays.toString(arrayA));
    }
}

