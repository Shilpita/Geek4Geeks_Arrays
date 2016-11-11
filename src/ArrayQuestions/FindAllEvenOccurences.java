package ArrayQuestions;
/**************************************************************************************
 * Author : Shilpita Roy
 * Date   : June 15,2016
 * Problem: Find the element in array with even number of occurrences.
 *          GeekForGeeks
 *          
 * The time complexity for the following method is O(N) with constant space complexity .
 * Another method is to use nested loop O(N*N) or hashmap O(N) with space complexity
 * ***************************************************************************************/

public class FindAllEvenOccurences {

	public static void findEven(int[] arr){
		int check =0;
		
		for(int i = 0 ; i< arr.length ; i++){
			int toggle = 1<< arr[i]; // shift by one to get toggle bit
			//System.out.println("\n"+ toggle);
			check ^= toggle; //// Toggle the bit every time we find the same number in the sequence
			//System.out.println("\n"+ check);
		}
		 
		check = ~check; //// Invert it so now the positive bits represent the EVEN numbers we are looking for
		for(int i = 0 ; i< arr.length ; i++){
			if((check & (1<< arr[i])) > 0)
				System.out.println("\n Even occurences:" + arr[i]);
		}
		
	}
	public static void main(String[] args) {
		int[] arr = {1,1,2,2,3,3,3,5,5,5,5,5};
		findEven(arr);

	}

}
