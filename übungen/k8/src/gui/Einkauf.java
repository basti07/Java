package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.text.DecimalFormat;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Einkauf extends JFrame {

	private JPanel contentPane;
	private JTextField tfStueckzahl;
	private JTextField tfStueckpreis;
	private JTextField tfRabatt;
	private JLabel lblStueckpreis;
	private JLabel lblRabatt;
	private JLabel lblErgebnis;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Einkauf frame = new Einkauf();
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
	public Einkauf() {
		setTitle("Einkauf");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 200);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tfStueckzahl = new JTextField();
		tfStueckzahl.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent a) {
				if (a.getKeyCode() == KeyEvent.VK_ENTER) {
					tfStueckpreis.requestFocus();
					tfStueckpreis.selectAll();
				}
			}
		});
		tfStueckzahl.setBounds(12, 23, 114, 19);
		contentPane.add(tfStueckzahl);
		tfStueckzahl.setColumns(10);
		
		tfStueckpreis = new JTextField();
		tfStueckpreis.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent b) {
				if (b.getKeyCode() == KeyEvent.VK_ENTER) {
					tfRabatt.requestFocus();
					tfRabatt.selectAll();
				}
			}
		});
		tfStueckpreis.setBounds(138, 23, 114, 19);
		contentPane.add(tfStueckpreis);
		tfStueckpreis.setColumns(10);
		
		tfRabatt = new JTextField();
		tfRabatt.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent c) {
				if (c.getKeyCode() == KeyEvent.VK_ENTER) {
					berechnen();
				}
			}
		});
		tfRabatt.setBounds(264, 23, 114, 19);
		contentPane.add(tfRabatt);
		tfRabatt.setColumns(10);
		
		JLabel lblStueckzahl = new JLabel("Stückzahl:");
		lblStueckzahl.setBounds(12, 9, 114, 15);
		contentPane.add(lblStueckzahl);
		
		lblStueckpreis = new JLabel("Stückpreis (€):");
		lblStueckpreis.setBounds(138, 9, 114, 15);
		contentPane.add(lblStueckpreis);
		
		lblRabatt = new JLabel("Rabatt (%):");
		lblRabatt.setBounds(270, 9, 108, 15);
		contentPane.add(lblRabatt);
		
		
		
		JButton btnEnde = new JButton("Ende");
		btnEnde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnEnde.setBounds(444, 80, 117, 25);
		contentPane.add(btnEnde);
		
		
		lblErgebnis = new JLabel();
		lblErgebnis.setFont(new Font("Dialog", Font.BOLD, 15));
		lblErgebnis.setBounds(32, 85, 346, 15);
		contentPane.add(lblErgebnis);
		
		JButton btnBerechnen = new JButton("Berechnen");
		btnBerechnen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				berechnen();
			}
		});
		btnBerechnen.setBounds(444, 20, 117, 25);
		contentPane.add(btnBerechnen);
	}
	
	
	//Berechnung/Aktion nach drücken des Berechnen Buttons:
	
	private void berechnen() {
		try {
			int stueckzahl = 1;
			double stueckpreis, rabatt, ergebnis, brutto;
			/*if (tfStueckzahl.getText().equals("") || tfStueckpreis.equals("")|| tfRabatt.equals("")) {
				lblErgebnis.setText("Bitte fülle alle Felder aus!");
			}else*/
			stueckzahl = Integer.parseInt(tfStueckzahl.getText());
			stueckpreis = Double.parseDouble(tfStueckpreis.getText());
			rabatt = Double.parseDouble(tfRabatt.getText());
			ergebnis = (stueckzahl * stueckpreis - stueckzahl * stueckpreis * rabatt / 100);
			DecimalFormat f =new DecimalFormat("#0.00");
			lblErgebnis.setText("Der Preis beträgt " + (f.format(ergebnis)) + " €.");
			tfStueckzahl.requestFocus();
			tfStueckzahl.selectAll();
		}
		catch (Exception e){
			lblErgebnis.setText("Bitte fülle alle Felder richtig aus!");
		}
		
	}
}
