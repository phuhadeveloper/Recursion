package recursion;

/**
 * Test class that test methods from ReverseArray class with JUnit5 
 * 
 * author: Phu Ha
 * date: 03/03/3024
 */

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReverseArrayTestTest {

	@Test
	void reverseArrayEmptyArrayTest() {
		int[] arr = {};
		int[] result = ReverseArray.reverseArray(arr);
		// check that result has length of 0
		assertEquals(0, result.length);
	}
	
	@Test
	void reverseArrayTest() {
		int[] testArray = {1, 0 , 0, -18, 90, 66};
		int[] result = ReverseArray.reverseArray(testArray);
		assertArrayEquals(new int[] {66, 90, -18, 0, 0, 1}, result);
	}

}
