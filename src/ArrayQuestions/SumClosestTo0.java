package ArrayQuestions;
/******************************************************************************************************
 * Author : Shilpita Roy
 * Date   : Sept4,2016
 * Problem: Find sum closest to zero in array
 *          GeekForGeeks
 *          
 * The time complexity for the best method is O(NlogN). 
 * *****************************************************************************************************/

public class SumClosestTo0 {
	//Generic print function
		private static void printArray(int[] arr1){
			for(int i: arr1)
				System.out.print(i +"\t");
		}
		
	// sort the array using quicksort
		private static void quickSort(int[] arr, int low, int high){
			if(arr == null || arr.length ==0)
				return;
			//System.out.println("\n quicksort");
			int i=low ; int j=high;
			if(low < high){
				int pivot = arr[(high+low)/2];
			    while(i<= j){
			    	while(arr[i] < pivot)
			    		i++;
			    	while(arr[j] > pivot)
			    		j--;
			    	if(i<= j){
			    	   int temp = arr[i];
			    	   arr[i] = arr[j];
			    	   arr[j] = temp;
			    	   i++;
			    	   j--;
			    	}
			    }
			    if(i< high)
			    	quickSort(arr,i,high);
			    if(j > low)
			    	quickSort(arr,low,j);
			    	
			}
		}
		
		//Find the sum closest to zero
		
		private static void sumCloseTo0(int[] arr){
			if(arr.length < 2)
				return;
			int sum ; int  min_sum = Integer.MAX_VALUE ;
			int low = 0 , high = arr.length -1;
			quickSort(arr , low , high);
			System.out.println("\n Sorted array");
			printArray(arr);
			int min_left = 0 , min_high =arr.length -1;
			while(low < high){
				sum = arr[low] + arr[high];
				if(Math.abs(sum) <= Math.abs(min_sum) || sum == 0){
					min_sum = sum;
					min_left = low; 
					min_high = high;
				}
				if(sum < 0)
					low++;
				else if (sum > 0)
					high--;
				else
					break;
			}
			System.out.println("\n The two element of array with sum closest to zero are: "+ 
			                    arr[min_left]+"\t"+ arr[min_high]);
			
		}
		
		
	public static void main(String[] args) {
		int[] arr ={12, 3,10,20,6,9,45,-1};
		printArray(arr);
		sumCloseTo0(arr);
	}

}
