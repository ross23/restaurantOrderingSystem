import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;


public class bookReservation extends JFrame {

	private JPanel contentPane;
	private final JTextField lebelClientName = new JTextField();
	private final JTextField name = new JTextField();
	private final JTextField lebelDesignation = new JTextField();
	private final JTextField designation = new JTextField();
	private final JTextField txtOrganization = new JTextField();
	private final JTextField organization = new JTextField();
	private final JTextField txtContactNumber = new JTextField();
	private final JTextField contactNumber = new JTextField();
	private final JTextField txtEstimatedGuest = new JTextField();
	private final JTextField totalPerson = new JTextField();
	private final JTextField txtTableNumber = new JTextField();
	private final JTextField textField_7 = new JTextField();
	private final JButton generate = new JButton("Generate Table Number");
	private final JButton btnNewButton = new JButton("Save & Send notification to the mobile device");
	private final JLabel lblwelcome = new JLabel("Say welcome!");

	/**
	 * Launch the application.
	 */
	public void book() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bookReservation frame = new bookReservation();
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
	public bookReservation() {
		name.setBounds(552, 69, 433, 50);
		name.setColumns(10);
		lebelClientName.setText("Name of the client");
		lebelClientName.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		lebelClientName.setBounds(237, 69, 305, 50);
		lebelClientName.setColumns(10);
		
		setTitle("Book a new reservation");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1300, 700);
		
		//Setting the windows always in the centre of the screen
				setLocationRelativeTo(null);
				
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		contentPane.add(lebelClientName);
		
		contentPane.add(name);
		lebelDesignation.setText("Designation");
		lebelDesignation.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		lebelDesignation.setColumns(10);
		lebelDesignation.setBounds(237, 132, 305, 50);
		
		contentPane.add(lebelDesignation);
		designation.setColumns(10);
		designation.setBounds(552, 132, 433, 50);
		
		contentPane.add(designation);
		txtOrganization.setText("Organization");
		txtOrganization.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		txtOrganization.setColumns(10);
		txtOrganization.setBounds(237, 193, 305, 50);
		
		contentPane.add(txtOrganization);
		organization.setColumns(10);
		organization.setBounds(552, 193, 433, 50);
		
		contentPane.add(organization);
		txtContactNumber.setText("Contact number");
		txtContactNumber.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		txtContactNumber.setColumns(10);
		txtContactNumber.setBounds(237, 254, 305, 50);
		
		contentPane.add(txtContactNumber);
		contactNumber.setColumns(10);
		contactNumber.setBounds(552, 254, 433, 50);
		
		contentPane.add(contactNumber);
		txtEstimatedGuest.setText("Estimated guest");
		txtEstimatedGuest.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		txtEstimatedGuest.setColumns(10);
		txtEstimatedGuest.setBounds(237, 315, 305, 50);
		
		contentPane.add(txtEstimatedGuest);
		totalPerson.setColumns(10);
		totalPerson.setBounds(552, 315, 433, 50);
		
		contentPane.add(totalPerson);
		txtTableNumber.setText("Table number");
		txtTableNumber.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		txtTableNumber.setColumns(10);
		txtTableNumber.setBounds(237, 467, 305, 78);
		
		contentPane.add(txtTableNumber);
		textField_7.setColumns(10);
		textField_7.setBounds(552, 467, 433, 78);
		
		contentPane.add(textField_7);
		generate.setForeground(Color.WHITE);
		generate.setBackground(new Color(100, 149, 237));
		generate.setFont(new Font("Times New Roman", Font.PLAIN, 27));
		generate.setBounds(237, 376, 744, 80);
		
		contentPane.add(generate);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				//Disposing the previous Window
				ignoreWindow hide = new ignoreWindow(this);
				hide.setVisible(false);
				setVisible(false);
				dispose();
				
				reservation res=new reservation();
				res.reserv();
			}
		});
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.RED);
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 31));
		btnNewButton.setBounds(237, 573, 748, 78);
		
		contentPane.add(btnNewButton);
		lblwelcome.setForeground(Color.RED);
		lblwelcome.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		lblwelcome.setBounds(237, 0, 305, 50);
		
		contentPane.add(lblwelcome);
	}
}
