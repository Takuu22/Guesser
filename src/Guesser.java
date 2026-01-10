import java.util.*;
public class Guesser {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        boolean online  = true;
        Random rand  = new Random();


        System.out.println("Welcome to Guesser, Guess a number between 1 and 100 (000 to quit)");

        while(online){
            int NumToGuess = (int) rand.nextInt(100)+1;
            int guess = input.nextInt();
            if(guess > NumToGuess){
                System.out.println("Wrong, guess lower");
            }
            else if (guess < NumToGuess) {
                System.out.println("wrong, guess higher");
            }
            else if (guess == 000){
                System.out.println("Darn, the number was "+NumToGuess);
                System.out.println("New Number! Guess again");
            }
            else {
                System.out.println("Correct! the Number was "+NumToGuess+"!");
                System.out.println("New Number! Guess again");
            }
        }
        System.out.print("Thanks for playing, Goodbye");
    }
}
