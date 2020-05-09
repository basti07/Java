package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Rechner extends JFrame {

	private JPanel contentPane;
	private JTextField tfOperand1;
	private JLabel lblOperand2;
	private JTextField tfOperand2;
	private JTextField tfErgebnis;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Rechner frame = new Rechner();
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
	public Rechner() {
		setTitle("Rechner");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 250);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblOperand1 = new JLabel("Operand 1");
		lblOperand1.setFont(new Font("Dialog", Font.BOLD, 12));
		lblOperand1.setBounds(12, 12, 86, 15);
		contentPane.add(lblOperand1);
		
		tfOperand1 = new JTextField();
		tfOperand1.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent a) {
				if (a.getKeyCode() == KeyEvent.VK_ENTER) {
					tfOperand2.requestFocus();
					tfOperand2.selectAll();
				}/*else if (a.getKeyCode() == KeyEvent.VK_PLUS) {
					addition();
				}else if (a.getKeyCode() == KeyEvent.VK_MINUS) {
					subtraktion();
				}else if (a.getKeyCode() == KeyEvent.VK_MULTIPLY) {
					multiplikation();
				}else if (a.getKeyCode() == KeyEvent.VK_DIVIDE) {
					division();
				}*/
			}
		});
		tfOperand1.setBounds(12, 28, 114, 19);
		contentPane.add(tfOperand1);
		tfOperand1.setColumns(10);
		
		lblOperand2 = new JLabel("Operand 2");
		lblOperand2.setFont(new Font("Dialog", Font.BOLD, 12));
		lblOperand2.setBounds(386, 12, 86, 15);
		contentPane.add(lblOperand2);
		
		tfOperand2 = new JTextField();
		tfOperand2.addKeyListener(new KeyAdapter() {
			/*public void keyPressed(KeyEvent b) {
				if (b.getKeyCode() == KeyEvent.VK_PLUS) {
					addition();
				}else if (b.getKeyCode() == KeyEvent.VK_MINUS) {
					subtraktion();
				}else if (b.getKeyCode() == KeyEvent.VK_MULTIPLY) {
					multiplikation();
				}else if (b.getKeyCode() == KeyEvent.VK_DIVIDE) {
					division();
				}
			}*/
		});
		tfOperand2.setBounds(386, 28, 114, 19);
		contentPane.add(tfOperand2);
		tfOperand2.setColumns(10);
		
		JButton btAddieren = new JButton("+");
		btAddieren.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				addition();
			}
		});
		btAddieren.setFont(new Font("Dialog", Font.BOLD, 15));
		btAddieren.setBounds(138, 25, 100, 25);
		contentPane.add(btAddieren);
		
		JButton btSubtraktion = new JButton("-");
		btSubtraktion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				subtraktion();
			}
		});
		btSubtraktion.setFont(new Font("Dialog", Font.BOLD, 15));
		btSubtraktion.setBounds(268, 25, 100, 25);
		contentPane.add(btSubtraktion);
		
		JButton btMultiplikation = new JButton("*");
		btMultiplikation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				multiplikation();
			}
		});
		btMultiplikation.setFont(new Font("Dialog", Font.BOLD, 15));
		btMultiplikation.setBounds(138, 62, 100, 25);
		contentPane.add(btMultiplikation);
		
		JButton btDivision = new JButton("/");
		btDivision.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				division();
			}
		});
		btDivision.setBounds(268, 62, 100, 25);
		contentPane.add(btDivision);
		
		tfErgebnis = new JTextField();
		tfErgebnis.setEditable(false);
		tfErgebnis.setFont(new Font("Dialog", Font.PLAIN, 15));
		tfErgebnis.setBounds(28, 177, 488, 25);
		contentPane.add(tfErgebnis);
		tfErgebnis.setColumns(10);
		
		JLabel lblErgebnis = new JLabel("Ergebnis:");
		lblErgebnis.setFont(new Font("Dialog", Font.BOLD, 15));
		lblErgebnis.setBounds(28, 160, 86, 15);
		contentPane.add(lblErgebnis);
		
	}
	 private double getOperand1() {
		 double operand1;
		 operand1 = Double.parseDouble(tfOperand1.getText());
		 return operand1;
		 }
	 
	 private double getOperand2() {
		 double operand2;
		 operand2 = Double.parseDouble(tfOperand2.getText());
		 return operand2;
	 }
	 
	 private void wdh() {
		 tfOperand1.requestFocus();
		 tfOperand1.selectAll();
	 }
	 private void addition() {
		 double ergebnis; 
			ergebnis = getOperand1() + getOperand2();
			tfErgebnis.setText(String.valueOf(ergebnis));
			wdh();
	 }
	 
	 private void subtraktion() {
		 double ergebnis;
			ergebnis = getOperand1() - getOperand2();
			tfErgebnis.setText(String.valueOf(ergebnis));
			wdh();
	 }
	 
	 private void multiplikation() {
		 double ergebnis;
			ergebnis = getOperand1() * getOperand2();
			tfErgebnis.setText(String.valueOf(ergebnis));
			wdh();
	 }
	 
	 private void division() {
		 double ergebnis;
			ergebnis = getOperand1() / getOperand2();
			tfErgebnis.setText(String.valueOf(ergebnis));
			wdh();
	 }
	
}
