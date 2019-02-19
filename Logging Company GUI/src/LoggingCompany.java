/*
 *Created by: Allison Cook
 *Created on: 15-Feb-2019
 *Created for: ICS4U
 *Day #4 (Logging Company GUI)
 *This program asks the user for the length of a log. 
 *Then calculates the logs weight and how many will fit of the transport truck. 
 *Then displays the answer to the user using GUI.
*/
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import javax.swing.JOptionPane;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class LoggingCompany {

	protected Shell shlLoggingComp;
	private Text txtInput;
	private Label lblNumbers;
	private Label lblLogLength;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			LoggingCompany window = new LoggingCompany();
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
		shlLoggingComp.open();
		shlLoggingComp.layout();
		while (!shlLoggingComp.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlLoggingComp = new Shell();
		shlLoggingComp.setSize(450, 300);
		shlLoggingComp.setText("Logging Company GUI");
		
		Label lblEnter = new Label(shlLoggingComp, SWT.NONE);
		lblEnter.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.NORMAL));
		lblEnter.setBounds(81, 61, 283, 21);
		lblEnter.setText("Please enter one of the above numbers:");
		
		txtInput = new Text(shlLoggingComp, SWT.BORDER);
		txtInput.setBounds(128, 88, 163, 21);
		
		Label lblAnswer = new Label(shlLoggingComp, SWT.NONE);
		lblAnswer.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.NORMAL));
		lblAnswer.setBounds(59, 163, 312, 21);
		
		lblNumbers = new Label(shlLoggingComp, SWT.NONE);
		lblNumbers.setText("0.25, 0.50 or 1 meter");
		lblNumbers.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.NORMAL));
		lblNumbers.setBounds(138, 37, 153, 21);
		
		lblLogLength = new Label(shlLoggingComp, SWT.NONE);
		lblLogLength.setText("Log lengths:");
		lblLogLength.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.NORMAL));
		lblLogLength.setBounds(158, 10, 110, 21);
		
		Button btnEnter = new Button(shlLoggingComp, SWT.NONE);
		btnEnter.addSelectionListener(new SelectionAdapter() {
			@Override
			//when the button is clicked
			public void widgetSelected(SelectionEvent e) {
				//variables
				double logWeight;
				double numLogs; 
				String userInput;
				double userNum = 0;
				
				//constants
				final double LENGTH1 = 0.25;
				final double LENGTH2 = 0.50;
				final double LENGTH3 = 1;
				final double MAX_WEIGHT = 1100;
				
				//get the users number
				try {
					//get value
					userInput = txtInput.getText();
					//convert to double
					userNum = Double.parseDouble(userInput);
					
					//check if the input is not one of the lenghts
					if (userNum != LENGTH1 && userNum != LENGTH2 && userNum != LENGTH3) {
						//show the error message
						JOptionPane.showMessageDialog(null, "Please enter one of the displayed log lenghts.");
					}
					//if it is one of the numbers continue the calculations
					else {
						//do the calculations
						logWeight = 20 * userNum;
						numLogs = MAX_WEIGHT/logWeight;
						
						//display the answer
						lblAnswer.setText("The truck can fit " + numLogs + " logs of " + userNum + "m length.");
					}
				}
				catch (Exception f) {
					//error message
					JOptionPane.showMessageDialog(null, "Please enter only numbers.");
				}
				
			}
		});
		btnEnter.setFont(SWTResourceManager.getFont("Segoe UI", 11, SWT.NORMAL));
		btnEnter.setBounds(172, 115, 75, 25);
		btnEnter.setText("Enter");
		
	}
}
