package Exercises;
public class CountByThrees 
{
	public static void main(String[] args) 
	{
		int numberline = 30;
		for(int x = 0; x<300; x=x+3)
		{
			System.out.print(x + " ");
			if(x % numberline == 0)
				System.out.println();
				
		}
	}
}
