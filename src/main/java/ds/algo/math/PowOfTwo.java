package ds.algo.math;

public class PowOfTwo {

	//Main idea is if the value 
	//if a number is pow
	static boolean isPowerOfTwo(int n){
		int r,l;
		while(n<=2){
			r=n>>2;
		    l=n<<2;
		    if(r!=l){
		    	return false;
		    }
			n=n>>2;
		}
		return true;
	}
	//If it is power of two then n&(n-1)==0
	static boolean isPowerOfTwo1(int n){
		return ((n>0) && (n&n-1)==0)?true:false;
	}
	
	//Use log= (n)=>2^(logn)/(log2)
	static boolean isPowerOfTwo2(int n){
		return (n>0) && n==Math.pow(2, (Math.round(Math.log(n)/Math.log(2))));
	}
	
	
	public static void main(String[] args) {
		System.out.println(isPowerOfTwo(8));
		System.out.println(isPowerOfTwo1(8));
		System.out.println(isPowerOfTwo2(8));
	}
}
