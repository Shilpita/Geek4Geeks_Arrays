package ArrayQuestions;

/*************************************************************************************************************************************************
 * Author : Shilpita Roy
 * Date   : Nov2,2016
 * Problem: Given an unsorted array arr[] and two numbers x and y, find the minimum distance between x and y in arr[].
 * 			Contains duplicate x and y. Assume has element x and y.
 * 		    GeekForGeeks
 * 
 * The naive solution is O(N*N).
 * The efficient element is O(N).
 * *****************************************************************************************************************************************************/

public class FinMinDistBtwTwoInt {
	//Generic print function
	private static void printArray(int[] arr1){
		for(int i: arr1)
			System.out.print(i +"\t");
	}

	/***
	 * The naive approach has two loops
	 * loop1 travels from left, loop 2 from next index of i for x and y and min diff
	 * @param arr
	 * @param x
	 * @param y
	 * @return miniff
	 */
	
	public static int findMinDistNaive(int[] arr, int x, int y){
		int minDiff = arr.length+1;
		for(int i =0 ; i< arr.length ; i++){
			for(int j = i+1; j< arr.length; j++){ // next index from i
				if(((x == arr[i] && arr[j]== y) ||(x == arr[j] && arr[i]== y)) &&(minDiff > (j-i)))
					minDiff = j-i;
			}
		}
		return minDiff;
	}
	
	/**
	 * Run loop to find either x or y set it to prev. run other loop from prev+1 and find y or x and calculate difference
	 * @param arr
	 * @param x
	 * @param y
	 * @return minDiff
	 */
	public static int findMinDistEfficient(int[] arr, int x,int y){
		int minDiff = arr.length+1;
		int prev = 0;
		int i =0;
		for (i = 0; i< arr.length ; i++){
			if(arr[i]==x || arr[i]==y){
				prev = i;
				break;
			}
		}
		//System.out.println(i);
		while(i < arr.length){
			if(arr[i]== x || arr[i] ==y){
				if(arr[prev] != arr[i])
					minDiff = (minDiff > (i-prev))? (i-prev) : minDiff;
				else
					prev = i;
				i++;
			}else
				i++;
		}
		return minDiff;
	}
	public static void main(String[] args) {
		int[] arr = {3, 5, 4, 2, 6, 5, 6, 6, 5, 4, 8, 3};
		int x = 3;
		int y = 6;
		printArray(arr);
		System.out.println("\nMinimum Difference between two integers is using Naive method :"+ findMinDistNaive(arr,x,y));
		System.out.println("\nMinimum Difference between two integers is using Efficient method :"+ findMinDistEfficient(arr,x,y));
	}

}
