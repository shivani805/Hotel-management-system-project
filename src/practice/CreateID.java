package practice;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JEditorPane;

import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CreateID extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	 String str1 ,str2;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
		
		
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreateID frame = new CreateID();
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
	public CreateID() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 961, 723);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		

		
		
		JEditorPane dtrpnCreateId = new JEditorPane();
		dtrpnCreateId.setText("          SIGN UP");
		dtrpnCreateId.setForeground(Color.WHITE);
		dtrpnCreateId.setFont(new Font("Tw Cen MT", Font.BOLD, 56));
		dtrpnCreateId.setBackground(Color.BLACK);
		dtrpnCreateId.setBounds(228, 46, 504, 65);
		contentPane.add(dtrpnCreateId);
		
		JLabel label = new JLabel("Name                 :");
		label.setFont(new Font("Segoe Print", Font.BOLD, 15));
		label.setBounds(290, 181, 153, 31);
		contentPane.add(label);
		
		JLabel lblPassword = new JLabel("Password            :");
		lblPassword.setFont(new Font("Segoe Print", Font.BOLD, 15));
		lblPassword.setBounds(290, 223, 153, 27);
		contentPane.add(lblPassword);
		
		JLabel lblConfirmPassword = new JLabel("Confirm Password :");
		lblConfirmPassword.setFont(new Font("Segoe Print", Font.BOLD, 15));
		lblConfirmPassword.setBounds(290, 265, 153, 31);
		contentPane.add(lblConfirmPassword);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(454, 179, 210, 31);
		contentPane.add(textField);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(453, 217, 211, 31);
		contentPane.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(453, 259, 211, 31);
		contentPane.add(passwordField_1);
		
		JButton button = new JButton("SAVE");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
				Connection conn=
						DriverManager.getConnection("jdbc:mysql://localhost:3306/hotelamangementsystem","root","root");
				PreparedStatement stmt;
				 stmt= (PreparedStatement) conn.prepareStatement("Insert into users values(?,?)");
			
				
				 str1=passwordField.getText();
				 str2=passwordField_1.getText();
				
				 if(str1.equals(str2)&&!(str1.equals("")&&str2.equals("")))
				 {
					 stmt.setString(1, textField.getText());
					 stmt.setString(2, passwordField.getText());
					 int i=stmt.executeUpdate();
					 JOptionPane.showMessageDialog(null, "user name added!");
					 textField.setText("");
					 passwordField.setText("");
					 passwordField_1.setText("");
				 }
				 else
				 {
					 JOptionPane.showMessageDialog(null, "Enter Correct Details!");
				 }
				
				}catch (SQLException e1) {
					
					e1.printStackTrace();				}
				
				
//				Connection conn;
//				try {
//					conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotelamangementsystem","root","root");
//					Statement stmt= conn.createStatement();
//					//stmt.executeQuery("SELECT UserName,Password,Color FROM users");
//					stmt.executeUpdate("INSERT into users values('textField.getText()',passwordField.getText()");
//					
//				} catch (SQLException e1) {
//					
//					e1.printStackTrace();
//				}
						
	//		theQuery("insert into users (UserName,Password) values(textField.getText(),passwordField.getText()");
				
			}

		});
		button.setFont(new Font("Sitka Small", Font.BOLD, 13));
		button.setBounds(415, 333, 119, 38);
		contentPane.add(button);
		
		JButton	btnBackToMain = new JButton("BACK TO LoGIN");
		btnBackToMain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Index l= new Index();
				l.setVisible(true);
				
			}
		});
		btnBackToMain.setFont(new Font("Sitka Small", Font.BOLD, 13));
		btnBackToMain.setBounds(555, 333, 150, 38);
		contentPane.add(btnBackToMain);
	}
		
	}

