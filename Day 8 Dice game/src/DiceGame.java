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
import org.eclipse.swt.SWT;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class DiceGame {

	protected Shell frmDiceGame;
	private Text txtGuess;

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
			}
		});
		btnGuess.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.NORMAL));
		btnGuess.setBounds(33, 83, 75, 25);
		btnGuess.setText("Guess");

	}
}
