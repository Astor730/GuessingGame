import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            int guess = 0;
            int guessnum = 1;
            double x = Math.random();
            int r = (int) (x * 11);
            Scanner input = new Scanner(System.in);
            System.out.println("Guess a number between 0 and 10");
            guess = input.nextInt();
            while (guess != r)
            {
                System.out.println("Guess again");
                guessnum = guessnum + 1;
                guess = input.nextInt();
            }
            System.out.println("Congrats you guessed correctly");
            System.out.println("It took you " + guessnum + " guesses");
    }
}
