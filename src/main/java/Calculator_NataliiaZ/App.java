package Calculator_NataliiaZ;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class App {
	/**
	 * Main entrance point of the program
	 * 
	 * @param args
	 */
	// private static final Object FlowLayout = null;

	public static void main(String[] args) {
		JFrame frame = new JFrame("Calculator");

		frame.setSize(500, 300);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		Font font = new Font("SanSerif", Font.BOLD, 20);

		// Creating panel for digits
		JPanel panelDigits = new JPanel(new GridLayout(2, 2));
		panelDigits.setFont(font);
		JLabel label1 = new JLabel("First digit");
		JTextField field1 = new JTextField();
		// field1.setBounds(10, 10, 230, 50);

		panelDigits.add(label1);
		panelDigits.add(field1);

		JLabel label2 = new JLabel("Second digit");
		JTextField field2 = new JTextField();
		// field2.setBounds(10, 10, 230, 50);

		panelDigits.add(label2);
		panelDigits.add(field2);

		frame.add(panelDigits, BorderLayout.NORTH);

		// Creation panel for operation
		JPanel panelOperations = new JPanel(new FlowLayout());
		panelOperations.setSize(100, 100);

		JLabel label3 = new JLabel("Operations:");
		JButton button01 = new JButton("+");
		JButton button02 = new JButton("-");
		JButton button03 = new JButton("*");
		JButton button04 = new JButton("/");
		JButton button05 = new JButton("%");
		JButton button06 = new JButton("rnd");
		JButton button07 = new JButton("sqrt");
		JButton button08 = new JButton("^2");
		JButton button09 = new JButton("^3");
		JButton button10 = new JButton("abs");

		panelOperations.add(label3);
		panelOperations.add(button01);
		panelOperations.add(button02);
		panelOperations.add(button03);
		panelOperations.add(button04);
		panelOperations.add(button05);
		panelOperations.add(button06);
		panelOperations.add(button07);
		panelOperations.add(button08);
		panelOperations.add(button09);
		panelOperations.add(button10);

		frame.add(panelOperations, BorderLayout.CENTER);
		
		// Creation panel for result
		JPanel panelResult= new JPanel(new GridLayout(2, 2));
		panelResult.setBounds(10, 10, 230, 50);
		
		JLabel label4 = new JLabel("Result");
		JTextField field3 = new JTextField();
		
		
		panelResult.add(label4);
		panelResult.add (field3);
		
		frame.add(panelResult, BorderLayout.SOUTH);
		
		frame.setVisible(true);
		
	}
}