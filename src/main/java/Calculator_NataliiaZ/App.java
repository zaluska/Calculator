package Calculator_NataliiaZ;

import javax.swing.JFrame;

public class App {
	/**
	 * Main entrance point of the program
	 * @param args
	 */
	public static void main(String[] args) {
		JFrame calculator = new JFrame("Calculator");
		
		calculator.setSize(500, 400);
		// calculator.add(new Panel());
		calculator.setLocationRelativeTo(null);
		calculator.setResizable(false);
		calculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		calculator.setVisible(true);
	}
}