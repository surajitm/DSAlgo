package ds.algo.math;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

	static boolean isHappyNumber(int n){
		Set<Integer> set=new HashSet<>();
		int r=n;
		while(!set.contains(r)){
			set.add(r);
			r=getSum(r);
			
			if(r==1){
				return true;
			}
		}
		return false;
	}
	
	static int getSum(int no){
		int sum=0;
		while(no>0){
			sum+=(no%10)*(no%10);
			no=no/10;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println(isHappyNumber(19));
	}
}
