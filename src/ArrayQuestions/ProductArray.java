package ArrayQuestions;
/******************************************************************************************************
 * Author : Shilpita Roy
 * Date   : Sept25,2016
 * Problem: Product of array elements. eg 2,3,4,5 o/p 60,40,30,24
 *          GeekForGeeks
 *          
 * The time complexity for the best method is O(N). 
 * *****************************************************************************************************/

public class ProductArray {

	//Generic print function
	private static void printArray(int[] arr1){
		for(int i: arr1)
			System.out.print(i +"\t");
	}

	/**
	 * @param args = array
	 * Product computed by multiplying element from left to right and right to left.
	 * 2,3,4,5 =>1,1,1,1 => 1,2,6,24 -> left to right
	 * 1,2,6,24=>60,40,30,24 -> right to left
	 **/
	private static void productArray(int[] arr){
		int[] prodArr = new int[arr.length];
		for(int i: prodArr) prodArr[i] = 1;
		int temp =1;
		
		/**Product from left to right. post product using temp variable**/
		
		for(int i = 0 ; i< arr.length ; i++){
			prodArr[i] = temp;
			temp = temp * arr[i];
		}
		
		temp =1;
		
		/**Product from right to left. post product using temp variable**/
		
		for(int i = arr.length-1 ; i>=0 ; i--){
			prodArr[i] = prodArr[i] * temp;
			temp = temp * arr[i];
		}
		
		System.out.println("\n");
		printArray(prodArr);
	}
	
	public static void main(String[] args) {
		int[] arr = {3,1,5,2,9};
		printArray(arr);
		productArray(arr);

	}

}
