package recursion;

/**
 * Test class that test methods from Factorial class with JUnit5 
 * 
 * author: Phu Ha
 * date: 03/03/3024
 */


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FactorialTestTest {
	@Test
	void factorialNegativeInputTest() {
		assertEquals(1, Factorial.factorialMethodOne(-5));
		assertEquals(1, Factorial.factorialMethodTwo(-5));
	}

	@Test
	void factorialInputOfZeroTest() {
		assertEquals(1, Factorial.factorialMethodOne(0));
		assertEquals(1, Factorial.factorialMethodTwo(0));
	}
	
	@Test
	void factorialInputOfOneTest() {
		assertEquals(1, Factorial.factorialMethodOne(1));
		assertEquals(1, Factorial.factorialMethodTwo(1));
	}
	
	@Test
	void factorialInputOfTenTest() {
		assertEquals(3628800, Factorial.factorialMethodOne(10));
		assertEquals(3628800, Factorial.factorialMethodTwo(10));
	}
}
