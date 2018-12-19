package Calculator_NataliiaZ;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import Calculator_NataliiaZ.Implementations.Calculator;

public class App {
	/**
	 * Main entrance point of the program
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// Creation and configuration main frame for calculator
		JFrame frame = new JFrame("Calculator");

		frame.setSize(500, 300);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		Font font = new Font("SanSerif", Font.BOLD, 20);

		// Creating panel with labels for digits
		JPanel panelDigits = new JPanel(new GridLayout(2, 2));
		panelDigits.setFont(font);

		JLabel label1 = new JLabel("First digit");
		final JTextField field1 = new JTextField();

		panelDigits.add(label1);
		panelDigits.add(field1);

		JLabel label2 = new JLabel("Second digit");
		final JTextField field2 = new JTextField();

		panelDigits.add(label2);
		panelDigits.add(field2);

		frame.add(panelDigits, BorderLayout.NORTH);

		// Creation panel for operations
		JPanel panelOperations = new JPanel(new FlowLayout());
		panelOperations.setSize(100, 100);

		// Creation and adding buttons
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
		JPanel panelResult = new JPanel(new GridLayout(2, 2));
		panelResult.setBounds(10, 10, 230, 50);

		JLabel label4 = new JLabel("Result");
		final JTextField field3 = new JTextField();

		panelResult.add(label4);
		panelResult.add(field3);

		frame.add(panelResult, BorderLayout.SOUTH);

		frame.setVisible(true);

		final Calculator calc = new Calculator();

		// Adding ActionListener that will call calc.addition method
		button01.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double firstNumber = Double.parseDouble(field1.getText());
				double secondNumber = Double.parseDouble(field2.getText());
				double result = 0.0;

				result = calc.addition(firstNumber, secondNumber);

				field3.setText(Double.toString(result));
			}
		});

		// Adding ActionListener that will call calc.subtraction method
		button02.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double firstNumber = Double.parseDouble(field1.getText());
				double secondNumber = Double.parseDouble(field2.getText());
				double result = 0.0;

				result = calc.subtraction(firstNumber, secondNumber);

				field3.setText(Double.toString(result));
			}
		});

		// Adding ActionListener that will call calc.multiplication method
		button03.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double firstNumber = Double.parseDouble(field1.getText());
				double secondNumber = Double.parseDouble(field2.getText());
				double result = 0.0;

				result = calc.multiplication(firstNumber, secondNumber);

				field3.setText(Double.toString(result));
			}
		});

		// Adding ActionListener that will call calc.division method
		button04.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double firstNumber = Double.parseDouble(field1.getText());
				double secondNumber = Double.parseDouble(field2.getText());
				double result = 0.0;

				result = calc.division(firstNumber, secondNumber);

				field3.setText(Double.toString(result));
			}
		});

		// Adding ActionListener that will call calc.procent method
		button05.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double firstNumber = Double.parseDouble(field1.getText());
				double secondNumber = Double.parseDouble(field2.getText());
				double result = 0.0;

				result = calc.procent(firstNumber, secondNumber);

				field3.setText(Double.toString(result));
			}
		});

		// Adding ActionListener that will call calc.rnd method
		button06.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double firstNumber = Double.parseDouble(field1.getText());
				double secondNumber = Double.parseDouble(field2.getText());
				double result = 0.0;

				result = calc.rnd(firstNumber, secondNumber);

				field3.setText(Double.toString(result));
			}
		});

		// Adding ActionListener that will call calc.sqrt method
		button07.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double firstNumber = Double.parseDouble(field1.getText());
				double result = 0.0;

				result = calc.sqrt(firstNumber);

				field3.setText(Double.toString(result));
			}
		});

		// Adding ActionListener that will call calc.power2 method
		button08.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double firstNumber = Double.parseDouble(field1.getText());
				double result = 0.0;

				result = calc.power2(firstNumber);

				field3.setText(Double.toString(result));
			}
		});

		// Adding ActionListener that will call calc.power3 method
		button09.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double firstNumber = Double.parseDouble(field1.getText());
				double result = 0.0;

				result = calc.power3(firstNumber);

				field3.setText(Double.toString(result));
			}
		});

		// Adding ActionListener that will call calc.abs method
		button10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double firstNumber = Double.parseDouble(field1.getText());
				double result = 0.0;

				result = calc.abs(firstNumber);

				field3.setText(Double.toString(result));
			}
		});
	}

}