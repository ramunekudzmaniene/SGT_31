package Lectures;

import java.util.Scanner;

public class StringExamples {
    public static void main(String[] args) {

        String text1 = "This is text example.";
        String text2 = text1.intern();
        System.out.println(text2);

        //Concatenation
        String input1 = "This is ";
        String input2 = "input text.";

        String inputCombined = input1.concat(input2);
        System.out.println(inputCombined);

        //Equals
        String text11 = "This is ";
        String text22 = "This is ";
        System.out.println(text11.equals(text22));
        System.out.println(text22.equals(text11));

        //String clas  methods

        String inputText = "This is my text";
        //Length
        System.out.println(inputText.length());

        //to Upper case
        System.out.println(inputText.toUpperCase());

        //to Lower case
        System.out.println(inputText.toLowerCase());

        System.out.println(inputText);

        //IndexOf()
        String speakingText = "This is test value";
        System.out.println(speakingText.indexOf('e'));
        System.out.println(speakingText.indexOf("is"));
        System.out.println(speakingText.indexOf(" is "));

        //Replace All() Šūdas
        String textForTv = "This phone is complete šūdas. And this case is also šūdas.";
        System.out.println(textForTv.replaceAll("šūdas", "š***s"));

        //Character index
        System.out.println(textForTv.charAt(textForTv.length()-1));


        //SubString
        System.out.println(textForTv.substring(5));
        System.out.println(textForTv.substring(5, 10));

        //Parsing
        //Converting String to primitive other Data types

        String intValue = "165";
        String floatValue = "2.0";
        String doubleValue = "2.45454545";
        String boolValue = "true";
        String longValue = "100000000000";

        System.out.println(Integer.parseInt(intValue)+4);

        //Trim method
        System.out.println("          this is the test    ".trim());

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter password (quert*)");
        String pswd = scanner.nextLine().trim().toLowerCase();

        if(pswd.equals("querty")){
            System.out.println("Password correct");
        } else{
            System.out.println("Password incorrect");
        }
    }
}
