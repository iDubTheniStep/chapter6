package Debugging;

import javax.swing.*;

public class FixDebugsix3
{
  public static void main(String[] args)
  {
    String userNumString;
    int userNum ,val;
    final int MIN = 1;
    final int MAX = 20;
    userNumString = JOptionPane.showInputDialog(null,
        "Enter a number between " + MIN + " and " + MAX + " inclusive");
    userNum = Integer.parseInt(userNumString);
    while(userNum < MIN | userNum > MAX)
    {
       //userNumString = JOptionPane.showInputDialog(null,
       System.out.println( "Number out of range" +
        "\nEnter a number between " + MIN + " and " + MAX + " inclusive");
       userNum = Integer.parseInt(userNumString);
    }
    for(val = userNum; val > 0; --val)
    {
      System.out.print(val + "  ");
      for(int x = 0; x < 100000; ++x)
       for(int y = 0; y < 10000; ++y);
       // Adjust these numbers for faster or slower performance
    }
    System.out.println("Blastoff!");
  }
}