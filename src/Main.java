import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            int guess = 0;
            String name = "";
            int guessnum = 1;
            double x = Math.random();
            int r = 0;
            Scanner input = new Scanner(System.in);
            System.out.println("What is your name?");
            name = input.nextLine();
            System.out.println("How difficult would you like the game to be " + name);
            System.out.println("Press 1 for easy, 2 for medium, 3 for hard and 4 for impossible");
            while(guess != 1 && guess !=2 && guess != 3 && guess !=4) {
                guess = input.nextInt();
                if (guess == 1) {
                    r = (int) (x * 11);
                    System.out.println("Guess a number between 0 and 10 " + name);
                } else if (guess == 2) {
                    r = (int) (x * 101);
                    System.out.println("Guess a number between 0 and 100 " + name);
                } else if (guess == 3) {
                    r = (int) (x * 1001);
                    System.out.println("Guess a number between 0 and 1000 " + name);
                } else if (guess == 4) {
                    r = (int) (x * 10001);
                    System.out.println("Guess a number between 0 and 10,000 " + name);
                } else {
                    System.out.println("Incorrect input");
                }
            }
            guess = input.nextInt();
            while (guess != r)
            {
                System.out.println("Guess again");
                guessnum = guessnum + 1;
                guess = input.nextInt();
            }
            System.out.println("Congrats you guessed correctly");
            System.out.println("It took you " + guessnum + " guesses " + name);
    }
}
