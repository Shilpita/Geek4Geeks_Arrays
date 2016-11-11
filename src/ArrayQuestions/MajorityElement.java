package ArrayQuestions;
/**************************************************************************************
 * Author : Shilpita Roy
 * Date   : June 15,2016
 * Problem: Find the element in array with max number of occurence.
 *          GeekForGeeks
 *          
 * The time complexity for the following method is O(N) with constant space complexity .
 * Another method is to use nested loop O(N*N) or hashmap O(N) with space complexity
 * ***************************************************************************************/

public class MajorityElement {
	
	public static int majorityElement(int[] arr){
		int currentIndex =0 ;
		int count =1;
		for(int i =1 ; i< arr.length ;i++){
			if(arr[currentIndex] == arr[i])
				count++;
			else count--;
			if(count == 0){
				currentIndex = i;
				count = 1;
			}
		}
		
		System.out.println(count +" "+ arr[currentIndex]);
		   return arr[currentIndex];		
	}
	public static int isMajority(int[]arr, int majElement){
		int count=0;
		for(int i =0 ; i< arr.length ;i++){
			if(arr[i]== majElement)
				count++;
		}
		if(count > arr.length/2)
			return majElement;
		else 
			return -99999;
	}

	public static void main(String[] args) {
		int[] arr = {3,4,1,8,3,3,3,3,3};
		System.out.println("Majority elment in array is :"+ isMajority(arr,majorityElement(arr)));

	}

}
