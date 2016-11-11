package ArrayQuestions;
/******************************************************************************************************
 * Author : Shilpita Roy
 * Date   : July 22,2016
 * Problem: Rotate a given array by a given integer
 *          GeekForGeeks
 *          
 * The time complexity for the best method is O(N). 
 * a) GCD block move method or juggling method
 * b) Block swap method
 * c) Reverse array method
 * *****************************************************************************************************/

public class RotateArray {
	/*
	 * Generic functions
	 */
	private static void printArray(int[] arr1){
		for(int i: arr1)
			System.out.print(i +"\t");
	}
	/*
	 * a) GCD block move method involves calculating the GCD of integer d and array length n
	 *    The array elements are moved at the GCD interval towards the end.
	 */
	public static void gcdArrayRotate(int[] arr ,int d){ 
		int temp =0 , j=0,k=0;
		//System.out.println("\nGCD" + gcd(arr.length , d));
		for(int i =0; i < gcd(arr.length , d); i++){
		     temp = arr[i];
			    j = i;
			while(true){
			      k = j+d;
				if(k >= arr.length)
					k= k-arr.length;
				if(k==i)
					break;
				else{
					arr[j] = arr[k];
					//System.out.println(arr[k]);
					j= k;
				   }
			}
			arr[j] = temp;
			//System.out.println(arr[j]);
		}	
		
	}
    // find GCD of two numbers : GCD(12,6) = 6
	private static int gcd(int length, int d) {
		if(d==0)
		return length;
		else return gcd(d, length%d);
	}

	/*
	 * b) Block swap array partitioned into array of length d and n-d.
	 * Initialize A = arr[0..d-1] and B = arr[d..n-1]
		i) Do following until size of A is equal to size of B

  			1)  If A is shorter, divide B into Bl and Br such that Br is of same 
       length as A. Swap A and Br to change ABlBr into BrBlA. Now A
       is at its final place, so recur on pieces of B.  

   			2)  If A is longer, divide A into Al and Ar such that Al is of same 
       length as B Swap Al and B to change AlArB into BArAl. Now B
       is at its final place, so recur on pieces of A.

		ii)  Finally when A and B are of equal size, block swap them.
	 * 
	 */
	private static void blockSwapRotate(int[]arr,int start,int d,int n){
		if(d==0 || n-d ==0)
			return ;
		if(n-d == d){
			swap(arr, start, n-d ,d);
			return;
		}
		if(d < n-d){
			swap(arr,start,n-d, d);
			blockSwapRotate( arr, 0, d , n-d);
		}else{
			swap(arr, start, d ,n-d);
			
			blockSwapRotate( arr, n-d, 2*d-n, d);
		}
		
	}
	
	
	private static void swap(int[] arr, int start, int end, int d) {
		for(int i = 0 ; i< d ; i++){
			int temp = arr[i+start];
			arr[i+start] = arr[i+end];
			arr[i+end]= temp;
		}
		
	}
	/*
	 * c) Reverse array method.
	 * 
	 */
	
	private static void reverseArrayRotate (int[] arr , int d){
		reverseArray(arr,0,d-1);
		reverseArray(arr,d,arr.length-1);
		reverseArray(arr,0,arr.length-1);
		
	}
	private static void reverseArray(int[] arr, int start, int end) {
		if(start < end){
			arr[start] = arr[start]+ arr[end];
			arr[end]  = arr[start]- arr[end];
			arr[start] = arr[start]- arr[end];
			reverseArray(arr, ++start , --end);
		}
		
	}
	
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6};
		System.out.println("\n Original array:\n");
		printArray(arr);
		
		System.out.println("\n GCD juggling method rotate by 3:\n");
		gcdArrayRotate(arr,3);
		printArray(arr);
		
		System.out.println("\n Block swap method rotate by 4:\n");
		blockSwapRotate(arr,0,4,arr.length);
		printArray(arr);
		
		System.out.println("\n Array reverse method rotate by 4:\n");
		reverseArrayRotate(arr,4);
		printArray(arr);

	}

}
