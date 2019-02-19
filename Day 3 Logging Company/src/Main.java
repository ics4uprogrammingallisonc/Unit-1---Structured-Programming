/*
 * Created by: Allison Cook
 * Created on: 04-Feb-2019
 * Created for: ICS4U
 * Day #3 (Logging Company)
 * This program gets the users input and calculates the mass of the log
 * and how many logs will fit on the truck
*/
import java.util.Scanner;
public class Main {
		public static void main (String args[]) 
		{
			//Variables
			double logWeight;
			double numLogs;
			
			//Constants
			final double MAX_WEIGHT = 1100;
			final double LENGTH1 = 0.25;
			final double LENGTH2 = 0.50;
			final double LENGTH3 = 1;
			
			//allow the console to take input
			Scanner input = new Scanner(System.in);
			
			//Ask the user for the length
			System.out.println("What size are the logs?");
			System.out.println("Chose between " + LENGTH1 + ", " + LENGTH2 + ", " + LENGTH3);
			
			//Gets the users number
			Double size = input.nextDouble();
			
			//check to see if the users number is one of the options
			while(size !=LENGTH1 && size != LENGTH2 && size != LENGTH3) 
			{
				//ask the user to input the right values
				System.out.println("Please input only one of the following numbers.");
				System.out.println( LENGTH1 + ", " + LENGTH2 + ", " + LENGTH3);
				size = input.nextDouble();
			}
			
				//continue with the calculations
				logWeight = 20 * size; 
				numLogs = MAX_WEIGHT/ logWeight; 
				
				//show the answer
				System.out.println("You can fit "+ numLogs + " logs on the truck.");
				
				//close the input
				input.close();

			
		}
}
