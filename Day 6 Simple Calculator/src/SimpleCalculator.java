/*
 * Created by: Allison Cook
 * Created on: 12-Feb-2019
 * Created for: ICS4U
 * Day #6 (Simple Calculator)
 *This program asks the user to input two numbers
 *Then asks them to select a function to perform with those two numbers and outputs the answer.
*/
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import javax.swing.JOptionPane;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Button;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class SimpleCalculator {

	protected Shell frmSimpleCalc;
	private Text txtFirstNum;
	private Text txtSecondNum;
	
	//public variables
	double firstNumber;
	double secondNumber;
	double answer;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			SimpleCalculator window = new SimpleCalculator();
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
		frmSimpleCalc.open();
		frmSimpleCalc.layout();
		while (!frmSimpleCalc.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		frmSimpleCalc = new Shell();
		frmSimpleCalc.setSize(450, 300);
		frmSimpleCalc.setText("Simple Calculator");
		
		txtFirstNum = new Text(frmSimpleCalc, SWT.BORDER);
		txtFirstNum.setBounds(60, 64, 123, 21);
		
		txtSecondNum = new Text(frmSimpleCalc, SWT.BORDER);
		txtSecondNum.setBounds(241, 64, 123, 21);
		
		Label lblNum1 = new Label(frmSimpleCalc, SWT.NONE);
		lblNum1.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.NORMAL));
		lblNum1.setBounds(60, 33, 110, 25);
		lblNum1.setText("First Number:");
		
		Label lblNum2 = new Label(frmSimpleCalc, SWT.NONE);
		lblNum2.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.NORMAL));
		lblNum2.setBounds(241, 33, 123, 21);
		lblNum2.setText("Second Number:");
		
		Label lblAnswer = new Label(frmSimpleCalc, SWT.NONE);
		lblAnswer.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.NORMAL));
		lblAnswer.setBounds(67, 173, 103, 21);
		lblAnswer.setText("The answer is:");
		
		Label lblNum = new Label(frmSimpleCalc, SWT.NONE);
		lblNum.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.NORMAL));
		lblNum.setBounds(176, 173, 212, 21);
		
		Button btnAdd = new Button(frmSimpleCalc, SWT.NONE);
		btnAdd.addSelectionListener(new SelectionAdapter() {
			@Override
			//When the button is clicked
			public void widgetSelected(SelectionEvent e) {
				//get the user input
				GetInput();
				
				//do the calculation
				answer = firstNumber + secondNumber;
				
				//display the answer
				lblNum.setText(" " + answer);
			}
		});
		btnAdd.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.NORMAL));
		btnAdd.setBounds(60, 113, 75, 25);
		btnAdd.setText("+");
		
		Button btnSubtract = new Button(frmSimpleCalc, SWT.NONE);
		btnSubtract.addSelectionListener(new SelectionAdapter() {
			@Override
			//When the button is clicked
			public void widgetSelected(SelectionEvent e) {
				//get the user input
				GetInput();
				
				//do the calculation
				answer = firstNumber - secondNumber;
				
				//display the answer
				lblNum.setText(" " + answer);
			}
		});
		btnSubtract.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.NORMAL));
		btnSubtract.setBounds(151, 113, 75, 25);
		btnSubtract.setText("-");
		
		Button btnDivide = new Button(frmSimpleCalc, SWT.NONE);
		btnDivide.addSelectionListener(new SelectionAdapter() {
			@Override
			//When the button is clicked
			public void widgetSelected(SelectionEvent e) {
				//get the user input
				GetInput();
				
				//check to see if the second number is not zero
				if (secondNumber > 0) {
					//do the calculation
					answer = firstNumber / secondNumber;
					
					//display the answer
					lblNum.setText(" " + answer);
				}
				else {
					//ask them to input a number greater than zero
					JOptionPane.showMessageDialog(null, "Please enter a number greater than 0 to divide.");
				}
				
			}
		});
		btnDivide.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.NORMAL));
		btnDivide.setBounds(313, 113, 75, 25);
		btnDivide.setText("/");
		
		Button btnMultiply = new Button(frmSimpleCalc, SWT.NONE);
		btnMultiply.addSelectionListener(new SelectionAdapter() {
			@Override
			//When the button is clicked
			public void widgetSelected(SelectionEvent e) {
				//get the user input
				GetInput();
				
				//do the calculation
				answer = firstNumber * secondNumber;
				
				//display the answer
				lblNum.setText(" " + answer);
			}
		});
		btnMultiply.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.NORMAL));
		btnMultiply.setBounds(232, 113, 75, 25);
		btnMultiply.setText("*");

	}
	public void GetInput() {
		//get the user input
		String firstNum = txtFirstNum.getText();
		String secondNum = txtSecondNum.getText();
		
		//try to convert to number
		try {
			firstNumber = Double.parseDouble(firstNum);
			secondNumber = Double.parseDouble(secondNum);
		}
		catch ( Exception e) {
			//display message box
			//error message if the user did not input a number
			JOptionPane.showMessageDialog(null, "Please enter only numbers.");
		}
	}
}
