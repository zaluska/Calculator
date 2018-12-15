package Calculator_NataliiaZ;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

// Creation class Panel 
public class Panel extends JPanel {

	private JButton numbers[] = new JButton[10]; // Creation Array of buttons
	private Font font = new Font("SanSerif", Font.BOLD, 20);
	private JTextField console = new JTextField(); // Creation output-console

	// Creation constructor to invoke Panel
	public Panel() {
		setLayout(null);

		// Creation button "0"
		numbers[0] = new JButton("0");
		numbers[0].setBounds(80, 290, 60, 60);
		numbers[0].setFont(font);
		add(numbers[0]);

		// Initialization buttons from 1 to 10 via two dimension Array
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				numbers[i * 3 + j + 1] = new JButton((i * 3 + j + 1) + " ");
				numbers[i * 3 + j + 1].setBounds(i * (60 + 10) + 10, j * (60 + 10) + 80, 60, 60);
				numbers[i * 3 + j + 1].setFont(font);
				add(numbers[i * 3 + j + 1]);
			}
		}
		// Setting console parameters
		console.setBounds(10, 10, 230, 50);
		console.setEditable(false);
		add(console);
		/*
		 * 
		 * // Creation ActionListener ActionListener al = new ActionListener () { public
		 * void actionPerformed(ActionEvent e) { // TODO Auto-generated method stub
		 * JButton button = new console.setText(console.getText() + button.getText());
		 * 
		 * for (JButton button: numbers) { button.addActionListener(al); }
		 * 
		 * 
		 * }
		 * 
		 * }
		 */

	}
}

/**
 * for (int i = 0; i < 11; i ++) { JButton b1 = new JButton ("1"); JButton b1 =
 * new JButton ("1"); b1.setBounds(100, 100, 80, 50); add (b1); }
 */
