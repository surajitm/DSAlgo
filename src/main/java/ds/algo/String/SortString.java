package ds.algo.String;

import java.util.Arrays;

public class SortString {

	//We can use Arrays.sort()
	public static String sort(String str){
		char[] ch=str.toCharArray();
		Arrays.sort(ch);
		return String.valueOf(ch);
	}
	
	
	public static void main(String[] args) {
		System.out.println(sort("surajit"));
	}
	
}
