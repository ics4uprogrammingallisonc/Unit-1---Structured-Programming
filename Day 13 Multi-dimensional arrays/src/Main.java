/*
 * Created by: Allison Cook
 * Created on: 10-April-2019
 * Created for: ICS4U
 * Day #13 (Multi-dimensional arrays)
 * This program creates a 2D array with students and their assignment marks 
 * then calculates the classes overall average and displays it to the user.
*/
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main {

	private JFrame frmdArrays;
	private JTextField txtNumStudents;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frmdArrays.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmdArrays = new JFrame();
		frmdArrays.setTitle("2D arrays");
		frmdArrays.setBounds(100, 100, 450, 300);
		frmdArrays.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmdArrays.getContentPane().setLayout(null);
		
		JLabel lblNumberOfStudents = new JLabel("Number of Students:");
		lblNumberOfStudents.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNumberOfStudents.setBounds(26, 38, 132, 24);
		frmdArrays.getContentPane().add(lblNumberOfStudents);
		
		txtNumStudents = new JTextField();
		txtNumStudents.setBounds(172, 42, 121, 20);
		frmdArrays.getContentPane().add(txtNumStudents);
		txtNumStudents.setColumns(10);
		
		JLabel lblAverage = new JLabel("Average:");
		lblAverage.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAverage.setBounds(103, 195, 55, 24);
		frmdArrays.getContentPane().add(lblAverage);
		
		JLabel lblAve = new JLabel("");
		lblAve.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAve.setBounds(178, 198, 115, 21);
		frmdArrays.getContentPane().add(lblAve);
		
		JButton btnStart = new JButton("Start");
		btnStart.addActionListener(new ActionListener() {
			//when clicked
			public void actionPerformed(ActionEvent arg0) {
				//variables
				int numStudents = 0;
				int random = 0;
				double average = 0.0;
				String endText = "";
				
				//constants
				final int MAX = 100;
				final int MIN = 0;
				
				//try to parse textbox
				try {
					//get numStudents
					numStudents = Integer.parseInt(txtNumStudents.getText());
					
					//create the array
					int[][] studentMarks = new int[numStudents][6];
					
					//loop through the number of students
					for(int student = 0; student <= numStudents - 1; student++) {
						// loop through number of assignments
						for(int assignment = 0; assignment <= 6 - 1; assignment ++) {
							
							//generate the random number
							random = (int)(Math.random()*((MAX - MIN) + 1)+ MIN);
						
							//add to the array
							studentMarks[student][assignment] = random;
						}
					}
					
					//calculate the average
					average = Average(studentMarks, numStudents);
					
					//set to string
					endText = Double.toString(average);
					
					//display the average
					lblAve.setText(endText);
					
				} catch (Exception e) {
					//display the error message
					JOptionPane.showMessageDialog(null, "Please enter only numbers");
				}
				
				
			}});
		btnStart.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnStart.setBounds(172, 120, 89, 23);
		frmdArrays.getContentPane().add(btnStart);
	}
	
	public double Average(int[][]studentMarks, int numStudents) {
		System.out.println("Called");
		//variables
		double average = 0.0;
		int mark = 0;
		int totalSum = 0;
		
		//loop through the students
		for (int index = 0; index < studentMarks.length; index++) {
			 
			//loop through each students marks
			for(int marks = 0; marks < studentMarks[1].length; marks ++) {
				
				//get the students mark
				mark = studentMarks[index][marks];
				
				//add to the total
				totalSum = totalSum + mark;
			}
		}
		
		//calculate the average
		average = totalSum/(numStudents * 6);
		
		return average;
	}
}
