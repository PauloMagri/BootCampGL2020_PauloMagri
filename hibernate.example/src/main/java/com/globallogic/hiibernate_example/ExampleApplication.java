package com.globallogic.hiibernate_example;

import java.util.List;

import com.globallogic.hibernate_example.dao.AlumnoDao;
import com.globallogic.hibernate_example.dao.MenuDao;
import com.globallogic.hibernate_example.entity.Alumno;
import com.globallogic.hibernate_example.entity.Menu;


public class ExampleApplication {
	

	public static void main(String[] args) {

		AlumnoDao alumnoDao = new AlumnoDao();
		
		alumnoDao.createAlumno(new Alumno(0, "Jose","Perez"));
        alumnoDao.createAlumno(new Alumno(1, "Estban","Quito"));
        alumnoDao.createAlumno(new Alumno(2, "Ulrica","Godofreda"));
		
		List <Alumno> alumnos = alumnoDao.getAlumnos();
		
		for (Alumno alumno : alumnos) {
			System.out.println(alumno.getNombre() + " " + alumno.getApellido());
		}
		
		Alumno alumnoModificado = alumnos.get(1);
		alumnoModificado.setNombre("Estefano");
		alumnoDao.updateAlumno(alumnoModificado);
		
		alumnos = alumnoDao.getAlumnos();
		System.out.println("-----------");
		for (Alumno alumno : alumnos) {
			System.out.println(alumno.getNombre() + " " + alumno.getApellido());
		}
		
		alumnoDao.removeAlumno(alumnos.get(0));
		
		alumnos = alumnoDao.getAlumnos();
		System.out.println("-----------");
		for (Alumno alumno : alumnos) {
			System.out.println(alumno.getNombre() + " " + alumno.getApellido());
		}
		
		MenuDao menuDao = new MenuDao();
		
		menuDao.createMenu(new Menu(1, 
				"Milanesa Clasica", 
				"una delicada milanesa con crocantes papas fritas finamente seleccionadas", 
				500.00));
		menuDao.createMenu(new Menu(2, 
				"Lomo al piedra", 
				"un curioso plato donde se utilizan piedras calentadas al rojo vivo para cocinar el lomo junto a especias orientales y sudamericanas logrando un elixir entre la textura y el sabor",
				750.00));
		List<Menu> menus = menuDao.getMenuById(1l);
		System.out.println("-----------");
		for(Menu menu : menus) {
			System.out.println(menu.getNombre());
		}
		
		
	}

}
