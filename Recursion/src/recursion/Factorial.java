package recursion;

public class Factorial {
	// factorial recursive method 1
	// starts from n, decrement n at each step
	public static int factorialMethodOne(int n) {
		// base case 
		if (n <= 0) {
			return 1;
		}
		
		// recursive case
		return n * factorialMethodOne(n - 1);
	}
	
	// factorial recursive method 2
	// start from 1, and increment towards n
	public static int factorialMethodTwo(int n) {
		// base case 
		if (n <= 0) {
			return 1;
		}
		
		// recursive case
		return factorialHelper(1, n, 1);
	}
	
	// private helper method for method 2
	private static int factorialHelper(int curr, int n, int product) {
		// base case
		if (curr > n) {
			return product;
		}
		// multiplying current number to product
		product *= curr;
		
		// recursive case
		return factorialHelper(curr + 1, n, product);
	}
}
