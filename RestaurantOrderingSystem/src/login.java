import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JButton;


public class login extends JFrame implements ActionListener {

	private JPanel contentPane;
	private final JTextField pass = new JTextField();
	private final JButton one = new JButton("1");
	private final JButton two = new JButton("2");
	private final JButton three = new JButton("3");
	private final JButton four = new JButton("4");
	private final JButton five = new JButton("5");
	private final JButton six = new JButton("6");
	private final JButton seven = new JButton("7");
	private final JButton eight = new JButton("8");
	private final JButton nine = new JButton("9");
	private final JButton zero = new JButton("0");
	private final JButton enterButton = new JButton("Enter");
	private final JButton reset = new JButton("Reset");
	private final JButton btnReturn = new JButton("Return");
	private final JTextField id = new JTextField();
	private final JButton admin = new JButton("Admin");
	private final JButton host = new JButton("Host");

	/**
	 * Launch the application.
	 */
	public void signin() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login frame = new login();
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
	public login() {
		pass.setForeground(new Color(255, 0, 0));
		pass.setHorizontalAlignment(SwingConstants.CENTER);
		pass.setFont(new Font("Times New Roman", Font.PLAIN, 99));
		pass.setBounds(44, 90, 873, 147);
		pass.setColumns(10);
		setTitle("Login into the System");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1300, 700);
		
		//Setting the windows always in the centre of the screen
				setLocationRelativeTo(null);

		
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		contentPane.add(pass);
		one.setForeground(Color.WHITE);
		one.setFont(four.getFont().deriveFont(150f));
		one.setBackground(SystemColor.inactiveCaptionText);
		one.setBounds(224, 266, 166, 180);
		
		contentPane.add(one);
		two.setForeground(Color.WHITE);
		two.setFont(four.getFont().deriveFont(150f));
		two.setBackground(SystemColor.inactiveCaptionText);
		two.setBounds(400, 266, 168, 180);
		
		contentPane.add(two);
		three.setForeground(Color.WHITE);
		three.setFont(four.getFont().deriveFont(150f));
		three.setBackground(SystemColor.inactiveCaptionText);
		three.setBounds(578, 266, 167, 180);
		
		contentPane.add(three);
		four.setForeground(Color.WHITE);
		four.setFont(four.getFont().deriveFont(150f));
		four.setBackground(SystemColor.inactiveCaptionText);
		four.setBounds(755, 266, 162, 180);
		
		contentPane.add(four);
		five.setForeground(Color.WHITE);
		five.setFont(four.getFont().deriveFont(150f));
		five.setBackground(SystemColor.inactiveCaptionText);
		five.setBounds(44, 473, 170, 178);
		
		contentPane.add(five);
		six.setForeground(Color.WHITE);
		six.setFont(four.getFont().deriveFont(150f));
		six.setBackground(SystemColor.inactiveCaptionText);
		six.setBounds(225, 473, 165, 178);
		
		contentPane.add(six);
		seven.setForeground(Color.WHITE);
		seven.setFont(four.getFont().deriveFont(150f));
		seven.setBackground(SystemColor.inactiveCaptionText);
		seven.setBounds(400, 473, 167, 178);
		
		contentPane.add(seven);
		eight.setForeground(Color.WHITE);
		eight.setFont(four.getFont().deriveFont(150f));
		eight.setBackground(SystemColor.inactiveCaptionText);
		eight.setBounds(578, 473, 166, 178);
		
		contentPane.add(eight);
		nine.setForeground(Color.WHITE);
		nine.setFont(four.getFont().deriveFont(150f));
		nine.setBackground(SystemColor.inactiveCaptionText);
		nine.setBounds(756, 473, 161, 178);
		
		contentPane.add(nine);
		zero.setForeground(Color.WHITE);
		zero.setFont(four.getFont().deriveFont(150f));
		zero.setBackground(SystemColor.inactiveCaptionText);
		zero.setBounds(44, 266, 170, 180);
		
		contentPane.add(zero);
		enterButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				//Disposing the previous Window
				ignoreWindow hide = new ignoreWindow(this);
				hide.setVisible(false);
				setVisible(false);
				dispose();
				
				tableOption t=new tableOption();
				t.table();
			}
		});
		enterButton.setForeground(new Color(255, 255, 255));
		enterButton.setBackground(new Color(204, 0, 0));
		enterButton.setFont(new Font("Times New Roman", Font.PLAIN, 60));
		enterButton.setBounds(963, 11, 311, 114);
		
		contentPane.add(enterButton);
		reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				id.setText(null);
				pass.setText(null);
			}
		});
		reset.setForeground(Color.WHITE);
		reset.setBackground(new Color(100, 149, 237));
		reset.setFont(new Font("Times New Roman", Font.PLAIN, 60));
		reset.setBounds(963, 136, 311, 114);
		
		contentPane.add(reset);
		btnReturn.addActionListener(new ActionListener() {
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
		btnReturn.setForeground(Color.WHITE);
		btnReturn.setFont(new Font("Times New Roman", Font.PLAIN, 60));
		btnReturn.setBackground(new Color(100, 149, 237));
		btnReturn.setBounds(963, 537, 311, 114);
		
		contentPane.add(btnReturn);
		id.setHorizontalAlignment(SwingConstants.CENTER);
		id.setForeground(new Color(100, 149, 237));
		id.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		id.setColumns(10);
		id.setBounds(44, 11, 873, 68);
		
		contentPane.add(id);
		admin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Disposing the previous Window
				ignoreWindow hide = new ignoreWindow(this);
				hide.setVisible(false);
				setVisible(false);
				dispose();
				
				adminOption admin=new adminOption();
				admin.adminPrivilege();
			}
		});
		admin.setForeground(Color.WHITE);
		admin.setFont(new Font("Times New Roman", Font.PLAIN, 60));
		admin.setBackground(new Color(100, 149, 237));
		admin.setBounds(963, 284, 311, 114);
		
		contentPane.add(admin);
		host.addActionListener(new ActionListener() {
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
		host.setForeground(Color.WHITE);
		host.setFont(new Font("Times New Roman", Font.PLAIN, 60));
		host.setBackground(new Color(100, 149, 237));
		host.setBounds(963, 412, 311, 114);
		
		contentPane.add(host);
		
		zero.addActionListener(this);
		one.addActionListener(this);
		two.addActionListener(this);
		three.addActionListener(this);
		four.addActionListener(this);
		five.addActionListener(this);
		six.addActionListener(this);
		seven.addActionListener(this);
		eight.addActionListener(this);
		nine.addActionListener(this);
	}
	
		public void actionPerformed(ActionEvent e)
		{
				if(e.getSource()==zero)
					pass.setText(pass.getText()+"0");
				if(e.getSource()==one)
					pass.setText(pass.getText()+"1");
				if(e.getSource()==two)
					pass.setText(pass.getText()+"2");
				if(e.getSource()==three)
					pass.setText(pass.getText()+"3");
				if(e.getSource()==four)
					pass.setText(pass.getText()+"4");
				if(e.getSource()==five)
					pass.setText(pass.getText()+"5");
				if(e.getSource()==six)
					pass.setText(pass.getText()+"6");
				if(e.getSource()==seven)
					pass.setText(pass.getText()+"7");
				if(e.getSource()==eight)
					pass.setText(pass.getText()+"8");
				if(e.getSource()==nine)
					pass.setText(pass.getText()+"9");				
		}
}
