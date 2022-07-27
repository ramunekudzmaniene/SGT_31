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
            System.out.println("Row no. " + (i+1));
            for(int j = 0; j < names[1].length; j++){
                System.out.println(names[i][j]);
            }
        }
    }
}
