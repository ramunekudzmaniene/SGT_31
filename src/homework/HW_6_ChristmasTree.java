package homework;
import java.util.Scanner;

public class HW_6_ChristmasTree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i, j, s;
        System.out.println("Lectures.Input tree size");
        s = scanner.nextInt();

        for(i = 0; i <= s; i++){
            for(j = 0; j <= s-1-i; j++) {
                System.out.print(" ");
            }
            for(j = 1; j<=2*i-1; j++){
                System.out.print("*");

            }
            System.out.println();
        }
        //base level
        for(i = 0; i<s-1; i++){
            System.out.print(" ");
        }
        System.out.println("#");
    }
}
