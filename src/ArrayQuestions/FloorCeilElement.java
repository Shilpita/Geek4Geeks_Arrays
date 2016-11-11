package ArrayQuestions;
/******************************************************************************************************
 * Author : Shilpita Roy
 * Date   : Sept6,2016
 * Problem: Find floor and ceiling element in array
 *          GeekForGeeks
 *          
 * The time complexity for the best method is O(NlogN). 
 * *****************************************************************************************************/

public class FloorCeilElement {
	//Generic print function
		private static void printArray(int[] arr1){
			for(int i: arr1)
				System.out.print(i +"\t");
		}
		
		private static int floorElement(int[]arr ,int low, int high, int x) {
			int mid = 0;
			if(arr == null || arr.length == 0)
				return -1;
			if(low <= high)
				mid = (high+low)/2;
			
			if (x < arr[low])
				return -1;
			
			if(x == arr[mid])
				return arr[mid];
			else if(x < arr[mid]){
					if(x >= arr[mid-1])
						return arr[mid-1];
					else
						return floorElement(arr, low, mid-1 , x);
			}else{
					if(x <= arr[mid+1])
						return arr[mid];
					else
						return floorElement(arr, mid+1, high, x);
			}	 
		}
		
		private static int ceilingElement(int[]arr ,int low, int high, int x) {
			int mid = 0;
			if(arr == null || arr.length == 0)
				return -1;
			if(low <= high)
				mid = (high+low)/2;
			
			if (x > arr[high])
				return -1;
			
			if(x == arr[mid])
				return arr[mid];
			else if(x < arr[mid]){
					if(x >= arr[mid-1])
						return arr[mid];
					else
						return ceilingElement(arr, low, mid-1 , x);
			}else{
					if(x <= arr[mid+1])
						return arr[mid+1];
					else
						return ceilingElement(arr, mid+1, high, x);
			}	 
		}
		
	public static void main(String[] args) {
		int[] arr ={1,1,8,9,20,33,90};
		printArray(arr);
		System.out.println("\n floor element of :"+ 7 +"\t" +floorElement(arr, 0 , arr.length-1 , 7));
		System.out.println("\n ceiling element of :"+ 7 +"\t" +ceilingElement(arr, 0 , arr.length-1 , 7));
	}

}
