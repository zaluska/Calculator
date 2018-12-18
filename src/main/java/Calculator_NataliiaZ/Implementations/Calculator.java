package Calculator_NataliiaZ.Implementations;

import Calculator_NataliiaZ.Interfaces.CalculatorAdvancedOperationsInterface;
import Calculator_NataliiaZ.Interfaces.CalculatorBasicOperationsInterface;

public class Calculator implements CalculatorBasicOperationsInterface, CalculatorAdvancedOperationsInterface {

	/**
	 * Adds two given numbers
	 * 
	 * @param firstNumber  First argument
	 * @param secondNumber Second argument
	 * @return Result of operation
	 */
	public double addition(double firstNumber, double secondNumber) {
		double result = 0.0;
		result = firstNumber + secondNumber;

		return result;
	}

	/**
	 * Subtracts one number from another
	 * 
	 * @param firstNumber  First argument
	 * @param secondNumber Second argument
	 * @return Result of operation
	 */
	public double subtraction(double firstNumber, double secondNumber) {
		double result = 0.0;
		result = firstNumber - secondNumber;

		return result;
	}

	/**
	 * Multiplicates two given numbers
	 * 
	 * @param firstNumber  First argument
	 * @param secondNumber Second argument
	 * @return Result of operation
	 */
	public double multiplication(double firstNumber, double secondNumber) {
		double result = 0.0;
		result = firstNumber * secondNumber;

		return result;
	}

	/**
	 * Divides one numbers by another number
	 * 
	 * @param firstNumber  First argument
	 * @param secondNumber Second argument
	 * @return Result of operation
	 */
	public double division(double firstNumber, double secondNumber) {
		double result = 0.0;
		result = firstNumber / secondNumber;

		return result;
	}

	/**
	 * Calculate percentage of one number from another
	 * 
	 * @param firstNumber  First argument
	 * @param secondNumber Second argument
	 * @return Result of operation
	 */
	public double procent(double firstNumber, double secondNumber) {
		double result = 0.0;
		result = firstNumber * secondNumber / 100;

		return result;
	}

	/**
	 * Generates random number within given boundaries
	 * 
	 * @param firstNumber  First argument
	 * @param secondNumber Second argument
	 * @return Result of operation
	 */
	public double rnd(double firstNumber, double secondNumber) {
		double result = 0.0;
		result = Math.random() * (secondNumber - firstNumber) + firstNumber;

		return result;
	}

	/**
	 * Calculates square root from given argument
	 * 
	 * @param firstNumber First argument
	 * @return Result of operation
	 */
	public double sqrt(double firstNumber) {
		double result = 0.0;
		result = Math.sqrt(firstNumber);

		return result;
	}

	/**
	 * Powers of 2 given argument
	 * 
	 * @param firstNumber First argument
	 * @return Result of operation
	 */
	public double power2(double firstNumber) {
		double result = 0.0;
		result = Math.pow(firstNumber, 2);

		return result;
	}

	/**
	 * Powers of 3 given argument
	 * 
	 * @param firstNumber First argument
	 * @return Result of operation
	 */
	public double power3(double firstNumber) {
		double result = 0.0;
		result = Math.pow(firstNumber, 3);

		return result;
	}

	/**
	 * Calculates absolute value of given number
	 * 
	 * @param firstNumber First argument
	 * @return Result of operation
	 */
	public double abs(double firstNumber) {
		double result = 0.0;
		result = Math.abs(firstNumber);

		return result;
	}
}
