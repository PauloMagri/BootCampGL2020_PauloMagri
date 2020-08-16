/**
 * 
 */
package mockito.example.services;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import mockito.example.exceptions.ZeroDivisionException;
import mockito.example.services.impl.BasicOperationsServiceImpl;
import mockito.example.services.impl.CalculatorServiceImpl;
import mockito.example.services.impl.DataServiceImpl;

@ExtendWith(MockitoExtension.class)
public class CalculatorServiceTest {
	
	@InjectMocks
	private CalculatorServiceImpl calculatorService;
	
	@Mock
	private BasicOperationsServiceImpl basicOperationsServicsImpl;
	
	@Mock
	private DataServiceImpl dataServiceImpl;
	
	int[] listaNumeros;
	
	@BeforeEach
	void init() {
		listaNumeros = new int[] {1,2,3,4,5};
	}
	
	@Test
	void test3_3() {
		BasicOperationsServiceImpl myOperationsSrv = new BasicOperationsServiceImpl();
		BasicOperationsServiceImpl spyMyOperationsSrv = spy(myOperationsSrv);
		calculatorService.setBasicOperationsServiceImpl(spyMyOperationsSrv);
		
		calculatorService.calculateSum(2, 3);
		
		verify(spyMyOperationsSrv).add(2.0, 3.0);
		
		Mockito.when(basicOperationsServicsImpl.add(4.0, 3.0)).thenReturn(7.0);
		assertEquals(7.0, basicOperationsServicsImpl.add(4.0, 3.0), .01);
		Mockito.verify(basicOperationsServicsImpl).add(4.0, 3.0);
		
		Mockito.when(basicOperationsServicsImpl.subtract(4.0, 3.0)).thenReturn(1.0);
		assertEquals(1.0, basicOperationsServicsImpl.subtract(4.0, 3.0), .01);
		Mockito.verify(basicOperationsServicsImpl).subtract(4.0, 3.0);
		
		Mockito.when(basicOperationsServicsImpl.divide(4.0, 2.0)).thenReturn(2.0);
		assertEquals(2.0, basicOperationsServicsImpl.divide(4.0, 2.0), .01);
		Mockito.verify(basicOperationsServicsImpl).divide(4.0, 2.0);
		
		Mockito.when(basicOperationsServicsImpl.multiply(4.0, 3.0)).thenReturn(12.0);
		assertEquals(12.0, basicOperationsServicsImpl.multiply(4.0, 3.0), .01);
		Mockito.verify(basicOperationsServicsImpl).multiply(4.0, 3.0);
	}
	
	@Test
	public void test3_4() {
		//Mockito.when(dataServiceImpl.getListOfNumbers()).thenReturn(new int[] {1,2,3,4,5});
		Mockito.when(dataServiceImpl.getListOfNumbers()).thenReturn(listaNumeros);
		assertEquals(3.0, calculatorService.calculateAverage(), .01);
	}
	
	@Test
	public void test3_5() {
		Mockito.when(dataServiceImpl.getListOfNumbers()).thenReturn(null);
		assertNull(dataServiceImpl.getListOfNumbers());
		assertThrows(NullPointerException.class, () -> {
			calculatorService.calculateAverage();
		});
	}
	
	@Test
	public void test3_6() {
		assertThrows(ZeroDivisionException.class, () -> {
			calculatorService.calculateDivision(4, 0);
		});
	}
	
	@Test
	public void test3_7() {
		Mockito.when(basicOperationsServicsImpl.add(4, 3)).thenReturn(7.0);
		double result = calculatorService.calculateSum(4, 3);
		
		assertEquals("El resultado es: " + result, calculatorService.printResult(result));
	}
	
	@ParameterizedTest
	@ValueSource(ints = {2, 6, 4, 8})
	void test3_8(int input) {
		assertTrue(calculatorService.isEven(input));
	}
	
	@Test
	public void test3_9() {
		BasicOperationsServiceImpl myOperationsSrv = new BasicOperationsServiceImpl();
		BasicOperationsServiceImpl spyMyOperationsSrv = spy(myOperationsSrv);
		calculatorService.setBasicOperationsServiceImpl(spyMyOperationsSrv);
		
		calculatorService.calculateSum(2, 3);
		
		verify(spyMyOperationsSrv).add(2.0, 3.0);
	}
	
	@Test
	public void test3_10() {
		DataServiceImpl myDataService = new DataServiceImpl();
		DataServiceImpl spyMyDataService = spy(myDataService);
		calculatorService.setDataService(spyMyDataService);
		
		when(spyMyDataService.getListOfNumbers()).thenReturn(new int[] {1, 2, 3, 4, 5});
		assertEquals(listaNumeros.length, spyMyDataService.getListOfNumbers().length);
		
		spyMyDataService.setListOfNumbers(new int[] {1, 2, 3});
		assertNotEquals(listaNumeros.length, spyMyDataService.getListOfNumbers().length);
	}

}
