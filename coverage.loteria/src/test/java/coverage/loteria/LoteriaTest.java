package coverage.loteria;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import coverage.loteria.model.CartonGenerator;

class LoteriaTest {

	Loteria loteria;
	CartonGenerator cartonGenerator;
	
	@BeforeEach
	void init() {
		cartonGenerator = new CartonGenerator();
		loteria = new Loteria(12.5f, 4, cartonGenerator);
	}

	@Test
	void testGetPozo() {
		assertEquals(12.5f, loteria.getPozo());
	}

	@Test
	void testGetBoletos() {
		assertEquals(4, loteria.getBoletos());
	}

	@Test
	void testGetGanadores() {
		assertEquals(0, loteria.getGanadores());
	}

	@Test
	void testJugada() {
		loteria.jugada();
		assertTrue(loteria.getGanadores() >= 0);
	}

	@Test
	void testHayGanadorUnico() {
		loteria.jugada();
		
		if(loteria.getGanadores() == 1) {
			assertTrue(loteria.hayGanadorUnico());
		} else {
			assertFalse(loteria.hayGanadorUnico());
		}
		
	}

	@Test
	void testHayCuadrupleGanador() {
		loteria.jugada();
		
		if(loteria.getGanadores() == 4) {
			assertTrue(loteria.hayCuadrupleGanador());
		} else {
			assertFalse(loteria.hayCuadrupleGanador());
		}
	}

}
