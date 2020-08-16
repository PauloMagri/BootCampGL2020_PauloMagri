/**
 * 
 */
package mockito.example.services.impl;

import mockito.example.exceptions.ZeroDivisionException;
import mockito.example.services.CalculatorService;

public class CalculatorServiceImpl implements CalculatorService {
	private DataServiceImpl dataServiceImpl;
	private BasicOperationsServiceImpl basicOperationsServiceImpl = new BasicOperationsServiceImpl();
	
	public void setBasicOperationsServiceImpl(BasicOperationsServiceImpl basicOperationsServiceImpl) {
		this.basicOperationsServiceImpl = basicOperationsServiceImpl;
	}

	public void setDataService(DataServiceImpl dataServiceImpl) {
		this.dataServiceImpl = dataServiceImpl;
	}
	
	public DataServiceImpl getDataServiceImpl() {
		return this.dataServiceImpl;
	}

	@Override
	public double calculateSum(int a, int b) {
		return basicOperationsServiceImpl.add(a, b);
	}

	@Override
	public double calculateSubstraction(int a, int b) {
		return basicOperationsServiceImpl.subtract(a, b);
	}
	
	@Override
	public double calculateDivision(int a, int b) throws ZeroDivisionException {
		if(b == 0) throw new ZeroDivisionException();
		return basicOperationsServiceImpl.divide(a, b);		
	}

	@Override
	public double calculateMultiplication(int a, int b) {
		return basicOperationsServiceImpl.multiply(a, b);	
	}
	
	@Override
	public double calculateAverage() {
		int[] numbers = this.getDataServiceImpl().getListOfNumbers();
		double avg = 0;
		for (int i : numbers) {
			avg += i;
		}
		return (numbers.length > 0) ? avg / numbers.length : 0;
	}

	@Override
	public boolean isEven(int a) {
		return (a % 2 == 0.0);
	}

	@Override
	public String printResult(double result) {
		String textToDisplay = "El resultado es: " + result;
		System.out.print(textToDisplay);
		return textToDisplay;
	}

}
