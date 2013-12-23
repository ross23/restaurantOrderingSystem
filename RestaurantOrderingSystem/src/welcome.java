import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;


public class welcome extends JFrame {

	private JPanel contentPane;
	private final JButton btnNewButton = new JButton("Order the meal");
	private final JLabel lblNewLabel = new JLabel("");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					welcome frame = new welcome();
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
	public welcome() {
		
		setTitle("Restaurant Order System");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1300, 700);
		
		//Setting the windows always in the centre of the screen
				setLocationRelativeTo(null);
		
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(Color.RED);
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 60));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Disposing the previous Window
				ignoreWindow hide = new ignoreWindow(this);
				hide.setVisible(false);
				setVisible(false);
				dispose();
				
				//choice c=new choice();
				//c.chooseMenu();
				
				login l=new login();
				l.signin();
			}
		});
		btnNewButton.setBounds(0, 282, 1284, 103);
		
		contentPane.add(btnNewButton);
		lblNewLabel.setIcon(new ImageIcon("E:\\Rashadul\\examschdule\\RestaurantOrderingSystem\\dining.jpg"));
		lblNewLabel.setBounds(510, 29, 285, 242);
		
		contentPane.add(lblNewLabel);
	}
}
