import java.util.Scanner;

public class AI {
    public static void main(String[] args)
    {
        String userin = "";
        int guess = 50;
        Scanner usertype = new Scanner(System.in);
        System.out.println("Guess a number between 1 and 100");
        System.out.println("Type correct, higher or lower to continue the code correctly");
        while (userin.equalsIgnoreCase("correct") != true)
        {
            System.out.println("Is your number " + guess + "?");
            userin = usertype.nextLine();
            if(userin.equalsIgnoreCase("correct"))
            {
                System.out.println("I guessed correctly");
            }
            else if(userin.equalsIgnoreCase("higher"))
            {
                guess = 75;
            }
            else if(userin.equalsIgnoreCase("lower"))
            {
                guess = 25;
            }
            else
            {
                System.out.println("That's not a correct input");
            }
        }

    }

}
