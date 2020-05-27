package k9;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Uhrzeit extends JFrame {

	private JPanel contentPane;
	private JTextField tfStunde;
	private JTextField tfMinute;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Uhrzeit frame = new Uhrzeit();
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
	public Uhrzeit() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 160);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblStunde = new JLabel("Stunden");
		lblStunde.setBounds(12, 0, 70, 15);
		contentPane.add(lblStunde);
		
		tfStunde = new JTextField();
		tfStunde.setBounds(12, 12, 114, 19);
		contentPane.add(tfStunde);
		tfStunde.setColumns(10);
		
		JLabel lblMinute = new JLabel("Minuten");
		lblMinute.setBounds(162, 0, 70, 15);
		contentPane.add(lblMinute);
		
		tfMinute = new JTextField();
		tfMinute.setBounds(162, 12, 114, 19);
		contentPane.add(tfMinute);
		tfMinute.setColumns(10);
		
		final JLabel lblAusgabe = new JLabel("");
		lblAusgabe.setBounds(12, 64, 302, 15);
		contentPane.add(lblAusgabe);
		
		JButton btnEnde = new JButton("Ende");
		btnEnde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnEnde.setBounds(355, 59, 81, 25);
		contentPane.add(btnEnde);
		
		JButton btnUebernehmen = new JButton("Übernehmen");
		btnUebernehmen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					int stunde, minute;
					stunde = Integer.parseInt(tfStunde.getText());
					minute = Integer.parseInt(tfMinute.getText());
					if ((stunde > 23) || (stunde < 0)) {
						throw new UhrzeitFormatException("Ungültige Stunden angabe!"); 
					}
					
					lblAusgabe.setText("Deine Uhrzeit beträgt " + stunde + ":" + minute + " Uhr");
					if ((minute > 60) || (minute < 0)) {
						throw new UhrzeitFormatException("Ungültige Minuten Anzahl");
					}
				}
				catch (UhrzeitFormatException a) {
					lblAusgabe.setText(a.getMessage());
				}
				catch (Exception e) {
					lblAusgabe.setText(e.getMessage());
				}
			}
		});
		
		
		btnUebernehmen.setBounds(307, 9, 129, 25);
		contentPane.add(btnUebernehmen);
		
		
	}
}


