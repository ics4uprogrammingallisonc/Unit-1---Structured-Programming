/*
 * Created by: Allison Cook
 * Created on: 5-April-2019
 * Created for: ICS4U
 * Day #11 (Board foot)
 * This program asks the user for the length and width of a board
 * Then it calculates the height for it to be a board foot which is 144 inches cubed
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

	private JFrame frmBoardFoot;
	private JTextField txtLength;
	private JTextField txtWidth;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frmBoardFoot.setVisible(true);
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
		frmBoardFoot = new JFrame();
		frmBoardFoot.setTitle("Board foot");
		frmBoardFoot.setBounds(100, 100, 365, 300);
		frmBoardFoot.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBoardFoot.getContentPane().setLayout(null);
		
		JLabel lblEnterLength = new JLabel("Enter length:");
		lblEnterLength.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEnterLength.setBounds(28, 36, 80, 17);
		frmBoardFoot.getContentPane().add(lblEnterLength);
		
		txtLength = new JTextField();
		txtLength.setBounds(121, 36, 132, 20);
		frmBoardFoot.getContentPane().add(txtLength);
		txtLength.setColumns(10);
		
		JLabel lblEnterWidth = new JLabel("Enter width:");
		lblEnterWidth.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEnterWidth.setBounds(28, 84, 80, 17);
		frmBoardFoot.getContentPane().add(lblEnterWidth);
		
		txtWidth = new JTextField();
		txtWidth.setBounds(121, 84, 132, 20);
		frmBoardFoot.getContentPane().add(txtWidth);
		txtWidth.setColumns(10);
		
		JLabel lblAnswerStatement = new JLabel("The height of the board is:");
		lblAnswerStatement.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAnswerStatement.setBounds(28, 207, 182, 23);
		frmBoardFoot.getContentPane().add(lblAnswerStatement);
		
		JLabel lblAnswer = new JLabel("");
		lblAnswer.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAnswer.setBounds(202, 207, 89, 23);
		frmBoardFoot.getContentPane().add(lblAnswer);
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(new ActionListener() {
			//when the button is clicked
			public void actionPerformed(ActionEvent arg0) {
				//variables
				String length = "";
				String width = "";
				Double lengthNum = 0.0;
				Double widthNum = 0.0;
				Double height = 0.0;
				
				//constant
				final int MAX_VOLUME = 144;
				
				//get the users input
				length = txtLength.getText();
				width = txtWidth.getText();
				
				//convert to numbers
				try {
					lengthNum = Double.parseDouble(length);
					widthNum = Double.parseDouble(width);
				}
				catch(Exception e){
					//display a message saying to only enter numbers
					JOptionPane.showMessageDialog(null, "Please enter only numbers as your length and width");
				}
				
				//calculate the height by dividing the max volume by the length times the width
				height = MAX_VOLUME/(lengthNum*widthNum);
				
				//round the height if it has more than three decimal places
				height = Math.round(height*100.0)/100.0;
				
				//display the height to the user
				lblAnswer.setText("" + height + " inches");
			}
		});
		btnCalculate.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnCalculate.setBounds(121, 140, 89, 23);
		frmBoardFoot.getContentPane().add(btnCalculate);
	}
}
