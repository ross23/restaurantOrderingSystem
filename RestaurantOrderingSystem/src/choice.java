import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import javax.swing.JTable;
import javax.swing.JTextField;


public class choice extends JFrame {

	private JPanel contentPane;
	private final JButton softDrink = new JButton("Soft Drinks");
	private final JButton smoothDrink = new JButton("Smoothes");
	private final JButton hotDrink = new JButton("Hot Drinks");
	private final JButton geographicalDrink = new JButton("Geo Drinks");
	private final JLabel lblNewLabel = new JLabel("Drinks");
	private final JButton hardDrink = new JButton("Hard Drinks");
	private final JLabel appetizers = new JLabel("Appetizers");
	private final JButton soup = new JButton("Soup");
	private final JButton sweetSour = new JButton("Sweet & Sour");
	private final JButton fishOrMeat = new JButton("Fish or Meat");
	private final JButton salad = new JButton("Salad");
	private final JButton chefsSpecial = new JButton("Chefs Special");
	private final JLabel mainDish = new JLabel("Main Dish");
	private final JButton fish = new JButton("Fish or Sushi");
	private final JButton meat = new JButton("Meat");
	private final JButton pasta = new JButton("Pasta");
	private final JButton chicken = new JButton("Chicken");
	private final JButton todaysSpecial = new JButton("Our special");
	private final JLabel Dessert = new JLabel("Dessert");
	private final JButton icecream = new JButton("Icecream");
	private final JButton cake = new JButton("Cake");
	private final JButton cheese = new JButton("Cheese");
	private final JButton sweets = new JButton("Sweets");
	private final JButton houseSpecial = new JButton("House special");
	private final JLabel lblOneTimeOrder = new JLabel("House meal");
	private final JButton breakfast = new JButton("Breakfast");
	private final JButton brunch = new JButton("Brunch");
	private final JButton lunch = new JButton("Lunch");
	private final JButton dinnerOrSupper = new JButton("Dinner/Supper");
	private final JButton back = new JButton("Table & Client");
	private final JPanel panel = new JPanel();
	private final JTable table = new JTable();
	private final JLabel label = new JLabel("Meal Ordered");
	private final JTextField textField = new JTextField();
	private final JButton saveandsend = new JButton("Save & Send");
	private final JButton btnComplementary = new JButton("Complementary");
	private final JTextField txtTable = new JTextField();

	/**
	 * Launch the application.
	 */
	public void chooseMenu() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					choice frame = new choice();
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
	public choice() {
		txtTable.setForeground(new Color(255, 255, 255));
		txtTable.setBackground(new Color(102, 153, 255));
		txtTable.setFont(new Font("Times New Roman", Font.PLAIN, 31));
		txtTable.setText("Table #   | Client #");
		txtTable.setHorizontalAlignment(SwingConstants.CENTER);
		txtTable.setBounds(10, 475, 479, 31);
		txtTable.setColumns(10);
		
		setTitle("Meal to order");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1300, 700);
		
		//Setting the windows always in the centre of the screen
				setLocationRelativeTo(null);
				
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		softDrink.setForeground(Color.WHITE);
		softDrink.setBackground(SystemColor.inactiveCaptionText);
		softDrink.setFont(new Font("Liberation Sans", Font.PLAIN, 17));
		softDrink.setBounds(509, 39, 148, 120);
		
		contentPane.add(softDrink);
		smoothDrink.setForeground(Color.WHITE);
		smoothDrink.setBackground(SystemColor.inactiveCaptionText);
		smoothDrink.setFont(new Font("Liberation Sans", Font.PLAIN, 17));
		smoothDrink.setBounds(509, 174, 148, 114);
		
		contentPane.add(smoothDrink);
		hotDrink.setForeground(Color.WHITE);
		hotDrink.setBackground(SystemColor.inactiveCaptionText);
		hotDrink.setFont(new Font("Liberation Sans", Font.PLAIN, 17));
		hotDrink.setBounds(508, 299, 149, 115);
		
		contentPane.add(hotDrink);
		geographicalDrink.setForeground(Color.WHITE);
		geographicalDrink.setBackground(SystemColor.inactiveCaptionText);
		geographicalDrink.setFont(new Font("Liberation Sans", Font.PLAIN, 17));
		geographicalDrink.setBounds(509, 425, 148, 111);
		
		contentPane.add(geographicalDrink);
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Dialog", Font.PLAIN, 17));
		lblNewLabel.setBounds(509, 11, 148, 31);
		
		contentPane.add(lblNewLabel);
		hardDrink.setForeground(Color.WHITE);
		hardDrink.setBackground(SystemColor.inactiveCaptionText);
		hardDrink.setFont(new Font("Liberation Sans", Font.PLAIN, 17));
		hardDrink.setBounds(509, 547, 148, 104);
		
		contentPane.add(hardDrink);
		appetizers.setForeground(Color.RED);
		appetizers.setHorizontalAlignment(SwingConstants.CENTER);
		appetizers.setFont(new Font("Dialog", Font.PLAIN, 17));
		appetizers.setBounds(667, 11, 141, 31);
		
		contentPane.add(appetizers);
		soup.setFont(new Font("Liberation Sans", Font.PLAIN, 17));
		soup.setForeground(Color.WHITE);
		soup.setBackground(SystemColor.inactiveCaptionText);
		soup.setBounds(667, 39, 141, 120);
		
		contentPane.add(soup);
		sweetSour.setFont(new Font("Liberation Sans", Font.PLAIN, 17));
		sweetSour.setForeground(Color.WHITE);
		sweetSour.setBackground(SystemColor.inactiveCaptionText);
		sweetSour.setBounds(666, 174, 142, 114);
		
		contentPane.add(sweetSour);
		fishOrMeat.setFont(new Font("Liberation Sans", Font.PLAIN, 17));
		fishOrMeat.setForeground(Color.WHITE);
		fishOrMeat.setBackground(SystemColor.inactiveCaptionText);
		fishOrMeat.setBounds(666, 299, 142, 115);
		
		contentPane.add(fishOrMeat);
		salad.setFont(new Font("Liberation Sans", Font.PLAIN, 17));
		salad.setForeground(Color.WHITE);
		salad.setBackground(SystemColor.inactiveCaptionText);
		salad.setBounds(666, 425, 142, 111);
		
		contentPane.add(salad);
		chefsSpecial.setFont(new Font("Liberation Sans", Font.PLAIN, 17));
		chefsSpecial.setForeground(Color.WHITE);
		chefsSpecial.setBackground(SystemColor.inactiveCaptionText);
		chefsSpecial.setBounds(667, 547, 141, 104);
		
		contentPane.add(chefsSpecial);
		mainDish.setHorizontalAlignment(SwingConstants.CENTER);
		mainDish.setForeground(Color.RED);
		mainDish.setFont(new Font("Dialog", Font.PLAIN, 17));
		mainDish.setBounds(818, 11, 144, 31);
		
		contentPane.add(mainDish);
		fish.setForeground(Color.WHITE);
		fish.setFont(new Font("Liberation Sans", Font.PLAIN, 17));
		fish.setBackground(SystemColor.inactiveCaptionText);
		fish.setBounds(818, 39, 144, 120);
		
		contentPane.add(fish);
		meat.setForeground(Color.WHITE);
		meat.setFont(new Font("Liberation Sans", Font.PLAIN, 17));
		meat.setBackground(SystemColor.inactiveCaptionText);
		meat.setBounds(816, 174, 146, 114);
		
		contentPane.add(meat);
		pasta.setForeground(Color.WHITE);
		pasta.setFont(new Font("Liberation Sans", Font.PLAIN, 17));
		pasta.setBackground(SystemColor.inactiveCaptionText);
		pasta.setBounds(816, 299, 146, 115);
		
		contentPane.add(pasta);
		chicken.setForeground(Color.WHITE);
		chicken.setFont(new Font("Liberation Sans", Font.PLAIN, 17));
		chicken.setBackground(SystemColor.inactiveCaptionText);
		chicken.setBounds(816, 425, 146, 111);
		
		contentPane.add(chicken);
		todaysSpecial.setForeground(Color.WHITE);
		todaysSpecial.setFont(new Font("Liberation Sans", Font.PLAIN, 17));
		todaysSpecial.setBackground(SystemColor.inactiveCaptionText);
		todaysSpecial.setBounds(817, 547, 145, 104);
		
		contentPane.add(todaysSpecial);
		Dessert.setHorizontalAlignment(SwingConstants.CENTER);
		Dessert.setForeground(Color.RED);
		Dessert.setFont(new Font("Dialog", Font.PLAIN, 17));
		Dessert.setBounds(972, 11, 150, 31);
		
		contentPane.add(Dessert);
		icecream.setForeground(Color.WHITE);
		icecream.setFont(new Font("Liberation Sans", Font.PLAIN, 17));
		icecream.setBackground(SystemColor.inactiveCaptionText);
		icecream.setBounds(972, 39, 150, 120);
		
		contentPane.add(icecream);
		cake.setForeground(Color.WHITE);
		cake.setFont(new Font("Liberation Sans", Font.PLAIN, 17));
		cake.setBackground(SystemColor.inactiveCaptionText);
		cake.setBounds(971, 174, 151, 114);
		
		contentPane.add(cake);
		cheese.setForeground(Color.WHITE);
		cheese.setFont(new Font("Liberation Sans", Font.PLAIN, 17));
		cheese.setBackground(SystemColor.inactiveCaptionText);
		cheese.setBounds(971, 299, 151, 115);
		
		contentPane.add(cheese);
		sweets.setForeground(Color.WHITE);
		sweets.setFont(new Font("Liberation Sans", Font.PLAIN, 17));
		sweets.setBackground(SystemColor.inactiveCaptionText);
		sweets.setBounds(971, 425, 151, 111);
		
		contentPane.add(sweets);
		houseSpecial.setForeground(Color.WHITE);
		houseSpecial.setFont(new Font("Liberation Sans", Font.PLAIN, 17));
		houseSpecial.setBackground(SystemColor.inactiveCaptionText);
		houseSpecial.setBounds(972, 547, 150, 104);
		
		contentPane.add(houseSpecial);
		lblOneTimeOrder.setHorizontalAlignment(SwingConstants.CENTER);
		lblOneTimeOrder.setForeground(Color.RED);
		lblOneTimeOrder.setFont(new Font("Dialog", Font.PLAIN, 17));
		lblOneTimeOrder.setBounds(1132, 11, 142, 31);
		
		contentPane.add(lblOneTimeOrder);
		breakfast.setForeground(Color.WHITE);
		breakfast.setFont(new Font("Liberation Sans", Font.PLAIN, 17));
		breakfast.setBackground(SystemColor.inactiveCaptionText);
		breakfast.setBounds(1132, 39, 142, 124);
		
		contentPane.add(breakfast);
		brunch.setForeground(Color.WHITE);
		brunch.setFont(new Font("Liberation Sans", Font.PLAIN, 17));
		brunch.setBackground(SystemColor.inactiveCaptionText);
		brunch.setBounds(1131, 174, 143, 113);
		
		contentPane.add(brunch);
		lunch.setForeground(Color.WHITE);
		lunch.setFont(new Font("Liberation Sans", Font.PLAIN, 17));
		lunch.setBackground(SystemColor.inactiveCaptionText);
		lunch.setBounds(1132, 299, 142, 114);
		
		contentPane.add(lunch);
		dinnerOrSupper.setForeground(Color.WHITE);
		dinnerOrSupper.setFont(new Font("Liberation Sans", Font.PLAIN, 17));
		dinnerOrSupper.setBackground(SystemColor.inactiveCaptionText);
		dinnerOrSupper.setBounds(1132, 425, 143, 111);
		
		contentPane.add(dinnerOrSupper);
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Disposing the previous Window
				ignoreWindow hide = new ignoreWindow(this);
				hide.setVisible(false);
				setVisible(false);
				dispose();
							
				tableReserve reserve=new tableReserve();
				reserve.tableAndClient();
			}
		});
		back.setForeground(Color.WHITE);
		back.setBackground(new Color(100, 149, 237));
		back.setFont(new Font("Liberation Sans", Font.PLAIN, 17));
		back.setBounds(1132, 547, 142, 104);
		
		contentPane.add(back);
		panel.setLayout(null);
		panel.setBorder(new LineBorder(new Color(100, 149, 237)));
		panel.setBackground(new Color(51, 51, 51));
		panel.setBounds(0, 0, 499, 674);
		
		contentPane.add(panel);
		table.setBackground(Color.WHITE);
		table.setBounds(10, 103, 479, 374);
		
		panel.add(table);
		label.setForeground(Color.WHITE);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		label.setBounds(10, 0, 447, 31);
		
		panel.add(label);
		textField.setForeground(new Color(255, 255, 255));
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Times New Roman", Font.BOLD, 57));
		textField.setColumns(10);
		textField.setBackground(new Color(219, 112, 147));
		textField.setBounds(10, 25, 479, 81);
		
		panel.add(textField);
		saveandsend.addActionListener(new ActionListener() {
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
		saveandsend.setForeground(Color.WHITE);
		saveandsend.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		saveandsend.setBackground(new Color(255, 0, 0));
		saveandsend.setBounds(10, 511, 479, 77);
		
		panel.add(saveandsend);
		btnComplementary.setForeground(Color.WHITE);
		btnComplementary.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		btnComplementary.setBackground(SystemColor.inactiveCaptionText);
		btnComplementary.setBounds(10, 599, 479, 55);
		
		panel.add(btnComplementary);
		
		panel.add(txtTable);
	}
}
