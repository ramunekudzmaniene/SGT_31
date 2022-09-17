package db.WLT;
import java.sql.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {
    static int existingUser = 0; //pvz = int currentUserId = 0;T
    static int existingTrip = 0;
    static String dbURL = "jdbc:mysql://localhost:3306/java31";
    static String username = "root";
    static String password = "Beata";
    static char again = 'y';
    static DataBase dataBase = new DataBase();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(dbURL, username, password)) {
            System.out.println("Welcome!");
            while (again == 'y') {
                System.out.println("Are you our driver(y/n)?");
                char action = scanner.nextLine().toLowerCase().charAt(0);
                if (action == 'y') {
                   //call method userLogIn
                    userLogIn();
                } else if (action == 'n') {
                    //TODO to make method for this
                    System.out.println("Do you want to start job at us?");
                    System.out.println("Choose 'r' or 'q'");
                    System.out.println("r - register new driver");
                    System.out.println("q or other characters - quit");
                    String result = scanner.nextLine();

                    if (result.toLowerCase().equals("r")){
                       //call method createUser
                        createUser();

                    } else {
                        System.out.println("Good luck!");
                    }
                }
                System.out.println("Do you want to do something more y/n");
                again = scanner.nextLine().charAt(0);
                if (again == 'y') {
                    System.out.println("Choose 'r' or 't");
                    System.out.println("r - register new trip");
                    System.out.println("t - to check trips and earnings");
                    String result = scanner.nextLine();
                    if (result.toLowerCase().equals("r")) {
                        //createTrip();
                    }else{
                        //checkTrips();
                    }

                }
            }
        } catch(Exception e){
            e.printStackTrace();
        }
    }
    //method1
    public static void userLogIn() { //pvz login
        DriversInfo driversLogInfo = new DriversInfo();
        //mano driversLogInfo = currentUser

        System.out.println("Enter driver`s license number");
        driversLogInfo.setDlid(scanner.nextLine());
        System.out.println("Enter password");
        driversLogInfo.setPswrd(scanner.nextLine());
        //DataBase class method for login check returns existing driver license No.
        //kas yra userId????
        int userId = dataBase.checkDlidAndPswrd(driversLogInfo.getDlid(), driversLogInfo.getpswrd());
                if (userId > 0) {
                    System.out.println("You have logged in successfully!");
                    existingUser = userId;
                } else {
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
            //check username, but for me user driver license number
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

                System.out.println("Please enter your password");
                newDriver.setPswrd(scanner.nextLine());

                pattern = Pattern.compile("[a-zA-Z]{7}[0-9]");
                matcher = pattern.matcher(newDriver.getpswrd());
                while (matcher.matches() == false) {
                    System.out.println("7 letters and 1 digit, please enter valid password!");
                    newDriver.setPswrd(scanner.nextLine());
                    pattern = Pattern.compile("[a-zA-Z]{7}[0-9]");
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


                ////CurrentUserID returns new userID Nr.
                // currentUserId = dataBase.createUser(newUser.getUsername(), newUser.getPswd(), newUser.getFullName(), newUser.getEmail());
                existingUser = dataBase.createUser(newDriver.getDlid(), newDriver.getpswrd(), newDriver.getName(), newDriver.getSurname());
                if (existingUser > 0) {
                    System.out.println("You have created an account successfully!");
                }
            }
    //method3
    /*public static void createTrip (){
        TripInfo newTrip = new TripInfo();

        System.out.println("Enter km driven");
        newTrip.setDistance(scanner.nextInt);
        Pattern pattern = Pattern.compile("[0-9]{5}");
        Matcher matcher = pattern.matcher(newTrip.getDistance();



        existingTrip = dataBase.createTrip(newTrip.getDistance(), newTrip.getDate_time(), newTrip.getPrice() );
        if (existingTrip > 0){
            System.out.println("You have created new trip successfully");
        }

    }*/

}



