package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class FahrenheitCelsius extends JFrame {

	private JPanel contentPane;
	private JTextField tfFahrenheit;
	private JLabel lblGradCelsius;
	private JTextField tfCelsius;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
		} catch (Throwable e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FahrenheitCelsius frame = new FahrenheitCelsius();
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
	public FahrenheitCelsius() {
		setTitle("Umrechnenung: Fahrenheit zu Celsius");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 200);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFahrenheit = new JLabel("Grad Fahrenheit");
		lblFahrenheit.setBounds(22, 0, 123, 15);
		contentPane.add(lblFahrenheit);
		
		tfFahrenheit = new JTextField();
		tfFahrenheit.addKeyListener(new KeyAdapter() {
			
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					umrechnen();
				}
			}
		});
		tfFahrenheit.setBounds(22, 20, 240, 19);
		contentPane.add(tfFahrenheit);
		tfFahrenheit.setColumns(10);
		tfFahrenheit.requestFocus();
		
		lblGradCelsius = new JLabel("Grad Celsius");
		lblGradCelsius.setBounds(22, 93, 123, 15);
		contentPane.add(lblGradCelsius);
		
		tfCelsius = new JTextField();
		tfCelsius.setEditable(false);
		tfCelsius.setBounds(22, 114, 240, 19);
		contentPane.add(tfCelsius);
				
		
		JButton btnUmrechnen = new JButton("Umrechnen");
		btnUmrechnen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			umrechnen();
			}
		});
		btnUmrechnen.setBounds(333, 17, 117, 25);
		contentPane.add(btnUmrechnen);
		
		JButton btnEnde = new JButton("Ende");
		btnEnde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnEnde.setBounds(333, 111, 117, 25);
		contentPane.add(btnEnde);
	}
	
	private void umrechnen() {
		try {
		double fahrenheit, celsius;
		fahrenheit = Double.parseDouble(tfFahrenheit.getText()); 
		celsius = (fahrenheit - 32)* 5 / 9;
		System.out.println(celsius);
		DecimalFormat f = new DecimalFormat("#0.00");
		tfCelsius.setText(f.format(celsius));
		tfFahrenheit.requestFocus();
		tfFahrenheit.selectAll();
		}
		catch (Exception e) {
			tfCelsius.setText("Falsches Eingabe!");
		}
	}
	
}
