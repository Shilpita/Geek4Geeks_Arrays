package ArrayQuestions;
/******************************************************************************************************
 * Author : Shilpita Roy
 * Date   : Sept25,2016
 * Problem: Dutch National Flag problem, Sort 0s,1s,and 2s
 *          GeekForGeeks
 *          
 * The time complexity for the best method is O(N). 
 * *****************************************************************************************************/

public class DutchNationalFlag {
 
	public DutchNationalFlag(){}
	
	/***
	 * @param args=array
	 * The three partition method. It has 3 indexes ; low,mid and high.
	 * Three cases 0,1,2: every time for 0 n 1 mid incremented, for 0 low incremented, for 2 only high decremented.
	 */
	
	public  void dutchNationalFlag(int[] arr){
		int low = 0 ; int mid = 0 ; int high = arr.length-1;
		while(mid <= high){
			if(arr[mid] == 0){
				int temp = arr[mid];
				arr[mid]=arr[low];
				arr[low]=temp;
				low++;
				mid++;
			}
			else if(arr[mid]==1)
				mid++;
			else{
				int temp = arr[mid];
				arr[mid]=arr[high];
				arr[high]=temp;
				high--;
				//mid++;
			}
		}
	}


}
