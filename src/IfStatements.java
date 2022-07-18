import java.util.Scanner;

public class IfStatements {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter the grade");
        int grade = scanner.nextInt();

        //Print out "Good job" if grade is over 6

        if (grade > 6) {
            System.out.println("GOOD JOB");
        }
        //Print out "Good job" if grade is over 3
        if (grade > 3) {
            System.out.println("good job");
        }
        //Print Good job if the grade over 6, if not "Better luck"
        if (grade > 6) {
            System.out.println("GOOD JOB");
        } else {
            System.out.println("Better luck next time");

        }
        //Print "you have a fiver" if temp is over 36.8
        float temperature = 36.8f;
        if (temperature > 36.8) {
            System.out.println("You have a fiver");
        } else {
            System.out.println("you a healthy");
        }
        // else if
        // 1-3 VERY BAD
        // 4-5 OK
        //6  NICE
        // VERY GOOD
        if (grade < 4) {
            System.out.println("Very bad");
            // else if (grade == 4 II grade == 5)
            // else if (grade <= 5)
        } else if(grade >= 4 && grade <= 5){
            System.out.println("ok");
        } else if(grade == 6){
            System.out.println("Nice");
        } else {
            System.out.println("Very good");
        }

    }
}
