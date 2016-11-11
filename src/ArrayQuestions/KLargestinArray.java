package ArrayQuestions;
/******************************************************************************************************
 * Author : Shilpita Roy
 * Date   : Sept21,2016
 * Problem: Find K largest(smallest) element in array using min heap.
 *          GeekForGeeks
 *          
 * The time complexity for the best method is O(NlogN). 
 * *****************************************************************************************************/

public class KLargestinArray {
	//Generic print function
	private static void printArray(int[] arr1){
		System.out.println();
		for(int i: arr1)
			System.out.print(i +"\t");
	}
	
	public static void heapify(int[] res, int k, int smallest){
		int root = smallest;
		int left = 2*smallest +1;
		int right= 2*smallest +2;
		
		/// below if statements used to find the smallest element and make it root
		if (left < k  && res[left] < res[root])
			 root = left;
		
		if (right < k  && res[right] < res[root])
			 root = right;
		
		if (root != smallest){
			// swap root with smallest 
			int temp = res[root];
			res[root]= res[smallest];
			res[smallest]= temp;
			
			heapify( res, k, root);
		}
		
		//printArray(res);
	}
	
	public static void findKLargestElement(int[] arr, int k){
		int[] res = new int[arr.length];
		//copy arr in reserve array res
		res = arr;
		//printArray(res);
		
		// Build min heap of the res array
	    // by calling heapify on every parent node
		for (int i = k/2-1 ; i>= 0 ; i--)
			heapify(res,k,i);
		
		printArray(res);
		System.out.println();
		// Now check whether any element present in arr is
	    // greater than the smallest element(root) of all the element
	    // present in min heap.
		for(int i = k ; i< arr.length ; i++){
			// If any element is greater then replace the root 
	        // with this element
			if(arr[i] > res[0]){
				res[0] = arr[i];
				printArray(res);
				heapify(res,k,0);
				printArray(res);
				System.out.println();
			}
			//printArray(res);
		}
		System.out.println();
		
		// sort the res array to get the k largest elements
		
		for(int i = k-1 ; i>=0 ; i--){
			System.out.println();
			System.out.println();
			printArray(res);
			int temp = res[0];
			res[0] = res[i];
			res[i] = temp;
			printArray(res);
			heapify(res , i ,0);
			printArray(res);
		}
		
	}


	public static void main(String[] args) {
		int[] arr ={22,5,6,7,0,1,18,16};
		int k = 4;
		printArray(arr);
		findKLargestElement(arr,k);
	}
	
	

}
