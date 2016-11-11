package ArrayQuestions;
/******************************************************************************************************
 * Author : Shilpita Roy
 * Date   : June 28,2016
 * Problem: Find the median of two equal length sorted arrays
 *          GeekForGeeks
 *          
 * The time complexity for the best method is O(logN). 
 *
 * *****************************************************************************************************/

public class MedianEqualSortedArrays {
	
	public static int median(int[] arr , int n){
		if(n <= 0)
			return -1;
		if(n % 2 != 0)
			return (arr[n/2]);
		else
			return (arr[n/2]+arr[n/2 -1])/2;
	}
	
	public static int getMedianEqualSortedArray(int[] arr1, int[] arr2 ,int low1,int  high1,int  low2, int high2){
		int n1 = high1-low1;
		int n2 = high2-low2;
		
	    if(n1 < 0 || n2 < 0)
	    	return -1;
	    if(n1 == 0 && n2 == 0)
	    	return ( arr1[low1]+arr2[low2])/2;
	    if (n1 == 1 && n2 ==1)
	    	return (Math.max(arr1[low1], arr2[low2]) + Math.min(arr1[high1], arr2[high2]))/2;
	    
	    int m1 = median(arr1, n1);
	    int m2 = median(arr2, n2);
	    
	    if(m1 < m2){
	    	if(n1%2 == 0){
	    		low1  = low1 + n1/2;
	    		high2 = low2 + n2/2;
	    	}else{
	    		low1  = low1 + n1/2;
	    		high2 = low2 + n2/2 +1;
	    	}
       }else{
    	   if(n2%2 == 0){
    		   low2 = low2 +n2/2;
    		   high1 =low1 +n1/2;
    	   }else{
    		   low2 = low2 +n2/2;
    		   high1= low2 +n1/2 +1;
    	   }
       }
	    
		return getMedianEqualSortedArray(arr1, arr2 , low1 , high1, low2, high2);
		
	}

	public static void main(String[] args) {
		int[] arr1 = {4,9,30,33,141};
		int[] arr2 = {1,2,17,20,50};
		if(arr1.length == arr2.length)
			System.out.println("The median is :"+ getMedianEqualSortedArray(arr1,arr2,0,arr1.length-1 , 0, arr2.length-1));
		else
			System.out.println("This does not work for arrays of different sizes.");
	}

}
