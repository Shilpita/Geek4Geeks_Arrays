package ArrayQuestions;
/******************************************************************************************************
 * Author : Shilpita Roy
 * Date   : Sept25,2016
 * Problem: Given a binary string, find if it is possible to make all its digits equal (either all 0’s or all 1’s) by 
 * 			flipping exactly one bit.
 *          GeekForGeeks
 *          
 * The time complexity for the best method is O(N). 
 * *****************************************************************************************************/

public class ChangeToAllSame1Step {

	public ChangeToAllSame1Step() {}
	/***
	 * @param args=String
	 * Count sum of 1 and 0 in the string. If sum ==1 for either then 'Yes' else 'No'.
	***/
	public boolean can1Flip(String str) {
		int sum1 =0 ; int sum0 =0;
		//System.out.println("\t" +str +":\t");
		for(int i =0 ; i<str.length(); i++)
				if(str.charAt(i) == '0')
					sum0++;
				else
					sum1++;
			
		return (sum1==1 || sum0==1);
	}
	
//	public static void main(String[] args) {
//
//		System.out.println("The String '1011' can be fliped in one step : "+ can1Flip("1011"));
//
//	}

	

}
