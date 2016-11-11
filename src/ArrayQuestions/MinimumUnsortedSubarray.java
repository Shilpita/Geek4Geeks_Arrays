package ArrayQuestions;
/******************************************************************************************************
 * Author : Shilpita Roy
 * Date   : Sept28,2016
 * Problem: Find minimum unsorted subarray to make partially sorted array completely sorted.
 *          GeekForGeeks
 *          
 * The time complexity for the best method is O(N).
 * *****************************************************************************************************/
public class MinimumUnsortedSubarray {
	
	//Generic print function
	private static void printArray(int[] arr1){
		for(int i: arr1)
			System.out.print(i +"\t");
	}
	
	/**
	 * @param arr
	 * Steps of the Algo:
	 * 1. Find the index s of the first element smaller than its previous element.
	 * 2. Find the index e of the last element greater than the next element.
	 * 3. Find min and max element between the above range : s to e.
	 * 4. Find the element smaller than min in the sorted part of array :0 to s-1;
	 * 5. Find the element greater than the max in the sorted part of array : e+1 to n-1.
	 */
	public static void findUnsortedSubarray(int[] arr){
		int sIndex = 0; 
		int eIndex = arr.length-1;
		// Find the index of the 1st element smaller than previous checking from left of array.
		for (int i = 0; i< arr.length; i++){
			if(arr[i] > arr[i+1]){
				sIndex = i;
				break;
			}
		}
		// Find the index of the 1st element greater than next checking from right of array.
		for (int i = arr.length-1; i>= 0; i--){
			if(arr[i] < arr[i-1]){
				eIndex = i;
				break;
			}
		}
		 int max = arr[sIndex]; 
		 int min = arr[sIndex];
		 
		// find min and max from the unsorted range.
		 for(int i = sIndex ; i <= eIndex; i++){
			 if(arr[i] < min)
				 min = arr[i];
			 else if(arr[i] > max)
				 max = arr[i];
		 }
		 
		 // Check to find the element smaller than min in sorted range 0 to sIndex.
		 for(int i =0; i<= sIndex-1 ; i++){
			 if(arr[i] > min){
				 sIndex = i;
				 break;
			 }
		 }
		 // Check to find the element greater than max in sorted range eIndex to last Index of array.
		 for(int i = arr.length-1 ; i>= eIndex+1 ; i--){
			 if(arr[i] < max){
				 eIndex = i;
				 break;
			 }
		 }
		 
		System.out.println("\n The unsorted subarray ranges from indexes :" +sIndex +"-"+ eIndex); 
		 
	}

	public static void main(String[] args) {
		int[] arr ={10, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60};
		MinimumUnsortedSubarray mm = new MinimumUnsortedSubarray();
		mm.printArray(arr);
		mm.findUnsortedSubarray(arr);
	}

}
