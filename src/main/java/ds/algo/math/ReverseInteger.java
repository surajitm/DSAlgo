package ds.algo.math;

public class ReverseInteger {
	static int reverse(int n){
	    int sum=0,a=0;	
	    while(n>0){
	    	a=n%10;
	    	sum=sum*10+a;
	    	n=n/10;
	    }
	   return sum; 
	}
	
	static boolean isPalindrome(int n){
		int pal=reverse(n);
		return (pal==n)?true:false;
	}
	
	
   public static void main(String[] args) {
	System.out.println(reverse(765675765)); 
	System.out.println(isPalindrome(123321));
   }	
	
}
