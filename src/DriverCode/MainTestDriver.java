package DriverCode;

import ArrayQuestions.*;

public class MainTestDriver {
	//Generic print function
	private static void printArray(int[] arr1){
		for(int i: arr1)
			System.out.print(i +"\t");
	}

	public static void main(String[] args) {
         System.out.println("Check if string can be changed by one bit flip");
		//Given a binary string, find if it is possible to make all its digits equal (either all 0’s or all 1’s) by 
		//flipping exactly one bit.
		String str = "1011";
		ChangeToAllSame1Step ch = new ChangeToAllSame1Step();
		System.out.println("The String "+str + "can be fliped in one step : "+ ch.can1Flip(str));
		
		//Given an unsorted array of numbers, write a function that returns true if array consists of consecutive numbers.
		int[] arr = {83, 78, 80, 81, 79, 82};
		//int[] arr1 = {7, 6, 5, 5, 3, 4};
		//int[] arr2 = {1 ,2 ,3, 3 ,5, 7, 7};
		//int[] arr3 = {0,1,0,1,2,3,6,7};
		CheckConsecutiveArray cca = new CheckConsecutiveArray();
		printArray(arr);
		System.out.println("\n The array are consecutive:"+ cca.isConsecutive(arr));
//		printArray(arr1);
//		System.out.println("\n The array are consecutive:"+ cca.isConsecutive(arr1));
//		printArray(arr2);
//		System.out.println("\n The array are consecutive:"+ cca.isConsecutive(arr2));
//		printArray(arr3);
//		System.out.println("\n The array are consecutive:"+ cca.isConsecutive(arr3));
		
		// Majority Element :Find if a given integer x appears more than n/2 times in a sorted array of n integers.
		int[] arr4 = {0,1,1,1,1,1,6,7};
		printArray(arr4);
		CheckMajorityElementInSortedArray maj = new CheckMajorityElementInSortedArray();
		System.out.println("\n 1 in majority element :"+ maj.checkMajority(arr4,1));
		
		//Count all inversion in array : Find count of all inverse pairs in array (merge sort method)
		CountInversionInArray invCont = new CountInversionInArray();
		int[] arr5 ={ 2,10,8,4,11,5,1};
		printArray(arr5);
	    int count = invCont.countInversion(arr5);
	    System.out.println("\n total inversion count :"+ count);
	    
	    // Dutch National Flag
		int[] arr6 = {1,2,0,2,2,1,1,0,2,0};
		DutchNationalFlag d = new DutchNationalFlag();
		printArray(arr6);
		d.dutchNationalFlag(arr6);
		System.out.println("\n");
		printArray(arr6);

	}

}
