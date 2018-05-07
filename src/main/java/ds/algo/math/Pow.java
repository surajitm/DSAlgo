package ds.algo.math;

public class Pow {

	//O(n) complexity
	static int pow(int x,int n){
		int c=1;
		for(int i=0;i<n;i++){
			c=c*x;
		}
		return c;
	}
	
	//O(logn)
	//
	static int pow1(int x,int n){
		int tmp;
		if(n==0){
			return 1;
		}
		tmp=pow(x,n/2);
		return (n%2==0)?(tmp*tmp):(x*tmp*tmp);
	}
	
	//O(logn)
	//more readable way-
	//pow(2,5)=>2*pow(4,2)=>2*pow(16,1)=>2*16*pow(16*16,0)=>2*16*1=>32
	//2^5=2.2^4=2*16
	static int pow2(int x,int n){
		if(n==0){
			return 1;
		}
		if(n%2==0){
			return pow2(x*x, n/2);
		}else{
			return x*pow2(x*x, (n-1)/2);
		}
	}
	
	public static void main(String[] args) {
		System.out.println(pow(2,3));
		System.out.println(pow1(2, 5));
	}
	
}
