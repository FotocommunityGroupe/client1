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

import javax.swing.DropMode;

import edu.esprit.fotocommunity.client.utils.AdminManagerBusinessDelegate;
import edu.esprit.fotocommunity.client.utils.UsersBusinessDelegate;
import edu.esprit.fotocommunity.ejb.entities.AdminManager;
import edu.esprit.fotocommunity.ejb.entities.PremiumUser;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

public class AutheticationUI extends JFrame {

	private JPanel contentPane;
	private JTextField login;
	private JTextField passwd;
	private List<AdminManager> listAdmin = new ArrayList<AdminManager>();
	private List<PremiumUser> list = new ArrayList<PremiumUser>();
	

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
		
		login = new JTextField();
		login.setBounds(254, 172, 192, 34);
		panel.add(login);
		login.setColumns(10);
		
		JLabel lblUsename = new JLabel("Usename");
		lblUsename.setText("Username");
		lblUsename.setVisible(true);
		
		passwd = new JTextField();
		passwd.setBounds(254, 238, 192, 34);
		panel.add(passwd);
		passwd.setColumns(10);
		
		JButton btnNewButton = new JButton("Connect");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
 			
			
			}
		});
		btnNewButton.setBackground(new Color(102, 153, 0));
		btnNewButton.setBounds(254, 309, 192, 34);
		panel.add(btnNewButton);
		lblUsename.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblUsename.setToolTipText("Username\r\n");
		lblUsename.setBounds(215, 172, 39, 31);
		panel.add(lblUsename);
		
		JLabel lblPassword = new JLabel("Password");
		panel.add(lblPassword);
		
		lblPassword.setText("password");
		lblPassword.setBounds(215, 238, 39, 34);
		lblPassword.setVisible(true);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\ajengui\\jbdevstudio\\studio\\log1.PNG"));
		lblNewLabel.setBounds(0, 0, 649, 510);
		panel.add(lblNewLabel);
		
	}
}
