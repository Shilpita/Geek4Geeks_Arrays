package ArrayQuestions;
/******************************************************************************************************
 * Author : Shilpita Roy
 * Date   : June 22,2016
 * Problem: Find the number in sorted pivoted array 
 *          GeekForGeeks
 *          
 * The time complexity for the best method is O(logN). 
 *
 * *****************************************************************************************************/

public class FindElementPivotedArray {
	/**
	 * Find the pivot index and then binary search for key
	 * @param arr
	 * @param i
	 * @param j
	 * @param key
	 * @return index for key
	 */
	private static int findPivotBinarySerach(int[] arr, int i, int j, int key) {
		int pivotIndex = findPivot(arr, i ,j);
		if(pivotIndex == -1)
			return -1;
		
		if(arr[pivotIndex] < key)
			return -1;
	    else if(arr[j]>= key && arr[pivotIndex] > key)
		    return binarySearch(arr,pivotIndex+1,j,key);
		else
			return binarySearch(arr,i,pivotIndex,key);
		
	}
	/**
	 * Binary search for key integer
	 * @param arr
	 * @param i
	 * @param j
	 * @param key
	 * @return index for key
	 */
	private static int binarySearch(int[] arr, int i, int j, int key) {
		int low = i, high = j;
		int mid = (low+high)/2;
		if(key > arr[j] || key < arr[i]) 
			return -1;
		if(key == arr[mid])
			return mid;
		if(key > arr[mid])
			return binarySearch(arr, mid+1 , high, key);
		else
			return binarySearch(arr, low , mid-1, key);
	}
	
	/**
	 * Find pivot index
	 * @param arr
	 * @param i
	 * @param j
	 * @return index
	 */
	private static int findPivot(int[] arr, int i, int j) {
		int low = i, high = j;
		int mid = (low+high)/2;
		if(low > high || mid == low || arr[low] < arr[high]) 
			return -1;
		
		if(arr[mid] > arr[mid+1])
		   return mid;
		else if(arr[mid] < arr[mid-1])
		   return mid-1;
		else{
			if(arr[mid] > arr[high])
				return findPivot(arr, mid ,high);
			else
				return findPivot(arr, low , mid-1);
		}
	}
	

	public static void main(String[] args) {
		int[] arr = {30,40,59,65,99,101,2,13};
		int key = 2;
		
		System.out.println("The array is pivoted at index:"+ findPivot(arr,0,arr.length-1));
		
		System.out.println("The key " +key +" is in the pivoted array at index :"+ findPivotBinarySerach(arr,0,arr.length-1,key));

	}


}
