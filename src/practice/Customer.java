package practice;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class Customer extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_1;
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
	private JButton btnNewButton;
	private JButton btnBackToMain;
	private JButton btnRefresh;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Customer frame = new Customer();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Customer() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 961, 723);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Customer Code         :");
		lblNewLabel.setFont(new Font("Segoe Print", Font.BOLD, 15));
		lblNewLabel.setBounds(145, 114, 171, 30);
		contentPane.add(lblNewLabel);
		
		JLabel lblLastName = new JLabel("Last Name              :");
		lblLastName.setFont(new Font("Segoe Print", Font.BOLD, 15));
		lblLastName.setBounds(145, 155, 170, 30);
		contentPane.add(lblLastName);
		
		JLabel lblFirstName = new JLabel("First Name    :");
		lblFirstName.setFont(new Font("Segoe Print", Font.BOLD, 15));
		lblFirstName.setBounds(502, 155, 115, 30);
		contentPane.add(lblFirstName);
		
		JLabel lblSex = new JLabel("Sex                       :");
		lblSex.setFont(new Font("Segoe Print", Font.BOLD, 15));
		lblSex.setBounds(145, 196, 170, 30);
		contentPane.add(lblSex);
		
		JLabel lblAge = new JLabel("Age             :");
		lblAge.setFont(new Font("Segoe Print", Font.BOLD, 15));
		lblAge.setBounds(502, 196, 115, 30);
		contentPane.add(lblAge);
		
		JLabel lblMartialStatus = new JLabel("Martial Status         :");
		lblMartialStatus.setFont(new Font("Segoe Print", Font.BOLD, 15));
		lblMartialStatus.setBounds(145, 237, 170, 30);
		contentPane.add(lblMartialStatus);
		
		JLabel lblPassportNumber = new JLabel("Passport Number     :");
		lblPassportNumber.setFont(new Font("Segoe Print", Font.BOLD, 15));
		lblPassportNumber.setBounds(145, 278, 170, 30);
		contentPane.add(lblPassportNumber);
		
		JLabel lblVisaNumber = new JLabel("Visa Number :");
		lblVisaNumber.setFont(new Font("Segoe Print", Font.BOLD, 15));
		lblVisaNumber.setBounds(502, 278, 115, 30);
		contentPane.add(lblVisaNumber);
		
		JLabel lblResidentialAddress = new JLabel("Residential Address  :");
		lblResidentialAddress.setFont(new Font("Segoe Print", Font.BOLD, 15));
		lblResidentialAddress.setBounds(145, 319, 170, 30);
		contentPane.add(lblResidentialAddress);
		
		JLabel lblOfficeAddress = new JLabel("Office Address        :");
		lblOfficeAddress.setFont(new Font("Segoe Print", Font.BOLD, 15));
		lblOfficeAddress.setBounds(145, 382, 170, 30);
		contentPane.add(lblOfficeAddress);
		
		JLabel lblPhoneNumber = new JLabel("Phone Number        :");
		lblPhoneNumber.setFont(new Font("Segoe Print", Font.BOLD, 15));
		lblPhoneNumber.setBounds(145, 457, 170, 30);
		contentPane.add(lblPhoneNumber);
		
		JLabel lblEmailId = new JLabel("Email Id                :");
		lblEmailId.setFont(new Font("Segoe Print", Font.BOLD, 15));
		lblEmailId.setBounds(145, 498, 170, 30);
		contentPane.add(lblEmailId);
		
		JLabel lblCustomerStatus = new JLabel("Customer Status     :");
		lblCustomerStatus.setFont(new Font("Segoe Print", Font.BOLD, 15));
		lblCustomerStatus.setBounds(145, 576, 170, 30);
		contentPane.add(lblCustomerStatus);
		
		textField = new JTextField();
		textField.setBounds(326, 114, 155, 30);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(326, 196, 155, 30);
		contentPane.add(textField_2);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(325, 155, 155, 30);
		contentPane.add(textField_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(326, 239, 155, 30);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(326, 278, 155, 30);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(326, 319, 385, 66);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(326, 389, 385, 71);
		contentPane.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(326, 464, 155, 30);
		contentPane.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(326, 505, 385, 30);
		contentPane.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(326, 576, 155, 30);
		contentPane.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(616, 278, 155, 30);
		contentPane.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(616, 196, 155, 30);
		contentPane.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(616, 155, 155, 30);
		contentPane.add(textField_12);
		
		JTextPane txtpnCustomerDetails = new JTextPane();
		txtpnCustomerDetails.setFont(new Font("Tw Cen MT", Font.BOLD, 56));
		txtpnCustomerDetails.setText("     CUSTOMER DETAILS");
		txtpnCustomerDetails.setForeground(Color.WHITE);
		txtpnCustomerDetails.setBackground(Color.BLACK);
		txtpnCustomerDetails.setBounds(145, 11, 626, 66);
		contentPane.add(txtpnCustomerDetails);
		
		btnNewButton = new JButton("SAVE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
		try{
			Connection conn=
					 (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/hotelamangementsystem","root","root");
			PreparedStatement stmt;
			 stmt= (PreparedStatement) conn.prepareStatement("Insert into customer values(?,?,?,?,?,?,?,?,?)");
			 stmt.setString(1, textField.getText());
			 stmt.setString(2, textField_1.getText());
			 stmt.setString(3, textField_2.getText());
			 stmt.setString(4, textField_3.getText());
			 stmt.setString(5, textField_4.getText());
			 stmt.setString(6, textField_5.getText());
			 stmt.setString(7, textField_6.getText());
			 stmt.setString(8, textField_7.getText());
			 stmt.setString(9, textField_8.getText());
			 stmt.setString(10, textField_9.getText());
			 stmt.setString(11, textField_10.getText());
			 stmt.setString(12, textField_11.getText());
			 stmt.setString(13, textField_12.getText());
			 
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
			 textField_9.setText("");
			 textField_10.setText("");
			 textField_11.setText("");
			 textField_12.setText("");
	}catch(SQLException e1) {
		
		e1.printStackTrace();		}
	}
		});
		btnNewButton.setFont(new Font("Sitka Small", Font.BOLD, 13));
		btnNewButton.setBounds(209, 643, 107, 30);
		contentPane.add(btnNewButton);
		
		btnBackToMain = new JButton("BACK TO MAIN");
		btnBackToMain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Login l= new Login();
				l.setVisible(true);
				
				
			}
		});
		btnBackToMain.setFont(new Font("Sitka Small", Font.BOLD, 13));
		btnBackToMain.setBounds(563, 643, 148, 30);
		contentPane.add(btnBackToMain);
		
		btnRefresh = new JButton("REFRESH");
		btnRefresh.setFont(new Font("Sitka Small", Font.BOLD, 13));
		btnRefresh.setBounds(387, 643, 107, 30);
		contentPane.add(btnRefresh);
	}

}
