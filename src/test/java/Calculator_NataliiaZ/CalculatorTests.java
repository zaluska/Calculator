package Calculator_NataliiaZ;

import java.util.Random;

import org.junit.Test;

import Calculator_NataliiaZ.Implementations.Calculator;
import junit.framework.TestCase;

public class CalculatorTests extends TestCase {

	// Creation unit tests that uses random input values in a loop-structure.
	// Testing positive and negative values to each method.

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
		double firstNumber = 10.0;
		double secondNumber = 100.0;

		Calculator calculator = new Calculator();

		// Act
		double actual = calculator.rnd(firstNumber, secondNumber);

		// Assert
		assertTrue(actual >= firstNumber && actual <= secondNumber);
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

	// Creation unit tests to each method that uses zero values for one of the
	// numbers.
	@Test
	public void testZeroAddition() {
		// Arrange
		double firstNumber = 2.0;
		double secondNumber = 0.0;
		double expected = 2.0;
		Calculator calculator = new Calculator();

		// Act
		double actual = calculator.addition(firstNumber, secondNumber);

		// Assert
		assertEquals(expected, actual);
	}

	@Test
	public void testZeroSubtraction() {
		// Arrange
		double firstNumber = 2.0;
		double secondNumber = 0.0;
		double expected = 2.0;
		Calculator calculator = new Calculator();

		// Act
		double actual = calculator.subtraction(firstNumber, secondNumber);

		// Assert
		assertEquals(expected, actual);
	}

	@Test
	public void testZeroMultiplication() {
		// Arrange
		double firstNumber = 2.0;
		double secondNumber = 0.0;
		double expected = 0.0;
		Calculator calculator = new Calculator();

		// Act
		double actual = calculator.multiplication(firstNumber, secondNumber);

		// Assert
		assertEquals(expected, actual);
	}

	@Test
	public void testZeroDivision() {
		// Arrange
		double firstNumber = 2.0;
		double secondNumber = 0.0;
		Calculator calculator = new Calculator();

		// Act
		double actual = calculator.division(firstNumber, secondNumber);

		// Assert
		assertTrue(Double.isInfinite(actual));
	}

	@Test
	public void testZeroProcent() {
		// Arrange
		double firstNumber = 2.0;
		double secondNumber = 0.0;
		double expected = 0.0;
		Calculator calculator = new Calculator();

		// Act
		double actual = calculator.procent(firstNumber, secondNumber);

		// Assert
		assertEquals(expected, actual);
	}

	@Test
	public void testZeroSqrt() {
		// Arrange
		double firstNumber = 0.0;
		double expected = 0.0;
		Calculator calculator = new Calculator();

		// Act
		double actual = calculator.sqrt(firstNumber);

		// Assert
		assertEquals(expected, actual);
	}

	@Test
	public void testZeroPower2() {
		// Arrange
		double firstNumber = 0.0;
		double expected = 0.0;
		Calculator calculator = new Calculator();

		// Act
		double actual = calculator.power2(firstNumber);

		// Assert
		assertEquals(expected, actual);
	}

	@Test
	public void testZeroPower3() {
		// Arrange
		double firstNumber = 0.0;
		double expected = 0.0;
		Calculator calculator = new Calculator();

		// Act
		double actual = calculator.power3(firstNumber);

		// Assert
		assertEquals(expected, actual);
	}

	@Test
	public void testZeroAbs() {
		// Arrange
		double firstNumber = 0.0;
		double expected = 0.0;
		Calculator calculator = new Calculator();

		// Act
		double actual = calculator.abs(firstNumber);

		// Assert
		assertEquals(expected, actual);
	}
}
