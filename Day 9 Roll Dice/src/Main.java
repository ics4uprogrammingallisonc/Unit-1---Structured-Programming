/*
 * Created by: Allison Cook
 * Created on: 18-March-2019
 * Created for: ICS4U
 * Day #9 (Roll Dice)
 * This program randomly generates a value between 1 and a maxInput given by the user
 *  and displays it to the console
*/

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		//set maxValue
		int maxValue = 0;
		
		// allow the console to get input
		Scanner input = new Scanner(System.in);
		
		//ask the user to pick a number
		System.out.println("Enter the max value for a random number:");
		
		//check to make sure they only enter an int
		try {
				//get the user input
				maxValue = input.nextInt();
				//once maxvalue is changed call the rollDice function
				RollDice(maxValue);
				
			}
		catch(Exception e) {
				//if they didn't enter an integer ask them to
				System.out.println("Please only enter integers, no letters or decimal places");
			}

		//close the input
		input.close();
	}
	
	public static void RollDice(int maxValue) {
		//generate a random number
		int randomNumber = (int)(Math.random() * maxValue + 1);
		
		//display the random number to the user
		System.out.println("The random number is " + randomNumber);
		
		main(null);
	}
}