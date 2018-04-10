package ds.algo.String;


public class ReverseAnExpression {

	/*
	 * Input: "15 + 208 * 32 - 86"
	 * Output: "86 - 32 * 208 + 15"
	 * 
	 * 1.First we will reverse all the operands
	 *     -> 51 + 802 * 23 - 68
	 *     -> check if(ch[i]!='+' || ch[i]!='-' || ch[i]!='*' || ch[i]!='/' || ch[i]!=' ')
	 *     
	 * 2.Then reverse the whole expression
	 *     -> 86 - 32 * 208 + 15    
	 */

	
	//Using caching---
	
	static void reverse(char ch[],int i,int j){
		char tmp;
		while(i<j){
			tmp=ch[i];
			ch[i]=ch[j];
			ch[j]=tmp;
			i++;
			j--;
		}
	}
	
	
	static String getReverse(String str){
		int start=0;
		char ch[]=str.toCharArray();
		
		for(int i=0;i<ch.length;i++){
			if(ch[i]==' '){
			    reverse(ch,start,i-1);
			    start=i+1;
			}
		}
		
		reverse(ch,start,ch.length-1);
		reverse(ch,0,ch.length-1);
		
		return String.valueOf(ch);
		
	}
	
	public static void main(String[] args) {
		System.out.println(getReverse("15 + 208 * 32 - 86"));
	}
}
