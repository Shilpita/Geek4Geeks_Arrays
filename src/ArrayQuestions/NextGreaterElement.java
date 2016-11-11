package ArrayQuestions;
import java.util.Stack;

/******************************************************************************************************
 * Author : Shilpita Roy
 * Date   : Sept28,2016
 * Problem: Find greater element of unsorted array. 
 * 			If No greater element then print -1. i/p 4,5,2,25 o/p 4->5, 5->25 , 2-> 25, 25->-1.
 *          GeekForGeeks
 *          
 * The time complexity for the best method is O(N).
 * *****************************************************************************************************/

public class NextGreaterElement {
	//Generic print function
	private static void printArray(int[] arr1){
		for(int i: arr1)
			System.out.print(i +"\t");
	}
	
	/**
	 * @param arr
	 * push first element to stack.
	 * for each element from 1 to n in array if element is <= to top of stack, push element to stack.
	 * else pop n print all values less than current array element on stack
	 */
	public static void findNextGreaterElement(int[] arr){
		Stack<Integer> st = new Stack();
	
		
		st.push(arr[0]);
		
		for(int i= 1; i<arr.length; i++){
			if(st.isEmpty() || arr[i] <= st.peek())
				st.push(arr[i]);
			else {
				while(!st.isEmpty() && arr[i] > st.peek()){
					System.out.println("\n"+ st.pop()+"-->"+arr[i]);
				}
				
				st.push(arr[i]);
			}
		}
		
		while(!st.isEmpty()){
			System.out.println("\n"+ st.pop()+"-->"+-1);
		}
		
	}
	public static void main(String[] args) {
		int[] arr = {4, 1,5, 2, 25,40};
		NextGreaterElement ng = new NextGreaterElement();
		ng.printArray(arr);
		ng.findNextGreaterElement(arr);

	}

}
