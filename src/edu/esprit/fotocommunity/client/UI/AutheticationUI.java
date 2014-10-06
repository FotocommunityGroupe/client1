package edu.esprit.fotocommunity.client.UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Panel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Button;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.Font;

public class AutheticationUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AutheticationUI frame = new AutheticationUI();
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
	public AutheticationUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 664, 558);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		Panel panel = new Panel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\ajengui\\jbdevstudio\\studio\\log1.PNG"));
		lblNewLabel.setBounds(0, 0, 649, 510);
		panel.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Connect");
		btnNewButton.setBackground(new Color(102, 153, 0));
		btnNewButton.setBounds(254, 309, 192, 34);
		panel.add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(254, 178, 192, 34);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(254, 238, 192, 34);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblUsename = new JLabel("Usename");
		lblUsename.setText("Username");
		lblUsename.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblUsename.setToolTipText("Username\r\n");
		lblUsename.setBounds(164, 188, 46, 14);
		panel.add(lblUsename);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(164, 248, 46, 14);
		panel.add(lblPassword);
	}
}
