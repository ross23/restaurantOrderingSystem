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


public class switchReport extends JFrame {

	private JPanel contentPane;
	private final JButton reprintReceipt = new JButton("Reprint Receipt");
	private final JButton reopenOrder = new JButton("Reopen Order");
	private final JButton shareTipsWith = new JButton("Share tips with");
	private final JButton exitFromHere = new JButton("Exit from here");

	/**
	 * Launch the application.
	 */
	public void switchReopenReceipt() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					switchReport frame = new switchReport();
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
	public switchReport() {
		
		setTitle("Switch or Recycle");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1300, 700);
		
		//Setting the windows always in the centre of the screen
				setLocationRelativeTo(null);
				
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		reprintReceipt.setForeground(Color.WHITE);
		reprintReceipt.setBackground(new Color(100, 149, 237));
		reprintReceipt.setFont(new Font("Times New Roman", Font.PLAIN, 35));
		reprintReceipt.setBounds(287, 65, 660, 93);
		
		contentPane.add(reprintReceipt);
		reopenOrder.setForeground(Color.WHITE);
		reopenOrder.setFont(new Font("Times New Roman", Font.PLAIN, 35));
		reopenOrder.setBackground(new Color(100, 149, 237));
		reopenOrder.setBounds(287, 187, 660, 93);
		
		contentPane.add(reopenOrder);
		shareTipsWith.setForeground(Color.WHITE);
		shareTipsWith.setFont(new Font("Times New Roman", Font.PLAIN, 35));
		shareTipsWith.setBackground(new Color(100, 149, 237));
		shareTipsWith.setBounds(287, 309, 660, 93);
		
		contentPane.add(shareTipsWith);
		exitFromHere.addActionListener(new ActionListener() {
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
		exitFromHere.setForeground(Color.WHITE);
		exitFromHere.setFont(new Font("Times New Roman", Font.PLAIN, 35));
		exitFromHere.setBackground(new Color(100, 149, 237));
		exitFromHere.setBounds(287, 439, 660, 93);
		
		contentPane.add(exitFromHere);
	}

}
