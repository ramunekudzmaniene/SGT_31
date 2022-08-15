package Lectures;

public class TwoDimensionalArray {
    public static void main(String[] args) {

        int[][] age = new int[][]{{4,5,3,6,5},{34,44,28,38,41}};
        //Print second column value
        System.out.println("Child - " + age[0][1]);
        System.out.println("Parent - " + age[1][1]);

        //Example 2
        String[][] names = new String[2][5]; // 2 rows, 5 columns

        names[0][0] = "Alice";
        names[0][1] = "Jom";
        names[0][2] = "Lukas";
        names[0][3] = "Abra";
        names[0][4] = "Karlis";

        //second row
        names[1][0] = "Maris";
        names[1][1] = "Kali";
        names[1][2] = "Linda";
        names[1][3] = "Bir";
        names[1][4] = "Kuk";

        //number of rows
        System.out.println(names.length);

        //number of columns
        System.out.println(names[0].length);
        // i - rows
        // j - columns

        for(int i = 0; i < names.length; i++ ){
            System.out.print("Row no. " + (i+1) + " ");
            for(int j = 0; j < names[1].length; j++){
                System.out.print(names[i][j] + " ");
            }
            System.out.println();
        }
        for(String [] tempNames : names){
            System.out.print("Row - ");
            for(String name : tempNames){
                System.out.print(name + " ");
            }
            System.out.println();
        }
        //Example
        int table[] = {1, 2, 3, 4, 5, 6};
        for (int i = 0; i < table.length; i++) {
            int value = table[i];
            if (value % 2 == 0) {
                System.out.println("even number: " + value);
            } else {
                System.out.println("odd number: " + value);
            }
        }

    }
}
