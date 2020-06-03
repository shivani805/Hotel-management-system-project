package practice;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Billing extends JFrame  {


	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JButton button;
	private JButton btnRefresh;
	private JButton btnBackToMain;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Billing frame = new Billing();
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
	public Billing() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 961, 723);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBillNumber = new JLabel("Bill Number             : ");
		lblBillNumber.setFont(new Font("Segoe Print", Font.BOLD, 15));
		lblBillNumber.setBounds(221, 115, 179, 25);
		contentPane.add(lblBillNumber);
		
		JLabel lblBookingNumber_1 = new JLabel("Booking Number       :");
		lblBookingNumber_1.setFont(new Font("Segoe Print", Font.BOLD, 15));
		lblBookingNumber_1.setBounds(221, 151, 179, 25);
		contentPane.add(lblBookingNumber_1);
		
		JLabel lblDepartureDate = new JLabel("Departure Date        :");
		lblDepartureDate.setFont(new Font("Segoe Print", Font.BOLD, 15));
		lblDepartureDate.setBounds(221, 187, 179, 25);
		contentPane.add(lblDepartureDate);
		
		JLabel lblBillingDays = new JLabel("Billing Days              :");
		lblBillingDays.setFont(new Font("Segoe Print", Font.BOLD, 15));
		lblBillingDays.setBounds(221, 223, 179, 25);
		contentPane.add(lblBillingDays);
		
		JLabel lblTotalRoomRent = new JLabel("Total Room Rent       :");
		lblTotalRoomRent.setFont(new Font("Segoe Print", Font.BOLD, 15));
		lblTotalRoomRent.setBounds(221, 261, 179, 25);
		contentPane.add(lblTotalRoomRent);
		
		JLabel lblServiceCharge = new JLabel("Service Charge          :");
		lblServiceCharge.setFont(new Font("Segoe Print", Font.BOLD, 15));
		lblServiceCharge.setBounds(221, 299, 179, 25);
		contentPane.add(lblServiceCharge);
		
		JLabel lblGrossBillAmount = new JLabel("Gross Bill Amount      :");
		lblGrossBillAmount.setFont(new Font("Segoe Print", Font.BOLD, 15));
		lblGrossBillAmount.setBounds(221, 335, 179, 25);
		contentPane.add(lblGrossBillAmount);
		
		JLabel lblServiceTax = new JLabel("Service Tax              :");
		lblServiceTax.setFont(new Font("Segoe Print", Font.BOLD, 15));
		lblServiceTax.setBounds(221, 371, 179, 25);
		contentPane.add(lblServiceTax);
		
		JLabel lblDiscountAllowed = new JLabel("Discount Allowed       :");
		lblDiscountAllowed.setFont(new Font("Segoe Print", Font.BOLD, 15));
		lblDiscountAllowed.setBounds(221, 407, 179, 25);
		contentPane.add(lblDiscountAllowed);
		
		JLabel lblNetBillingAmount = new JLabel("Net Billing Amount    :");
		lblNetBillingAmount.setFont(new Font("Segoe Print", Font.BOLD, 15));
		lblNetBillingAmount.setBounds(221, 451, 179, 25);
		contentPane.add(lblNetBillingAmount);
		
		JLabel lblBillingMode = new JLabel("Billing Mode             :");
		lblBillingMode.setFont(new Font("Segoe Print", Font.BOLD, 15));
		lblBillingMode.setBounds(221, 487, 179, 25);
		contentPane.add(lblBillingMode);
		
		JLabel lblAmountRecieved = new JLabel("Amount Recieved      :");
		lblAmountRecieved.setFont(new Font("Segoe Print", Font.BOLD, 15));
		lblAmountRecieved.setBounds(221, 523, 172, 25);
		contentPane.add(lblAmountRecieved);
		
		JLabel lblCreditCardNumber = new JLabel("Credit Card Number :");
		lblCreditCardNumber.setFont(new Font("Segoe Print", Font.BOLD, 15));
		lblCreditCardNumber.setBounds(221, 559, 167, 25);
		contentPane.add(lblCreditCardNumber);
		
		JLabel lblOutstandingAmount = new JLabel("Outstanding Amount :");
		lblOutstandingAmount.setFont(new Font("Segoe Print", Font.BOLD, 15));
		lblOutstandingAmount.setBounds(221, 597, 172, 25);
		contentPane.add(lblOutstandingAmount);
		
		textField_2 = new JTextField();
		textField_2.setBounds(407, 119, 144, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(407, 155, 144, 20);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(407, 191, 144, 20);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(407, 227, 144, 20);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(407, 265, 144, 20);
		contentPane.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(407, 303, 144, 20);
		contentPane.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(407, 339, 144, 20);
		contentPane.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(407, 371, 144, 20);
		contentPane.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(407, 411, 144, 20);
		contentPane.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(407, 455, 144, 20);
		contentPane.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(407, 491, 144, 20);
		contentPane.add(textField_12);
		
		JEditorPane dtrpnBillingDetails = new JEditorPane();
		dtrpnBillingDetails.setForeground(Color.WHITE);
		dtrpnBillingDetails.setFont(new Font("Tw Cen MT", Font.BOLD, 56));
		dtrpnBillingDetails.setText("    BILLING DETAILS");
		dtrpnBillingDetails.setBackground(Color.BLACK);
		dtrpnBillingDetails.setBounds(263, 25, 520, 65);
		contentPane.add(dtrpnBillingDetails);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(407, 527, 144, 20);
		contentPane.add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(407, 563, 144, 20);
		contentPane.add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(407, 601, 144, 20);
		contentPane.add(textField_17);
		
		button = new JButton("SAVE");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					java.sql.Connection conn=
							 (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/hotelamangementsystem","root","root");
					java.sql.PreparedStatement stmt;
					 stmt= (PreparedStatement) conn.prepareStatement("Insert into billing values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
					 stmt.setString(1, textField_2.getText());
					 stmt.setString(2, textField_3.getText());
					 stmt.setString(3, textField_4.getText());
					 stmt.setString(4, textField_5.getText());
					 stmt.setString(5, textField_6.getText());
					 stmt.setString(6, textField_7.getText());
					 stmt.setString(7, textField_8.getText());
					 stmt.setString(8, textField_9.getText());
					 stmt.setString(9, textField_10.getText());
					 stmt.setString(10, textField_11.getText());
					 stmt.setString(11, textField_12.getText());
					 stmt.setString(12, textField_15.getText());
					 stmt.setString(13, textField_16.getText());
					 stmt.setString(14, textField_17.getText());
					 
					 int i=stmt.executeUpdate();
					 JOptionPane.showMessageDialog(null, "Billing Information added!");
					 
					 textField_9.setText("");
					 textField_2.setText("");
					 textField_3.setText("");
					 textField_4.setText("");
					 textField_5.setText("");
					 textField_6.setText("");
					 textField_7.setText("");
					 textField_8.setText("");
					
					 textField_10.setText("");
					 textField_11.setText("");
					 textField_12.setText("");
					
					 textField_15.setText("");
					 textField_16.setText("");
					 textField_17.setText("");
					 
			}catch(SQLException e1) {
				
				e1.printStackTrace();		}
				}
		});
		button.setFont(new Font("Sitka Small", Font.BOLD, 13));
		button.setBounds(310, 644, 107, 30);
		contentPane.add(button);
		
		btnRefresh = new JButton("REFRESH");
		btnRefresh.setFont(new Font("Sitka Small", Font.BOLD, 13));
		btnRefresh.setBounds(493, 644, 107, 30);
		contentPane.add(btnRefresh);
		
		
		btnBackToMain = new JButton("BACK TO MAIN");
		btnBackToMain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login l= new Login();
				l.setVisible(true);
				
			}
		});
		btnBackToMain.setFont(new Font("Sitka Small", Font.BOLD, 13));
		btnBackToMain.setBounds(676, 644, 156, 30);
		contentPane.add(btnBackToMain);
	}


}
