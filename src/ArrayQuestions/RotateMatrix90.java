package ArrayQuestions;
/******************************************************************************************************
 * Author : Shilpita Roy
 * Date   : Nov8,2016
 * Problem: Rotate a 2 dimensional array by 90 degrees.
 *          GeekForGeeks
 *          Input
 *			 1  2  3
 *			 4  5  6    
 *			 7  8  9
 *          Output:
 *			 3  6  9 
 *			 2  5  8 
 *			 1  4  7 
 *          
 * Method: step 1. transpose matrix : 2*3 => 3*2 
 *         step 2. 
 *
******************************************************************************************************/


public class RotateMatrix90 {
	//Generic print function
	private static void printArray(int[][] arr){
		//System.out.println();
		for(int i=0 ; i < arr.length ;i++){
			int row = arr[i].length;
			System.out.println();
			for(int j = 0; j < row; j++)
				System.out.print(arr[i][j]+"\t");
		}	
	}

	/**
	 * Transpose of the given matrix
	 * 123		147
	 * 456 =>	258
	 * 789		369
	 * @param arr
	 * @return arr
	 */
	private static int[][] transposeMatrix(int[][] arr){
		
		int[][] transpose = new int[arr.length][arr[0].length];
		for(int i = 0 ; i< arr.length ;i++){
			int row_length = arr[i].length;
			for(int j = 0 ;j < row_length ; j++){
				transpose[i][j] = arr[j][i];
			}
		}
		//printArray(transpose);
		return transpose;
	}
	
	/**
	 * reverse the columns 
	 * 147    369
	 * 258 => 258
	 * 369    147
	 * @param arr
	 * @return arr
	 */
	private static int[][] reverseMatrix(int[][] arr){
		int[][] reverse = new int[arr.length][arr[0].length];
		int i = arr.length-1;
		int j =0;
		//for(;i>=0 ;i--){
			while(j<arr.length && i>= 0){
				reverse[j] = arr[i];
				i--;
				j++;
			}
		//}
		//printArray(reverse);
		return reverse;
	}
	/**
	 * Naive method to transpose array and then reverse the columns
	 * @param arr
	 * @return rotate arr
	 */
	public static int[][] rotate90Naive(int[][] arr){
		return reverseMatrix(transposeMatrix(arr));
	}
	
	public static int[][] rotate90Efficient(int[][] arr){
		int k = arr.length-1;
		for(int x=0; x< arr.length/2 ;x++){  // for each row till mid
			for(int y= x ; y < arr.length-x-1 ;y++) {// for column till end
				int temp 	= arr[x][y];
				arr[x][y]	= arr[y][k-x];
				arr[y][k-x] = arr[k-x][k-y];
				arr[k-x][k-y]=arr[k-y][x];
				arr[k-y][x] = temp;
			}
		}
		//printArray(arr);
		return arr;
	}
	
	public static void main(String[] args) {
		int[][] arr ={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		printArray(arr);
		System.out.println("\nRotated Matrix by Naive method:");
//		int[][] transpose = transposeMatrix(arr);
//		printArray(transpose);
//		System.out.println("\nReverse");
//		int[][] reverse = reverseMatrix(transpose);
		printArray(rotate90Naive(arr));
		System.out.println("\nRotated Matrix by Efficient method:");
		printArray(rotate90Efficient(arr));
	}

}
