package ArrayQuestions;
/**************************************************************************************
 * Author : Shilpita Roy
 * Date   : Nov11,2016
 * Problem: Given an array of n distinct integers sorted in ascending order, write a function that returns a Fixed Point in the array,
 * 		    if there is any Fixed Point present in array, else returns -1. Fixed Point in an array is an index i such that arr[i]= i. 
 * 			Ex: Input: {-10, -5, 0, 3, 7}
 *				Output: 3
 *          GeekForGeeks
 *          
 * The time complexity for the following method is O(N).
 * ***************************************************************************************/


public class FindFixedPoint {

	//Generic print function
	private static void printArray(int[] arr1){
		System.out.println();
		for(int i: arr1)
			System.out.print(i +"\t");
	}
	/**
	 * Binary search
	 * @param arr
	 * @return index
	 */
	private static int findFixedIndex(int[] arr , int low, int high){
		if(low > high)
			return -1;
		int mid =(high+low)/2;
		if(mid == arr[mid])
			return mid;
		else if(mid > arr[mid])
			return findFixedIndex(arr, mid+1, arr.length-1);
		else
			return findFixedIndex(arr, low, mid-1);
	}
	
	public static void main(String[] args) {
		int[] arr = {-10, -5, 0, 3, 7};
		printArray(arr);
		System.out.println("\nThe Fixed Point :"+ findFixedIndex(arr, 0,arr.length-1));
	}

}
