package ArrayQuestions;
/******************************************************************************************************
 * Author : Shilpita Roy
 * Date   : June 20,2016
 * Problem: Find the missing number in array of natural integer series
 *          GeekForGeeks
 *          
 * The time complexity for the best method is O(N). Two methods are
 *      a) Sum of all the numbers till n and then subtract the series elements to get missing number.
 *      b) XOR the elements and XOR from 1 to N. XOR the two and get missing number.
 * Naive solution is O(NlogN) for sorting and then finding the missing element.
 * 
 * *****************************************************************************************************/

public class FindMissingElement {
	
	private static int getMissingElement(int[] arr) {
		long total = (arr.length+1)*(arr.length+2)/2;
		for(int i =0 ; i< arr.length; i++)
			total-= arr[i];
		return (int)total;
	}
	
	private static int getMissingElementXOR(int[] arr) {
		int XOR1 = arr[0];
		int XOR2 = 1;
		for(int i = 1 ; i< arr.length; i++){
			XOR1 ^= arr[i];
		    XOR2 ^= i+1;
		} 
		
		XOR2 ^= arr.length +1; // XOR all natural number from 1 to N 
		
		return (XOR1^XOR2);
	}
	
	public static void main(String[] args) {
		int[] arr ={1,4,3,2,7,5};
         System.out.println("The missing element is :"+ getMissingElement(arr));
         System.out.println("The missing element is :"+ getMissingElementXOR(arr));
	}



}
