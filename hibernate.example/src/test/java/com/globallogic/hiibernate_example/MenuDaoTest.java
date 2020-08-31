package com.globallogic.hiibernate_example;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.globallogic.hibernate_example.dao.MenuDao;
import com.globallogic.hibernate_example.entity.Menu;

class MenuDaoTest {
	
	@Test
	void menuDaoTest() {
		MenuDao menuDao = new MenuDao();
		
		menuDao.createMenu(new Menu(1, 
				"Milanesa Clasica", 
				"una delicada milanesa con crocantes papas fritas finamente seleccionadas", 
				500.00));
		menuDao.createMenu(new Menu(2, 
				"Lomo al piedra", 
				"un curioso plato donde se utilizan piedras calentadas al rojo vivo para cocinar el lomo junto a especias orientales y sudamericanas logrando un elixir entre la textura y el sabor",
				750.00));
		
		List<Menu> menus = menuDao.getAllMenus();
		assertEquals("Milanesa Clasica", menus.get(0).getNombre());
		
		Menu menuModificado = menus.get(0);
		menuModificado.setPrecio(550.00);
		menuDao.updateMenu(menuModificado);
		menus = menuDao.getAllMenus();
		assertEquals(550.00, menus.get(0).getPrecio());
		
		menuDao.removeMenu(menus.get(0));
		List<Menu> menusConEliminado = menuDao.getAllMenus();
		assertEquals(menus.size()-1, menusConEliminado.size());
	}

}
