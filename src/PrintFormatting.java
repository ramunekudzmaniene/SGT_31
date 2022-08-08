public class PrintFormatting {
    public static void main(String[] args) {


        //s is for string
        // d - decimal
        // f - float
        //c - char
        // b - boolean

        String name = "Bill";
        int age = 34;

        System.out.println("Hello " + name + " your age is " + age);
        System.out.printf("Hello %s your age is %d \n", name,age);

        System.out.printf("Hello %1$s your age is %2$d", name, age);

        double height = 192.45345;
        System.out.println();
        System.out.printf("%s is %.2f cm tall", name, height);
    }
}
