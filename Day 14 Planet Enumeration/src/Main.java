/*
 * Created by: Allison Cook
 * Created on: 14-April-2019
 * Created for: ICS4U
 * Day #14 (Planet Enumeration)
 * This program uses enumeration to reference the planet position and name
*/
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
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
		frame = new JFrame();
		frame.setBounds(100, 100, 334, 356);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblPlanet = new JLabel("Click ont the planet that you want to go to:");
		lblPlanet.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPlanet.setBounds(20, 11, 295, 17);
		frame.getContentPane().add(lblPlanet);
		
		JButton btnMercury = new JButton("Mercury");
		btnMercury.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//set the value of the planet
				EnumTest planet = new EnumTest (Planets.MERCURY);
				//call the text fucntion
				planet.displayPlanet();
			}
		});
		btnMercury.setForeground(Color.BLACK);
		btnMercury.setBackground(new Color(153, 153, 153));
		btnMercury.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnMercury.setBounds(47, 39, 89, 23);
		frame.getContentPane().add(btnMercury);
		
		JButton btnVenus = new JButton("Venus");
		btnVenus.setBackground(new Color(255, 51, 51));
		btnVenus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//set the value of the planet
				EnumTest planet = new EnumTest (Planets.VENUS);
				//call the text fucntion
				planet.displayPlanet();
			}
		});
		btnVenus.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnVenus.setBounds(47, 73, 89, 23);
		frame.getContentPane().add(btnVenus);
		
		JButton btnEarth = new JButton("Earth");
		btnEarth.setBackground(new Color(255, 255, 102));
		btnEarth.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//set the value of the planet
				EnumTest planet = new EnumTest (Planets.EARTH);
				//call the text fucntion
				planet.displayPlanet();
			}
		});
		btnEarth.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnEarth.setBounds(47, 107, 89, 23);
		frame.getContentPane().add(btnEarth);
		
		JButton btnMars = new JButton("Mars");
		btnMars.setBackground(new Color(102, 153, 51));
		btnMars.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//set the value of the planet
				EnumTest planet = new EnumTest (Planets.MARS);
				//call the text fucntion
				planet.displayPlanet();
			}
		});
		btnMars.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnMars.setBounds(47, 141, 89, 23);
		frame.getContentPane().add(btnMars);
		
		JButton btnJupiter = new JButton("Jupiter");
		btnJupiter.setBackground(new Color(0, 102, 255));
		btnJupiter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//set the value of the planet
				EnumTest planet = new EnumTest (Planets.JUPITER);
				//call the text fucntion
				planet.displayPlanet();
			}
		});
		btnJupiter.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnJupiter.setBounds(47, 175, 89, 23);
		frame.getContentPane().add(btnJupiter);
		
		JButton btnSaturn = new JButton("Saturn");
		btnSaturn.setBackground(new Color(153, 255, 204));
		btnSaturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//set the value of the planet
				EnumTest planet = new EnumTest (Planets.SATURN);
				//call the text fucntion
				planet.displayPlanet();
			}
		});
		btnSaturn.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnSaturn.setBounds(47, 209, 89, 23);
		frame.getContentPane().add(btnSaturn);
		
		JButton btnUranus = new JButton("Uranus");
		btnUranus.setBackground(new Color(255, 153, 153));
		btnUranus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//set the value of the planet
				EnumTest planet = new EnumTest (Planets.URANUS);
				//call the text fucntion
				planet.displayPlanet();
			}
		});
		btnUranus.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnUranus.setBounds(47, 243, 89, 23);
		frame.getContentPane().add(btnUranus);
		
		JButton btnNeptune = new JButton("Neptune");
		btnNeptune.setBackground(new Color(204, 51, 255));
		btnNeptune.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//set the value of the planet
				EnumTest planet = new EnumTest (Planets.NEPTUNE);
				//call the text fucntion
				planet.displayPlanet();
			}
		});
		btnNeptune.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNeptune.setBounds(47, 277, 89, 23);
		frame.getContentPane().add(btnNeptune);
	}
	
	//create the enumeration
	public enum Planets {
		MERCURY,
		VENUS,
		EARTH,
		MARS,
		JUPITER,
		SATURN,
		URANUS,
		NEPTUNE		
	}
	
	//create the enumeration class
	public class EnumTest {
		//create the new enum object
		Planets planet;
		
		//get the planets when the enumtest is created 
		public EnumTest (Planets planet){
			//set the planet variable
			this.planet = planet;
		}
		
		public void displayPlanet() {
			//check which planet was chosen 
			switch(planet) {
			
			case MERCURY:
				JOptionPane.showMessageDialog(null, "You would like to go to Mercury, planet " + (planet.ordinal() + 1));
				break;
			case VENUS:
				JOptionPane.showMessageDialog(null, "You would like to go to Venus, planet " + (planet.ordinal() + 1));
				break;
			case EARTH:
				JOptionPane.showMessageDialog(null, "You would like to stay on Earth");
				break;
			case MARS:
				JOptionPane.showMessageDialog(null, "You would like to go to Mars, planet " + (planet.ordinal() + 1));
				break;
			case JUPITER:
				JOptionPane.showMessageDialog(null, "You would like to go to Jupiter, planet " + (planet.ordinal() + 1));
				break;
			case SATURN:
				JOptionPane.showMessageDialog(null, "You would like to go to Saturn, planet " + (planet.ordinal() + 1));
				break;
			case URANUS:
				JOptionPane.showMessageDialog(null, "You would like to go to Uranus, planet " + (planet.ordinal() + 1));
				break;
			case NEPTUNE:
				JOptionPane.showMessageDialog(null, "You would like to go to Neptune, planet " + (planet.ordinal() + 1));
				break;				
			}
		}
		
	}

}
