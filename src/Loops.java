import java.util.Scanner;
public class Loops {
    public static void main(String[] args) {
/*      System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");

 */
        for(int i=0; i<10; i++){
            System.out.println("Hello World " + i);
        }
        //while
        int i = 0;
        while(i < 10){
            System.out.println("Hello Ramune!");
            i++;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter any number");
        int input = scanner.nextInt();

        while (input != 0 ){
            System.out.println("+100");
            System.out.println("Please enter any number");
                    input = scanner.nextInt();
        }
        //Do while
        int j = 10;
        while(j<10){
            System.out.println("This is While loop");
            j++;
        }
        do{
            System.out.println("This is the Do While loop");
        }while(j<10);
    }
}

