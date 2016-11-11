package ArrayQuestions;
/******************************************************************************************************
 * Author : Shilpita Roy
 * Date   : Sept15,2016
 * Problem: Find if a given integer x appears more than n/2 times in a sorted array of n integers.
 *          GeekForGeeks
 *          
 * The time complexity for the best method is O(logN) using Binary search. 
 * Other method is linear serach O(N)
 * *****************************************************************************************************/

public class CheckMajorityElementInSortedArray {
	
    public CheckMajorityElementInSortedArray(){}

	public  boolean checkMajority(int[] arr , int x){
		if(arr==null || arr.length <= 2)
			return false;
		 int majority = (arr.length %2 == 0)? (arr.length/2) : arr.length/2+1;
		 int first_occurance = binarySearch(arr, 0 , arr.length-1 , x);
		 if(first_occurance+majority < arr.length && x == arr[first_occurance+majority])
			 return true;
		 else 
			 return false;
	}
	
	private  int binarySearch(int[] arr, int i, int j, int x) {
		int mid = 0;
		if(i<j)
			 mid =(j+i)/2;
		if( mid < arr.length){
		
			if(arr[mid-1] < x)
				return mid;
			else
				return binarySearch(arr, i , mid-1 ,x);
		}else if(arr[mid] < x && mid+1 < arr.length)
				return binarySearch(arr,  mid+1,j ,x);
		else
			return binarySearch(arr, i , mid-1 ,x);
		
	}


}
