/*
 * Created by: Allison Cook
 * Created on: 10-April-2019
 * Created for: ICS4U
 * Day #12 (Max and Min Numbers)
 * This program generates 10 random numbers between 1 and 99 and finds the min and max number
 * then displays it to the user
*/
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MaxAndMin {

	private JFrame frmMaxAndMin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MaxAndMin window = new MaxAndMin();
					window.frmMaxAndMin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MaxAndMin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMaxAndMin = new JFrame();
		frmMaxAndMin.setTitle("Max and Min Numbers");
		frmMaxAndMin.setBounds(100, 100, 450, 300);
		frmMaxAndMin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMaxAndMin.getContentPane().setLayout(null);
		
		JLabel lblMaxNumber = new JLabel("Max Number:");
		lblMaxNumber.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMaxNumber.setBounds(52, 34, 91, 23);
		frmMaxAndMin.getContentPane().add(lblMaxNumber);
		
		JLabel lblMinNumber = new JLabel("Min Number:");
		lblMinNumber.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMinNumber.setBounds(52, 68, 91, 26);
		frmMaxAndMin.getContentPane().add(lblMinNumber);
		
		JLabel lblRandomNumbers = new JLabel("Random Numbers:");
		lblRandomNumbers.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblRandomNumbers.setBounds(52, 105, 116, 23);
		frmMaxAndMin.getContentPane().add(lblRandomNumbers);
		
		JLabel lblMaxNum = new JLabel("");
		lblMaxNum.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMaxNum.setBounds(158, 34, 91, 23);
		frmMaxAndMin.getContentPane().add(lblMaxNum);
		
		JLabel lblMinNum = new JLabel("");
		lblMinNum.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMinNum.setBounds(158, 68, 91, 23);
		frmMaxAndMin.getContentPane().add(lblMinNum);
		
		JLabel lblAllNum = new JLabel("");
		lblAllNum.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAllNum.setBounds(52, 126, 372, 38);
		frmMaxAndMin.getContentPane().add(lblAllNum);
		
		JButton btnStart = new JButton("Start");
		btnStart.addActionListener(new ActionListener() {
			//when button is clicked
			public void actionPerformed(ActionEvent arg0) {
				//variables
				int max = 0;
				int min = 0;
				int [] randomNum = new int [10];
				int random = 0;
				String list = "";
				
				//constants
				int RANDOMMAX = 99;
				int RANDOMMIN = 1;
				
				//generate random numbers
				for (int index = 0; index < 10; index++) {
					//get the random number
					random = (int) (Math.random()*((RANDOMMAX - RANDOMMIN) + 1) + RANDOMMIN);
					
					//add the number to the list
					randomNum[index] = random;
					
					//add to the string
					list = list + " " + Integer.toString(random) + ",";				
					}
			
				//call the functions
				max = Max(randomNum);
				min = Min(randomNum);
				
				//set the list of numbers
				lblAllNum.setText(list);
				lblMaxNum.setText("" + max);
				lblMinNum.setText(" " + min);
			
			}
			
		});
		btnStart.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnStart.setBounds(158, 201, 101, 32);
		frmMaxAndMin.getContentPane().add(btnStart);
	}
	
	public int Max(int[]randomNum) {
		//variables
		int max = 0;
		int currentNum = 0;
		
		//loop through the list and and find the max
		for(int index = 0; index < randomNum.length; index++) {
			//get a number
			currentNum = randomNum[index];
			
			//check if it is greater than the max value
			if(currentNum > max) {
				//set to max
				max = currentNum;
			}
		}
				
		return max;
	}
	
	public int Min(int[]randomNum) {
		//variables
		int min = 99;
		int currentNum = 0;
	
		//loop through the list and and find the mas
			for(int index = 0; index < randomNum.length; index++) {
				//get a number
				currentNum = randomNum[index];
					
				//check if it is smaller than the min value
				if(currentNum < min) {
					//set to max
					min = currentNum;
				}
			}
				
		return min;
	}
}
