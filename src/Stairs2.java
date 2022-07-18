
import java.util.Scanner;

class Stairs2 {
    public static void main(String[] args) {
        int i, j, s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of steps for stairs");
        s = sc.nextInt();

        for (i=1; i<=s; i++) {
            for (j=i; j<=s; j++) {
                    System.out.print(" ");
                }
            for (j=1; j<=i; j++) {
                    System.out.print("#");
                }
                System.out.println();
        }
    }
}