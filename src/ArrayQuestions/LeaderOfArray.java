package ArrayQuestions;
/******************************************************************************************************
 * Author : Shilpita Roy
 * Date   : July 23,2016
 * Problem: Find Leaders of Array (elements which are greater than all the elements to its right)
 *          GeekForGeeks
 *          
 * The time complexity for the best method is O(N). 
 * *****************************************************************************************************/

public class LeaderOfArray {
	
	//Generic print function
	private static void printArray(int[] arr1){
		for(int i: arr1)
			System.out.print(i +"\t");
	}
	
	// loop from right to left to track the max number
	private static void leaderElements(int[] arr){
		int max_num = arr[arr.length-1];
		System.out.print("\t"+max_num);
		for(int i = arr.length-2;i>=0 ;i--){
			if(arr[i]>= max_num){
				System.out.print("\t"+arr[i]);
				max_num = arr[i];
			}
			//System.out.println("\t"+max_num);	
		}
		
	}

	public static void main(String[] args) {
		int[] arr = {12,72,-5,1,20,0,1,6};
		System.out.println("\n Original array:\n");
		printArray(arr);
		System.out.println("\n the Leaders of array are:");
		leaderElements(arr);
	}

}
