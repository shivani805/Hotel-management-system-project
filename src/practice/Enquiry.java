package practice;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JEditorPane;

import java.sql.Connection;
import java.sql.PreparedStatement;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Enquiry extends JFrame {

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
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Enquiry frame = new Enquiry();
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
	public Enquiry() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 961, 723);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblName = new JLabel("Last Name           :");
		lblName.setFont(new Font("Segoe Print", Font.BOLD, 15));
		lblName.setBounds(196, 124, 153, 31);
		contentPane.add(lblName);
		
		JLabel lblCustomerCode = new JLabel("Customer Code     :");
		lblCustomerCode.setFont(new Font("Segoe Print", Font.BOLD, 15));
		lblCustomerCode.setBounds(196, 163, 153, 31);
		contentPane.add(lblCustomerCode);
		
		JLabel lblAge = new JLabel("Age                   :");
		lblAge.setFont(new Font("Segoe Print", Font.BOLD, 15));
		lblAge.setBounds(196, 196, 153, 31);
		contentPane.add(lblAge);
		
		JLabel lblNationality = new JLabel("Nationality          :");
		lblNationality.setFont(new Font("Segoe Print", Font.BOLD, 15));
		lblNationality.setBounds(196, 227, 153, 31);
		contentPane.add(lblNationality);
		
		JLabel lblResidentialAddress = new JLabel("Residential Address:");
		lblResidentialAddress.setFont(new Font("Segoe Print", Font.BOLD, 15));
		lblResidentialAddress.setBounds(196, 269, 169, 31);
		contentPane.add(lblResidentialAddress);
		
		JLabel lblPhoneNumber = new JLabel("Phone Number     :");
		lblPhoneNumber.setFont(new Font("Segoe Print", Font.BOLD, 15));
		lblPhoneNumber.setBounds(196, 349, 153, 31);
		contentPane.add(lblPhoneNumber);
		
		JLabel lblEmailId = new JLabel("Email ID             :");
		lblEmailId.setFont(new Font("Segoe Print", Font.BOLD, 15));
		lblEmailId.setBounds(196, 384, 153, 31);
		contentPane.add(lblEmailId);
		
		JLabel lblRoomNumber = new JLabel("Room Number      :");
		lblRoomNumber.setFont(new Font("Segoe Print", Font.BOLD, 15));
		lblRoomNumber.setBounds(196, 419, 153, 31);
		contentPane.add(lblRoomNumber);
		
		JLabel lblDateOfArrival = new JLabel("Date Of Arrival    :");
		lblDateOfArrival.setFont(new Font("Segoe Print", Font.BOLD, 15));
		lblDateOfArrival.setBounds(196, 453, 153, 31);
		contentPane.add(lblDateOfArrival);
		
		JLabel lblDateOfDeparture = new JLabel("Date Of Departure:");
		lblDateOfDeparture.setFont(new Font("Segoe Print", Font.BOLD, 15));
		lblDateOfDeparture.setBounds(190, 488, 159, 31);
		contentPane.add(lblDateOfDeparture);
		
		JLabel lblNumberOfPerson = new JLabel("Number Of Person :");
		lblNumberOfPerson.setFont(new Font("Segoe Print", Font.BOLD, 15));
		lblNumberOfPerson.setBounds(190, 522, 159, 31);
		contentPane.add(lblNumberOfPerson);
		
		JLabel lblNetBillAmount = new JLabel("Net Bill Amount    :");
		lblNetBillAmount.setFont(new Font("Segoe Print", Font.BOLD, 15));
		lblNetBillAmount.setBounds(196, 559, 153, 31);
		contentPane.add(lblNetBillAmount);
		
		textField = new JTextField();
		textField.setBounds(370, 124, 159, 29);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(370, 163, 159, 29);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(370, 199, 159, 29);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(370, 234, 159, 29);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(370, 269, 396, 65);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(370, 349, 159, 29);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(370, 384, 159, 29);
		contentPane.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(370, 419, 159, 29);
		contentPane.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(370, 456, 159, 29);
		contentPane.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(370, 491, 159, 29);
		contentPane.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(370, 525, 159, 29);
		contentPane.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(370, 562, 159, 29);
		contentPane.add(textField_11);
		
		JButton button = new JButton("SAVE");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					Connection conn=
							 (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/hotelamangementsystem","root","root");
					PreparedStatement stmt;
					 stmt= (PreparedStatement) conn.prepareStatement("Insert into customer values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
					 stmt.setString(1, textField_1.getText());
					 stmt.setString(2, textField.getText());
					 stmt.setString(3, textField_12.getText());
					 stmt.setString(4, textField_14.getText());
					 stmt.setString(5, textField_2.getText());
					 stmt.setString(6, textField_13.getText());
					 stmt.setString(7, textField_3.getText());
					 stmt.setString(8, textField_15.getText());
					 stmt.setString(9, textField_16.getText());
					 stmt.setString(10, textField_4.getText());
					 stmt.setString(11, textField_4.getText());
					 stmt.setString(12, textField_5.getText());
					 stmt.setString(13, textField_6.getText());
					 stmt.setString(14, textField_17.getText());
					 
					 int i=stmt.executeUpdate();
					 JOptionPane.showMessageDialog(null, " Information added!");
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
					 textField_13.setText("");
					 textField_14.setText("");
					 textField_15.setText("");
					 textField_16.setText("");
					 textField_17.setText("");
					 
					 
			}catch(SQLException e1) {
				
				e1.printStackTrace();		}
				}
		});
		
		button.setFont(new Font("Sitka Small", Font.BOLD, 13));
		button.setBounds(193, 624, 107, 30);
		contentPane.add(button);
		
		JButton button_1 = new JButton("REFRESH");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Enquiry e= new Enquiry();
				e.setVisible(true);
			}
		});
		button_1.setFont(new Font("Sitka Small", Font.BOLD, 13));
		button_1.setBounds(361, 624, 107, 30);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("BACK TO MAIN");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Login l= new Login();
				l.setVisible(true);
			}
		});
		button_2.setFont(new Font("Sitka Small", Font.BOLD, 13));
		button_2.setBounds(536, 624, 135, 30);
		contentPane.add(button_2);
		
		JEditorPane dtrpnEnquiry = new JEditorPane();
		dtrpnEnquiry.setText("         ENQUIRY");
		dtrpnEnquiry.setForeground(Color.WHITE);
		dtrpnEnquiry.setFont(new Font("Tw Cen MT", Font.BOLD, 56));
		dtrpnEnquiry.setBackground(Color.BLACK);
		dtrpnEnquiry.setBounds(168, 28, 504, 65);
		contentPane.add(dtrpnEnquiry);
		
		JLabel lblFirstName = new JLabel("First Name          :");
		lblFirstName.setFont(new Font("Segoe Print", Font.BOLD, 15));
		lblFirstName.setBounds(573, 124, 153, 31);
		contentPane.add(lblFirstName);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(747, 124, 159, 29);
		contentPane.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(747, 198, 159, 29);
		contentPane.add(textField_13);
		
		JLabel lblMartialStatus = new JLabel("Martial Status      :");
		lblMartialStatus.setFont(new Font("Segoe Print", Font.BOLD, 15));
		lblMartialStatus.setBounds(573, 195, 153, 31);
		contentPane.add(lblMartialStatus);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(747, 165, 159, 29);
		contentPane.add(textField_14);
		
		JLabel lblSex = new JLabel("Sex                   :");
		lblSex.setFont(new Font("Segoe Print", Font.BOLD, 15));
		lblSex.setBounds(573, 162, 153, 31);
		contentPane.add(lblSex);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(747, 352, 159, 29);
		contentPane.add(textField_15);
		
		JLabel lblPassportNo = new JLabel("Passport No.         :");
		lblPassportNo.setFont(new Font("Segoe Print", Font.BOLD, 15));
		lblPassportNo.setBounds(573, 349, 153, 31);
		contentPane.add(lblPassportNo);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(747, 386, 159, 29);
		contentPane.add(textField_16);
		
		JLabel lblVisaNo = new JLabel("Visa No.              :");
		lblVisaNo.setFont(new Font("Segoe Print", Font.BOLD, 15));
		lblVisaNo.setBounds(573, 383, 153, 31);
		contentPane.add(lblVisaNo);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(747, 550, 159, 29);
		contentPane.add(textField_17);
		
		JLabel lblStatus = new JLabel("Status                :");
		lblStatus.setFont(new Font("Segoe Print", Font.BOLD, 15));
		lblStatus.setBounds(573, 547, 153, 31);
		contentPane.add(lblStatus);
	}
}
