/*
 * Created by: Allison Cook
 * Created on: 24-March-2019
 * Created for: ICS4U
 * Day #10 (Rock, Paper, scissors)
 * This program allows the user to play a game of rock, paper, scissors 
 * against the computer and displays the winner
*/

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Main {
	//variables 
	int userChoice;
	int compChoice;
	int numLost = 0;
	int numWon = 0;
	
	//Constants
	final int MAX = 3;
	final int MIN = 1;
	final int ROCK = 1;
	final int PAPER = 2;
	final int  SCISSORS = 3;
	

	private JFrame frmGame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frmGame.setVisible(true);
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
		frmGame = new JFrame();
		frmGame.setBounds(100, 100, 492, 491);
		frmGame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmGame.getContentPane().setLayout(null);
		
		JLabel lblplayerChoice = new JLabel("Players Choice:");
		lblplayerChoice.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblplayerChoice.setBounds(40, 19, 97, 31);
		frmGame.getContentPane().add(lblplayerChoice);
		
		JLabel lblComputer = new JLabel("Computer's Choice:");
		lblComputer.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblComputer.setBounds(252, 27, 126, 14);
		frmGame.getContentPane().add(lblComputer);
		
		JRadioButton rdbtnComputerRock = new JRadioButton("Rock");
		rdbtnComputerRock.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnComputerRock.setBounds(252, 73, 89, 23);
		frmGame.getContentPane().add(rdbtnComputerRock);
		
		JRadioButton rdbtnComputerPaper = new JRadioButton("Paper");
		rdbtnComputerPaper.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnComputerPaper.setBounds(252, 171, 80, 23);
		frmGame.getContentPane().add(rdbtnComputerPaper);
		
		JRadioButton rdbtnComputerScissors = new JRadioButton("Scissors");
		rdbtnComputerScissors.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnComputerScissors.setBounds(252, 265, 89, 23);
		frmGame.getContentPane().add(rdbtnComputerScissors);
		
		JRadioButton rdbtnPlayerScissors = new JRadioButton("Scissors");
		rdbtnPlayerScissors.setBounds(40, 264, 73, 25);
		frmGame.getContentPane().add(rdbtnPlayerScissors);
		rdbtnPlayerScissors.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JRadioButton rdbtnPlayerPaper = new JRadioButton("Paper");
		rdbtnPlayerPaper.setBounds(40, 170, 61, 25);
		frmGame.getContentPane().add(rdbtnPlayerPaper);
		rdbtnPlayerPaper.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JRadioButton rdbtnPlayerRock = new JRadioButton("Rock");
		rdbtnPlayerRock.setBounds(40, 72, 57, 25);
		frmGame.getContentPane().add(rdbtnPlayerRock);
		rdbtnPlayerRock.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblSicssors1 = new JLabel("");
		lblSicssors1.setIcon(new ImageIcon("N:\\a\\Sem2-Winter2019\\ICS4U Programming\\Cook, Allison (s241474)\\Unit 1 - Structured Programming\\Day 10 Rock Paper Scissors\\Images\\scissorsF.png"));
		lblSicssors1.setBounds(133, 233, 80, 80);
		frmGame.getContentPane().add(lblSicssors1);
		
		JLabel lblRcok1 = new JLabel("");
		lblRcok1.setIcon(new ImageIcon("N:\\a\\Sem2-Winter2019\\ICS4U Programming\\Cook, Allison (s241474)\\Unit 1 - Structured Programming\\Day 10 Rock Paper Scissors\\Images\\rock2.png"));
		lblRcok1.setBounds(133, 47, 80, 80);
		frmGame.getContentPane().add(lblRcok1);
		
		JLabel lblRock2 = new JLabel("");
		lblRock2.setIcon(new ImageIcon("N:\\a\\Sem2-Winter2019\\ICS4U Programming\\Cook, Allison (s241474)\\Unit 1 - Structured Programming\\Day 10 Rock Paper Scissors\\Images\\rock2.png"));
		lblRock2.setBounds(344, 47, 80, 80);
		frmGame.getContentPane().add(lblRock2);
		
		JLabel lblScissors2 = new JLabel("");
		lblScissors2.setIcon(new ImageIcon("N:\\a\\Sem2-Winter2019\\ICS4U Programming\\Cook, Allison (s241474)\\Unit 1 - Structured Programming\\Day 10 Rock Paper Scissors\\Images\\scissorsF.png"));
		lblScissors2.setBounds(344, 233, 80, 80);
		frmGame.getContentPane().add(lblScissors2);
		
		JLabel lblPaper1 = new JLabel("");
		lblPaper1.setIcon(new ImageIcon("N:\\a\\Sem2-Winter2019\\ICS4U Programming\\Cook, Allison (s241474)\\Unit 1 - Structured Programming\\Day 10 Rock Paper Scissors\\Images\\paperF.png"));
		lblPaper1.setBounds(133, 142, 80, 80);
		frmGame.getContentPane().add(lblPaper1);
		
		JLabel lblPaper2 = new JLabel("");
		lblPaper2.setIcon(new ImageIcon("N:\\a\\Sem2-Winter2019\\ICS4U Programming\\Cook, Allison (s241474)\\Unit 1 - Structured Programming\\Day 10 Rock Paper Scissors\\Images\\paperF.png"));
		lblPaper2.setBounds(344, 142, 80, 80);
		frmGame.getContentPane().add(lblPaper2);
		
		JLabel lblOutcome = new JLabel("");
		lblOutcome.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblOutcome.setBounds(40, 375, 97, 31);
		frmGame.getContentPane().add(lblOutcome);
		
		JLabel lblTimeLost = new JLabel("Times lost:");
		lblTimeLost.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblTimeLost.setBounds(295, 388, 83, 14);
		frmGame.getContentPane().add(lblTimeLost);
		
		JLabel lblTimesWon = new JLabel("Times won:");
		lblTimesWon.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblTimesWon.setBounds(295, 414, 83, 14);
		frmGame.getContentPane().add(lblTimesWon);
		
		JLabel lblNumLost = new JLabel("");
		lblNumLost.setBounds(374, 388, 46, 14);
		frmGame.getContentPane().add(lblNumLost);
		
		JLabel lblNumWon = new JLabel("");
		lblNumWon.setBounds(374, 413, 46, 14);
		frmGame.getContentPane().add(lblNumWon);
		
		////Put the buttons into a group
		ButtonGroup grbUser_Buttons = new ButtonGroup();
		grbUser_Buttons.add(rdbtnPlayerRock);
		grbUser_Buttons.add(rdbtnPlayerPaper);
		grbUser_Buttons.add(rdbtnPlayerScissors);
		
		//put the computers buttons in a group
		ButtonGroup grbComp_Buttons = new ButtonGroup();
		grbComp_Buttons.add(rdbtnComputerScissors);
		grbComp_Buttons.add(rdbtnComputerPaper);
		grbComp_Buttons.add(rdbtnComputerRock);
		
		JButton btnPlay = new JButton("Play");
		btnPlay.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnPlay.setBounds(189, 340, 97, 31);
		frmGame.getContentPane().add(btnPlay);
		btnPlay.addActionListener(new ActionListener() {
			//when the play button is clicked
			public void actionPerformed(ActionEvent arg0) {
				//find which button the user clicked
				if(rdbtnPlayerRock.isSelected()) {
					//set player choice to rock
					userChoice = ROCK;
				}
				else if (rdbtnPlayerPaper.isSelected()) {
					//set player choice to paper
					userChoice = PAPER;
				}
				else if (rdbtnPlayerScissors.isSelected()) {
					//set player choice to scissors
					userChoice = SCISSORS;
				}
				
				//get the computers choice, generate a random number
				int randomNum = (int)(Math.random() * ((MAX-MIN) + 1))+MIN;
				
				//set what the computer chose
				if (randomNum == 1) {
					//set the computer choice to rock
					compChoice = ROCK;
					
					//select the rock button
					rdbtnComputerRock.setSelected(true);
				}
				else if (randomNum == 2) {
					//set the computer choice to paper
					compChoice = PAPER;
					
					//select the paper button
					rdbtnComputerPaper.setSelected(true);
				}
				else if (randomNum == 3) {
					//set the computer choice to scissors
					compChoice = SCISSORS;
					
					//select the scissors button
					rdbtnComputerScissors.setSelected(true);
				}
				
				//compare the answers
				if (userChoice == compChoice) {
					//set to tie
					lblOutcome.setText("It's a tie!");
					
				}
				else if (userChoice < compChoice) {
					//set to lost
					lblOutcome.setText("You lost.");
					
					//add to lost counter
					numLost = numLost + 1;
					
					//display times won
					lblNumLost.setText(" " + numLost);
				}
				else if (userChoice > compChoice) {
					//set to win
					lblOutcome.setText("You won!!");
					
					//add to win counter
					numWon = numWon + 1;
					
					//display times won
					lblNumWon.setText(" " + numWon);
				}
				
			}
		});
	}
}
