package homework;

import java.util.Scanner;

public class HW_3_Printout_numbers {
    public static void main(String[] args) {
        int num, i;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter integer number");
        num = scanner.nextInt();

        if (num>=0) {
            for (i = num; i >= 0; i--) {
                System.out.print(i + " ");
            }
        } else {
           for (i = num; i<= 0; i++) {
                System.out.print(i+ " ");
            }
        }
    }
}
