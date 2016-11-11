package ArrayQuestions;
/******************************************************************************************************
 * Author : Shilpita Roy
 * Date   : Sept28,2016
 * Problem: Find Equilibrium Index of array such that sum of left hand Index = sum of Right hand index.
 * 			If no equilibrium return -1;
 *          GeekForGeeks
 *          
 * The time complexity for the best method is O(N).
 * *****************************************************************************************************/
public class EquilibriumIndex {
	//Generic print function
	private static void printArray(int[] arr1){
		for(int i: arr1)
			System.out.print(i +"\t");
	}
	
	/**
	 * @param arr
	 * 1. find total sum of array.
	 * 2. for each index get right sum and compare with left sum
	 * 3. if equal return else return -1
	 */
	//public static void findEquilibriumIndex(int[] arr){
	public static int findEquilibriumIndex(int[] arr){
		int leftsum =0; 
		int rightsum = 0;
		for( int i = 0 ; i< arr.length ; i++)
			rightsum += arr[i];
		
		for(int i =0 ; i< arr.length ; i++){
			rightsum = rightsum - arr[i];
			if(rightsum == leftsum)
				return i;
			  //System.out.println("\n Equilibriums Index found at :"+ i);
			leftsum = leftsum + arr[i];
		}
		//System.out.println("\n Equilibriums Index found at :"+ -1);
		return -1;
	}
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		int [] arr = {-7, 1, 5, 2, -4, 3, 0};
		EquilibriumIndex ei = new EquilibriumIndex();
		ei.printArray(arr);
		System.out.println("\n The Equilibriium index of the array is : "+ ei.findEquilibriumIndex(arr));
	}

}
