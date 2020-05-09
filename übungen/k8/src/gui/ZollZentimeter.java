package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;

public class ZollZentimeter extends JFrame {

	private JPanel contentPane;
	private JTextField tfZoll;
	private JTextField tfZentimeter;
	private JLabel lblZentimeter;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ZollZentimeter frame = new ZollZentimeter();
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
	public ZollZentimeter() {
		setTitle("Zoll in Zentimeter");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 395, 148);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tfZoll = new JTextField();
		tfZoll.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent z) {
				if (z.getKeyCode() == KeyEvent.VK_ENTER) {
					umrechnen();
				}
			}
		});
		tfZoll.setBounds(22, 45, 117, 25);
		contentPane.add(tfZoll);
		tfZoll.setColumns(10);
		
		
		JLabel lblZoll = new JLabel("Zoll:");
		lblZoll.setBounds(22, 18, 70, 15);
		contentPane.add(lblZoll);
		
		
		JButton btnUmrechnen = new JButton("Umrechnen");
		btnUmrechnen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				umrechnen();
			}
		});
		
		btnUmrechnen.setBounds(22, 82, 117, 25);
		contentPane.add(btnUmrechnen);
		
		JButton btnEnde = new JButton("Ende");
		btnEnde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnEnde.setBounds(221, 82, 117, 25);
		contentPane.add(btnEnde);
		
		tfZentimeter = new JTextField();
		tfZentimeter.setEditable(false);
		tfZentimeter.setBounds(224, 47, 114, 22);
		contentPane.add(tfZentimeter);
		tfZentimeter.setColumns(10);
		
		lblZentimeter = new JLabel("Zentimeter:");
		lblZentimeter.setBounds(221, 18, 117, 15);
		contentPane.add(lblZentimeter);
		
		
		
	}
	
	private void umrechnen() {
		double zoll, zentimeter;
		zoll = Double.parseDouble(tfZoll.getText());
		zentimeter = zoll * 2.45;
		DecimalFormat f = new DecimalFormat("#0.00");
		tfZentimeter.setText(f.format(zentimeter));
		tfZoll.requestFocus();
		tfZoll.selectAll();
	}
}
