package ArrayQuestions;
/******************************************************************************************************
 * Author : Shilpita Roy
 * Date   : Sept26,2016
 * Problem: Shift all 0s to end of Array
 *          GeekForGeeks
 *          
 * The time complexity for the best method is O(N) space complexity O(1). 
 * *****************************************************************************************************/

public class Move0sToEnd {
	//Generic print function
	private static void printArray(int[] arr1){
		for(int i: arr1)
			System.out.print(i +"\t");
	}
	
	/*
	 * Shift all non zero to left by counting non zero and putting all nonzero to the sum position.
	 * arr[count] = arr[i]
	 */
	
	private static void shiftZerosRight(int[] arr){
		int count=0;
		for(int i=0; i< arr.length; i++){
			if(arr[i]!= 0){
				arr[count]= arr[i];
				count++;
			}
		}
		//count++;
		while(count< arr.length){
			arr[count]= 0;
			count++;
		}
	}
	public static void main(String[] args) {
		int[] arr ={0,0,2,3,0,9,7,0,0,0,3,0,8,9};
		printArray(arr);
		System.out.println("\n Shifted zeros to end:");
		shiftZerosRight(arr);
		printArray(arr);
	}

}
