import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;

import javax.swing.JOptionPane;

import org.eclipse.swt.SWT;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class Calculator {

	protected Shell shlSimpleCalculator;
	private Button btnSubtract;
	private Text txtFristNumber;
	private Text txtSecondNumber;
	
	//variables
	public Double firstNumber;
	public Double secondNumber;
	public Double answer;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Calculator window = new Calculator();
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
		shlSimpleCalculator.open();
		shlSimpleCalculator.layout();
		while (!shlSimpleCalculator.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		
		Label lblNum = new Label(shlSimpleCalculator, SWT.NONE);
		lblNum.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.NORMAL));
		lblNum.setBounds(144, 202, 82, 22);
		lblNum.setText("First Numer:");
		
		shlSimpleCalculator = new Shell();
		shlSimpleCalculator.setSize(450, 300);
		shlSimpleCalculator.setText("Simple Calculator");
		
		Label lblFirstNumber = new Label(shlSimpleCalculator, SWT.NONE);
		lblFirstNumber.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.NORMAL));
		lblFirstNumber.setBounds(22, 31, 92, 22);
		lblFirstNumber.setText("First Numer:");
		
		Label lblSecondNumber = new Label(shlSimpleCalculator, SWT.NONE);
		lblSecondNumber.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.NORMAL));
		lblSecondNumber.setBounds(237, 31, 125, 22);
		lblSecondNumber.setText("Second Number:");
		
		Button btnAdd = new Button(shlSimpleCalculator, SWT.NONE);
		btnAdd.addSelectionListener(new SelectionAdapter() {
			@Override
			//if they press the + button
			public void widgetSelected(SelectionEvent e) {
				//call the function to get the user numbers
				GetInput();
				
				//do the math
				answer = firstNumber + secondNumber;
				
				//display the answer
				lblNum.setText("" + answer);
				
			}
		});
		btnAdd.setBounds(22, 130, 75, 25);
		btnAdd.setText("+");
		
		btnSubtract = new Button(shlSimpleCalculator, SWT.NONE);
		btnSubtract.addSelectionListener(new SelectionAdapter() {
			@Override
			//if they press the - button
			public void widgetSelected(SelectionEvent e) {
				
				//call the function to get the user numbers
				GetInput();
				
				//do the math
				answer = firstNumber - secondNumber; 
				
				//display the answer
				lblNum.setText("" + answer);
			}
		});
		btnSubtract.setBounds(124, 130, 75, 25);
		btnSubtract.setText("-");
		
		txtFristNumber = new Text(shlSimpleCalculator, SWT.BORDER);
		txtFristNumber.setText("Enter a number");
		txtFristNumber.setBounds(22, 59, 154, 21);
		
		txtSecondNumber = new Text(shlSimpleCalculator, SWT.BORDER);
		txtSecondNumber.setText("Enter a number");
		txtSecondNumber.setBounds(237, 59, 162, 21);
		
		Button btnMulitply = new Button(shlSimpleCalculator, SWT.NONE);
		btnMulitply.addSelectionListener(new SelectionAdapter() {
			@Override
			//if they press the * button
			public void widgetSelected(SelectionEvent e) {
				
				//call the function to get the user numbers
				GetInput();
				
				//do the math
				answer = firstNumber * secondNumber; 
				
				//display the answer
				lblNum.setText("" + answer);
			}
		});
		btnMulitply.setText("*");
		btnMulitply.setBounds(222, 130, 75, 25);
		
		Button btnDivide = new Button(shlSimpleCalculator, SWT.NONE);
		btnDivide.addSelectionListener(new SelectionAdapter() {
			@Override
			//if they press the / button
			public void widgetSelected(SelectionEvent e) {
				
				//call the function to get the user numbers
				GetInput();
				
				//do the math
				answer = firstNumber / secondNumber; 
				
				//display the answer
				lblNum.setText("" + answer);
			}
		});
		btnDivide.setText("/");
		btnDivide.setBounds(324, 130, 75, 25);
		
		Label lblDisplay = new Label(shlSimpleCalculator, SWT.NONE);
		lblDisplay.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.NORMAL));
		lblDisplay.setBounds(22, 202, 377, 22);
		lblDisplay.setText("The answer is:");

	}
	
	public void GetInput() {
		//get the two numbers the user inputs 
		String firstNumberString = txtFristNumber.getText();
		String secondNumberString = txtSecondNumber.getText();
		
		try 
		{
			//convert the strings to numbers
			firstNumber = Double.parseDouble(firstNumberString);
			secondNumber = Double.parseDouble(secondNumberString);
		}
		catch(Exception e)
		{
			//ask the user to enter only numbers
			JOptionPane.showMessageDialog(null, "Please enter a number.", "Error", JOptionPane.INFORMATION_MESSAGE);
		}
	}
}
