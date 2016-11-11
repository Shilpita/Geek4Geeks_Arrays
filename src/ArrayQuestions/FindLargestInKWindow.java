package ArrayQuestions;

import java.util.*;

/*************************************************************************************************************************************************
 * Author : Shilpita Roy
 * Date   : Nov5,2016
 * Problem: Given an unsorted array and an integer k, find the maximum for each and every contiguous sub-array of size k.
 * 			Eg: input: arr[] = {1, 2, 3, 1, 4, 5, 2, 3, 6}  and k = 3  Output : 3 3 4 5 5 5 6
 * 		    GeekForGeeks
 * 
 * The naive solution is O(N*N). using two loops.Another method is self balancing BST
 * The efficient element is O(N) using double ended Queue (Dequeue of size k).
 * *****************************************************************************************************************************************************/


public class FindLargestInKWindow {
	//Generic print function
	private static void printArray(int[] arr1){
		System.out.println();
		for(int i: arr1)
			System.out.print(i +"\t");
	}
	
	/**
	 * runs two loops 1. 0 till array length - k and 2.1 to k 
	 * get max in each k and add to list
	 * @param arr
	 * @param k
	 * @return resulted array
	 */
	public static ArrayList<Integer> findKMaxNaive(int[] arr, int k){
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		for(int i = 0 ; i<=arr.length-k;i++){
			int max = arr[i];
			for(int j = 1; j<k ;j++)
				if(i+j < arr.length)
					max = (max > arr[i+j])? max: arr[i+j];
			result.add(max);
		}
		return result;
	}
	
	/**
	 * Create a Dequeue of size k.and keep only max element in dequeue
	 * @param arr
	 * @param k
	 * @return resulted array
	 */
	public static ArrayList<Integer> findKMaxDeque(int[] arr, int k){
		ArrayList<Integer> result = new ArrayList<Integer>();
		ArrayDeque<Integer> dequeue = new ArrayDeque<Integer>();
		for (int i = 0; i<k ; i++){
			while(!dequeue.isEmpty() && arr[i] >= arr[dequeue.peekLast()])
				dequeue.pollLast();
			dequeue.add(i);
		}
		for(int i = k ;i<arr.length; i++){
			result.add(arr[dequeue.peekFirst()]);
			//System.out.println(dequeue.peekFirst()+"  "+arr[dequeue.peekFirst()]);
			while(!dequeue.isEmpty() && i-k >= dequeue.peekFirst())
				dequeue.pollFirst();
			while(!dequeue.isEmpty() && arr[i] >= arr[dequeue.peekLast()])
				dequeue.pollLast();
			dequeue.add(i);
		}
		result.add(arr[dequeue.peekFirst()]);
		return result;
	}
	public static void main(String[] args) {
		int[] arr ={1, 2, 3, 1, 4, 5, 2, 3, 6};
		int k =3;
		printArray(arr);
		ArrayList<Integer> result = findKMaxNaive(arr,k);
		System.out.println("\nNaiveSolution: "+result);
		ArrayList<Integer> result_ = findKMaxDeque(arr,k);
		System.out.println("\nDequeueSolution: "+result_);
		
	}

}
