import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class serviceStatusReport extends JFrame {

	private JPanel contentPane;
	private final JLabel lblNewLabel = new JLabel("Name of the server");
	private final JTextField textField = new JTextField();
	private final JLabel lblIdentificationNumber = new JLabel("Identification number");
	private final JTextField textField_1 = new JTextField();
	private final JPanel panel = new JPanel();
	private final JButton btnNewButton = new JButton("Exit from here");
	private final JLabel lblNewLabel_1 = new JLabel("");
	private final JLabel lblNewLabel_2 = new JLabel("Status Report");
	private final JLabel lblNewLabel_3 = new JLabel("Tips collected:");
	private final JLabel lblTotalSalesDone = new JLabel("Total Sales done:");
	private final JLabel lblTaxGathered = new JLabel("Tax gathered:");
	private final JLabel lblSinceLoginhhmmss = new JLabel("Since login(hh:mm:ss)");
	private final JLabel lblTotalEarning = new JLabel("Total earning:");
	private final JTextField textField_2 = new JTextField();
	private final JTextField textField_3 = new JTextField();
	private final JTextField textField_4 = new JTextField();
	private final JTextField textField_5 = new JTextField();
	private final JTextField textField_6 = new JTextField();
	private final JPanel panel_1 = new JPanel();

	/**
	 * Launch the application.
	 */
	public void serviceStatus() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					serviceStatusReport frame = new serviceStatusReport();
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
	public serviceStatusReport() {
		textField_2.setFont(new Font("Times New Roman", Font.PLAIN, 37));
		textField_2.setBounds(845, 183, 387, 52);
		textField_2.setColumns(10);
		
		setTitle("Service Status Report");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1300, 700);
		
		//Setting the windows always in the centre of the screen
			setLocationRelativeTo(null);
		
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaptionText);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 457, 662);
		
		contentPane.add(panel);
		panel.setLayout(null);
		lblNewLabel.setBounds(10, 327, 431, 42);
		panel.add(lblNewLabel);
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		textField.setForeground(new Color(255, 0, 0));
		textField.setBounds(10, 363, 431, 65);
		panel.add(textField);
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		textField.setColumns(10);
		lblIdentificationNumber.setBounds(11, 439, 215, 42);
		panel.add(lblIdentificationNumber);
		lblIdentificationNumber.setForeground(Color.BLACK);
		lblIdentificationNumber.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		textField_1.setForeground(new Color(255, 0, 0));
		textField_1.setBounds(10, 475, 431, 65);
		panel.add(textField_1);
		textField_1.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		textField_1.setColumns(10);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Disposing the previous Window
				ignoreWindow hide = new ignoreWindow(this);
				hide.setVisible(false);
				setVisible(false);
				dispose();
				
				tableOption to =new tableOption();
				to.table();
			}
		});
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(100, 149, 237));
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		btnNewButton.setBounds(10, 570, 431, 92);
		
		panel.add(btnNewButton);
		lblNewLabel_1.setIcon(new ImageIcon("E:\\Rashadul\\examschdule\\RestaurantOrderingSystem\\payment.jpg"));
		lblNewLabel_1.setBounds(10, 11, 437, 265);
		
		panel.add(lblNewLabel_1);
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		lblNewLabel_2.setBounds(491, 110, 399, 27);
		
		contentPane.add(lblNewLabel_2);
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_3.setBounds(617, 183, 218, 52);
		
		contentPane.add(lblNewLabel_3);
		lblTotalSalesDone.setForeground(Color.WHITE);
		lblTotalSalesDone.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblTotalSalesDone.setBounds(617, 251, 218, 52);
		
		contentPane.add(lblTotalSalesDone);
		lblTaxGathered.setForeground(Color.WHITE);
		lblTaxGathered.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblTaxGathered.setBounds(617, 314, 218, 52);
		
		contentPane.add(lblTaxGathered);
		lblSinceLoginhhmmss.setForeground(Color.WHITE);
		lblSinceLoginhhmmss.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblSinceLoginhhmmss.setBounds(617, 393, 248, 52);
		
		contentPane.add(lblSinceLoginhhmmss);
		panel_1.setBackground(SystemColor.activeCaption);
		panel_1.setBounds(617, 474, 610, 52);
		
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		lblTotalEarning.setBounds(0, 0, 260, 52);
		panel_1.add(lblTotalEarning);
		lblTotalEarning.setForeground(Color.WHITE);
		lblTotalEarning.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		textField_6.setFont(new Font("Times New Roman", Font.PLAIN, 37));
		textField_6.setBounds(228, 0, 394, 52);
		panel_1.add(textField_6);
		textField_6.setColumns(10);
		
		contentPane.add(textField_2);
		textField_3.setFont(new Font("Times New Roman", Font.PLAIN, 37));
		textField_3.setColumns(10);
		textField_3.setBounds(845, 251, 387, 52);
		
		contentPane.add(textField_3);
		textField_4.setFont(new Font("Times New Roman", Font.PLAIN, 37));
		textField_4.setColumns(10);
		textField_4.setBounds(845, 325, 387, 52);
		
		contentPane.add(textField_4);
		textField_5.setFont(new Font("Times New Roman", Font.PLAIN, 37));
		textField_5.setColumns(10);
		textField_5.setBounds(845, 398, 387, 52);
		
		contentPane.add(textField_5);
	}

}
