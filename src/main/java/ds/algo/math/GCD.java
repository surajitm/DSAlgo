package ds.algo.math;
/*
 * GCD(x,y)=GCD(x,y%x) if(y==0){return x;}
 */
public class GCD {

	//From Euclidian's rule
	static int getGCD1(int x,int y){
		if(y==0){
			return x;
		}
		return getGCD1(y, x%y); 
	}
	
	
	//We can do it in alternative way
	//Time complexity- O(log(min(x,y)))
	static int getGCD2(int x,int y){
		if(x==0){
			return y;
		}
		return getGCD2(y%x, x); 
	}
	
	/*
	 * Do GCD of more than two element:--
	 * complexity-O(n)
	 */
	static int mulGCD(int[] arr){
		int result=0;
		for(int i=0;i<arr.length;i++){
			result=getGCD1(arr[i], result);
		}
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println(getGCD2(12, 6));
		System.out.println(mulGCD(new int[]{10,5,5}));
	}
}
