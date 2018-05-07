package ds.algo.math;

public class PowerOfFour {

	static boolean isPowerOfFour(int n){
		while(n>0){
			if(n==0){
				return true;
			}
			if(n%4==0){
				return true;
			}else{
				n=n/4;
			}
		}
		return false;
	}
	
	//We can do some log operation.
	
	public static void main(String[] args) {
		System.out.println(isPowerOfFour(16));
	}
	
}
