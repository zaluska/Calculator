package Calculator_NataliiaZ;

import java.util.Random;

import org.junit.Test;

import Calculator_NataliiaZ.Implementations.Calculator;
import junit.framework.TestCase;

public class CalculatorTests extends TestCase {

	@Test
	public void testAddition() {
		// Arrange
		double firstNumber = 0.0;
		double secondNumber = 0.0;
		double expected = 0.0;
		double actual = 0.0;

		Random rnd = new Random();
		Calculator calculator = new Calculator();

		// Act
		for (int i = 0; i < 50; i++) {
			firstNumber = rnd.nextDouble() * 100 - 50;
			secondNumber = rnd.nextDouble() * 100 - 50;
			expected = firstNumber + secondNumber;

			actual = calculator.addition(firstNumber, secondNumber);

			// Assert
			assertEquals(expected, actual);
		}
	}

	@Test
	public void testSubtraction() {
		// Arrange
		double firstNumber = 0.0;
		double secondNumber = 0.0;
		double expected = 0.0;
		double actual = 0.0;

		Random rnd = new Random();
		Calculator calculator = new Calculator();

		// Act
		for (int i = 0; i < 50; i++) {
			firstNumber = rnd.nextDouble() * 100 - 50;
			secondNumber = rnd.nextDouble() * 100 - 50;
			expected = firstNumber - secondNumber;

			actual = calculator.subtraction(firstNumber, secondNumber);

			// Assert
			assertEquals(expected, actual);
		}
	}

	@Test
	public void testMultiplication() {
		// Arrange
		double firstNumber = 0.0;
		double secondNumber = 0.0;
		double expected = 0.0;
		double actual = 0.0;

		Random rnd = new Random();
		Calculator calculator = new Calculator();

		// Act
		for (int i = 0; i < 50; i++) {
			firstNumber = rnd.nextDouble() * 100 - 50;
			secondNumber = rnd.nextDouble() * 100 - 50;
			expected = firstNumber * secondNumber;

			actual = calculator.multiplication(firstNumber, secondNumber);

			// Assert
			assertEquals(expected, actual);
		}
	}

	@Test
	public void testDivision() {
		// Arrange
		double firstNumber = 0.0;
		double secondNumber = 0.0;
		double expected = 0.0;
		double actual = 0.0;

		Random rnd = new Random();
		Calculator calculator = new Calculator();

		// Act
		for (int i = 0; i < 50; i++) {
			firstNumber = rnd.nextDouble() * 100 - 50;
			secondNumber = rnd.nextDouble() * 100 - 50;
			expected = firstNumber / secondNumber;

			actual = calculator.division(firstNumber, secondNumber);

			// Assert
			assertEquals(expected, actual);
		}
	}

	@Test
	public void testProcent() {
		// Arrange
		double firstNumber = 0.0;
		double secondNumber = 0.0;
		double expected = 0.0;
		double actual = 0.0;

		Random rnd = new Random();
		Calculator calculator = new Calculator();

		// Act
		for (int i = 0; i < 50; i++) {
			firstNumber = rnd.nextDouble() * 100 - 50;
			secondNumber = rnd.nextDouble() * 100 - 50;
			expected = firstNumber * secondNumber / 100;

			actual = calculator.procent(firstNumber, secondNumber);

			// Assert
			assertEquals(expected, actual);
		}
	}

	@Test
	public void testRnd() {
		// Arrange
		double firstNumber = 0.0;
		double secondNumber = 0.0;
		double expected = 0.0;
		double actual = 0.0;

		Random rnd = new Random();
		Calculator calculator = new Calculator();

		// Act
		for (int i = 0; i < 50; i++) {
			firstNumber = rnd.nextDouble() * 100 - 50;
			secondNumber = rnd.nextDouble() * 100 - 50;
			expected = Math.random() * (secondNumber - firstNumber) + firstNumber;

			actual = calculator.rnd(firstNumber, secondNumber);

			// Assert
			assertEquals(expected, actual);
		}
	}

	@Test
	public void testSqrt() {
		// Arrange
		double firstNumber = 0.0;
		double expected = 0.0;
		double actual = 0.0;

		Random rnd = new Random();
		Calculator calculator = new Calculator();

		// Act
		for (int i = 0; i < 50; i++) {
			firstNumber = rnd.nextDouble() * 100 - 50;
			expected = Math.sqrt(firstNumber);

			actual = calculator.sqrt(firstNumber);

			// Assert
			assertEquals(expected, actual);
		}
	}

	@Test
	public void testPower2() {
		// Arrange
		double firstNumber = 0.0;
		double expected = 0.0;
		double actual = 0.0;

		Random rnd = new Random();
		Calculator calculator = new Calculator();

		// Act
		for (int i = 0; i < 50; i++) {
			firstNumber = rnd.nextDouble() * 100 - 50;
			expected = Math.pow(firstNumber, 2);

			actual = calculator.power2(firstNumber);

			// Assert
			assertEquals(expected, actual);
		}
	}

	@Test
	public void testPower3() {
		// Arrange
		double firstNumber = 0.0;
		double expected = 0.0;
		double actual = 0.0;

		Random rnd = new Random();
		Calculator calculator = new Calculator();

		// Act
		for (int i = 0; i < 50; i++) {
			firstNumber = rnd.nextDouble() * 100 - 50;
			expected = Math.pow(firstNumber, 3);

			actual = calculator.power3(firstNumber);

			// Assert
			assertEquals(expected, actual);
		}
	}

	@Test
	public void testAbs() {
		// Arrange
		double firstNumber = 0.0;
		double expected = 0.0;
		double actual = 0.0;

		Random rnd = new Random();
		Calculator calculator = new Calculator();

		// Act
		for (int i = 0; i < 50; i++) {
			firstNumber = rnd.nextDouble() * 100 - 50;
			expected = Math.abs(firstNumber);

			actual = calculator.abs(firstNumber);

			// Assert
			assertEquals(expected, actual);
		}
	}
}
