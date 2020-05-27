package k10;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.util.ArrayList;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class JList extends JFrame {

	private JPanel contentPane;
	private JTextField tfEifuegen;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JList frame = new JList();
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
	public JList() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTest = new JLabel("Test Tabelle");
		lblTest.setBounds(55, 12, 130, 15);
		contentPane.add(lblTest);
		
		javax.swing.JList listTest = new javax.swing.JList();
		listTest.setBounds(55, 39, 256, 168);
		contentPane.add(listTest);
		
		ArrayList<Double> a;
		final DefaultListModel aModel = new DefaultListModel();
		listTest.setModel(aModel);
		
		tfEifuegen = new JTextField();
		
		tfEifuegen.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					double eingabe;
					eingabe = Double.parseDouble(tfEifuegen.getText());
					aModel.addElement(eingabe);
					tfEifuegen.selectAll();
				}
			}
		});
		tfEifuegen.setBounds(55, 219, 114, 19);
		contentPane.add(tfEifuegen);
		tfEifuegen.setColumns(10);
		tfEifuegen.requestFocus();
		
		JButton btnEinfuegen = new JButton("Einfügen");
		btnEinfuegen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double eingabe;
				eingabe = Double.parseDouble(tfEifuegen.getText());
				aModel.addElement(eingabe);
			}
		});
		btnEinfuegen.setBounds(236, 216, 117, 25);
		contentPane.add(btnEinfuegen);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				aModel.clear();
			}
		});
		btnReset.setBounds(323, 35, 117, 25);
		contentPane.add(btnReset);
		
	}
}
