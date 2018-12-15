package Calculator_NataliiaZ.Implementations;

import Calculator_NataliiaZ.Interfaces.CalculatorBasicOperationsInterface;

public class Calculator implements CalculatorBasicOperationsInterface {

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
		double returnValue = 0.0;
		returnValue = firstNumber * secondNumber;
		return returnValue;
	}

	public double division(double firstNumber, double secondNumber) {
		double returnValue = 0.0;
		returnValue = firstNumber / secondNumber;
		return returnValue;
	}

}
