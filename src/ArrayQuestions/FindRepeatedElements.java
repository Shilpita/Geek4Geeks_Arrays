package ArrayQuestions;
/******************************************************************************************************
 * Author : Shilpita Roy
 * Date   : Sept26,2016
 * Problem: Find repeated Element in array.
 *          GeekForGeeks
 *          
 * The time complexity for the best method is O(N) space complexity O(1). 
 * *****************************************************************************************************/

public class FindRepeatedElements {
	//Generic print function
	private static void printArray(int[] arr1){
		for(int i: arr1)
			System.out.print(i +"\t");
	}
	
	/**
	 * @param args = array
	 * For each element inspect the element if its positive change to negative.
	 * Only works on array with elements between 1 to n-1 and repeated only twice.
	 **/
	private static void findRepeats(int[] arr){
		for(int i =0; i< arr.length; i++){
			if(arr[i]!= Integer.MIN_VALUE){
				if(arr[Math.abs(arr[i])] == 0)
					arr[Math.abs(arr[i])] = Integer.MIN_VALUE;
				else if (arr[Math.abs(arr[i])] > 0)
					arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];
				else
					System.out.println("\t"+ Math.abs(arr[i]));
			}else{
				System.out.println("\t"+ 0);
			}
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {3,0,-2,2,4,5,5,5};
		printArray(arr);
		System.out.println("\nThe repeated elements are:");
		findRepeats(arr);
	}

}
