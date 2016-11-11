package ArrayQuestions;
/******************************************************************************************************
 * Author : Shilpita Roy
 * Date   : July 22,2016
 * Problem: Maximum sum of subsequence of Non adjacent element.
 *          GeekForGeeks
 *          
 * The time complexity for the best method is O(N). 
 * *****************************************************************************************************/

public class MaximumNonAdjacentSum {
	//Generic print function
	private static void printArray(int[] arr1){
		for(int i: arr1)
			System.out.print(i +"\t");
	}
	
	/*
	 * 
	 */
    public static int maxSumNonadjacent(int[] arr){
    	int incl_sum = arr[0];
    	int excl_sum = 0;
    	for(int i =1 ; i < arr.length ; i++){
    		int temp = incl_sum;
    		incl_sum = Math.max(incl_sum,excl_sum +arr[i]);	
    		excl_sum = Math.max(temp, excl_sum);
    	}
    	return Math.max(incl_sum, excl_sum);
    }
	
	public static void main(String[] args) {
		int[] arr = {12,7,-5,1,20,0,1,6};
		System.out.println("\n Original array:\n");
		printArray(arr);
		System.out.println("\n The maximum sum of non adjacent elements of array is :"+ maxSumNonadjacent(arr));

	}

}
