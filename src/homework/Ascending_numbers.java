package homework;

import java.util.Scanner;

public class Ascending_numbers {
    public static void main(String[] args) {
        int c, i, j, temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount of numbers");
        c = sc.nextInt();

        int num[] = new int[c];
        System.out.println("Enter this amount of integer numbers " +c);
        for(i=0; i<c; i++) {
            num[i] = sc.nextInt();
            }
            for (i=0; i<c; i++) {
                for (j = i + 1; j < c; j++) {
                    if (num[i] > num[j]) {
                        temp = num[i];
                        num[i] = num[j];
                        num[j] = temp;
                    }
                }
            }
            System.out.println();

            for (i = 0; i < c - 1; i++) {
                 System.out.print(num[i] + " ");
        }
    }
}
