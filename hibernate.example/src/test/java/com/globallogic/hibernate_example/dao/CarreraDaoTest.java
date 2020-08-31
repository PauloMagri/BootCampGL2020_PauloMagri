package com.globallogic.hibernate_example.dao;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.globallogic.hibernate_example.entity.Carrera;
import com.globallogic.hibernate_example.entity.Competidor;

class CarreraDaoTest {

	@Test
	void carreraDaoTest() {
		CompetidorDao competidorDao = new CompetidorDao();
		CarreraDao carreraDao = new CarreraDao();
		List<Competidor> competidores = new ArrayList<Competidor>();
		
		competidorDao.createCompetidor(new Competidor(2, "Sebastian Loeb"));
		competidorDao.createCompetidor(new Competidor(3, "Marcus Gronholm"));
		competidorDao.createCompetidor(new Competidor(7, "Carlos Sainz"));
		competidorDao.createCompetidor(new Competidor(11, "Petter Solberg"));
		
		competidores = competidorDao.getCompetidores();
		
		carreraDao.createCarrera(new Carrera(1l, new Date(2020-07-17), "Gran Carrera Global", competidores));
		
		Carrera carrera = carreraDao.getCarreraById(1);
		
		assertEquals("Gran Carrera Global", carrera.getNombre());
		
		carrera.setFecha(new Date(2020-8-17));
		carreraDao.updateCarrera(carrera);
		assertEquals(new Date(2020-8-17), carrera.getFecha());
		
		carreraDao.removeCarrera(carrera);
		assertNull(carreraDao.getCarreraById(carrera.getId()));
		
	}

}
