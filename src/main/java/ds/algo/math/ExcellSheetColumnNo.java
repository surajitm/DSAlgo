package ds.algo.math;

import java.util.HashMap;
import java.util.Map;

/*
 * Excell sheet has column number like below--
 *  A -> 1
    B -> 2
    C -> 3
    ...
    Z -> 26
    AA -> 27
    AB -> 28 
    ...
    AAA -> 703 
 */
public class ExcellSheetColumnNo {

	static int getExcellSheetNo(String s){
		Map<Character,Integer> map=new HashMap<>();
		char ch='A';
		//Creating dictionary
		for(int i=1;i<=26;i++){
			map.put(ch, i);
			ch++;
		}
		
		//Decoding the column number
		int i=s.length()-1;
		int result=0;
		int t=0;
		while(i>=0){
			char ch1=s.charAt(i);
			result=result+ (int)Math.pow(26, t) * map.get(ch1);
			t++;
			i--;
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println(getExcellSheetNo("AAAB"));
	}
	
}
