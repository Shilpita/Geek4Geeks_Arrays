package ArrayQuestions;
/******************************************************************************************************
 * Author : Shilpita Roy
 * Date   : Sept1,2016
 * Problem: Find 2 smallest element in array
 *          GeekForGeeks
 *          
 * The time complexity for the best method is O(N). 
 * *****************************************************************************************************/

public class Smallest2Element {
	//Generic print function
	private static void printArray(int[] arr1){
		for(int i: arr1)
			System.out.print(i +"\t");
	}
	
	/*
	 * Function to find two smallest element
	 */
	private static void smallest2Element(int[] arr){
		if((arr.length -1) < 2)
			System.out.println("Invalid: array input to small");
		int element1 = Integer.MAX_VALUE, element2 = Integer.MAX_VALUE;
		for(int i=0 ; i< arr.length ;i++){
			if(arr[i] < element1){
				element2 = element1;
				element1 = arr[i];
				
			}
			if(arr[i] < element2 && arr[i] > element1){
				element2 = arr[i];
			}
		}
		
		System.out.println("\n The smallest two elements are : "+element1 +" and "+ element2);
		
	}
	
	public static void main(String[] args) {
		int[] arr ={13,8,9,-7,9999,99,1,98};
		printArray(arr);
		smallest2Element(arr);
	}

}
