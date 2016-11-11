package ArrayQuestions;
/******************************************************************************************************
 * Author : Shilpita Roy
 * Date   : Sept4,2016
 * Problem: Find count of all inverse pairs in array (merge sort method)
 *          GeekForGeeks
 *          
 * The time complexity for the best method is O(NlogN). 
 * *****************************************************************************************************/

public class CountInversionInArray {

    public CountInversionInArray(){}
	//count inversion suing mergesort
	public  int countInversion(int[] arr){
				if(arr==null || arr.length < 2)
					System.out.println("\n Invalid array");
				return mergeCountInversion(arr,0,arr.length-1);
			}
			
	private  int mergeCountInversion(int[] arr, int low, int high) {
				int inv_count =0;
				int mid ;
				if(low < high){
					mid = (high+low)/2;
					inv_count = mergeCountInversion(arr , low, mid);
					//System.out.println("\n inv_count1 :"+ inv_count );
					inv_count += mergeCountInversion(arr , mid+1, high);
					//System.out.println("\n inv_count2:"+ inv_count );
					inv_count += merge(arr, low, mid+1, high);
					//System.out.println("\n inv_count3:"+ inv_count );
				}
				return inv_count;
			}

	private  int merge(int[] arr, int low, int mid, int high) {
		int inv_count= 0;
		int i = low ; 
		int j = mid;
		int k = low;
		//System.out.println("\n"+ i+"---->"+j+" ---->"+high);
		int[] temp = new int[arr.length];
		while(i<= mid-1 && j<= high){
			if(arr[i] <= arr[j])
				temp[k++]= arr[i++];
			else{
					//System.out.println("\n"+ arr[i]+" ----"+arr[j]);
					temp[k++]= arr[j++];
					inv_count = inv_count + (mid-i);
					//System.out.println("\n merge inv_count:"+inv_count);
			}
		}
		while(i<= mid-1)
			temp[k++]= arr[i++];
		while(j<= high)
			temp[k++]= arr[j++];
		
		for(i = low ; i<= high ; i++)
			arr[i]= temp[i];
		
		//printArray(arr);
		return inv_count;
	}


}
