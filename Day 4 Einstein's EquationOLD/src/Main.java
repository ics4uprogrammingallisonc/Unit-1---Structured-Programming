/*
 * Created by: Allison Cook
 * Created on: 07-Feb-2019
 * Created for: ICS4U
 * Day #4 (Einstein's Equation)
 * This program gets the users input on the mass of an object, then calculates the amount of energy made by that object
 * Displays it to the user
*/
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		//allow the console to take input
		Scanner input = new Scanner(System.in);
		
		//Declare the variables
		double massObject;
		double energy;
		
		//constant
		final double SPEEDOFLIGHT = (2.998 * Math.pow(10, 8));
		
		//ask the user for a mass
		System.out.println("Enter a mass in kg for an object.");
		
		// get their input
		massObject = input.nextDouble();
		
		//check to see if the users number is greater than 0
		while (massObject <= 0) {
			//ask the user to input a number greater than 0
			System.out.println("Please enter a mass greater than 0.");
			
			//get the new input
			massObject = input.nextDouble();
		}
		
		//calculate the energy
		energy = massObject * Math.pow(SPEEDOFLIGHT, 2); 
		
		//Display the calculation to the user
		System.out.println("That object would produce " + energy + " jules of energy" );
		
		//close the input
		input.close();
		
	}
}
