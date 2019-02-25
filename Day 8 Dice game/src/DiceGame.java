/*
 * Created by: Allison Cook
 * Created on: 20-Feb-2019
 * Created for: ICS4U
 * Day #8 (Dice Game)
 *This program generates a random dice roll (number between 1 and 6)
 *Then ask the user to guess what number and display how many guesses it took to get the right answer
*/
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import javax.swing.JOptionPane;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.wb.swt.SWTResourceManager;

public class DiceGame {

	protected Shell frmDiceGame;
	private Text txtGuess;
	
	//variables
	int userNum;
	int randomNumber;
	int numberOfGuesses;
	int counter = 1;
	boolean userEnterNum = true;
	
	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			DiceGame window = new DiceGame();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		frmDiceGame.open();
		frmDiceGame.layout();
		while (!frmDiceGame.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		//get a random number
		randomNumber = (int)(Math.random() * 6 + 1);
		
		frmDiceGame = new Shell();
		frmDiceGame.setSize(450, 300);
		frmDiceGame.setText("SWT Application");
		
		Label lblEnter = new Label(frmDiceGame, SWT.NONE);
		lblEnter.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.NORMAL));
		lblEnter.setBounds(21, 23, 258, 21);
		lblEnter.setText("Enter a number between 1 and 6:");
		
		txtGuess = new Text(frmDiceGame, SWT.BORDER);
		txtGuess.setBounds(285, 25, 108, 21);
		
		Label lblRandomNumber = new Label(frmDiceGame, SWT.NONE);
		lblRandomNumber.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.NORMAL));
		lblRandomNumber.setBounds(33, 176, 184, 21);
		lblRandomNumber.setText("The random number was:");
		
		Label lblNumber = new Label(frmDiceGame, SWT.NONE);
		lblNumber.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.NORMAL));
		lblNumber.setBounds(295, 176, 76, 21);
		
		Label lblGuess = new Label(frmDiceGame, SWT.NONE);
		lblGuess.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.NORMAL));
		lblGuess.setBounds(33, 149, 246, 21);
		lblGuess.setText("Number of guesses before correct:");
		
		Label lblNumGuesses = new Label(frmDiceGame, SWT.NONE);
		lblNumGuesses.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.NORMAL));
		lblNumGuesses.setBounds(295, 149, 76, 21);
		
		Button btnGuess = new Button(frmDiceGame, SWT.NONE);
		btnGuess.addSelectionListener(new SelectionAdapter() {
			@Override
			//when the button is clicked
			public void widgetSelected(SelectionEvent e) {
				//get the users input
				try {
					//get the user text
					String userInput = txtGuess.getText();
					
					//convert the string into a number
					userNum = Integer.parseInt(userInput);
					//set boolean to true
					userEnterNum = true;
				}
				catch (Exception f) {
					//error message if the user did not input a number
					JOptionPane.showMessageDialog(null, "Please enter only numbers.");
					//set boolean to false
					userEnterNum = false;
				}
				
				if (userEnterNum == true) {
					//check to see if the user entered a number between 1 and 6
					if (userNum >= 1 && userNum <= 6) {
						//check to see if the number is the same as the random number
						if (userNum != randomNumber ) {
							//display a message for the user to guess again
							JOptionPane.showMessageDialog(null, "Please guess again.");
							
							//add one to counter
							counter = counter +1;
						}
						else {
							
							//display to the user that they got the right answer
							JOptionPane.showMessageDialog(null, "You got the right answer!");
							
							//change the labels
							lblNumber.setText("" + randomNumber);
							lblNumGuesses.setText(""+ counter);
						}					
					}
					else {
						//error message since the user did not input a correct number
						JOptionPane.showMessageDialog(null, "Please enter only numbers between 1 and 6.");
					}
				}
				
			}
		});
		btnGuess.setText("Guess");		
		btnGuess.setBounds(285, 85, 75, 25); 
		
		Button btnNewNumber = new Button(frmDiceGame, SWT.NONE);
		btnNewNumber.setBounds(39, 82, 83, 25);
		btnNewNumber.setText("New Number");
		btnNewNumber.addSelectionListener(new SelectionAdapter() {
			@Override
			//when the button is clicked
			public void widgetSelected(SelectionEvent e) {
				//get a new random number
				randomNumber = (int)(Math.random() * 6 + 1);
				//set counter back to 0
				counter = 1;
			}
		});
		

	}
}


