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


public class reservation extends JFrame {

	private JPanel contentPane;
	private final JButton status = new JButton("Status of all reservation");
	private final JButton cancel = new JButton("Cancel a reservation");
	private final JButton bookNew = new JButton("Book a new reservation");

	/**
	 * Launch the application.
	 */
	public void reserv() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					reservation frame = new reservation();
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
	public reservation() {
		
		setTitle("Reservation or Booking System");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1300, 700);
		
		//Setting the windows always in the centre of the screen
				setLocationRelativeTo(null);
				
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		status.setForeground(Color.WHITE);
		status.setBackground(Color.DARK_GRAY);
		status.setFont(new Font("Times New Roman", Font.PLAIN, 33));
		status.setBounds(292, 390, 691, 98);
		
		contentPane.add(status);
		cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				//Disposing the previous Window
				ignoreWindow hide = new ignoreWindow(this);
				hide.setVisible(false);
				setVisible(false);
				dispose();
				
				cancelReservation cancelRes=new cancelReservation();
				cancelRes.canceltheReservation();
			}
		});
		cancel.setForeground(Color.WHITE);
		cancel.setBackground(Color.DARK_GRAY);
		cancel.setFont(new Font("Times New Roman", Font.PLAIN, 33));
		cancel.setBounds(292, 264, 691, 98);
		
		contentPane.add(cancel);
		bookNew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				//Disposing the previous Window
				ignoreWindow hide = new ignoreWindow(this);
				hide.setVisible(false);
				setVisible(false);
				dispose();
				
				bookReservation bRes=new bookReservation();
				bRes.book();
			}
		});
		bookNew.setForeground(Color.WHITE);
		bookNew.setBackground(Color.DARK_GRAY);
		bookNew.setFont(new Font("Times New Roman", Font.PLAIN, 33));
		bookNew.setBounds(292, 137, 691, 98);
		
		contentPane.add(bookNew);
	}
}
