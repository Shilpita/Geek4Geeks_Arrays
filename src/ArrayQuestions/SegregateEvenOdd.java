package ArrayQuestions;
/******************************************************************************************************
 * Author : Shilpita Roy
 * Date   : Sept24,2016
 * Problem: Segregate evens to left and odds to right.
 *          GeekForGeeks
 *          
 * The time complexity for the best method is O(N). 
 * *****************************************************************************************************/

public class SegregateEvenOdd {
	//Generic print function
		private static void printArray(int[] arr1){
			for(int i: arr1)
				System.out.print(i +"\t");
		}
    private static void segregateEvenOdd(int[] arr){
    	int low = 0 ;
    	int high= arr.length-1;
    	
    	while(low < high){
    		if((arr[low]&1) == 1) {
    			if((arr[high]&1) ==0){
    				int temp = arr[low];
    				arr[low] =arr[high];
    				arr[high]=temp;
    				low++;
    				high--;
    			}else high--;
    		}else low++;
    	}
    }
	public static void main(String[] args) {
		int[] arr ={13,2,5,24,9,80,7,8};
		printArray(arr);
		System.out.println("\n");
		segregateEvenOdd(arr);
		printArray(arr);

	}

}
