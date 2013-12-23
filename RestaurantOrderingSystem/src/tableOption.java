import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import javax.swing.JMenuBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class tableOption extends JFrame {

	private JPanel contentPane;
	private final JButton meal = new JButton("Order Meal");
	private final JButton modify = new JButton("Modify");
	private final JButton payment = new JButton("Payment");
	private final JButton reportOrSwitch = new JButton("Report or Switch");
	private final JButton cancelTheOrder = new JButton("Cancel order");
	private final JButton clearTheTable = new JButton("Clear the table");
	private final JButton statusOfService = new JButton("Status of service");
	private final JButton btnReturn = new JButton("Return");
	private final JButton exitFromHere = new JButton("Exit from here");

	/**
	 * Launch the application.
	 */
	public void table() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tableOption frame = new tableOption();
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
	public tableOption() {
		
		setTitle("Order and Options");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1300, 700);
		
		//Setting the windows always in the centre of the screen
		setLocationRelativeTo(null);

		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		meal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Disposing the previous Window
				ignoreWindow hide = new ignoreWindow(this);
				hide.setVisible(false);
				setVisible(false);
				dispose();
				
				//choice meal =new choice();
				//meal.chooseMenu();
				
				tableReserve reserve=new tableReserve();
				reserve.tableAndClient();
			}
		});
		meal.setForeground(new Color(255, 255, 255));
		meal.setFont(new Font("Times New Roman", Font.PLAIN, 34));
		meal.setBackground(new Color(178, 34, 34));
		meal.setBounds(86, 29, 309, 182);
		
		contentPane.add(meal);
		modify.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				//Disposing the previous Window
				ignoreWindow hide = new ignoreWindow(this);
				hide.setVisible(false);
				setVisible(false);
				dispose();
				
				modifyOrder mod=new modifyOrder();
				mod.orderModification();
			}
		});
		modify.setForeground(new Color(255, 255, 255));
		modify.setFont(new Font("Times New Roman", Font.PLAIN, 34));
		modify.setBackground(new Color(178, 34, 34));
		modify.setBounds(86, 244, 309, 182);
		
		contentPane.add(modify);
		payment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				//Disposing the previous Window
				ignoreWindow hide = new ignoreWindow(this);
				hide.setVisible(false);
				setVisible(false);
				dispose();
				
				payment cash=new payment();
				cash.pay();
			}
		});
		payment.setForeground(new Color(255, 255, 255));
		payment.setFont(new Font("Times New Roman", Font.PLAIN, 34));
		payment.setBackground(new Color(178, 34, 34));
		payment.setBounds(455, 29, 309, 182);
		
		contentPane.add(payment);
		reportOrSwitch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				//Disposing the previous Window
				ignoreWindow hide = new ignoreWindow(this);
				hide.setVisible(false);
				setVisible(false);
				dispose();
				
				switchReport r=new switchReport();
				r.switchReopenReceipt();
			}
		});
		reportOrSwitch.setForeground(new Color(255, 255, 255));
		reportOrSwitch.setFont(new Font("Times New Roman", Font.PLAIN, 34));
		reportOrSwitch.setBackground(new Color(178, 34, 34));
		reportOrSwitch.setBounds(86, 453, 309, 182);
		
		contentPane.add(reportOrSwitch);
		cancelTheOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				//Disposing the previous Window
				ignoreWindow hide = new ignoreWindow(this);
				hide.setVisible(false);
				setVisible(false);
				dispose();
				
				cancelOrder cancel=new cancelOrder();
				cancel.canceltheOrder();
			}
		});
		cancelTheOrder.setForeground(new Color(255, 255, 255));
		cancelTheOrder.setFont(new Font("Times New Roman", Font.PLAIN, 34));
		cancelTheOrder.setBackground(new Color(178, 34, 34));
		cancelTheOrder.setBounds(455, 244, 309, 182);
		
		contentPane.add(cancelTheOrder);
		clearTheTable.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Disposing the previous Window
				ignoreWindow hide = new ignoreWindow(this);
				hide.setVisible(false);
				setVisible(false);
				dispose();
				
				cleartheTable clear=new cleartheTable();
				clear.clearTable();
			}
		});
		clearTheTable.setForeground(new Color(255, 255, 255));
		clearTheTable.setFont(new Font("Times New Roman", Font.PLAIN, 34));
		clearTheTable.setBackground(new Color(178, 34, 34));
		clearTheTable.setBounds(455, 458, 309, 182);
		
		contentPane.add(clearTheTable);
		statusOfService.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Disposing the previous Window
				ignoreWindow hide = new ignoreWindow(this);
				hide.setVisible(false);
				setVisible(false);
				dispose();
				
				serviceStatusReport serviceStatus=new serviceStatusReport();
				serviceStatus.serviceStatus();
			}
		});
		statusOfService.setForeground(new Color(255, 255, 255));
		statusOfService.setFont(new Font("Times New Roman", Font.PLAIN, 34));
		statusOfService.setBackground(new Color(178, 34, 34));
		statusOfService.setBounds(827, 30, 309, 181);
		
		contentPane.add(statusOfService);
		btnReturn.setFont(new Font("Times New Roman", Font.PLAIN, 34));
		btnReturn.setForeground(new Color(255, 255, 255));
		btnReturn.setBackground(new Color(178, 34, 34));
		btnReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Disposing the previous Window
				ignoreWindow hide = new ignoreWindow(this);
				hide.setVisible(false);
				setVisible(false);
				dispose();
				
				login l=new login();
				l.signin();
			}
		});
		btnReturn.setBounds(827, 244, 309, 182);
		
		contentPane.add(btnReturn);
		exitFromHere.addActionListener(new ActionListener() {
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
		exitFromHere.setForeground(Color.WHITE);
		exitFromHere.setFont(new Font("Times New Roman", Font.PLAIN, 34));
		exitFromHere.setBackground(new Color(178, 34, 34));
		exitFromHere.setBounds(827, 458, 309, 182);
		
		contentPane.add(exitFromHere);
	}
}
