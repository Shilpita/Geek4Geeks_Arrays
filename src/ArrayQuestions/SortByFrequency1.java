package ArrayQuestions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/******************************************************************************************************
 * Author : Shilpita Roy
 * Date   : Julu 23,2016
 * Problem: Sort elements by Frequency decreasing
 *          GeekForGeeks
 *          
 * The time complexity for the best method is O(N) using Hashmap.
 * *****************************************************************************************************/

public class SortByFrequency1 {
	
	//Generic print function
	private static void printArray(int[] arr1){
		for(int i: arr1)
			System.out.print(i +"\t");
	}
	
	/*
	 *  Function that populate the Hashmap with the count of the occurrences 
	 *  Then sort the Hashmap using TreeMap
	 */
	
	private static void sortFrequency(int[] arr){
		LinkedHashMap<Integer,Integer> hm = new LinkedHashMap();
		Map result = new LinkedHashMap(); 
		int j = 0;
		//Create Linked HashMap
		for(int i: arr){
			if(hm.containsKey(i))
				hm.put(i, hm.get(i)+1);
			else
				hm.put(i, 1);
		}
		//printLinkedHashMap(hm);
		//System.out.println("sorted map");
		hm = sortLinkedHashMap(hm);
		// Get a set of the entries
	      Set set = hm.entrySet();
	      // Get an iterator
	      Iterator i = set.iterator();
	      // Display elements
	      while(i.hasNext() && j< arr.length) {
	         Map.Entry me = (Map.Entry)i.next();
	         int count = 1;
	         while (count <= (int)me.getValue()){
	        	 arr[j] = (int) me.getKey();
	        	 j++;
	        	 count++;
	         }
	      }
	      
	      
	}
	
	private static void printLinkedHashMap(LinkedHashMap<Integer,Integer> hm){
		// Get a set of the entries
	      Set set = hm.entrySet();
	      // Get an iterator
	      Iterator i = set.iterator();
	      // Display elements
	      while(i.hasNext()) {
	         Map.Entry me = (Map.Entry)i.next();
	         System.out.print(me.getKey() + ": ");
	         System.out.println(me.getValue());
	      }
	}
	
	private static LinkedHashMap<Integer,Integer> sortLinkedHashMap(LinkedHashMap<Integer,Integer> hm){
		List<Map.Entry<Integer, Integer>> entries =
				  new ArrayList<Map.Entry<Integer, Integer>>(hm.entrySet());
				Collections.sort(entries, new Comparator<Map.Entry<Integer, Integer>>() {
				  public int compare(Map.Entry<Integer, Integer> a, Map.Entry<Integer, Integer> b){
				    return b.getValue().compareTo(a.getValue());
				  }
				});
				LinkedHashMap<Integer, Integer> sortedMap = new LinkedHashMap<Integer, Integer>();
				for (Map.Entry<Integer, Integer> entry : entries) {
				  sortedMap.put(entry.getKey(), entry.getValue());
				}
				//printLinkedHashMap(sortedMap);
				return sortedMap;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,8,9,8,0,1,8,0,9,7};
		System.out.println("Original array");
		printArray(arr);
		
		System.out.println("\nSorted frequency array:");
		sortFrequency(arr);
		printArray(arr); 

	}

	

}
