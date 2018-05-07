package ds.algo.String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * list={abc,kbb,cba,bkb}
 * o/p={abc,cba},{kbb,bkb}
 */


public class AnagramGroup {

	boolean isAnagram(String str1,String str2){
		if(str1.length()!=str2.length()){
			return false;
		}
		char ch1[]=str1.toCharArray();
		char ch2[]=str2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		if(String.valueOf(ch1).equals(String.valueOf(ch2))){
			return true;
		}
		return false;
	}
	
	public List<List<String>> groupAnagrams(List<String> strs) {
	    List<List<String>> result = new ArrayList<List<String>>();
	 
	    HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
	    for(String str: strs){
	        char[] arr = new char[26];
	        for(int i=0; i<str.length(); i++){
	            arr[str.charAt(i)-'a']++;
	        }
	        String ns = new String(arr);
	        if(map.containsKey(ns)){
	            map.get(ns).add(str);
	        }else{
	            ArrayList<String> al = new ArrayList<String>();
	            al.add(str);
	            map.put(ns, al);
	        }
	    }
	   System.out.println(map);
	    result.addAll(map.values());
	 
	    return result;
	}
	
	
	public static void main(String[] args) {
		AnagramGroup ana=new AnagramGroup();
		List<String> list=new ArrayList<>();
		list.add("eat");list.add("tea");list.add("tan");list.add("eat");list.add("ate");list.add("nat");list.add("bat");
		 ;
		 System.out.println(ana.groupAnagrams(list));
	
}
}
