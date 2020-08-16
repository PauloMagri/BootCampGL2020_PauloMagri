package coverage.example;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import coverage.example.model.Planet;
import coverage.example.model.Star;

class StarTest {
	
	Star star;
	Planet planet;
	List<Planet> planets;
	
	@BeforeEach
	void init() {
		star = new Star();
		star.setName("Maria");
		star.setColor("Amarillo");
		planet = new Planet();
		planet.setName("Tierra");
		planets = new ArrayList<Planet>();
		planets.add(planet);
		star.setPlanets(planets);
	}

	@Test
	void getNameTest() {
		assertEquals("Maria", star.getName());
	}
	
	@Test
	void setNameTest() {
		star.setName("Estrellita");
		
		assertEquals("Estrellita", star.getName());
	}
	
	@Test
	void getColorTest() {
		assertEquals("Amarillo", star.getColor());
	}
	
	@Test
	void setColorTest() {
		star.setColor("Blanco");
		
		assertEquals("Blanco", star.getColor());
	}
	
	@Test
	void getPlanetsTest() {
		assertEquals("Tierra", star.getPlanets().get(0).getName());
	}
	
	@Test
	void setPlanetsTest() {
		planet.setName("Marte");
		planets.add(planet);
		
		star.setPlanets(planets);
		assertEquals("Marte", planets.get(0).getName());
	}
	
	@Test
	void toStringTest() {
		assertEquals("Star [name=Tierra, planets=[]]", star.toString());
	}

}
