package Calculator_NataliiaZ;

import org.junit.Test;

import Calculator_NataliiaZ.Implementations.Calculator;
import junit.framework.TestCase;

public class CalculatorTests extends TestCase {
	@Test
	public void testAddition() {
		// Arrange
		double firstNumber = 2.0;
		double secondNumber = 2.0;
		double expected = 4.0;
		
		Calculator calculator = new Calculator();
		
		// Act
		double actual = calculator.addition(firstNumber, secondNumber);
		
		// Assert
		assertEquals(expected, actual);
	}
	
	@Test
	public void testSubtraction() {
		// Arrange
		double firstNumber = 3.0;
		double secondNumber = 2.0;
		double expected = 1.0;
		
		Calculator calculator = new Calculator();
		
		// Act
		double actual = calculator.subtraction(firstNumber, secondNumber);
		
		// Assert
		assertEquals(expected, actual);
	}
	
	@Test
	public void testMultiplication() {
		// Arrange
		double firstNumber = 3.0;
		double secondNumber = 2.0;
		double expected = 6.0;
		
		Calculator calculator = new Calculator();
		
		// Act
		double actual = calculator.multiplication(firstNumber, secondNumber);
		
		// Assert
		assertEquals(expected, actual);
	}
	
	@Test
	public void testDivision() {
		// Arrange
		double firstNumber = 3.0;
		double secondNumber = 2.0;
		double expected = 1.5;
		
		Calculator calculator = new Calculator();
		
		// Act
		double actual = calculator.division(firstNumber, secondNumber);
		
		// Assert
		assertEquals(expected, actual);
	}
	
	@Test
	public void testProcent() {
		// Arrange
		double firstNumber = 100.0;
		double secondNumber = 10.0;
		double expected = 10.0;
		
		Calculator calculator = new Calculator();
		
		// Act
		double actual = calculator.procent(firstNumber, secondNumber);
		
		// Assert
		assertEquals(expected, actual);
	}
	
	@Test
	public void testRnd() {
		// Arrange
		double firstNumber = 11.0;
		double secondNumber = 81.0;
		
		Calculator calculator = new Calculator();
		
		// Act
		double result = calculator.rnd(firstNumber, secondNumber);
		
		// Assert
		assertTrue(result >= firstNumber && result <= secondNumber);
	}
	
	@Test
	public void testSqrt () {
		// Arrange
		double firstNumber = 25.0;
		double expected = 5.0;
		
		Calculator calculator = new Calculator();
		
		// Act
		double actual = calculator.sqrt(firstNumber);
		
		// Assert
		assertEquals(expected, actual);
	}
	
	@Test
	public void testPower2 () {
		// Arrange
		double firstNumber = 3.0;
		double expected = 9.0;
		
		Calculator calculator = new Calculator();
		
		// Act
		double actual = calculator.power2(firstNumber);
		
		// Assert
		assertEquals(expected, actual);
	}
	
	@Test
	public void testPower3 () {
		// Arrange
		double firstNumber = 3.0;
		double expected = 27.0;
		
		Calculator calculator = new Calculator();
		
		// Act
		double actual = calculator.power3(firstNumber);
		
		// Assert
		assertEquals(expected, actual);
	}
	
	@Test
	public void testAbs () {
		// Arrange
		double firstNumber = -3.0;
		double expected = 3.0;
		
		Calculator calculator = new Calculator();
		
		// Act
		double actual = calculator.abs(firstNumber);
		
		// Assert
		assertEquals(expected, actual);
	}
}



