package homework;

import java.util.Scanner;

public class HW_7_PalindromeWord {
    public static void main(String[] args) {

        //Program will check do word is Palindrome or not
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any word.");
        String word = scanner.nextLine().trim().toLowerCase().replaceAll(" ","");
        //System.out.println(word);
        // MA dam

        boolean isPalindrome = true;

        for(int i = 0; i < word.length()/2; i++){
            if (word.charAt(i) != word.charAt(word.length() - i - 1)) {
                isPalindrome = false;
                break;
            }
        }
        if(isPalindrome == true){
            System.out.printf("Your input %s is a palindrome \n", word);
        }else{
            System.out.printf("Your input %s isn't a palindrome \n", word);
        }
    }
}
