package practice;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 738, 465);
	    contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("WELCOME TO MAIN FORM");
		label.setForeground(Color.BLACK);
		label.setFont(new Font("Tw Cen MT", Font.BOLD, 32));
		label.setBackground(Color.ORANGE);
		label.setBounds(48, 53, 469, 52);
		contentPane.add(label);
		
		JButton button = new JButton("Customer");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Customer c= new Customer();
				c.setVisible(true);
			}
		});
		button.setFont(new Font("Tahoma", Font.PLAIN, 16));
		button.setBounds(63, 164, 121, 39);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Booking");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Booking b= new Booking();
				b.setVisible(true);
			}
		});
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		button_1.setBounds(274, 164, 121, 39);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("Billing");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Billing b= new Billing();
				b.setVisible(true);
			}
		});
		button_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		button_2.setBounds(274, 241, 121, 39);
		contentPane.add(button_2);
		
		JButton button_4 = new JButton("Enquiry");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Enquiry e= new Enquiry();
				e.setVisible(true);
			}
		});
		button_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		button_4.setBounds(63, 241, 121, 39);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("Logout");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Index i= new Index();
				i.setVisible(true);
			}
		});
		button_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		button_5.setBounds(185, 322, 121, 39);
		contentPane.add(button_5);
	}
}
