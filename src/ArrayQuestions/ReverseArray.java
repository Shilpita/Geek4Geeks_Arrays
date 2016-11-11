package ArrayQuestions;
/******************************************************************************************************
 * Author : Shilpita Roy
 * Date   : June 20,2016
 * Problem: Reverse a given array
 *          GeekForGeeks
 *          
 * The time complexity for the best method is O(N). 
 * *****************************************************************************************************/

public class ReverseArray {
	private static void printArray(int[] arr1){
		for(int i: arr1)
			System.out.print(i +"\t");
	}
	
	private static void reverseArray(int[] arr, int start, int end) {
		if(start < end){
			arr[start] = arr[start]+ arr[end];
			arr[end]  = arr[start]- arr[end];
			arr[start] = arr[start]- arr[end];
			reverseArray(arr, ++start , --end);
		}
		
	}

	public static void main(String[] args) {
		int[] arr = {12,7,-5,1,20,0,1,6};
		printArray(arr);
		reverseArray(arr,0,arr.length-1);
		System.out.println();
		printArray(arr);
		
	}


	

}
