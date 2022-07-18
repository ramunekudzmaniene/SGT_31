import java.util.Scanner;

public class HW_2_Greatest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        System.out.println("Please, enter 1th integer number");
        a = scanner.nextInt();
        System.out.println("Please, enter 2th integer number");
        b = scanner.nextInt();
        System.out.println("Please, enter 3th integer number");
        c = scanner.nextInt();

        if(a >= b && a >= c){
            System.out.println(a + " is the greatest number");
        } else if(b >= a && b >= c){
            System.out.println(b + " is the greatest number");
        } else {
            System.out.println(c + " is the greatest number");
        }
    }
}
