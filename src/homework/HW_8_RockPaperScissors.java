package homework;

import java.util.Scanner;

public class HW_8_RockPaperScissors {
    public static void main(String[] args) {

        String rock;
        String paper;
        String scissors;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Player1 picks the word from Rock, Paper Scissors");
        String word1 = scanner.nextLine().trim().toLowerCase();
        System.out.println("Player2 picks the word from Rock, Paper, Scissors");
        String word2 = scanner.nextLine().trim().toLowerCase();

        if(word1.equals(word2)) {
            System.out.println("TIE");
        }else{
            if((word1.equals("rock") && word2.equals("scissors")) || (word1.equals("paper") && word2.equals("rock")) || (word1.equals("scissors") && word2.equals("paper"))) {
                System.out.println("Player1 wins");
            }else{
                System.out.println("Player2 wins");
            }

        }
    }
}
