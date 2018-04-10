package ds.algo.String;

public class ReverseString {

	//Using recursion to reverse the String.
	//Recursion use System stack
	public static String reverse(String str,String tmp){
		int len=str.length();
		if(len==0){
			return tmp;
		}
		return reverse(str.substring(0,len-1), tmp+str.charAt(len-1));
	}
	
	public static void main(String[] args) {
		System.out.println(reverse("surajit",""));
	}
	
}
