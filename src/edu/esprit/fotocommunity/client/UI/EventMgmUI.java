package edu.esprit.fotocommunity.client.UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Panel;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;




import javax.swing.JTabbedPane;
import javax.swing.UIManager;

import de.javasoft.plaf.synthetica.SyntheticaGreenDreamLookAndFeel;
import edu.esprit.fotocommunity.client.models.EventTableModel;
import edu.esprit.fotocommunity.client.utils.EventsBusinessDelegate;
import edu.esprit.fotocommunity.ejb.entities.Event;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.table.DefaultTableModel;

public class EventMgmUI extends JFrame {

	private JPanel contentPane;
	private JTable table;
	static EventMgmUI frame ;
	static EventTableModel model1;
	JPanel panel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(new SyntheticaGreenDreamLookAndFeel());
					frame= new EventMgmUI();
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
	public EventMgmUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 760, 536);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		Panel panel = new Panel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(32, 60, 595, 343);
		panel.add(tabbedPane);
		
		panel_1 = new JPanel();
		panel_1.setToolTipText("");
		tabbedPane.addTab("Events Management", null, panel_1, null);
	     model1=new EventTableModel();
		table = new JTable(model1);
			
		panel_1.add(new JScrollPane(table));
		
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Workshops Management", null, panel_2, null);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.setIcon(new ImageIcon("C:\\Users\\ajengui\\jbdevstudio\\studio\\suppression.png"));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Event event=new Event();
				event.setID((Integer) table.getValueAt(table.getSelectedRow(), 0));
				EventsBusinessDelegate.deleteEvent(event);
				JOptionPane.showMessageDialog(null, "Your event has been removed !");
				
				EventTableModel emt = new EventTableModel();
				table.setModel(emt);
				emt.fireTableDataChanged();
				
//				table=new JTable( model1);
//				panel_1.add(new JScrollPane(table));
				
			}
		});
		btnNewButton_3.setBounds(176, 423, 52, 41);
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.setIcon(new ImageIcon("C:\\Users\\ajengui\\jbdevstudio\\studio\\update.png"));
		btnNewButton_4.setBounds(306, 423, 46, 41);
		panel.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("");
		btnNewButton_5.setIcon(new ImageIcon("C:\\Users\\ajengui\\jbdevstudio\\studio\\ajout.PNG"));
		btnNewButton_5.setBounds(424, 423, 46, 41);
		panel.add(btnNewButton_5);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\ajengui\\jbdevstudio\\studio\\logo.png"));
		lblNewLabel.setBounds(0, 0, 639, 53);
		panel.add(lblNewLabel);
	}
}
