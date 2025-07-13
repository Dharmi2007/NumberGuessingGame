/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Random;
import java.util.Scanner;

//Gauss the number

class GuessingGame{
    public int number;
    public int inputnumber;
    public int gaussesnumber = 0;

    GuessingGame()
    {
        Random random = new Random();
        this.number = random.nextInt(100);
    }
    
    public int getgaussesnumber()
    {
        return gaussesnumber;
    }
    public void setgaussesnumber(int gaussesnumber)
    {
        this.gaussesnumber = gaussesnumber;
    }
    
    public void TakeUserInput(Scanner sc)
        {
            System.out.println("Enter your guess number (between 1 to 100) : ");
            inputnumber = sc.nextInt();
        }
        
        public boolean iscorrectnumber()
        {
            gaussesnumber ++;
            if(inputnumber == number)
            {
                System.out.format("Hurrah!..Yes you are right,it was %d\n You have guess number in %d attemped.",number,gaussesnumber);
                return true;
            }
            else{
                if(inputnumber<number)
                {
                    System.out.println("Too low! Try a higher number.");
                }
                else{
                    if(inputnumber>number)
                    {
                        System.out.println("Too high! Try a lower number.");
                    }
                }
            }
            return false;
        }
    }

public class Guessnumber
{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		GuessingGame game = new GuessingGame();
        System.out.println("Welcome to the Number Guessing Game!");
		boolean correct = false;
		while(!correct)
		{
		    game.TakeUserInput(sc);
		    correct = game.iscorrectnumber();
		}
        sc.close();
    }
}