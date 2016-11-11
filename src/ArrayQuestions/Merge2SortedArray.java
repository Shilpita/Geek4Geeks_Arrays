package ArrayQuestions;
/******************************************************************************************************
 * Author : Shilpita Roy
 * Date   : June 24,2016
 * Problem: Merge two sorted arrays of length N and M+N.
 *          GeekForGeeks
 *          
 * The time complexity for the best method is O(M+N). 
 *
 * *****************************************************************************************************/

public class Merge2SortedArray {

	private static void pushElement(int[] arr1){
		int l = arr1.length -1;
		for(int i = arr1.length -1 ; i>= 0 ; i--){
			if(arr1[i] != -99){
				arr1[l] = arr1[i];
				arr1[i] = -99;
				l--;
			}
		}
	}
	
	private static void mergeArray(int[] arr1 , int[] arr2){
		int k = 0;
		int j = arr2.length;
		for(int i = 0 ; i < arr1.length ; i++){
			if(j < arr1.length && k < arr2.length ){
			if(arr1[j] < arr2[k]){
				arr1[i] = arr1[j];
				j++;
			} else if(arr1[j] >= arr2[k]){
				arr1[i] = arr2[k];
				k++;
			} 	
		}
	  }
		
	}
	
	private static void printArray(int[] arr1){
		for(int i: arr1)
			System.out.print(i +"\t");
	}
	
	public static void main(String[] args) {
		int[] arr1 = {2, -99, 14,15,-99,-99,76,89,-99,-99};
		int[] arr2 = {0,4,23,46,87};
		pushElement(arr1);
		printArray(arr1);
		System.out.println();
		printArray(arr2);
		System.out.println();
		mergeArray(arr1, arr2);
		printArray(arr1);
	}

}
