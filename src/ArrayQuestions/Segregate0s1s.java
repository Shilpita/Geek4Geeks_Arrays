package ArrayQuestions;
/******************************************************************************************************
 * Author : Shilpita Roy
 * Date   : Sept24,2016
 * Problem: Segregate 0s to left and 1s right.
 *          GeekForGeeks
 *          
 * The time complexity for the best method is O(N). 
 * *****************************************************************************************************/

public class Segregate0s1s {
	//Generic print function
	private static void printArray(int[] arr1){
		for(int i: arr1)
			System.out.print(i +"\t");
	}

	/**
	 * 
	 * @param args = arrays
	 */
	
	private static void segregate0s1s(int[] arr){
		int low = 0 ;
		int high = arr.length-1;
		
		while(low < high){
			if(arr[low]+ arr[high] == 0)
				low++;
			else if(arr[low]+ arr[high] == 2)
				high--;
			else{
				if(arr[low]== 1 && arr[high]==0){
					int temp = arr[low];
					arr[low] = arr[high];
					arr[high]= temp;
				}	
				low++;
				high--;
			}
		}
		
	}
	public static void main(String[] args) {
		int[] arr = {0,1,0,1,0,0,0,1,1,1};
		printArray(arr);
		segregate0s1s(arr);
		System.out.println("\n");
		printArray(arr);
	}

}
