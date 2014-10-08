package edu.esprit.fotocommunity.client.UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JMenuBar;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import javax.swing.JPasswordField;
import java.awt.Choice;
import javax.swing.JCheckBoxMenuItem;
import java.awt.Button;
import java.awt.Color;

public class AuthentificationAdminUI extends JFrame {

	private JPanel contentPane;
	private JTextField txtlogin;
	private JPasswordField pwdField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AuthentificationAdminUI frame = new AuthentificationAdminUI();
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
	public AuthentificationAdminUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 540, 445);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		Button btConnect = new Button("Connect");
		btConnect.setBounds(82, 297, 93, 22);
		panel.add(btConnect);
		
		Button btCancel = new Button("Cancel");
		btCancel.setBounds(273, 297, 80, 22);
		panel.add(btCancel);
		
		Choice ChoixList = new Choice();
		ChoixList.setBackground(Color.WHITE);
		ChoixList.add("Super Admin");
		ChoixList.add("Admin Manger");
		ChoixList.setBounds(170, 193, 138, 20);
		panel.add(ChoixList);
		ChoixList.setVisible(true);
		
		JLabel lblLogin = new JLabel("");
		lblLogin.setBounds(10, 0, 552, 454);
		panel.add(lblLogin);
		
		JLabel lblNewLabel_1 = new JLabel("Login");
		lblNewLabel_1.setBounds(57, 84, 46, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblPwd = new JLabel("Password");
		lblPwd.setBounds(57, 140, 46, 14);
		panel.add(lblPwd);
		
		txtlogin = new JTextField();
		txtlogin.setBounds(170, 81, 138, 20);
		panel.add(txtlogin);
		txtlogin.setColumns(10);
		
		pwdField = new JPasswordField();
		pwdField.setBounds(170, 137, 138, 20);
		panel.add(pwdField);
		
		JLabel LblPassword = new JLabel("Remember my Password");
		LblPassword.setBounds(185, 242, 193, 28);
		panel.add(LblPassword);
		
		JCheckBoxMenuItem chckbxmntmNewCheckItem_1 = new JCheckBoxMenuItem("");
		chckbxmntmNewCheckItem_1.setSelected(true);
		chckbxmntmNewCheckItem_1.setBounds(129, 242, 46, 22);
		panel.add(chckbxmntmNewCheckItem_1);
	}
}
