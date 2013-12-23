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


public class modifyOrder extends JFrame {

	private JPanel contentPane;
	private final JButton splitBills = new JButton("Split Bills");
	private final JButton chageOrderid = new JButton("Change Order Id");
	private final JButton changeTable = new JButton("Change Table");
	private final JButton changeServer = new JButton("Change Server & database");
	private final JButton button_3 = new JButton("Find recipe");
	private final JButton back = new JButton("Back from here");
	private final JButton printBills = new JButton("Print bills");
	private final JButton orderStatusdineOr = new JButton("Order Status-Dine or Takeout");

	/**
	 * Launch the application.
	 */
	public void orderModification() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					modifyOrder frame = new modifyOrder();
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
	public modifyOrder() {
		
		setTitle("Order Modification");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1300, 700);
		
		//Setting the windows always in the centre of the screen
				setLocationRelativeTo(null);
				
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		splitBills.setForeground(Color.WHITE);
		splitBills.setBackground(new Color(0, 51, 0));
		splitBills.setFont(new Font("Times New Roman", Font.PLAIN, 27));
		splitBills.setBounds(40, 11, 591, 142);
		
		contentPane.add(splitBills);
		chageOrderid.setForeground(Color.WHITE);
		chageOrderid.setFont(new Font("Times New Roman", Font.PLAIN, 27));
		chageOrderid.setBackground(new Color(0, 51, 0));
		chageOrderid.setBounds(40, 178, 591, 142);
		
		contentPane.add(chageOrderid);
		changeTable.setForeground(Color.WHITE);
		changeTable.setFont(new Font("Times New Roman", Font.PLAIN, 27));
		changeTable.setBackground(new Color(0, 51, 0));
		changeTable.setBounds(40, 342, 591, 142);
		
		contentPane.add(changeTable);
		changeServer.setForeground(Color.WHITE);
		changeServer.setFont(new Font("Times New Roman", Font.PLAIN, 27));
		changeServer.setBackground(new Color(0, 51, 0));
		changeServer.setBounds(40, 509, 591, 142);
		
		contentPane.add(changeServer);
		button_3.setForeground(Color.WHITE);
		button_3.setFont(new Font("Times New Roman", Font.PLAIN, 27));
		button_3.setBackground(new Color(0, 51, 0));
		button_3.setBounds(708, 342, 524, 142);
		
		contentPane.add(button_3);
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				//Disposing the previous Window
				ignoreWindow hide = new ignoreWindow(this);
				hide.setVisible(false);
				setVisible(false);
				dispose();
				
				tableOption to=new tableOption();
				to.table();
			}
		});
		back.setForeground(Color.WHITE);
		back.setFont(new Font("Times New Roman", Font.PLAIN, 27));
		back.setBackground(new Color(204, 0, 0));
		back.setBounds(708, 509, 524, 142);
		
		contentPane.add(back);
		printBills.setForeground(Color.WHITE);
		printBills.setFont(new Font("Times New Roman", Font.PLAIN, 27));
		printBills.setBackground(new Color(0, 51, 0));
		printBills.setBounds(708, 178, 524, 142);
		
		contentPane.add(printBills);
		orderStatusdineOr.setForeground(Color.WHITE);
		orderStatusdineOr.setFont(new Font("Times New Roman", Font.PLAIN, 27));
		orderStatusdineOr.setBackground(new Color(0, 51, 0));
		orderStatusdineOr.setBounds(708, 11, 524, 142);
		
		contentPane.add(orderStatusdineOr);
	}
}
