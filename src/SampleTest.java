import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class SampleTest {

	public static void main(String[] args) {
//		//int a =4 ,b=3;
//		//int res =Integer.MAX_VALUE;
//		/*
//		res = res ^ a;
//		//System.out.println(res);
//		res = res ^ b;
//		res = res ^ b ;
//		res = res ^ b;*/
//		int res = 0^1^0^1^2^3^6^7;
//		int res1 = 0^1^2^3^4^5^6^7;
//		int res3 = res^ res1;
//		System.out.println(res +" "+res1 +" "+res3 );
//		
//		int a = 5;
//		int b = 1<<a;
//		System.out.println("\n"+ b);
//		int c = 0 ^ b;
//		System.out.println("\n"+ b);
//		
//		//System.out.println(a*b);
		
		ArrayDeque <Integer> dequeA = new ArrayDeque<Integer>();

	    dequeA.add(0);
		dequeA.add(1);
		dequeA.add(3);
		System.out.println(dequeA);
		System.out.println(dequeA.getLast());
		dequeA.pollFirst();
		System.out.println(dequeA);
		//access via Iterator
		Iterator iterator = dequeA.iterator();
		while(iterator.hasNext()){
			Integer element = (Integer) iterator.next();
		  
		}




	}
	 

}
