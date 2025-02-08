import java.util.Scanner;
import java.util.Random;

public class InteractiveProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        System.out.println("Welcome to the Interactive Java Program!");
        
        // Greeting
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        
        // Random Number Game
        int randomNumber = random.nextInt(100) + 1;
        System.out.println("Guess a number between 1 and 100: ");
        
        int guess;
        do {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            
            if (guess > randomNumber) {
                System.out.println("Too high! Try again.");
            } else if (guess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Congratulations, " + name + "! You guessed the right number.");
            }
        } while (guess != randomNumber);
        
        scanner.close();
    }
}
