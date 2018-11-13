import java.util.Scanner;
public class CoinFlip {
	static int heads = 0;
	static int tails = 0;
	public static void main(String[] args)
	{
		greetUser();
		flipCoin();
		giveTotal();
		//brilliant!
	}
	public static void greetUser()
	{
		// Here is the comment you asked me to add. 
		// How was your day Mr. Mcguire?
		// I hope is was good. Personally, mine was good.
		// Okay bye thanks for talking to me!
		System.out.println("Hi what's your name?");
		Scanner userInput = new Scanner(System.in);
		String name= userInput.nextLine();
		System.out.println("Hi" +" " +name + "!");
	}
	public static void flipCoin() 
	{
		Scanner userInput = new Scanner(System.in);
		System.out.println("How many times would you like to flip the coin?");
		
		int coinNumber = userInput.nextInt();
		for (int i=1;i<=coinNumber;i++)
		{
		if(Math.random() <.5)
		{
			heads++;
		}
		else
		{
			tails++;
		}
		}
			}
	
	public static void giveTotal()
	{
	System.out.println("Heads" + " " + heads);
	System.out.println("Tails" + " " + tails);
	}

}
