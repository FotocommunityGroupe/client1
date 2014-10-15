package edu.esprit.fotocommunity.client.UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTree;
import javax.swing.JTable;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.UIManager;

import java.awt.List;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import de.javasoft.plaf.synthetica.SyntheticaGreenDreamLookAndFeel;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.Toolkit;

public class Accueil extends JFrame {

	/**
	 * Launch the application.
	 */
	static Accueil frame = new Accueil();
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
							UIManager.setLookAndFeel(new SyntheticaGreenDreamLookAndFeel());
					
					
					
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
	public Accueil() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\ajengui\\jbdevstudio\\studio\\background.PNG"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 754, 563);
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\ajengui\\jbdevstudio\\studio\\dashbord1.png"));
		lblNewLabel.setBounds(0, 0, 744, 525);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				EventMgmUI eventMgmUI=new EventMgmUI();
				
				eventMgmUI.setVisible(true);
				frame.setVisible(false);
				
				
				
				
			}
		});
		
		lblNewLabel_1.setBounds(43, 75, 200, 183);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(303, 205, 226, 151);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(28, 284, 255, 230);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setBounds(539, 340, 189, 174);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setBounds(539, 75, 189, 142);
		panel.add(lblNewLabel_5);
	}
}
