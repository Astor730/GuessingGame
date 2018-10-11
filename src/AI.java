import java.util.Scanner;

public class AI {
    public static void main(String[] args)
    {
        String userin = "";
        Scanner usertype = new Scanner(System.in);
        System.out.println("Guess a number between 1 and 100");
        while (userin != "correct")
        {
            System.out.println("Is your number 50");
            userin = usertype.nextLine();
            if (userin.equals("higher"))
            {

            }
            else if(userin.equals("lower"))
            {

            }
        }
    }

}
