import java.util.Arrays;

public class ArrayExamples {
    public static void main(String[] args) {

        //Declare Array that will hold 3 string type variables
        String[] names = new String[3];

        //Now to set array's element values
        names[0] = "Ramune";
        names[1] = "Vaidas";
        names[2] = "Greta";

        //Now to get array's elements value
        System.out.println(names[0]);

        int[] grades = new int[10];
        grades[0] = 10;
        grades[1] = 9;
        grades[2] = 8;
        grades[3] = 7;
        grades[4] = 6;
        grades[5] = 5;
        grades[6] = 4;
        grades[7] = 3;
        grades[8] = 2;
        grades[9] = 1;

        //How to get Array size
        System.out.println("Array's size: " + grades.length);


        //Print out all elements
        for (int i = 0; i < grades.length; i++ ) {
            System.out.print(grades[i] + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(grades));


    }
}
