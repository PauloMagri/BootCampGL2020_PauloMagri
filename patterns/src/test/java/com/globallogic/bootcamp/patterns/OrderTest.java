package com.globallogic.bootcamp.patterns;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OrderTest {

	@Test
	void test() {
		Currency currency = Currency.getInstance();
		Product product = Product.getInstance();
		
		Order order1 = new Order("One", 10, currency, product);
		Order order2 = new Order("Two", 20, currency, product);
		
		assertSame(order1.getCurrency(), order2.getCurrency());
		assertSame(order1.getProduct(), order2.getProduct());
	}

}
