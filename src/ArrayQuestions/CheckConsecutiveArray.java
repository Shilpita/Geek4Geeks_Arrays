package ArrayQuestions;

import java.util.ArrayList;

/******************************************************************************************************
 * Author : Shilpita Roy
 * Date   : Sept28,2016
 * Problem: Given an unsorted array of numbers, write a function that returns true if array consists of consecutive numbers.
 *          GeekForGeeks
 *          
 * The time complexity for the best method is O(N). For checking duplicates space complexity is O(N) 
 * For O(1) space complexity only the range of positive and 0 integers can be checked.
 *  
 * https://disqus.com/home/discussion/geeksforgeeks/check_if_array_elements_are_consecutive_added_method_3/
 * https://www.quora.com/What-is-the-most-efficient-algorithm-to-find-repeated-elements-in-an-array-in-time-complexity-O-n-and-space-complexity-O-1
 * *****************************************************************************************************/

public class CheckConsecutiveArray {
	public CheckConsecutiveArray(){}
	/**
	 * 1.Find min, max and xor of all the elements.
	 * 2.Check total arraylength with range Max-min+1
	 * 		a. check for duplicates using hashmap 
	 * 			if duplicate return false
	 * 		b. xor for all elements in range min to max
	 * 			if xor = 0 return true.
	 *      else return false.
	 * @param arr
	 * @return true/false
	 */
	
	public  boolean isConsecutive(int[] arr){
		int min = arr[0] ;
		int max = arr[0] ;
		int xor = arr[0];
		
		// find xor and min and max in array
		for(int i =1; i< arr.length ; i++){
			min = Math.min(min, arr[i]);
			max = Math.max(max, arr[i]);
			xor^= arr[i];
		}
		
		if(max-min+1 == arr.length){
			//check for xor of range is 0 with xor of all elements.
			for(int i = min ; i <= max ; i++)
				xor^= i;
			if(xor == 0){ // check for duplicates in array
				ArrayList ht = new ArrayList();
				for(int i : arr){
					if(!ht.contains(i))
						ht.add(i);
					else
						return false;
				}
				return true;
			}else
				return false;	
		}
		 return false;
	}


}
