package GameZone;

import javax.swing.JOptionPane;

public class RandomGuess3
{

	public static void main(String[] args)
	{
		int guess;
		int result;
		String resultString;
		String msg = null;
		int low = 1;
		int high = 100;
		int score = 10;
		
		result = low + (int)(Math.random() * high);
		do {
		resultString = JOptionPane.showInputDialog(null, "Try to guess my number between 1 and 100. ");
		guess = Integer.parseInt(resultString);
		
		
		if(guess == result)
		{
			msg = ("You got it. Better than austin could do.");
	  
		}
		if(guess >= result)
		{
			msg = ("Your guess was too high. Still better than austin");
		}
		if(guess <= result)
		{
			msg = ("your guess was too low. its ok austin would of choose 0 for some reason.");
		}
		if(guess != result )
		{
			score--;
		}
		
		JOptionPane.showMessageDialog(null , msg + " Your score is " + score );
		
		}while(score != 0);
	}
	
}
