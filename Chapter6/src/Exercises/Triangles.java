package Exercises;

import java.util.Scanner;

public class Triangles
{

	public static void main(String[] args)
	{
		
		double side1;
		double side2 = 0;
		double side3 = 0;
		String chooseSideString = null;
		int stop = 1;
		
		while(stop == 1)
		{
		Scanner input = new Scanner(System.in);
		System.out.println("please enter which side you're trying to solve for \nA \nB \nC");
		chooseSideString= input.nextLine();
		
		if(chooseSideString.equalsIgnoreCase("A"));
		{
			System.out.println("Please enter side B");
			side2 = input.nextInt(); 
			
			System.out.println("Please enter side C");
			side3 = input.nextInt();
			
			side1 = Math.sqrt(side3)- Math.sqrt(side2);
			
			System.out.println("Side A = " + side1);
		}
		
		if(chooseSideString.equalsIgnoreCase("B"));
		{
			System.out.println("Please enter side C");
			side3 = input.nextInt(); 
			
			System.out.println("Please enter side A");
			side1 = input.nextInt();
			
			side2 = Math.sqrt(side3)- Math.sqrt(side2);
			
			System.out.println("Side B = " + side1);
		}
		
		if(chooseSideString.equalsIgnoreCase("C"));
		{
			System.out.println("Please enter side A");
			side1 = input.nextInt(); 
			
			System.out.println("Please enter side B");
			side2 = input.nextInt();
			
			side3 = Math.sqrt(side1) + Math.sqrt(side2);
			
			System.out.println("Side C = " + side1);
		}
		System.out.println("would you like to stop? 1 for no 2 for yes.");
		stop = input.nextInt(); 
		}
		
		}
		

}
