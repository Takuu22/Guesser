import java.util.*;
public class Guesser {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        boolean online  = true;
        Random rand  = new Random();
        int Range = 0;
        System.out.println("Welcome to Guesser,Choose a Range of Numbers, 10, 100, or 1000 ");
        Range = input.nextInt();
        int NumToGuess = rand.nextInt(Range) +1;


        System.out.println("Welcome to Guesser, Guess a number between 1 and " + Range + " (-1 to give up, 0 to quit)");

        while(online){
            int guess = input.nextInt();
            if(guess == NumToGuess){
                System.out.println("Correct! the Number was "+NumToGuess+"!");
                System.out.println("New Number! Guess again");
                NumToGuess = rand.nextInt(Range) +1;
            }
            else if (guess == -1){
                System.out.println("Darn, the number was "+NumToGuess);
                System.out.println("New Number! Guess again");
                NumToGuess = rand.nextInt(Range) +1;
            }
            else if (guess == 0){
                online = false;
            }
            else if (guess < NumToGuess) {
                System.out.println("wrong, guess higher");
            }
            else if (guess > NumToGuess){
                System.out.println("wrong, guess lower");
            }
        }
        System.out.print("Thanks for playing, Goodbye");
    }
}
