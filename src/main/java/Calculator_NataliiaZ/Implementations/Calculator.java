package Calculator_NataliiaZ.Implementations;

import Calculator_NataliiaZ.Interfaces.CalculatorAdvancedOperationsInterface;
import Calculator_NataliiaZ.Interfaces.CalculatorBasicOperationsInterface;

public class Calculator implements CalculatorBasicOperationsInterface, CalculatorAdvancedOperationsInterface {

	public double addition(double firstNumber, double secondNumber) {
		double result = 0.0;
		result = firstNumber + secondNumber;

		return result;
	}

	public double subtraction(double firstNumber, double secondNumber) {
		double result = 0.0;
		result = firstNumber - secondNumber;

		return result;
	}

	public double multiplication(double firstNumber, double secondNumber) {
		double result = 0.0;
		result = firstNumber * secondNumber;

		return result;
	}

	public double division(double firstNumber, double secondNumber) {
		double result = 0.0;
		result = firstNumber / secondNumber;

		return result;
	}

	public double procent(double firstNumber, double secondNumber) {
		double result = 0.0;
		result = firstNumber * secondNumber / 100;

		return result;
	}

	public double rnd(double firstNumber, double secondNumber) {
		double result = 0.0;
		result = Math.random() * (secondNumber - firstNumber) + firstNumber;

		return result;
	}

	public double sqrt(double firstNumber) {
		double result = 0.0;
		result = Math.sqrt(firstNumber);

		return result;
	}

	public double power2(double firstNumber) {
		double result = 0.0;
		result = Math.pow(firstNumber, 2);

		return result;
	}

	public double power3(double firstNumber) {
		double result = 0.0;
		result = Math.pow(firstNumber, 3);
		
		return result;
	}

	public double abs(double firstNumber) {
		double result = 0.0;
		result = Math.abs(firstNumber);
		
		return result;
	}

}
