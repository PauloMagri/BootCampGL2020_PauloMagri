package mockito.loteria;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import mockito.loteria.model.CartonGenerator;

@ExtendWith(MockitoExtension.class)
class LoteriaTest {
	
	@InjectMocks
	private Loteria loteria;
	
	@Mock
	CartonGenerator cartonGenerator;
	
	
	@BeforeEach
	void init() {
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
		Mockito.when(cartonGenerator.isGanador()).thenReturn(true, false);
		loteria.jugada();
		assertTrue(loteria.getGanadores() >= 0);
	}
	
	@InjectMocks
	CartonGenerator cartonGeneratorInjectMocks;
	
	@Mock
	Random rand;
    
	@Test
	void testHayGanadorUnico() {
		Mockito.when(rand.nextInt()).thenReturn(1,1,1,0);
		loteria = new Loteria(12.5f, 4, cartonGeneratorInjectMocks);
		loteria.jugada();
		
		if(loteria.getGanadores() == 1) {
			assertTrue(loteria.hayGanadorUnico());
		} else {
			assertFalse(loteria.hayGanadorUnico());
		}
		
	}

	@Test
	void testHayCuadrupleGanador() {
		Mockito.when(rand.nextInt()).thenReturn(1,1,1,0);
		loteria = new Loteria(12.5f, 4, cartonGeneratorInjectMocks);
		loteria.jugada();
		
		if(loteria.getGanadores() == 4) {
			assertTrue(loteria.hayCuadrupleGanador());
		} else {
			assertFalse(loteria.hayCuadrupleGanador());
		}
	}

}
