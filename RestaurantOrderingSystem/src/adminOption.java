import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class adminOption extends JFrame {

	private JPanel contentPane;
	private final JButton tableSetup = new JButton("Table Setup");
	private final JButton menuSetup = new JButton("Menu Setup");
	private final JButton reservation = new JButton("Reservation");
	private final JButton serverConfiguration = new JButton("Server Configuration");
	private final JButton softwareConfiguration = new JButton("Software Configuration");
	private final JButton returnToMain = new JButton("Return to main");
	private final JButton transaction = new JButton("Transaction");
	private final JButton employeManagement = new JButton("Employee Management");
	private final JButton salesReport = new JButton("Sales report");
	private final JButton inventory = new JButton("Inventory");

	/**
	 * Launch the application.
	 */
	public void adminPrivilege(){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					adminOption frame = new adminOption();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public adminOption() {
		setTitle("Admin Privileges");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1300, 700);
		
		//Setting the windows always in the centre of the screen
				setLocationRelativeTo(null);
		
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		tableSetup.setBackground(new Color(100, 149, 237));
		tableSetup.setForeground(Color.WHITE);
		tableSetup.setFont(new Font("Times New Roman", Font.PLAIN, 28));
		tableSetup.setBounds(41, 45, 533, 90);
		
		contentPane.add(tableSetup);
		menuSetup.setBackground(new Color(100, 149, 237));
		menuSetup.setForeground(Color.WHITE);
		menuSetup.setFont(new Font("Times New Roman", Font.PLAIN, 28));
		menuSetup.setBounds(41, 162, 533, 90);
		
		contentPane.add(menuSetup);
		reservation.setBackground(new Color(100, 149, 237));
		reservation.setForeground(Color.WHITE);
		reservation.setFont(new Font("Times New Roman", Font.PLAIN, 28));
		reservation.setBounds(41, 282, 533, 90);
		
		contentPane.add(reservation);
		serverConfiguration.setBackground(new Color(100, 149, 237));
		serverConfiguration.setForeground(Color.WHITE);
		serverConfiguration.setFont(new Font("Times New Roman", Font.PLAIN, 28));
		serverConfiguration.setBounds(41, 406, 533, 90);
		
		contentPane.add(serverConfiguration);
		softwareConfiguration.setBackground(new Color(100, 149, 237));
		softwareConfiguration.setForeground(Color.WHITE);
		softwareConfiguration.setFont(new Font("Times New Roman", Font.PLAIN, 28));
		softwareConfiguration.setBounds(41, 539, 533, 90);
		
		contentPane.add(softwareConfiguration);
		returnToMain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Disposing the previous Window
				ignoreWindow hide = new ignoreWindow(this);
				hide.setVisible(false);
				setVisible(false);
				dispose();
				
				welcome a=new welcome();
				a.main(null);
			}
		});
		returnToMain.setBackground(new Color(100, 149, 237));
		returnToMain.setForeground(Color.WHITE);
		returnToMain.setFont(new Font("Times New Roman", Font.PLAIN, 28));
		returnToMain.setBounds(642, 539, 603, 90);
		
		contentPane.add(returnToMain);
		transaction.setBackground(new Color(100, 149, 237));
		transaction.setForeground(Color.WHITE);
		transaction.setFont(new Font("Times New Roman", Font.PLAIN, 28));
		transaction.setBounds(642, 406, 603, 90);
		
		contentPane.add(transaction);
		employeManagement.setBackground(new Color(100, 149, 237));
		employeManagement.setForeground(Color.WHITE);
		employeManagement.setFont(new Font("Times New Roman", Font.PLAIN, 28));
		employeManagement.setBounds(642, 282, 603, 90);
		
		contentPane.add(employeManagement);
		salesReport.setBackground(new Color(100, 149, 237));
		salesReport.setForeground(Color.WHITE);
		salesReport.setFont(new Font("Times New Roman", Font.PLAIN, 28));
		salesReport.setBounds(642, 162, 603, 90);
		
		contentPane.add(salesReport);
		inventory.setBackground(new Color(100, 149, 237));
		inventory.setForeground(Color.WHITE);
		inventory.setFont(new Font("Times New Roman", Font.PLAIN, 28));
		inventory.setBounds(642, 45, 603, 90);
		
		contentPane.add(inventory);
	}

}
