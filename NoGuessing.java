import java.util.Random;
import java.util.Scanner;

public class NoGuessing {
    public static void main(String[] args) {
        
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess;
        int attempts = 0;
        int min = 1;
        int max = 100;
        int randomNumber = random.nextInt(min, max +1);

        System.out.println("---------Number Guessing Game---------\n");
        System.out.printf("Guess a number between %d-%d\n", min, max);

        do{
            System.out.print("Enter a guess: ");
            guess = scanner.nextInt();
            attempts++;

            if(guess < randomNumber){
                System.out.println("Too Low! Try again\n");
            }
            else if(guess > randomNumber){
                System.out.println("Too High! Try again\n");
            }
            else{
                System.out.println("Correct! The number was " + randomNumber);
                System.out.println("\nNumber of attempts: " + attempts);
                System.out.println("---------------------------------\n");
            }

        }while(guess != randomNumber);
        scanner.close();
    }
}