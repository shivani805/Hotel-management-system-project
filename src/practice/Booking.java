package practice;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;

import java.sql.Connection;
import java.sql.PreparedStatement;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Booking extends JFrame {

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

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Booking frame = new Booking();
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
	public Booking() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 961, 723);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBookingNumber = new JLabel("Booking Number   :");
		lblBookingNumber.setFont(new Font("Segoe Print", Font.BOLD, 15));
		lblBookingNumber.setBounds(213, 114, 153, 31);
		contentPane.add(lblBookingNumber);
		
		JLabel lblCustomerCode = new JLabel("Customer Code     :");
		lblCustomerCode.setFont(new Font("Segoe Print", Font.BOLD, 15));
		lblCustomerCode.setBounds(213, 154, 153, 31);
		contentPane.add(lblCustomerCode);
		
		JLabel lblName = new JLabel("Name                :");
		lblName.setFont(new Font("Segoe Print", Font.BOLD, 15));
		lblName.setBounds(213, 196, 153, 31);
		contentPane.add(lblName);
		
		JLabel lblAddress = new JLabel("Address              :");
		lblAddress.setFont(new Font("Segoe Print", Font.BOLD, 15));
		lblAddress.setBounds(213, 238, 153, 31);
		contentPane.add(lblAddress);
		
		JLabel lblRoomNumber = new JLabel("Room Number      :");
		lblRoomNumber.setFont(new Font("Segoe Print", Font.BOLD, 15));
		lblRoomNumber.setBounds(213, 312, 153, 31);
		contentPane.add(lblRoomNumber);
		
		JLabel lblDateOfArrival = new JLabel("Date Of Arrival    :");
		lblDateOfArrival.setFont(new Font("Segoe Print", Font.BOLD, 15));
		lblDateOfArrival.setBounds(213, 354, 153, 31);
		contentPane.add(lblDateOfArrival);
		
		JLabel lblDateOfDeparture = new JLabel("Date Of Departure :");
		lblDateOfDeparture.setFont(new Font("Segoe Print", Font.BOLD, 15));
		lblDateOfDeparture.setBounds(213, 391, 167, 31);
		contentPane.add(lblDateOfDeparture);
		
		JLabel lblNumberOfPersons = new JLabel("Number Of Persons:");
		lblNumberOfPersons.setFont(new Font("Segoe Print", Font.BOLD, 15));
		lblNumberOfPersons.setBounds(213, 433, 167, 31);
		contentPane.add(lblNumberOfPersons);
		
		JLabel lblRelationship = new JLabel("Relationship         :");
		lblRelationship.setFont(new Font("Segoe Print", Font.BOLD, 15));
		lblRelationship.setBounds(213, 475, 153, 31);
		contentPane.add(lblRelationship);
		
		JButton button = new JButton("SAVE");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					Connection conn=
							 (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/hotelamangementsystem","root","root");
					PreparedStatement stmt;
					 stmt= (PreparedStatement) conn.prepareStatement("Insert into booking values(?,?,?,?,?,?,?,?,?)");
					 stmt.setString(1, textField.getText());
					 stmt.setString(2, textField_1.getText());
					 stmt.setString(3, textField_4.getText());
					 stmt.setString(4, textField_5.getText());
					 stmt.setString(5, textField_7.getText());
					 stmt.setString(6, textField_8.getText());
					 stmt.setString(7, textField_2.getText());
					 stmt.setString(8, textField_3.getText());
					 stmt.setString(9, textField_6.getText());
					 
					 int i=stmt.executeUpdate();
					 JOptionPane.showMessageDialog(null, "user name added!");
					 textField.setText("");
					 textField_1.setText("");
					 textField_2.setText("");
					 textField_3.setText("");
					 textField_4.setText("");
					 textField_5.setText("");
					 textField_6.setText("");
					 textField_7.setText("");
					 textField_8.setText("");
			}catch(SQLException e1) {
				
				e1.printStackTrace();		}
			}
		});
		button.setToolTipText("");
		button.setFont(new Font("Sitka Small", Font.BOLD, 13));
		button.setBounds(165, 591, 107, 30);
		contentPane.add(button);
		
		JButton btnRefresh = new JButton("REFRESH");
		btnRefresh.setToolTipText("");
		btnRefresh.setFont(new Font("Sitka Small", Font.BOLD, 13));
		btnRefresh.setBounds(342, 591, 107, 30);
		contentPane.add(btnRefresh);
		
		JButton btnBackToMain = new JButton("BACK TO MAIN");
		btnBackToMain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Login l= new Login();
				l.setVisible(true);
			}
		});
		btnBackToMain.setToolTipText("");
		btnBackToMain.setFont(new Font("Sitka Small", Font.BOLD, 13));
		btnBackToMain.setBounds(509, 591, 135, 30);
		contentPane.add(btnBackToMain);
		
		textField = new JTextField();
		textField.setBounds(388, 114, 172, 31);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(388, 154, 172, 31);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(388, 196, 172, 31);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(388, 238, 408, 66);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(388, 312, 172, 31);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(388, 354, 172, 31);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(388, 391, 172, 31);
		contentPane.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(388, 433, 172, 31);
		contentPane.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(388, 475, 408, 66);
		contentPane.add(textField_8);
		
		JTextArea txtrBookingDetails = new JTextArea();
		txtrBookingDetails.setText("   BOOKING DETAILS");
		txtrBookingDetails.setFont(new Font("Tw Cen MT", Font.BOLD, 56));
		txtrBookingDetails.setForeground(Color.WHITE);
		txtrBookingDetails.setBackground(Color.BLACK);
		txtrBookingDetails.setBounds(249, 11, 547, 66);
		contentPane.add(txtrBookingDetails);
	}
}
