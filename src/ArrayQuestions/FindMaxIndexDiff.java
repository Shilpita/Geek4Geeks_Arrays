package ArrayQuestions;
/**************************************************************************************
 * Author : Shilpita Roy
 * Date   : Oct 31,2016
 * Problem: Given an array arr[], find the maximum j – i such that arr[j] > arr[i].
 * 			Ex: Input: {34, 8, 10, 3, 2, 80, 30, 33, 1}
 *				Output: 6  (j = 7, i = 1) 
 *          GeekForGeeks
 *          
 * The time complexity for the following method is O(N) with space complexity for O(N).
 * Another method is to run two loop n find max diff O(N*N)
 * ***************************************************************************************/

public class FindMaxIndexDiff {
	//Generic print function
	private static void printArray(int[] arr1){
		System.out.println();
		for(int i: arr1)
			System.out.print(i +"\t");
	}
	/**
	 * Naive solution for maximum difference between two index j>i
	 * @param arr
	 */
    public static int findMaxDiffNaive(int[] arr){
    	int maxDiff = -1;
    	for(int i = 0 ; i < arr.length ;i++){
    		for(int j = arr.length-1;j>=0; j-- ){
    			if(j > i && arr[j] > arr[i])
    				maxDiff = (maxDiff < (j-i))? (j-i):maxDiff;
    		}
    	}
    	return maxDiff;
    }
    
    /**
     * Effiecient solution by arranging element in temporary array in increasing order.
     * @param arr
     * @return maxDiff
     */
	
    public static int findMaxDiffEffecient(int[] arr){
    	int[] temp = new int[arr.length];
    	int maxDiff= -1;
    	temp[arr.length-1] = arr[arr.length-1];
    	for(int i = arr.length-2; i>=0 ;--i){
    		temp[i] = (temp[i+1] > arr[i])? temp[i+1] :arr[i];
    	}
    	printArray(temp);
    	printArray(arr);
    	int i=0 ; int j =0;
    	while(j< arr.length && i< arr.length){
    		if(j<i)
    			j= i;
    		if(arr[i] < temp[j]){
    			maxDiff = (maxDiff < (j-i))? (j-i):maxDiff;
    			System.out.println(temp[j] +"   "+arr[i]+"   "+maxDiff);
    			j=j+1;
    		}else{
    			System.out.println(temp[j] +"   "+arr[i]);
    			
    			i=i+1;
    		}
    	}
    	
		return maxDiff;
    }
	
	public static void main(String[] args) {
		int[] arr ={34, 8, 10, 3, 2, 80, 89,30, 33, 1};
		printArray(arr);
		System.out.println("\nNaive solution for maximum difference :"+ findMaxDiffNaive(arr));
		System.out.println("\nEfficient solution for maximum difference :"+ findMaxDiffEffecient(arr));
		printArray(arr);
	}


}
