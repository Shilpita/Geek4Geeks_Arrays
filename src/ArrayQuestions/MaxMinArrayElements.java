package ArrayQuestions;
/******************************************************************************************************
 * Author : Shilpita Roy
 * Date   : Sept24,2016
 * Problem: Find Min and Max elements in array with minimum comparisions.
 *          GeekForGeeks
 *          
 * The time complexity for the best method is O(N). 
 * *****************************************************************************************************/

public class MaxMinArrayElements {
	//Generic print function
	private static void printArray(int[] arr1){
		for(int i: arr1)
			System.out.print(i +"\t");
	}

	/**
	 * 
	 * @param args= array
	 * finding min and max
	 **/
	private static void findMinMax(int[] arr){
		int min, max, i;
	//	System.out.println("\n enter func");
		if(arr.length == 0)
			System.out.println("Invalid input. zero length array");
		if(arr.length==1)
			System.out.println("\n Minimum ="+arr[0] +"\t Maximum ="+ arr[0]);
		if(arr.length%2 == 0){ // if even length array consider 2 elements at a time.
			if(arr[0] <= arr[1]){
				min = arr[0];
				max = arr[1];
			}else{
				min = arr[1];
				max = arr[0];
			}
			i=2;
		}else{ // if odd length consider 1st element then 2 element per comparision.
			min = arr[0];
			max = arr[0];
			i=1;
		//	System.out.println("\n min man odd");
		}
		while(i< arr.length){
			if(arr[i] < arr[i+1]){
				if(min > arr[i])
					min = arr[i];
				if(max < arr[i+1])
					max = arr[i+1];
			}else{
				if(min > arr[i+1])
					min = arr[i+1];
				if(max < arr[i])
					max = arr[i];
			}
			 i=i+2;
		}
		
		System.out.println("\nMinimum ="+min +"\t Maximum ="+ max);
	}
	public static void main(String[] args) {
		int [] arr = {12,34,6,0,45,8,1};
		printArray(arr);
		findMinMax(arr);
	}

}
