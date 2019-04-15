/*
 * Created by: Allison Cook
 * Created on: 15-April-2019
 * Created for: ICS4U
 * Day #15 (Student ADT)
 * This program takes the information for a student and uses an ADT to hold the information 
 * then displays it to the user.
*/
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main {

	private JFrame frm;
	private JTextField txtFirstName;
	private JTextField txtLastName;
	private JTextField txtMiddle;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frm.setVisible(true);
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
		frm = new JFrame();
		frm.setTitle("Student ADT");
		frm.setBounds(100, 100, 307, 300);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.getContentPane().setLayout(null);
		
		JLabel lblFirstName = new JLabel("First name:");
		lblFirstName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblFirstName.setBounds(22, 32, 88, 14);
		frm.getContentPane().add(lblFirstName);
		
		JLabel lblLastName = new JLabel("Last name");
		lblLastName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblLastName.setBounds(22, 72, 88, 14);
		frm.getContentPane().add(lblLastName);
		
		JLabel lblMiddle = new JLabel("Middle initial:");
		lblMiddle.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMiddle.setBounds(22, 111, 88, 14);
		frm.getContentPane().add(lblMiddle);
		
		JLabel lblGrade = new JLabel("Grade:");
		lblGrade.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblGrade.setBounds(22, 145, 53, 14);
		frm.getContentPane().add(lblGrade);
		
		JLabel lblIdentified = new JLabel("Identified:");
		lblIdentified.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblIdentified.setBounds(22, 180, 77, 14);
		frm.getContentPane().add(lblIdentified);
		
		txtFirstName = new JTextField();
		txtFirstName.setBounds(120, 31, 114, 20);
		frm.getContentPane().add(txtFirstName);
		txtFirstName.setColumns(10);
		
		txtLastName = new JTextField();
		txtLastName.setBounds(120, 71, 114, 20);
		frm.getContentPane().add(txtLastName);
		txtLastName.setColumns(10);
		
		txtMiddle = new JTextField();
		txtMiddle.setBounds(120, 110, 114, 20);
		frm.getContentPane().add(txtMiddle);
		txtMiddle.setColumns(10);
		
		JCheckBox chckbxIdentified = new JCheckBox("");
		chckbxIdentified.setBounds(120, 178, 97, 23);
		frm.getContentPane().add(chckbxIdentified);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "7", "8", "9", "10", "11", "12"}));
		comboBox.setBounds(120, 144, 114, 20);
		frm.getContentPane().add(comboBox);
		
		JButton btnEnter = new JButton("Enter");
		btnEnter.addActionListener(new ActionListener() {
			//when the button is clicked
			public void actionPerformed(ActionEvent arg0) {
				//create the new object
				Student studentInfo = new Student();
				
				//get the first name
				studentInfo.firstName = txtFirstName.getText();
				
				//get the last name
				studentInfo.lastName = txtLastName.getText();
				
				//get the middle initial
				studentInfo.middleInitial = txtMiddle.getText();
				
				//get grade
				studentInfo.grade = comboBox.getSelectedIndex();
				
				//get identification
				boolean indentified = chckbxIdentified.isSelected();
				
				//check if it is identified or not 
				if(indentified == true) {
					//set the studentInfo
					
				}
					
			}
		});
		btnEnter.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnEnter.setBounds(22, 227, 89, 23);
		frm.getContentPane().add(btnEnter);
	}
	
	//create a class for the students
	class Student
	{
			String firstName;
			String lastName;
			String middleInitial;
			int grade;
			String identified;
			
			//to display for the user
			public void Display() {
				//display to the user
				JOptionPane.showMessageDialog(null, " " + firstName + " " + middleInitial + " " + lastName + " is in grade " + grade +" and is " + identified );
			}
	}
	
}
