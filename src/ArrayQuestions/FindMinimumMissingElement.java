package ArrayQuestions;
/******************************************************************************************************
 * Author : Shilpita Roy
 * Date   : Sept29,2016
 * Problem: Find missing smallest element in range from 1 to n.
 *          GeekForGeeks
 * 
 * The time complexity for the general solution is O(N) with linear serach.
 * The time complexity for the best method is O(logN) if no repeated elements by binary search.
 * *****************************************************************************************************/

public class FindMinimumMissingElement {
	//Generic print function
	private static void printArray(int[] arr1){
		for(int i: arr1)
			System.out.print(i +"\t");
	}
	
	/*
	 *  Linear Method: check difference between element at each index and the next index.
	 *  If difference is greater than 1 then missing value is next index.
	 *  base case : arr[0] != 0
	 */
	
	public static int linearMissingSearch(int[] arr){
		if(arr.length==0 || arr == null)
			return -1;
		if(arr[0] != 0)
			return 0;
		int i;
		for(i =0 ; i< arr.length -1;i++){
			if(arr[i+1]- arr[i] > 1)
				return arr[i]+1;
		} 
		return i;
	}
	
	/**
	 * Binary search for array without duplicates. calculate mid index if array at mid is greater than mid
	 * then search left subarray else search right subarray.
	 * @param arr
	 */
	public static int binaryMissingSearch(int[] arr , int low , int high){
		if(arr.length == 0 || arr == null) 
			return -1;
		if (low > high)
			return high+1;
		if (arr[low] != low)
			return low;
		int mid = (high+low)/2;
		
		if(arr[mid] > mid)
			return binaryMissingSearch(arr,low,mid-1);
		else
			return binaryMissingSearch(arr,mid+1,high);
		
	}
	public static void main(String[] args) {
		//int[] arr = {0,1,2,2,3};
		int[] arr ={0, 1, 2, 2,3,6, 7,9};
		int[] arr1 ={0,1,2,3,4,7,9,10};
        printArray(arr);
        System.out.println("\nLinear method missing value:"+linearMissingSearch(arr) );
        System.out.println("\n");
        printArray(arr1);
        System.out.println("\nBinary method missing value:"+binaryMissingSearch(arr1,0,arr.length-1));
	}

}
