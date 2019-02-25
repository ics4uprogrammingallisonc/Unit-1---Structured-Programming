/*
 *Created by: Allison Cook
 *Created on: 15-Feb-2019
 *Created for: ICS4U
 *Day #5 (Enstein's Equation GUI)
 *This program gets the users input on the mass of an object
 *Then calculates the amount of energy the object could release and displays it to the user.
*/

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import javax.swing.JOptionPane;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.wb.swt.SWTResourceManager;

public class GUI {

	protected Shell frmEinsteinsEquation;
	private Text txtMass;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			GUI window = new GUI();
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
		frmEinsteinsEquation.open();
		frmEinsteinsEquation.layout();
		while (!frmEinsteinsEquation.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		frmEinsteinsEquation = new Shell();
		frmEinsteinsEquation.setBackground(SWTResourceManager.getColor(153, 153, 204));
		frmEinsteinsEquation.setModified(true);
		frmEinsteinsEquation.setSize(450, 300);
		frmEinsteinsEquation.setText("Einstein's Equation");
		
		txtMass = new Text(frmEinsteinsEquation, SWT.BORDER);
		txtMass.setBounds(149, 91, 150, 21);
		
		Label lblEnterMass = new Label(frmEinsteinsEquation, SWT.NONE);
		lblEnterMass.setBackground(SWTResourceManager.getColor(153, 153, 204));
		lblEnterMass.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.NORMAL));
		lblEnterMass.setBounds(104, 54, 238, 21);
		lblEnterMass.setText("Please enter a mass for an object");
		
		Label lblAnswer = new Label(frmEinsteinsEquation, SWT.WRAP);
		lblAnswer.setBackground(SWTResourceManager.getColor(153, 153, 204));
		lblAnswer.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.NORMAL));
		lblAnswer.setBounds(32, 176, 381, 56);
		
		Button btnEnter = new Button(frmEinsteinsEquation, SWT.NONE);
		btnEnter.setFont(SWTResourceManager.getFont("Segoe UI", 11, SWT.NORMAL));
		btnEnter.addSelectionListener(new SelectionAdapter() {
			@Override
			//when the button is clicked
			public void widgetSelected(SelectionEvent e) {
				//variables
				double mass;
				String userNum;
				double energy;
				
				//constant
				final double SPEED_OF_LIGHT = (2.988 * Math.pow(10, 8));
				
				//get the users number
				try {
					//get value
					userNum = txtMass.getText();
					//convert to double
					mass = Double.parseDouble(userNum);
					
					//check if the input is greater than 0
					if (mass < 0) {
						//show the error message
						JOptionPane.showMessageDialog(null, "Please enter a mass greater than 0.");
					}
					//if it is greater than 0 continue the calculations
					else {
						//do the calculations
						energy = mass * Math.pow(SPEED_OF_LIGHT, 2);
						
						//display the answer
						lblAnswer.setText("The object can be converted into " + energy + " joules of energy.");
					}
				}
				catch (Exception f) {
					//error message if the user did not input a number
					JOptionPane.showMessageDialog(null, "Please enter only numbers.");
				}
				
			}
		});
		btnEnter.setBounds(183, 129, 75, 25);
		btnEnter.setText("Enter");

	}
}
