package db;

public class Try {
    public static void main(String[] args) {
        System.out.println("Hello");

        try{
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[2]);
            //System.out.println(numbers[3]);

        } catch (Exception e){
            System.out.println(e);
            System.out.println("Something wrong");

        }
        System.out.println("World");
    }

}
