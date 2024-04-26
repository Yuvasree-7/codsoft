import java.util.Random;
import java.util.Scanner;
public class GuessNumber{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        Random random=new Random();
        int min=1;
        int max=100;
        int attemptsLimit=5;
        int score=0;
        System.out.println("Welcome to Guess the Number!");
        boolean playAgain=true;
        while(playAgain){
            int randomNumber=random.nextInt(max-min+1)+min;
            int attempts=0;
            boolean guessedCorrectly=false;
            System.out.println("\n1 have selected a random number between " + min + " and " + max + ".");
            System.out.println("You have "+ attemptsLimit +" attempts to guess it.");
            while(attempts<attemptsLimit && !guessedCorrectly){
                System.out.println("\n Enter your guess:");
                int guess=scanner.nextInt();
                attempts++;
                if(guess==randomNumber){
                    System.out.println("Congralutions! You guessed the number "+ randomNumber+ " correctly in "+ attempts+ " attempts.");
                    guessedCorrectly=true;
                    score++;

                }
                else if(guess<randomNumber){
                    System.out.println("Too low! Try again.");
                }else{
                    System.out.println("Too High! Try again.");
                }
            }
            if(!guessedCorrectly){
                System.out.println("Sorry, You have used all your attempts. The correct number was "+ randomNumber+ ".");
            }
            System.out.println("\n Do you want to play again?(yes/no):");
            String playAgainInput=scanner.next();
            playAgain=playAgainInput.equalsIgnoreCase("yes");
        }
        System.out.println("\n Thank you for playing! Your final score is: "+score);
        scanner.close();
    }
}