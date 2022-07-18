import java.util.Scanner;

public class HW_2_LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter a year as integer number");
        int y = scanner.nextInt();

        if(y % 400 == 0){
            System.out.println(y + " year is the Leap year");
        }
        else if(y % 4 == 0 && y % 100 != 0) {
            System.out.println(y + " year is the Leap year");
        }
        else
            System.out.println(y + " is not a Leap year");

    }
}
