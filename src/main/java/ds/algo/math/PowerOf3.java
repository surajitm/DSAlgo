package ds.algo.math;

public class PowerOf3 {
	 static boolean powerOf3(int n){
		 if(n==1){
			 return true;
		 }
		while(n>0){ 
			int m=n%3;
			if(m==0){
				n=n/3;
				if(n==1){
					return true;
				}
			}else{
				return false;
			}
		}
		return false;
	}
	 public static void main(String[] args) {
		System.out.println(powerOf3(82));
	}
}
