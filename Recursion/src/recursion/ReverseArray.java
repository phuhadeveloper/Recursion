package recursion;

public class ReverseArray {
	
	// method to reverse an array
	public static int[] reverseArray(int[] arr) {
		// array to store answer
		int[] answer = new int[arr.length];
		
		// use a helper method
		reverseArrayHelper(arr.length - 1, answer, arr);
		
		return answer;
	}
	
	private static void reverseArrayHelper(int currIndex, int[] ans, int[] original) {
		// base case, if currIndex is less than 0, we have reach the start of the array
		if (currIndex < 0) return;
		
		//get index for the ans array
		int index = (original.length - 1) - currIndex;
		
		// copy original to ans ans array
		ans[index] = original[currIndex];
		
		//recursive case
		reverseArrayHelper(currIndex - 1, ans, original);
	}
}
