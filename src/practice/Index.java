package practice;

import java.awt.BorderLayout;
import java.sql.Connection;
import java.awt.EventQueue;

import javax.naming.spi.DirStateFactory.Result;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JSpinner;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Button;
import java.awt.Label;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JTextPane;
import javax.swing.ImageIcon;



public class Index extends JFrame implements ActionListener  {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JPasswordField passwordField;
	PreparedStatement ps;
	ResultSet rs;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotelamangementsystem","root","root");
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Index frame = new Index();
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
	public Index() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 961, 723);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblName.setBounds(72, 82, 61, 29);
		contentPane.add(lblName);
		
		JLabel lblId = new JLabel("ID");
		lblId.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblId.setBounds(72, 122, 61, 14);
		contentPane.add(lblId);
		
		textField = new JTextField();
		textField.setBounds(171, 88, 166, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(171, 121, 166, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPassword.setBounds(72, 150, 75, 20);
		contentPane.add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(171, 152, 166, 20);
		contentPane.add(passwordField);
		
		JButton btnSave = new JButton("LOGIN");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try
				{
					Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotelamangementsystem","root","root");
					PreparedStatement ps;
					 
							ps=conn.prepareStatement("Select * from Users where Name=? and Password=?");	
							ps.setString(1,textField.getText());
							ps.setString(2,passwordField.getText());
							rs=ps.executeQuery();
//							textField.setText("");
//							passwordField.setText("");
							if(rs.next()) {
							textField.setText(rs.getString(1));
							passwordField.setText(rs.getString(2));
							Login l=new Login();
							l.setVisible(true);}
						}
						catch(Exception e)
						{
							textField.setText("");
							passwordField.setText("");
							JOptionPane.showMessageDialog(null, "Invalid user");
						}
//					String s=textField.getText();
//					String s1=new String(passwordField.getPassword());
//					
//					if((s.compareTo("")==0) && (s1.compareTo("")==0))
//					{
//						JOptionPane.showMessageDialog(null, "Welcome");
//						Login l= new Login();
//						l.setVisible(true);
//					}
//					else
//					{
//						throw new Exception();
//					}
//				}
//				catch(Exception e1)
//				{
//					textField.setText("");
//					passwordField.setText("");
//					JOptionPane.showMessageDialog(null, "Not Done");
//				}
			}
		});
//			
//				try
//				{	Connection conn=
//				DriverManager.getConnection("jdbc:mysql://localhost:3306/hotelamangementsystem","root","root");
//		PreparedStatement stmt;
//		 stmt= (PreparedStatement) conn.prepareStatement("Select * from users where UserName=? and Password=?");	
//					stmt.setString(1,textField.getText());
//					stmt.setString(2,passwordField.getText());
//		 System.out.println("a");
//				   String str1,str2;
//				   str1=textField.getText();
//				   str2=new String(passwordField.getPassword());
//				   if((str1.compareTo("users")==0 && (str2.compareTo("users")==0)))
//						   {
//					    Login l= new Login();
//					    l.setVisible(true);
//					textField.setText("");
//					passwordField.setText("");
//						   }
//					
//				}
//				catch(Exception e)
//				{
//					textField.setText("Illegal User Name or Password");
//					passwordField.setText("");
//				}
//
//			}
	//	});
		btnSave.setFont(new Font("Sitka Text", Font.BOLD, 13));
		btnSave.setBounds(142, 194, 89, 23);
		contentPane.add(btnSave);
		btnSave.addActionListener(this);
		
		
		JTextPane txtpnWelcomeToPortal = new JTextPane();
		txtpnWelcomeToPortal.setForeground(Color.WHITE);
		txtpnWelcomeToPortal.setFont(new Font("Tw Cen MT", Font.BOLD, 28));
		txtpnWelcomeToPortal.setBackground(Color.BLACK);
		txtpnWelcomeToPortal.setText(" WELCOME TO PORTAL");
		txtpnWelcomeToPortal.setBounds(75, 21, 288, 37);
		contentPane.add(txtpnWelcomeToPortal);
		
		JButton btnSignUp = new JButton("SIGN UP");
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CreateID c= new CreateID();
				c.setVisible(true);
			}
		});
		btnSignUp.setFont(new Font("Sitka Text", Font.BOLD, 13));
		btnSignUp.setBounds(289, 194, 89, 23);
		contentPane.add(btnSignUp);
	}

	
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()=="btnSave")
		{
			
//			try
//			{		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotelamangementsystem","root","root");
//				ps=conn.prepareStatement("Select * from Users where UserName= '" + textField.getText() + "' and Password=' "  + passwordField.getText() +"'");	
//				ps.setString(1,textField.getText());
//				ps.setString(2,passwordField.getText());
//				rs=ps.executeQuery();
//				textField.setText("");
//				passwordField.setText("");
//				rs.next();
//				textField.setText(rs.getString(1));
//				passwordField.setText(rs.getString(2));
//				Login l=new Login();
//				l.setVisible(true);
//				
//			}
//			catch(Exception e)
//			{
//				textField.setText("Illegal User Name or Password");
//				passwordField.setText("");
//			}
//			try
//			{
//				Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotelamangementsystem","root","root");
//				ps=conn.prepareStatement("Select * from Users where UserName= '" + textField.getText() + "' and Password=' "  + passwordField.getText() +"'");
//				String s=textField.getText();
//				String s1=new String(passwordField.getPassword());
//			System.out.println("a");
//				
//				if((s.compareTo("users")==1) && (s1.compareTo("users")==1))
//				{
//					
//					JOptionPane.showMessageDialog(null, "Welcome");
//					Login l= new Login();
//					l.setVisible(true);
//				}
//				else
//				{
//					throw new Exception();
//				}
//			}
//			catch(Exception e1)
//			{
//				textField.setText("");
//				passwordField.setText("");
//			}
		}
		
	}
}
