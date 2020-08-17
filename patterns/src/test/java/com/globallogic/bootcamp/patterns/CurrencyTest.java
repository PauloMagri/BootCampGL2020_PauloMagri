package com.globallogic.bootcamp.patterns;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CurrencyTest {

	@Test
	void test() {
		Currency currency1 = Currency.getInstance();
		Currency currency2 = Currency.getInstance();
		
		assertSame(currency1, currency2);
	}

}
