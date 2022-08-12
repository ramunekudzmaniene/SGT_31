public class MethodsExamples {
    public static void main(String[] args) {
        //to call method

        printName("Karlis");
        printName("Ramune");
        printName("Greta");
        String introText = returnName("Vaidas");
        System.out.println(introText);
        System.out.println(returnName("Jonas"));

        personalInfo("Beata",16);

        int calculation = sum(45,45,45);
        if(calculation >=100){
            System.out.println("over 100");
        }else{
            System.out.println("under 100");
        }

    }
    public static void printName(String name){
        System.out.println("Hello " + name);
    }

    public static String returnName (String name){
        System.out.println("----- Inside returnName method ----");
        return "Hello one more time " + name;
    }

    public static void personalInfo(String name, int age){
        System.out.printf("Your name is %s and you are %d years old\n", name,age);

    }

    public static int sum (int num1, int num2, int num3){
        return num1+num2+num3;

    }

}
