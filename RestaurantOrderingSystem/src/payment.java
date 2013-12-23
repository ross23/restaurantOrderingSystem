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


public class payment extends JFrame {

	private JPanel contentPane;
	private final JButton creditCard = new JButton("Authorize Credit Card");
	private final JButton enterCreditCard = new JButton("Enter Credit Card Number");
	private final JButton discount = new JButton("Discount");
	private final JButton cash = new JButton("Cash");
	private final JButton Quit = new JButton("Quit");

	/**
	 * Launch the application.
	 */
	public void pay() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					payment frame = new payment();
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
	public payment() {
		setTitle("Payment Portal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1300, 700);
		
		//Setting the windows always in the centre of the screen
				setLocationRelativeTo(null);
				
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		creditCard.setForeground(Color.WHITE);
		creditCard.setBackground(new Color(255, 0, 0));
		creditCard.setFont(new Font("Times New Roman", Font.ITALIC, 43));
		creditCard.setBounds(82, 103, 780, 97);
		
		contentPane.add(creditCard);
		enterCreditCard.setForeground(Color.WHITE);
		enterCreditCard.setBackground(new Color(255, 0, 0));
		enterCreditCard.setFont(new Font("Times New Roman", Font.ITALIC, 43));
		enterCreditCard.setBounds(82, 224, 780, 97);
		
		contentPane.add(enterCreditCard);
		discount.setForeground(Color.WHITE);
		discount.setBackground(new Color(255, 0, 0));
		discount.setFont(new Font("Times New Roman", Font.ITALIC, 43));
		discount.setBounds(82, 348, 780, 97);
		
		contentPane.add(discount);
		cash.setForeground(Color.WHITE);
		cash.setFont(new Font("Times New Roman", Font.ITALIC, 43));
		cash.setBackground(Color.RED);
		cash.setBounds(82, 476, 780, 97);
		
		contentPane.add(cash);
		Quit.addActionListener(new ActionListener() {
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
		Quit.setForeground(Color.WHITE);
		Quit.setBackground(new Color(100, 149, 237));
		Quit.setFont(new Font("Times New Roman", Font.PLAIN, 61));
		Quit.setBounds(911, 103, 289, 470);
		
		contentPane.add(Quit);
	}

}
