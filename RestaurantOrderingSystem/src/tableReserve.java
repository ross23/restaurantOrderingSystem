import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;


public class tableReserve extends JFrame {

	private JPanel contentPane;
	private final JLabel LabelTable = new JLabel("Table");
	private final JLabel lblServerName = new JLabel("Server name");
	private final JTextField textField = new JTextField();
	private final JPanel panel = new JPanel();
	private final JButton t1c1 = new JButton("Client 1");
	private final JLabel LabelClient = new JLabel("Client Markup");
	private final JPanel panel_1 = new JPanel();
	private final JLabel LebelTable1 = new JLabel("Table 1");
	private final JButton t1c2 = new JButton("Client 2");
	private final JButton t1c3 = new JButton("Client 3");
	private final JButton t1c4 = new JButton("Client 4");
	private final JButton t1c5 = new JButton("Client 5");
	private final JButton t1c6 = new JButton("Client 6");
	private final JButton t1c7 = new JButton("Client 7");
	private final JButton t1c8 = new JButton("Client 8");
	private final JButton t2c8 = new JButton("Client 8");
	private final JButton t2c7 = new JButton("Client 7");
	private final JButton t2c6 = new JButton("Client 6");
	private final JButton t2c5 = new JButton("Client 5");
	private final JButton t2c4 = new JButton("Client 4");
	private final JButton t2c3 = new JButton("Client 3");
	private final JButton t2c2 = new JButton("Client 2");
	private final JButton t2c1 = new JButton("Client 1");
	private final JLabel LebelTable2 = new JLabel("Table 2");
	private final JButton t3c8 = new JButton("Client 8");
	private final JButton t3c7 = new JButton("Client 7");
	private final JButton t3c6 = new JButton("Client 6");
	private final JButton t3c5 = new JButton("Client 5");
	private final JButton t3c4 = new JButton("Client 4");
	private final JButton t3c3 = new JButton("Client 3");
	private final JButton t3c2 = new JButton("Client 2");
	private final JButton t3c1 = new JButton("Client 1");
	private final JLabel LebelTable3 = new JLabel("Table 3");
	private final JButton t4c8 = new JButton("Client 8");
	private final JButton t4c7 = new JButton("Client 7");
	private final JButton t4c6 = new JButton("Client 6");
	private final JButton t4c5 = new JButton("Client 5");
	private final JButton t4c4 = new JButton("Client 4");
	private final JButton t4c3 = new JButton("Client 3");
	private final JButton t4c2 = new JButton("Client 2");
	private final JButton t4c1 = new JButton("Client 1");
	private final JLabel LebelTable4 = new JLabel("Table 4");
	private final JButton btnNewButton = new JButton("Return ");
	private final JButton btnExit = new JButton("Exit");
	private final JLabel lblNewLabel_2 = new JLabel("");

	/**
	 * Launch the application.
	 */
	public void tableAndClient() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tableReserve frame = new tableReserve();
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
	public tableReserve() {
		setTitle("Table and Client Order");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1300, 700);
		
		//Setting the windows always in the centre of the screen
				setLocationRelativeTo(null);
				
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		panel_1.setForeground(Color.WHITE);
		panel_1.setBackground(new Color(255, 51, 51));
		panel_1.setBounds(285, 0, 999, 76);
		
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		LabelTable.setHorizontalAlignment(SwingConstants.CENTER);
		LabelTable.setForeground(Color.WHITE);
		LabelTable.setBounds(0, 0, 149, 65);
		panel_1.add(LabelTable);
		LabelTable.setFont(new Font("Times New Roman", Font.PLAIN, 37));
		LabelClient.setForeground(Color.WHITE);
		LabelClient.setBounds(141, 0, 838, 65);
		panel_1.add(LabelClient);
		LabelClient.setBackground(Color.RED);
		LabelClient.setFont(new Font("Times New Roman", Font.PLAIN, 37));
		LabelClient.setHorizontalAlignment(SwingConstants.CENTER);
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 285, 662);
		
		contentPane.add(panel);
		panel.setLayout(null);
		lblServerName.setForeground(Color.DARK_GRAY);
		lblServerName.setBounds(0, 268, 285, 38);
		panel.add(lblServerName);
		lblServerName.setFont(new Font("Times New Roman", Font.PLAIN, 38));
		lblServerName.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBounds(0, 317, 285, 78);
		panel.add(textField);
		textField.setForeground(Color.DARK_GRAY);
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 51));
		textField.setColumns(10);
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
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 33));
		btnNewButton.setBackground(Color.DARK_GRAY);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBounds(0, 429, 285, 119);
		
		panel.add(btnNewButton);
		btnExit.addActionListener(new ActionListener() {
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
		btnExit.setFont(new Font("Times New Roman", Font.PLAIN, 33));
		btnExit.setBackground(Color.DARK_GRAY);
		btnExit.setForeground(Color.WHITE);
		btnExit.setBounds(0, 559, 285, 92);
		
		panel.add(btnExit);
		lblNewLabel_2.setIcon(new ImageIcon("E:\\Rashadul\\examschdule\\RestaurantOrderingSystem\\serve.jpg"));
		lblNewLabel_2.setBounds(0, 0, 285, 233);
		
		panel.add(lblNewLabel_2);
		t1c1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Disposing the previous Window
				ignoreWindow hide = new ignoreWindow(this);
				hide.setVisible(false);
				setVisible(false);
				dispose();
				
				choice meal =new choice();
				meal.chooseMenu();
			}
		});
		t1c1.setForeground(Color.WHITE);
		t1c1.setBackground(Color.DARK_GRAY);
		t1c1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		t1c1.setBounds(436, 87, 96, 105);
		
		contentPane.add(t1c1);
		LebelTable1.setHorizontalAlignment(SwingConstants.CENTER);
		LebelTable1.setForeground(Color.BLACK);
		LebelTable1.setFont(new Font("Times New Roman", Font.PLAIN, 37));
		LebelTable1.setBounds(295, 87, 131, 78);
		
		contentPane.add(LebelTable1);
		t1c2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Disposing the previous Window
				ignoreWindow hide = new ignoreWindow(this);
				hide.setVisible(false);
				setVisible(false);
				dispose();
				
				choice meal =new choice();
				meal.chooseMenu();
			}
		});
		t1c2.setForeground(Color.WHITE);
		t1c2.setBackground(Color.DARK_GRAY);
		t1c2.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		t1c2.setBounds(542, 87, 96, 105);
		
		contentPane.add(t1c2);
		t1c3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Disposing the previous Window
				ignoreWindow hide = new ignoreWindow(this);
				hide.setVisible(false);
				setVisible(false);
				dispose();
				
				choice meal =new choice();
				meal.chooseMenu();
			}
		});
		t1c3.setForeground(Color.WHITE);
		t1c3.setBackground(Color.DARK_GRAY);
		t1c3.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		t1c3.setBounds(648, 87, 96, 105);
		
		contentPane.add(t1c3);
		t1c4.setForeground(Color.WHITE);
		t1c4.setBackground(Color.DARK_GRAY);
		t1c4.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		t1c4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				//Disposing the previous Window
				ignoreWindow hide = new ignoreWindow(this);
				hide.setVisible(false);
				setVisible(false);
				dispose();
				
				choice meal =new choice();
				meal.chooseMenu();
			}
		});
		t1c4.setBounds(754, 87, 96, 105);
		
		contentPane.add(t1c4);
		t1c5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Disposing the previous Window
				ignoreWindow hide = new ignoreWindow(this);
				hide.setVisible(false);
				setVisible(false);
				dispose();
				
				choice meal =new choice();
				meal.chooseMenu();
			}
		});
		t1c5.setForeground(Color.WHITE);
		t1c5.setBackground(Color.DARK_GRAY);
		t1c5.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		t1c5.setBounds(860, 87, 96, 105);
		
		contentPane.add(t1c5);
		t1c6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Disposing the previous Window
				ignoreWindow hide = new ignoreWindow(this);
				hide.setVisible(false);
				setVisible(false);
				dispose();
				
				choice meal =new choice();
				meal.chooseMenu();
			}
		});
		t1c6.setForeground(Color.WHITE);
		t1c6.setBackground(Color.DARK_GRAY);
		t1c6.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		t1c6.setBounds(966, 87, 96, 105);
		
		contentPane.add(t1c6);
		t1c7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Disposing the previous Window
				ignoreWindow hide = new ignoreWindow(this);
				hide.setVisible(false);
				setVisible(false);
				dispose();
				
				choice meal =new choice();
				meal.chooseMenu();
			}
		});
		t1c7.setForeground(Color.WHITE);
		t1c7.setBackground(Color.DARK_GRAY);
		t1c7.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		t1c7.setBounds(1072, 87, 96, 105);
		
		contentPane.add(t1c7);
		t1c8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Disposing the previous Window
				ignoreWindow hide = new ignoreWindow(this);
				hide.setVisible(false);
				setVisible(false);
				dispose();
				
				choice meal =new choice();
				meal.chooseMenu();
			}
		});
		t1c8.setForeground(Color.WHITE);
		t1c8.setBackground(Color.DARK_GRAY);
		t1c8.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		t1c8.setBounds(1178, 87, 96, 105);
		
		contentPane.add(t1c8);
		t2c8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Disposing the previous Window
				ignoreWindow hide = new ignoreWindow(this);
				hide.setVisible(false);
				setVisible(false);
				dispose();
				
				choice meal =new choice();
				meal.chooseMenu();
			}
			
		});
		t2c8.setForeground(Color.WHITE);
		t2c8.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		t2c8.setBackground(Color.DARK_GRAY);
		t2c8.setBounds(1178, 238, 96, 105);
		
		contentPane.add(t2c8);
		t2c7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Disposing the previous Window
				ignoreWindow hide = new ignoreWindow(this);
				hide.setVisible(false);
				setVisible(false);
				dispose();
				
				choice meal =new choice();
				meal.chooseMenu();
			}
		});
		t2c7.setForeground(Color.WHITE);
		t2c7.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		t2c7.setBackground(Color.DARK_GRAY);
		t2c7.setBounds(1072, 238, 96, 105);
		
		contentPane.add(t2c7);
		t2c6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Disposing the previous Window
				ignoreWindow hide = new ignoreWindow(this);
				hide.setVisible(false);
				setVisible(false);
				dispose();
				
				choice meal =new choice();
				meal.chooseMenu();
			}
		});
		t2c6.setForeground(Color.WHITE);
		t2c6.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		t2c6.setBackground(Color.DARK_GRAY);
		t2c6.setBounds(966, 238, 96, 105);
		
		contentPane.add(t2c6);
		t2c5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Disposing the previous Window
				ignoreWindow hide = new ignoreWindow(this);
				hide.setVisible(false);
				setVisible(false);
				dispose();
				
				choice meal =new choice();
				meal.chooseMenu();
			}
		});
		t2c5.setForeground(Color.WHITE);
		t2c5.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		t2c5.setBackground(Color.DARK_GRAY);
		t2c5.setBounds(860, 238, 96, 105);
		
		contentPane.add(t2c5);
		t2c4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Disposing the previous Window
				ignoreWindow hide = new ignoreWindow(this);
				hide.setVisible(false);
				setVisible(false);
				dispose();
				
				choice meal =new choice();
				meal.chooseMenu();
			}
		});
		t2c4.setForeground(Color.WHITE);
		t2c4.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		t2c4.setBackground(Color.DARK_GRAY);
		t2c4.setBounds(754, 238, 96, 105);
		
		contentPane.add(t2c4);
		t2c3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Disposing the previous Window
				ignoreWindow hide = new ignoreWindow(this);
				hide.setVisible(false);
				setVisible(false);
				dispose();
				
				choice meal =new choice();
				meal.chooseMenu();
			}
		});
		t2c3.setForeground(Color.WHITE);
		t2c3.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		t2c3.setBackground(Color.DARK_GRAY);
		t2c3.setBounds(648, 238, 96, 105);
		
		contentPane.add(t2c3);
		t2c2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Disposing the previous Window
				ignoreWindow hide = new ignoreWindow(this);
				hide.setVisible(false);
				setVisible(false);
				dispose();
				
				choice meal =new choice();
				meal.chooseMenu();
			}
		});
		t2c2.setForeground(Color.WHITE);
		t2c2.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		t2c2.setBackground(Color.DARK_GRAY);
		t2c2.setBounds(542, 238, 96, 105);
		
		contentPane.add(t2c2);
		t2c1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Disposing the previous Window
				ignoreWindow hide = new ignoreWindow(this);
				hide.setVisible(false);
				setVisible(false);
				dispose();
				
				choice meal =new choice();
				meal.chooseMenu();
			}
		});
		t2c1.setForeground(Color.WHITE);
		t2c1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		t2c1.setBackground(Color.DARK_GRAY);
		t2c1.setBounds(436, 238, 96, 105);
		
		contentPane.add(t2c1);
		LebelTable2.setHorizontalAlignment(SwingConstants.CENTER);
		LebelTable2.setForeground(Color.BLACK);
		LebelTable2.setFont(new Font("Times New Roman", Font.PLAIN, 37));
		LebelTable2.setBounds(295, 238, 131, 78);
		
		contentPane.add(LebelTable2);
		t3c8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Disposing the previous Window
				ignoreWindow hide = new ignoreWindow(this);
				hide.setVisible(false);
				setVisible(false);
				dispose();
				
				choice meal =new choice();
				meal.chooseMenu();
			}
		});
		t3c8.setForeground(Color.WHITE);
		t3c8.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		t3c8.setBackground(Color.DARK_GRAY);
		t3c8.setBounds(1178, 392, 96, 105);
		
		contentPane.add(t3c8);
		t3c7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Disposing the previous Window
				ignoreWindow hide = new ignoreWindow(this);
				hide.setVisible(false);
				setVisible(false);
				dispose();
				
				choice meal =new choice();
				meal.chooseMenu();
			}
		});
		t3c7.setForeground(Color.WHITE);
		t3c7.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		t3c7.setBackground(Color.DARK_GRAY);
		t3c7.setBounds(1072, 392, 96, 105);
		
		contentPane.add(t3c7);
		t3c6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Disposing the previous Window
				ignoreWindow hide = new ignoreWindow(this);
				hide.setVisible(false);
				setVisible(false);
				dispose();
				
				choice meal =new choice();
				meal.chooseMenu();
			}
		});
		t3c6.setForeground(Color.WHITE);
		t3c6.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		t3c6.setBackground(Color.DARK_GRAY);
		t3c6.setBounds(966, 392, 96, 105);
		
		contentPane.add(t3c6);
		t3c5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Disposing the previous Window
				ignoreWindow hide = new ignoreWindow(this);
				hide.setVisible(false);
				setVisible(false);
				dispose();
				
				choice meal =new choice();
				meal.chooseMenu();
			}
		});
		t3c5.setForeground(Color.WHITE);
		t3c5.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		t3c5.setBackground(Color.DARK_GRAY);
		t3c5.setBounds(860, 392, 96, 105);
		
		contentPane.add(t3c5);
		t3c4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Disposing the previous Window
				ignoreWindow hide = new ignoreWindow(this);
				hide.setVisible(false);
				setVisible(false);
				dispose();
				
				choice meal =new choice();
				meal.chooseMenu();
			}
		});
		t3c4.setForeground(Color.WHITE);
		t3c4.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		t3c4.setBackground(Color.DARK_GRAY);
		t3c4.setBounds(754, 392, 96, 105);
		
		contentPane.add(t3c4);
		t3c3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Disposing the previous Window
				ignoreWindow hide = new ignoreWindow(this);
				hide.setVisible(false);
				setVisible(false);
				dispose();
				
				choice meal =new choice();
				meal.chooseMenu();
			}
		});
		t3c3.setForeground(Color.WHITE);
		t3c3.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		t3c3.setBackground(Color.DARK_GRAY);
		t3c3.setBounds(648, 392, 96, 105);
		
		contentPane.add(t3c3);
		t3c2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Disposing the previous Window
				ignoreWindow hide = new ignoreWindow(this);
				hide.setVisible(false);
				setVisible(false);
				dispose();
				
				choice meal =new choice();
				meal.chooseMenu();
			}
		});
		t3c2.setForeground(Color.WHITE);
		t3c2.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		t3c2.setBackground(Color.DARK_GRAY);
		t3c2.setBounds(542, 392, 96, 105);
		
		contentPane.add(t3c2);
		t3c1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Disposing the previous Window
				ignoreWindow hide = new ignoreWindow(this);
				hide.setVisible(false);
				setVisible(false);
				dispose();
				
				choice meal =new choice();
				meal.chooseMenu();
			}
		});
		t3c1.setForeground(Color.WHITE);
		t3c1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		t3c1.setBackground(Color.DARK_GRAY);
		t3c1.setBounds(436, 392, 96, 105);
		
		contentPane.add(t3c1);
		LebelTable3.setHorizontalAlignment(SwingConstants.CENTER);
		LebelTable3.setForeground(Color.BLACK);
		LebelTable3.setFont(new Font("Times New Roman", Font.PLAIN, 37));
		LebelTable3.setBounds(295, 392, 131, 78);
		
		contentPane.add(LebelTable3);
		t4c8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Disposing the previous Window
				ignoreWindow hide = new ignoreWindow(this);
				hide.setVisible(false);
				setVisible(false);
				dispose();
				
				choice meal =new choice();
				meal.chooseMenu();
			}
		});
		t4c8.setForeground(Color.WHITE);
		t4c8.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		t4c8.setBackground(Color.DARK_GRAY);
		t4c8.setBounds(1178, 546, 96, 105);
		
		contentPane.add(t4c8);
		t4c7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Disposing the previous Window
				ignoreWindow hide = new ignoreWindow(this);
				hide.setVisible(false);
				setVisible(false);
				dispose();
				
				choice meal =new choice();
				meal.chooseMenu();
			}
		});
		t4c7.setForeground(Color.WHITE);
		t4c7.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		t4c7.setBackground(Color.DARK_GRAY);
		t4c7.setBounds(1072, 546, 96, 105);
		
		contentPane.add(t4c7);
		t4c6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Disposing the previous Window
				ignoreWindow hide = new ignoreWindow(this);
				hide.setVisible(false);
				setVisible(false);
				dispose();
				
				choice meal =new choice();
				meal.chooseMenu();
			}
		});
		t4c6.setForeground(Color.WHITE);
		t4c6.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		t4c6.setBackground(Color.DARK_GRAY);
		t4c6.setBounds(966, 546, 96, 105);
		
		contentPane.add(t4c6);
		t4c5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Disposing the previous Window
				ignoreWindow hide = new ignoreWindow(this);
				hide.setVisible(false);
				setVisible(false);
				dispose();
				
				choice meal =new choice();
				meal.chooseMenu();
			}
		});
		t4c5.setForeground(Color.WHITE);
		t4c5.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		t4c5.setBackground(Color.DARK_GRAY);
		t4c5.setBounds(860, 546, 96, 105);
		
		contentPane.add(t4c5);
		t4c4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Disposing the previous Window
				ignoreWindow hide = new ignoreWindow(this);
				hide.setVisible(false);
				setVisible(false);
				dispose();
				
				choice meal =new choice();
				meal.chooseMenu();
			}
		});
		t4c4.setForeground(Color.WHITE);
		t4c4.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		t4c4.setBackground(Color.DARK_GRAY);
		t4c4.setBounds(754, 546, 96, 105);
		
		contentPane.add(t4c4);
		t4c3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Disposing the previous Window
				ignoreWindow hide = new ignoreWindow(this);
				hide.setVisible(false);
				setVisible(false);
				dispose();
				
				choice meal =new choice();
				meal.chooseMenu();
			}
		});
		t4c3.setForeground(Color.WHITE);
		t4c3.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		t4c3.setBackground(Color.DARK_GRAY);
		t4c3.setBounds(648, 546, 96, 105);
		
		contentPane.add(t4c3);
		t4c2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Disposing the previous Window
				ignoreWindow hide = new ignoreWindow(this);
				hide.setVisible(false);
				setVisible(false);
				dispose();
				
				choice meal =new choice();
				meal.chooseMenu();
			}
		});
		t4c2.setForeground(Color.WHITE);
		t4c2.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		t4c2.setBackground(Color.DARK_GRAY);
		t4c2.setBounds(542, 546, 96, 105);
		
		contentPane.add(t4c2);
		t4c1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Disposing the previous Window
				ignoreWindow hide = new ignoreWindow(this);
				hide.setVisible(false);
				setVisible(false);
				dispose();
				
				choice meal =new choice();
				meal.chooseMenu();
			}
		});
		t4c1.setForeground(Color.WHITE);
		t4c1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		t4c1.setBackground(Color.DARK_GRAY);
		t4c1.setBounds(436, 546, 96, 105);
		
		contentPane.add(t4c1);
		LebelTable4.setHorizontalAlignment(SwingConstants.CENTER);
		LebelTable4.setForeground(Color.BLACK);
		LebelTable4.setFont(new Font("Times New Roman", Font.PLAIN, 37));
		LebelTable4.setBounds(295, 546, 131, 78);
		
		contentPane.add(LebelTable4);
	}
}
