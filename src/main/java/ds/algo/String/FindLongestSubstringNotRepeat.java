package ds.algo.String;

public class FindLongestSubstringNotRepeat {

	public static String getLogestSubstring(String input){
		/*
		//set two pointer startIndex,endIndex
		//Traverse the String character by character.
		//Check for duplicacy
		     //If duplicacy found then update the endIndex with (i+1) as substring() exclusive.
		    //Get the substring by str.substring(start,end)
		   //update start=end+1;end=start;
		      //If end is not update because till the string length we did'nt find any other duplicacy. 
		       * Out side the loop we will just str.substring(start,str.length());
      */
      	int start=0,end=0;
      	String str="",maxString="";
      	int maxLen=Integer.MIN_VALUE;
      	
      	char ch[]=input.toCharArray();
      	for(int i=1;i<ch.length;i++){
      		//System.out.println(start+","+end);
      		if(ch[i]==ch[i-1]){
      			end=i;
      		    str=input.substring(start,end);
      		    start=end;
      		}
      		if(str.length()>maxLen){
      			maxLen=str.length();
      			maxString=str;
      		}
      	}
      
      str=input.substring(start);
       //System.out.println(str);
      
  		if(str.length()>maxLen){
  			maxLen=str.length();
  			maxString=str;
  		}
		return maxString;
	}
	
	public static void main(String[] args) {
		System.out.println(getLogestSubstring("abccdefgghijkl"));
	}
	
	
	
}
