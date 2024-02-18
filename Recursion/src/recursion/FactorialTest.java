package recursion;

public class FactorialTest {

	public static void main(String[] args) {
		// test for method 1
		System.out.println("Testing for factorial method 1:");
		System.out.println(" Case 1: Input of 0 or less will return 1");
		System.out.println("  Input: -10 , Actual Output: " + Factorial.factorialMethodOne(-10));
		System.out.println("  Input: 0 , Actual Output: " + Factorial.factorialMethodOne(0));
		System.out.println(" Case 2: Input of 1, expected output of 1");
		System.out.println("  Input: 1 , Actual Output: " + Factorial.factorialMethodOne(1));
		System.out.println(" Case 3: Input of 5, expected output of 120");
		System.out.println("  Input: 5 , Actual Output: " + Factorial.factorialMethodOne(5));
		System.out.println(" Case 3: Input of 10, expected output of 3628800");
		System.out.println("  Input: 10 , Actual Output: " + Factorial.factorialMethodOne(10));
		System.out.println(" n of 13 or higher will output incorrect results as results are too large");
		System.out.println();
		
		// test for method 2
		System.out.println("Testing for factorial method 2:");
		System.out.println(" Case 1: Input of 0 or less will return 1");
		System.out.println("  Input: -10 , Actual Output: " + Factorial.factorialMethodTwo(-10));
		System.out.println("  Input: 0 , Actual Output: " + Factorial.factorialMethodTwo(0));
		System.out.println(" Case 2: Input of 1, expected output of 1");
		System.out.println("  Input: 1 , Actual Output: " + Factorial.factorialMethodTwo(1));
		System.out.println(" Case 3: Input of 7, expected output of 5040");
		System.out.println("  Input: 5 , Actual Output: " + Factorial.factorialMethodTwo(7));
		System.out.println(" Case 3: Input of 12, expected output of 479001600");
		System.out.println("  Input: 12 , Actual Output: " + Factorial.factorialMethodTwo(12));
		System.out.println(" n of 13 or higher will output incorrect results as results are too large");
	}

}
