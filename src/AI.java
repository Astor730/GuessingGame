import java.util.Scanner;

public class AI {
    public static void main(String[] args)
    {
        String userin = "";
        int guess = 50;
        int guessnum = 1;
        String name = "";
        int lowerlimit = 0;
        int upperlimit = 100;
        Scanner usertype = new Scanner(System.in);
        System.out.println("What's your name");
        name = usertype.nextLine();
        System.out.println("Guess a number between 1 and 100 " + name);
        System.out.println("Type correct, higher or lower to continue the code correctly");
        while (userin.equalsIgnoreCase("correct") != true)
        {
            System.out.println("Is your number" + guess);
            userin = usertype.nextLine();
            if(guess == 99)
            {
                guess = 100;
                guessnum++;
            }
            if (userin.equalsIgnoreCase("higher"))
            {
                lowerlimit = guess;
                upperlimit = lowerlimit + (upperlimit-lowerlimit);
                guess = guess+ ((int) (upperlimit - lowerlimit)/2);
                guessnum++;
            }
            else if(userin.equalsIgnoreCase("lower"))
            {
                upperlimit = guess;
                lowerlimit = upperlimit - (lowerlimit+upperlimit);
                guess = guess - ((int) (upperlimit - lowerlimit)/2);
                guessnum++;
            }
        }
        System.out.println("It took me " + guessnum + " guess " + name);

    }

}
