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

public class Main {

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
		frmGame.setBounds(100, 100, 450, 454);
		frmGame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmGame.getContentPane().setLayout(null);
		
		JLabel lblplayerChoice = new JLabel("Players Choice:");
		lblplayerChoice.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblplayerChoice.setBounds(40, 27, 97, 31);
		frmGame.getContentPane().add(lblplayerChoice);
		
		JLabel lblComputer = new JLabel("Computer's Choice:");
		lblComputer.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblComputer.setBounds(221, 35, 126, 14);
		frmGame.getContentPane().add(lblComputer);
		
		JRadioButton rdbtnComputerRock = new JRadioButton("Rock");
		rdbtnComputerRock.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnComputerRock.setBounds(221, 73, 109, 23);
		frmGame.getContentPane().add(rdbtnComputerRock);
		
		JRadioButton rdbtnComputerPaper = new JRadioButton("Paper");
		rdbtnComputerPaper.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnComputerPaper.setBounds(221, 140, 109, 23);
		frmGame.getContentPane().add(rdbtnComputerPaper);
		
		JRadioButton rdbtnComputerScissors = new JRadioButton("Scissors");
		rdbtnComputerScissors.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnComputerScissors.setBounds(221, 206, 109, 23);
		frmGame.getContentPane().add(rdbtnComputerScissors);
		
		JRadioButton rdbtnPlayerScissors = new JRadioButton("Scissors");
		rdbtnPlayerScissors.setBounds(40, 205, 73, 25);
		frmGame.getContentPane().add(rdbtnPlayerScissors);
		rdbtnPlayerScissors.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JRadioButton rdbtnPlayerPaper = new JRadioButton("Paper");
		rdbtnPlayerPaper.setBounds(40, 139, 61, 25);
		frmGame.getContentPane().add(rdbtnPlayerPaper);
		rdbtnPlayerPaper.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JRadioButton rdbtnPlayerRock = new JRadioButton("Rock");
		rdbtnPlayerRock.setBounds(40, 72, 57, 25);
		frmGame.getContentPane().add(rdbtnPlayerRock);
		rdbtnPlayerRock.setFont(new Font("Tahoma", Font.PLAIN, 14));
	}
}
