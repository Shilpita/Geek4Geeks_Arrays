import java.util.*;

public class bitmnipultion {

	public static void main(String[] args) {
		/*
		int n = new Scanner(System.in).nextInt();
		String str = String.format("%32s", Integer.toBinaryString(n)).replace(" ", "0")	;
		
		System.out.println(str);
		int j = 0;
		j = j+(n&1);
		System.out.println(n&1);
		n = n>>>1;
		str = String.format("%32s", Integer.toBinaryString(n)).replace(" ", "0")	;
		System.out.println(n&1);
		System.out.println(str+"\n"+j);
		

		
	    char[] map = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
	    int num =123;
	        String result = "";
	        while(num != 0){
	        	String str1 = String.format("%32s", Integer.toBinaryString(num)).replace(" ", "0")	;
	        	String str2 = String.format("%32s", Integer.toBinaryString(15)).replace(" ", "0")	;
	        	String str3 = String.format("%32s", Integer.toBinaryString(num&15)).replace(" ", "0")	;
	        	System.out.println(str1+" \n"+str2+" \n"+str3);
	            result = map[(num & 15)] + result; 
	            num = (num >>> 4);
	            System.out.println("\n");
	        }
	
	        System.out.println(Arrays.toString(
	        	    "Thequickbrownfoxjumps".split("(?<=\\G.{4})")));
	    */    
		int ones = ~0;
		int i = (1<<3) -1;
		String s = String.format("%8s", Integer.toBinaryString(ones)); //.replace(" ", "0")	;
		System.out.println(ones+"   "+s+ s.length());
	}

}
