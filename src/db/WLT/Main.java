package  db.WLT;
import java.sql.*;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {
    static int existingUser = 0;
    static String dbURL = "jdbc:mysql://localhost:3306/java31";
    static String username = "root";
    static String password = "Beata";
    static char again = 'y';
    static DataBase dataBase = new DataBase();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
            System.out.println("Welcome!");
            while (again == 'y') {
                System.out.println("Are you our driver(y/n)?");
                char action = scanner.next().toLowerCase().charAt(0);
                if (action == 'y') {

                    //call method userLogIn
                    userLogIn();

                } else if (action == 'n') {
                    //TODO to make method for this
                    System.out.println("Do you want to start job at us?");
                    System.out.println("Choose 'r' or 'q'");
                    System.out.println("r - register new driver");
                    System.out.println("q or other characters - quit");
                    String result = scanner.next();

                    if (result.toLowerCase().equals("r")){

                        //call method createUser
                        createUser();
                    } else {
                        System.out.println("Good luck!");
                    }
                }
                System.out.println("Do you want to do something more y/n");
                again = scanner.next().charAt(0);

            }
    }
    //method1
    public static void userLogIn() {
        DriversInfo driversLogInfo = new DriversInfo();
        scanner.nextLine();
        System.out.println("Enter driver`s license number from 5 numbers");
        driversLogInfo.setDlid(scanner.nextLine());
        System.out.println("Enter password from 7 letters and 1 number");
        driversLogInfo.setPswrd(scanner.nextLine());

        //DataBase class method for login check returns existing driver license No.
        int userId = dataBase.checkDlidAndPswrd(driversLogInfo.getDlid(), driversLogInfo.getpswrd());
        if (userId > 0) {
            System.out.println("You have logged in successfully!");
            System.out.println("What do you want to do - to enter new trip, to check your earnings or to quit?");
            System.out.println("Enter t for new trip");
            System.out.println("Enter c for your earnings");
            System.out.println("Enter q to quit the app");
            char same = scanner.next().toLowerCase().charAt(0);

            if (same == 't') {

                existingUser = userId;
                System.out.println("enter carID");
                System.out.println("1 - 'KE-1293'; 2 -'MN-1028'; 3 - 'DS-2033'; 4 - 'ML-543'; 5 - 'OL-9867'; 6 - 'LJ-2394'");
                int carID = scanner.nextInt();
                System.out.println("enter distance");
                System.out.println("1 - 5 km; 2 - 10 km; 3 - 15 km; 4 - 20 km; 5 - 25 km; 6 - 30 km; 7 - 35 km");
                int distID = scanner.nextInt();

                String dat;
                do{
                    System.out.println("enter date in this format YYYY-MM-DD");
                    dat = scanner.next();
                }while (!isLegalDate(dat));



                dataBase.createTrip(existingUser, carID, distID, dat);
            }else if(same == 'c'){
                System.out.println("Your earnings: " + dataBase.readEarnings(userId));
            }else{
                System.out.println("See you soon");
                System.exit(0);
            }

        } else{
            System.out.println("Password or username incorrect");
        }
    }
    //method2
    public static void createUser () {
        DriversInfo newDriver = new DriversInfo();
        System.out.println("Enter driver`s license number");
        newDriver.setDlid(scanner.nextLine());
        //Pattern to use
        Pattern pattern = Pattern.compile("[0-9]{5}");
        Matcher matcher = pattern.matcher(newDriver.getDlid());
        while (matcher.matches() == false) {
            System.out.println("Please enter a driver`s license number! It must be 5 numbers.");
            newDriver.setDlid(scanner.nextLine());
            pattern = Pattern.compile("[0-9]{5}");
            matcher = pattern.matcher(newDriver.getDlid());
        }
        //DataBase class method for dlid check returns 1 if true, 0 if false
        int userId = dataBase.checkDlid(newDriver.getDlid());

        while (userId > 0) {
            System.out.println("This driver license number already exists! Please check and enter correct number!");
            newDriver.setDlid(scanner.nextLine());
            pattern = Pattern.compile("[0-9]{5}");
            matcher = pattern.matcher(newDriver.getDlid());
            while (matcher.matches() == false) {

                System.out.println("Please enter a driver`s license number! It should be 5 numbers.");
                newDriver.setDlid(scanner.nextLine());
                pattern = Pattern.compile("[0-9]{5}");
                matcher = pattern.matcher(newDriver.getDlid());
            }
            userId = dataBase.checkDlid(newDriver.getDlid());
        }

        System.out.println("Please enter your password 7 letters and 1 number");
        newDriver.setPswrd(scanner.nextLine());

        pattern = Pattern.compile("[a-zA-Z]{5,20}[0-9]");
        matcher = pattern.matcher(newDriver.getpswrd());
        while (matcher.matches() == false) {
            System.out.println("7 letters and 1 number, please enter valid password!");
            newDriver.setPswrd(scanner.nextLine());
            pattern = Pattern.compile("[a-zA-Z]{5,20}[0-9]");
            matcher = pattern.matcher(newDriver.getpswrd());
        }

        System.out.println("Enter name");
        newDriver.setName(scanner.nextLine());
        pattern = Pattern.compile("[A-Za-z]{2,45}");
        matcher = pattern.matcher(newDriver.getName());
        while (matcher.matches() == false) {
            System.out.println("Please enter valid first name!");
            newDriver.setName(scanner.nextLine());
            pattern = Pattern.compile("[A-Za-z]{2,45}");
            matcher = pattern.matcher(newDriver.getName());
        }
        System.out.println("Enter your surname");
        newDriver.setSurname(scanner.nextLine());
        pattern = Pattern.compile("[A-Za-z]{2,45}");
        matcher = pattern.matcher(newDriver.getSurname());
        while (matcher.matches() == false) {
            System.out.println("Please enter valid surname!");
            newDriver.setSurname(scanner.nextLine());
            pattern = Pattern.compile("[A-Za-z]{2,45}");
            matcher = pattern.matcher(newDriver.getSurname());
        }
        existingUser = dataBase.createUser(newDriver.getDlid(), newDriver.getpswrd(), newDriver.getName(), newDriver.getSurname());
        if (existingUser > 0) {
            System.out.println("You have created an account successfully!");

        }
    }

    static boolean  isLegalDate(String s) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        sdf.setLenient(false);
        return sdf.parse(s, new ParsePosition(0)) != null;
    }
}











