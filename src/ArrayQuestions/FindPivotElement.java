package ArrayQuestions;
/******************************************************************************************************
 * Author : Shilpita Roy
 * Date   : Sept15,2016
 * Problem: Find pivot element where all previous element smaller than pivot and all later elements larger than pivot.
 *          eg: i/p {5,10,11,13,15,12,9,13,14,15,16,17};
 *          o/p : 10
 *          GeekForGeeks
 *          
 * The time complexity for the best method is O(N). 
 * *****************************************************************************************************/

public class FindPivotElement {
	//Generic print function
	private static void printArray(int[] arr1){
		for(int i: arr1)
			System.out.print(i +"\t");
	}

	private static int findPivotElement(int[] arr){
		int curr = 1;
		int i = 0;
		int max = arr[0];
		while(true){
			while (curr < arr.length && arr[curr]<= max)
				curr++;
			if(curr == arr.length)
				return -1;
			max = arr[curr];
			int max1 = max;
			i= curr+1;
			while(i < arr.length){
				if(arr[curr] < arr[i]){
					if(arr[i] > max1)
						max1= arr[i];
					i++;
				}else {
					curr = i;
					max = max1;
					break;
				}
			}
			if(i== arr.length)
				break;
		}
		return curr;
	}
	
	public static void main(String[] args) {
		int arr[] = {5,10,11,13,15,12,9,13,14,15,16,17};
		printArray(arr);
		System.out.println("\n The pivot element is at index :"+findPivotElement(arr));

	}

}
