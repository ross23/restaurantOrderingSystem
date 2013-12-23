import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class cleartheTable extends JFrame {

	private JPanel contentPane;
	private final JLabel lblNewLabel = new JLabel("Enter Table number");
	private final JTextField textField = new JTextField();
	private final JLabel lblEnterClientNumber = new JLabel("Enter client number");
	private final JTextField textField_1 = new JTextField();
	private final JButton saveSend = new JButton("Clear and Send notification to Host");
	private final JButton back = new JButton("Back to option");

	/**
	 * Launch the application.
	 */
	public void clearTable() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cleartheTable frame = new cleartheTable();
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
	public cleartheTable() {
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 47));
		textField.setBounds(556, 106, 397, 87);
		textField.setColumns(10);
		
		setTitle("Clear the table and send notification to Host");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1300, 700);
		
		//Setting the windows always in the centre of the screen
		setLocationRelativeTo(null);
		
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 32));
		lblNewLabel.setBounds(275, 111, 283, 82);
		
		contentPane.add(lblNewLabel);
		
		contentPane.add(textField);
		lblEnterClientNumber.setForeground(Color.BLACK);
		lblEnterClientNumber.setHorizontalAlignment(SwingConstants.LEFT);
		lblEnterClientNumber.setFont(new Font("Times New Roman", Font.PLAIN, 32));
		lblEnterClientNumber.setBounds(275, 212, 283, 82);
		
		contentPane.add(lblEnterClientNumber);
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setFont(new Font("Times New Roman", Font.PLAIN, 47));
		textField_1.setColumns(10);
		textField_1.setBounds(556, 207, 397, 87);
		
		contentPane.add(textField_1);
		saveSend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Disposing the previous Window
				ignoreWindow hide = new ignoreWindow(this);
				hide.setVisible(false);
				setVisible(false);
				dispose();
				
				login sign=new login();
				sign.signin();
			}
		});
		saveSend.setForeground(Color.WHITE);
		saveSend.setBackground(new Color(100, 149, 237));
		saveSend.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		saveSend.setBounds(226, 329, 794, 150);
		
		contentPane.add(saveSend);
		back.addActionListener(new ActionListener() {
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
		back.setForeground(Color.WHITE);
		back.setBackground(SystemColor.inactiveCaptionText);
		back.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		back.setBounds(226, 502, 794, 105);
		
		contentPane.add(back);
	}

}
