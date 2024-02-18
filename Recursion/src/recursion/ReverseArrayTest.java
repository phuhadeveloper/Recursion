package recursion;

import java.util.Arrays;

public class ReverseArrayTest {

	public static void main(String[] args) {
		// inputs for testing
		int[] input1 = {};
		int[] input2 = {1, 4, 9 , 3};
		int[] input3 = {1, 0 , 0, -18, 90, 66};
		int[] input4 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0};
		
		// tests
		System.out.println("Tests for reversing an array function: ");
		System.out.println(" Case 1: empty array, expected output []");
		System.out.println("  Input: [], Actual output: " + Arrays.toString(ReverseArray.reverseArray(input1)));
		System.out.println(" Case 2: [1, 4, 9, 3], expected output [3, 9, 4, 1]");
		System.out.println("  Input: [1, 4, 9, 3], Actual output: " + Arrays.toString(ReverseArray.reverseArray(input2)));
		System.out.println(" Case 3: [1, 0, 0, -18, 90, 66], expected output [66, 90, -18, 0, 0, 1]");
		System.out.println("  Input: [1, 0, 0, -18, 90, 66], Actual output: " + Arrays.toString(ReverseArray.reverseArray(input3)));
		System.out.println(" Case 3: [1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0], expected output [0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1]");
		System.out.println("  Input: [1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0], Actual output: " + Arrays.toString(ReverseArray.reverseArray(input4)));

	}

}
