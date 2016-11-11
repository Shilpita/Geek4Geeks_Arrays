package ArrayQuestions;
/**************************************************************************************
 * Author : Shilpita Roy
 * Date   : June 15,2016
 * Problem: Find the element in array with odd number of occurence.
 *          GeekForGeeks
 *          
 * The time complexity for the following method is O(N) with constant space complexity .
 * Another method is to use nested loop O(N*N) or hashmap O(N) with space complexity
 * ***************************************************************************************/

public class OddOccurence {
	
	public static int oddOccurencyElement(int[] arr){
		int result = 0;
		for(int i= 0; i< arr.length; i++)
			result = result ^ arr[i];
		return result;
	}

	public static void main(String[] args) {
		int[] arr = {4,3,3,3,4};
		
		System.out.println(" The element occuring odd number of times is :" + oddOccurencyElement(arr));

	}

}
