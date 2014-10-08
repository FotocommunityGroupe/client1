package edu.esprit.fotocommunity.client.UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import java.awt.List;
import java.awt.Button;
import java.awt.Panel;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Label;

public class ProfileUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProfileUI frame = new ProfileUI();
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
	public ProfileUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 640, 333);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JList list = new JList();
		list.setBounds(54, 137, 42, -83);
		panel.add(list);
		
		List ListUsers = new List();
		ListUsers.setBounds(10, 53, 157, 171);
		ListUsers.add("Fatma Karoui");
		ListUsers.add("Sinda Yaakoubi");
		ListUsers.add("Oumayma Ajengui");
		ListUsers.setVisible(true);
		
		panel.add(ListUsers);
		
		Button btSearch = new Button("Search");
		btSearch.setBounds(55, 241, 70, 22);
		panel.add(btSearch);
		
		JLabel lblPhoto = new JLabel("");
		lblPhoto.setIcon(new ImageIcon("C:\\Users\\Sinda Yakoubi\\Downloads\\user1.png"));
		lblPhoto.setBounds(258, 21, 60, 43);
		panel.add(lblPhoto);
		
		JLabel lblSexe = new JLabel("Sexe : Female");
		lblSexe.setBounds(210, 128, 121, 14);
		panel.add(lblSexe);
		
		JLabel lblAge = new JLabel("Age :  23");
		lblAge.setBounds(210, 153, 89, 14);
		panel.add(lblAge);
		
		JLabel lblMailAdress = new JLabel("Mail Adress : Fatma.karoui@esprit.tn");
		lblMailAdress.setBounds(210, 178, 194, 14);
		panel.add(lblMailAdress);
		
		JLabel lblName = new JLabel("Name : Karoui Fatma");
		lblName.setBounds(210, 92, 154, 25);
		panel.add(lblName);
		
		JLabel lblTYpeUser = new JLabel("Premium user");
		lblTYpeUser.setBounds(210, 203, 89, 14);
		panel.add(lblTYpeUser);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(305, 81, 46, 14);
		panel.add(label_1);
		
		JLabel lblCode = new JLabel("Code :");
		lblCode.setBounds(441, 153, 46, 14);
		panel.add(lblCode);
		
		textField = new JTextField();
		textField.setBounds(518, 150, 86, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnSend = new JButton("Send ");
		btnSend.setBounds(467, 201, 89, 23);
		panel.add(btnSend);
		
		Label lblNotification = new Label("You have a new notification ");
		lblNotification.setBounds(433, 42, 171, 53);
		panel.add(lblNotification);
	}
}
