package Calculator_NataliiaZ.Implementations;

import Calculator_NataliiaZ.Interfaces.CalculatorAdvancedOperationsInterface;
import Calculator_NataliiaZ.Interfaces.CalculatorBasicOperationsInterface;

public class Calculator implements CalculatorBasicOperationsInterface, CalculatorAdvancedOperationsInterface {

	public double addition(double firstNumber, double secondNumber) {
		double returnValue = 0.0;
		returnValue = firstNumber + secondNumber;
		return returnValue;
	}

	public double subtraction(double firstNumber, double secondNumber) {
		double returnValue = 0.0;
		returnValue = firstNumber - secondNumber;
		return returnValue;
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
		// TODO Auto-generated method stub
		return 0;
	}

	public double rnd(double firstNumber, double secondNumber) {
		// TODO Auto-generated method stub
		return 0;
	}

	public double sqrt(double firstNumber) {
		// TODO Auto-generated method stub
		return 0;
	}

	public double power2(double firstNumber) {
		// TODO Auto-generated method stub
		return 0;
	}

	public double power3(double firstNumber) {
		// TODO Auto-generated method stub
		return 0;
	}

	public double abs(double firstNumber) {
		// TODO Auto-generated method stub
		return 0;
	}

}
