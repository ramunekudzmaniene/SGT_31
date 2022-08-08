import java.util.Scanner;

public class StringInputPractise {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Name and Age (John 30) ");

        //Read the string from the user
        //Get rid of spaces
        //Get substring last two characters in the string convert into integer
        //If age is over 70 then print "Senior" if not - "Adult"

        String nameAge = scanner.nextLine().trim();
        //System.out.println(nameAge);

        //System.out.println(Integer.parseInt(nameAge.substring(nameAge.length()-2)));
        int age = Integer.parseInt(nameAge.substring(nameAge.length()-2));
        System.out.println(age);


        if(Integer.parseInt(nameAge.substring(nameAge.length()-2)) >= 70){
            System.out.println("Senior");
        }else {
            System.out.println("Adult");
        }


    }
}
