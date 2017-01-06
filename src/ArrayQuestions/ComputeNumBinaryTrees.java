package ArrayQuestions;
/******************************************************************************************************
 * Author : Shilpita Roy
 * Date   : Dec15,2016
 * Problem: Given a sorted array, find how many structurally different binary tress can be formed
 *          GeekForGeeks
 *          
 * The time complexity for the best method is computed by Catalan number formula 
 * *****************************************************************************************************/


public class ComputeNumBinaryTrees {
	
	public static long countBinaryTrees(int arr_length){
	   // long arr_length = arr.length;
		if(arr_length < 0)
			return 0;
		if(arr_length <=1)
			return 1;
		int count =0;
		for(int i =0 ; i< arr_length ;i++){
			for(int j =0 ; j< arr_length ;j++){
				 count+= combination( arr_length-j-1 ,j) * countBinaryTrees(j) *countBinaryTrees(arr_length-j-1);
			} 
		}
		return count;
	} 
 
	public static   long factorial(int n){
		if(n < 0)
			return 0;
		if(n <= 1)
			return 1;
		else
			return n* factorial(n-1);
	}
	
	 public static  long combination(int n , int i){
		 if(factorial(i) > 0)
			 return factorial(n)/factorial(i);
		 else
			 return 0;
	 }
	public static void main(String[] args) {
		System.out.println(countBinaryTrees(3));
	}

}
