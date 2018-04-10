package ds.algo.String;

import java.util.ArrayList;

/*
 * Best technique to get all the substring from a stream of character.
 * Use String Buffer or Builder.
 */


public class SplitString {
	public static ArrayList<String> split(String str,char ch){
		char chr[]=str.toCharArray();
		StringBuffer sb=new StringBuffer();
		ArrayList<String> list=new ArrayList<String>();

		for(int i=0;i<chr.length;i++){
			if(chr[i]!=ch){
				sb.append(chr[i]);
			}else{
				list.add(sb.toString());
				sb.delete(0, sb.length());
			}
		}
		
		list.add(sb.toString());
		sb.delete(0, sb.length());
		return list;
	}
	
	public static void main(String[] args) {
		System.out.println(split("ab bnbnb klklk",' '));
	}
	
}
