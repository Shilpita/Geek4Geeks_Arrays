package ArrayQuestions;
/******************************************************************************************************
 * Author : Shilpita Roy
 * Date   : Sept25,2016
 * Problem: Create Union and Intersection of sorted arrays
 *          GeekForGeeks
 *          
 * The time complexity for the best method is O(N+M). 
 * *****************************************************************************************************/

import java.util.ArrayList;
public class UnionIntersectionSortedArray {
	//Generic print function
	private static void printArray(int[] arr1){
		for(int i: arr1)
			System.out.print(i +"\t");
	}
	
	//function to create union arraylist and intersection arraylist
	private static void getUnionIntersection(int[]arr1, int[] arr2){
		ArrayList unionList = new ArrayList();
		ArrayList intersectionList= new ArrayList();
		
		int i=0 ; int j=0;
		
		while(i< arr1.length && j<arr2.length){
			if(arr1[i] < arr2[j]){
				unionList.add(arr1[i]);
				i++;
			}else if(arr2[j]< arr1[i]){
				unionList.add(arr2[j]);
				j++;
			}else{
				unionList.add(arr1[i]);
				intersectionList.add(arr1[i]);
				i++;
				j++;
			}
		}
		
		if(arr1.length > arr2.length){
			while(i< arr1.length){
				unionList.add(arr1[i]);
				i++;
			}
		}else{
			while(j< arr2.length){
				unionList.add(arr2[j]);
				j++;
			}
		}
		
		System.out.println("\nUnion of Arrays :"+ unionList);
		System.out.println("\nIntersection of Arrays :"+ intersectionList);
	}
	
	public static void main(String[] args) {
		int[] arr1 ={1,5,7,8};
		int[] arr2 ={1,2,4,5,6,8,9};
		System.out.println("Array 1:");
		printArray(arr1);
		System.out.println("\nArray 2:");
		printArray(arr2);
		getUnionIntersection(arr1,arr2);
	}

}
