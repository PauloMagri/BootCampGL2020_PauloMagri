package test.java.com.globallogic.bootcampgl.junitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import main.java.com.globallogic.bootcampgl.junitTest.App;

class AppTest {
	
	App app;
	
	@BeforeEach
	void init() {
		app = new App();
	}

	@DisplayName("Ejercicio 1.1")
	@Test
	void test() {
		assertEquals("Test", "Test");
	}
	
	@DisplayName("Ejercicio 1.2")	
	@Test
	void comparandoCadenas() {
		String cadena1 = "Soy cadena 1";
		String cadena2 = "Soy cadena 1";
		String cadena3 = "asd";
		
		assertEquals(cadena1, cadena2);
		assertNotEquals(cadena1, cadena3);
		
	}
	
	@DisplayName("Ejercicio 1.3")
	@Test
	void comprobandoNumeros() {
		assertTrue(25 > 12);
		assertFalse(25 > 27);
	}
	
	@DisplayName("Ejercicio 1.4")
	@Test
	void comprobandoNull() {
		Long numero = null;
		
		numero = 1l;
		
		assertNotNull(numero);
	}
	
	@DisplayName("Ejercicio 1.5")	
	@Test
	void Ejercicio1_2() {
		String cadena1 = "Soy cadena 1";
		String cadena2 = "Soy cadena 1";
		String cadena3 = "asd";
		
		assertNotEquals(cadena1, cadena2);
		assertEquals(cadena1, cadena3);
		
	}
	
	@DisplayName("Ejercicio 1.5")
	@Test
	void ejercicio1_3() {
		assertFalse(25 > 12);
		assertTrue(25 > 27);
	}
	
	@DisplayName("Ejercicio 1.5")
	@Test
	void ejercicio1_4() {
		Long numero = null;
		
		numero = 1l;
		
		assertNull(numero);
	}
	
	@DisplayName("Ejercicio 1.6")
	@Test
	void sumaTest() {
		int a = 2;
		int b = 3;
		int suma = a + b;
		
		assertEquals(5, suma);
		assertNotEquals(6, suma, "El resultado esta mal");
	}
	
	@DisplayName("Ejercicio 1.7")
	@Test
	void bucleTest() {
		assertTrue(app.bucle(4), "Esta variable no es false");
		assertFalse(app.bucle(1), "Esta variable no es true");
	}
	
	

}
