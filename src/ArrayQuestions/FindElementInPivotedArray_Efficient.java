package ArrayQuestions;

/******************************************************************************************************
 * Author : Shilpita Roy
 * Date   : Nov8,2016
 * Problem: Find the number in sorted pivoted array using binary serach without finding pivot
 *          GeekForGeeks
 *          
 * The time complexity for the best method is O(logN). 
 *
******************************************************************************************************/

public class FindElementInPivotedArray_Efficient {
	//Generic print function
	private static void printArray(int[] arr1){
		System.out.println();
		for(int i: arr1)
			System.out.print(i +"\t");
	}

	/**
	 * Find the given key in the pivoted array using modified binary search.
	 * @param arr
	 * @param high
	 * @param low
	 * @param key
	 * @return index of key
	 */
	private static int findElementInPivotedArray(int[] arr,int high, int low, int key){
		//int index =-1;
		if(low >= high)
			return -1;
		else{
			int mid = (high+low)/2;
			if(arr[mid]==key)
				return mid;
			else{
				if(arr[low] < arr[mid]){
					if(key < arr[mid-1] && key > arr[low])
						return findElementInPivotedArray(arr, mid-1 , low, key);
					else
						return findElementInPivotedArray(arr, high, mid+1 , key);
				}
			    if (arr[mid+1] <= key && arr[high]> key)
			    	return findElementInPivotedArray(arr, high, mid+1 , key);
			    return findElementInPivotedArray(arr, mid-1 , low, key);
			}
		}
		
	}

	public static void main(String[] args) {
		int[] arr = {30,40,59,65,99,101,2,13};
		int key = 2;
		
		printArray(arr);
		
		System.out.println("\n key is at index :" + findElementInPivotedArray(arr,arr.length-1,0,key));

	}

}
