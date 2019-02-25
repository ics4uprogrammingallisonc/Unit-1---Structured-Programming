/*
 *Created by: Allison Cook
 *Created on: 16-Feb-2019
 *Created for: ICS4U
 *Day #7 (MircoWave)
 *This program asks the user for a type of food and how many items, then calculates how long the food should be in the microwave
*/
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class Microwave {
	
	//constants
	final double ONEITEM = 1;
	final double TWOITEMS = 1.5;
	final double THREEITEMS = 2;
	final int SUBTIME = 60;
	final int PIZZATIME = 45;
	final int SOUPTIME = 105;
	
	//variables
	double time;
	int startTime;
	double serving;

	protected Shell frmMicrowave;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Microwave window = new Microwave();
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
		frmMicrowave.open();
		frmMicrowave.layout();
		while (!frmMicrowave.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		frmMicrowave = new Shell();
		frmMicrowave.setBackground(SWTResourceManager.getColor(153, 204, 255));
		frmMicrowave.setSize(435, 297);
		frmMicrowave.setText("Microwave");
		
		Label lblSelect = new Label(frmMicrowave, SWT.NONE);
		lblSelect.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.NORMAL));
		lblSelect.setBackground(SWTResourceManager.getColor(153, 204, 255));
		lblSelect.setBounds(132, 22, 154, 21);
		lblSelect.setText("Select a type of food:");
		
		Label lblNumber = new Label(frmMicrowave, SWT.NONE);
		lblNumber.setText("Select number of servings:");
		lblNumber.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.NORMAL));
		lblNumber.setBackground(SWTResourceManager.getColor(153, 204, 255));
		lblNumber.setBounds(116, 112, 194, 21);
		
		Label lblTime = new Label(frmMicrowave, SWT.NONE);
		lblTime.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.NORMAL));
		lblTime.setBackground(SWTResourceManager.getColor(153, 204, 255));
		lblTime.setBounds(45, 227, 320, 21);
		
		Button btnSub = new Button(frmMicrowave, SWT.NONE);
		btnSub.addSelectionListener(new SelectionAdapter() {
			@Override
			//when clicked
			public void widgetSelected(SelectionEvent e) {
				//set time to the sub time
				startTime = SUBTIME;
			}
		});
		btnSub.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.NORMAL));
		btnSub.setBounds(45, 56, 75, 25);
		btnSub.setText("Sub");
		
		Button btnPizza = new Button(frmMicrowave, SWT.NONE);
		btnPizza.addSelectionListener(new SelectionAdapter() {
			@Override
			//when clicked
			public void widgetSelected(SelectionEvent e) {
				//set time to the pizza time
				startTime = PIZZATIME;
			}
		});
		btnPizza.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.NORMAL));
		btnPizza.setBounds(171, 56, 75, 25);
		btnPizza.setText("Pizza");
		
		Button btnSoup = new Button(frmMicrowave, SWT.NONE);
		btnSoup.addSelectionListener(new SelectionAdapter() {
			@Override
			//when clicked
			public void widgetSelected(SelectionEvent e) {
				//set time to the soup time
				startTime = SOUPTIME;
			}
		});
		btnSoup.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.NORMAL));
		btnSoup.setBounds(290, 56, 75, 25);
		btnSoup.setText("Soup");
		
		Button btnServing = new Button(frmMicrowave, SWT.NONE);
		btnServing.addSelectionListener(new SelectionAdapter() {
			@Override
			//when clicked
			public void widgetSelected(SelectionEvent e) {
				//set serving time to 1 serving
				serving = ONEITEM;
			}
		});
		btnServing.setBounds(45, 156, 75, 25);
		btnServing.setText("1 ");
		
		Button btnServing2 = new Button(frmMicrowave, SWT.NONE);
		btnServing2.addSelectionListener(new SelectionAdapter() {
			@Override
			//when clicked
			public void widgetSelected(SelectionEvent e) {
				//set serving time to 2 servings
				serving = TWOITEMS;
			}
		});
		btnServing2.setText("2");
		btnServing2.setBounds(171, 156, 75, 25);
		
		Button btnServing3 = new Button(frmMicrowave, SWT.NONE);
		btnServing3.addSelectionListener(new SelectionAdapter() {
			@Override
			//when clicked
			public void widgetSelected(SelectionEvent e) {
				//set serving time to 3 servings
				serving = THREEITEMS;
			}
		});
		btnServing3.setText("3");
		btnServing3.setBounds(290, 156, 75, 25);
		
		Button btnEnter = new Button(frmMicrowave, SWT.NONE);
		btnEnter.addSelectionListener(new SelectionAdapter() {
			@Override
			//when enter is clicked
			public void widgetSelected(SelectionEvent e) {
				
				//calculate the time needed 
				time = startTime * serving;
				time = time/60;
				
				//display time
				lblTime.setText("It will take " + time + " minutes in the mircowave." );
			}
		});
		btnEnter.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.NORMAL));
		btnEnter.setBounds(171, 196, 75, 25);
		btnEnter.setText("Enter");

	}
	
}
