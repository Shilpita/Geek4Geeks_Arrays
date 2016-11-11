package ArrayQuestions;
/**************************************************************************************
 * Author : Shilpita Roy
 * Date   : June 13,2016
 * Problem: Given integer find all pair of sum = integer in array
 *          GeekForGeeks
 *          
 * The time complexity for the following method is O(N) with space complexity for hashmap.
 * Another method is to sort the array and then perform binary search.O(NlogN)
 * ***************************************************************************************/



import java.util.HashSet;
import java.util.Scanner;

public class PairSumArray {
	
	public static void isSum(int[] arr , int sum){
		HashSet <Integer> map = new HashSet <Integer>();
		int flag =0;
		for(int i : arr){
			if(map.contains(sum - i)){
				System.out.println(" sum pair " + i + " and "+ (sum-i));
				flag=1;
			}
			else
				map.add(i);
		}	
		if(flag==0)
			System.out.println("No pair with the sum "+ sum);
	}

	public static void main(String[] args) {
		int[] arr = {12,7,-5,1,20,0,1,6};
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the sum :");
		int sum = input.nextInt();
		isSum(arr, sum);
	}

}
