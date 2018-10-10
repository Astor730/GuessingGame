import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String guess = "";
        double x = Math.random();
        int r = (int) x * 11;
        String ran = Integer.toString(r);
        Scanner input = new Scanner(System.in);
        System.out.println("Guess a number between 0 and 10");
        guess = input.nextLine();
        while (!guess.equals(ran))
        {
            System.out.println("Guess again");
            guess = input.nextLine();
        }
        System.out.println("Congrats you guess correctly");
    }
}
