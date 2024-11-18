package com.testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Addition {

	@Test
	void test() {
		
		Calculator calculator=new Calculator();
		int expected=10+20;
		int result=calculator.add(10, 20);
		assertEquals(expected,result);
	}

}
