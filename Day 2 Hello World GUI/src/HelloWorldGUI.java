/*
 * Created by: Allison Cook
 * Created on: 14-Feb-2019
 * Created for: ICS4U
 * Day #2 (Hello World GUI)
 *This program has two strings which are combined to form "Hello World" in the console and GUI Text.
*/
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.wb.swt.SWTResourceManager;

public class HelloWorldGUI {

	protected Shell frmHelloWorldGUI;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			HelloWorldGUI window = new HelloWorldGUI();
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
		frmHelloWorldGUI.open();
		frmHelloWorldGUI.layout();
		while (!frmHelloWorldGUI.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		frmHelloWorldGUI = new Shell();
		frmHelloWorldGUI.setSize(450, 300);
		frmHelloWorldGUI.setText("Hello World GUI");
		
		Label lblHelloWorld = new Label(frmHelloWorldGUI, SWT.NONE);
		lblHelloWorld.setBackground(SWTResourceManager.getColor(0, 51, 102));
		lblHelloWorld.setFont(SWTResourceManager.getFont("Segoe UI", 15, SWT.NORMAL));
		lblHelloWorld.setAlignment(SWT.CENTER);
		lblHelloWorld.setBounds(10, 99, 401, 55);
		
		//declare the strings
		String wordOne = "Hello";
		String wordTwo = "World";
		String wordThree = "GUI!";
		
		//change the background colour
		frmHelloWorldGUI.setBackground(SWTResourceManager.getColor(0, 51, 102));
		
		//set the text colour
		lblHelloWorld.setForeground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		
		//combine strings
		lblHelloWorld.setText(wordOne + " " + wordTwo + " " + wordThree); 		

	}
	
	
}
