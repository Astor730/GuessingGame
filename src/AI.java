import java.util.Scanner;

public class AI {
    public static void main(String[] args)
    {
        String userin = "";
        int guess = 50;
        int lowerlimit = 50;
        int upperlimit = 100;
        int lowerlimit2 = 0;
        int upperlimit2 = 50;
        Scanner usertype = new Scanner(System.in);
        System.out.println("Guess a number between 1 and 100");
        System.out.println("Type correct, higher or lower to continue the code correctly");
        while (userin.equalsIgnoreCase("correct"))
        {
            System.out.println("Is your number" + guess);
            if (userin.equalsIgnoreCase("higher"))
            {
                lowerlimit = (upperlimit - lowerlimit) + lowerlimit;
            }
            else if(userin.equalsIgnoreCase("lower"))
            {

            }
        }

    }

}
