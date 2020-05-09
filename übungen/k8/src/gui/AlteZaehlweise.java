package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class AlteZaehlweise extends JFrame {

	private JPanel contentPane;
	private JTextField tfStueck;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AlteZaehlweise frame = new AlteZaehlweise();
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
	public AlteZaehlweise() {
		setTitle("Alte Zählweisen");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblGebeEineStckzahl = new JLabel("Gebe eine Stückzahl ein:");
		lblGebeEineStckzahl.setBounds(12, 12, 186, 15);
		contentPane.add(lblGebeEineStckzahl);
		
		tfStueck = new JTextField();
		tfStueck.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent s) {
				if(s.getKeyCode() == KeyEvent.VK_ENTER) {
					System.out.print("a");
				}
			}
		});
		tfStueck.setBounds(12, 30, 136, 19);
		contentPane.add(tfStueck);
		tfStueck.setColumns(10);
		
		JLabel lblSind = new JLabel("sind");
		lblSind.setBounds(12, 52, 70, 15);
		contentPane.add(lblSind);
		
		final JLabel lblGros = new JLabel("Gros");
		lblGros.setFont(new Font("Dialog", Font.BOLD, 15));
		lblGros.setBounds(12, 101, 153, 15);
		contentPane.add(lblGros);
		
		final JLabel lblSchock = new JLabel("Schock");
		lblSchock.setFont(new Font("Dialog", Font.BOLD, 15));
		lblSchock.setBounds(12, 128, 153, 15);
		contentPane.add(lblSchock);
		
		final JLabel lblDutzend = new JLabel("Dutzend");
		lblDutzend.setFont(new Font("Dialog", Font.BOLD, 15));
		lblDutzend.setBounds(12, 155, 153, 15);
		contentPane.add(lblDutzend);
		
		final JLabel lblStck = new JLabel("Stück");
		lblStck.setFont(new Font("Dialog", Font.BOLD, 15));
		lblStck.setBounds(12, 182, 153, 15);
		contentPane.add(lblStck);
		
		JButton btnEnde = new JButton("Ende");
		btnEnde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnEnde.setBounds(244, 177, 117, 25);
		contentPane.add(btnEnde);
		
		JButton btnUmrechnen = new JButton("Umrechnen");
		btnUmrechnen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int stueck, gros, schock, dutzend;
				stueck = Integer.parseInt(tfStueck.getText());
				dutzend = stueck / 12;
				schock = dutzend / 5;
				gros = dutzend / 12;
				lblDutzend.setText(dutzend + " Dutzend");
				lblStck.setText(stueck + " Stück");
				lblSchock.setText(schock + " Schock");
				lblGros.setText(gros + " Gros");
				tfStueck.requestFocus();
				tfStueck.selectAll();
			}
		});
		
		btnUmrechnen.setBounds(244, 27, 117, 25);
		contentPane.add(btnUmrechnen);
	}
}
