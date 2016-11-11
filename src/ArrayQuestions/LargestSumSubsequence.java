package ArrayQuestions;
/**************************************************************************************
 * Author : Shilpita Roy
 * Date   : June 16,2016
 * Problem: Find the sum of contiguous subarray within a one-dimensional array of numbers 
 * 			which has the largest sum. 
 *          GeekForGeeks
 *          
 * The time complexity for the following method is O(N) with constant space complexity .
 * Another method is to use nested loop O(N*N) 
 * ***************************************************************************************/

public class LargestSumSubsequence {

	
	private static int largestSumSubsequence(int[] arr) {
		int curr_max   = arr[0];
		int max_so_far = arr[0];
		for(int i = 1; i< arr.length; i++){
			curr_max = Math.max(arr[i], curr_max + arr[i]);
			max_so_far = Math.max(max_so_far, curr_max);		
		}
		
		return max_so_far;
	}
	public static void main(String[] args) {
		int[] arr = {3,4,-1,-3,6,-7};
		System.out.println("Largest sum of contiguous subsequence is  :"+ largestSumSubsequence(arr));

	}

}
