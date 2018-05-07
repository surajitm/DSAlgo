package ds.algo.math;


public class FindAllFactor {

	//Every composite number has at least one prime factor less than or equal to square root of itself.

	static void getPrimeFactor(int n){
		if(n%2==0){
			System.out.println(2);
			n=n/2;
		}
		
		for(int i=3;i<=Math.sqrt(n) ;i++){
        
			while(n%i==0){
				System.out.println(i);
				n=n/i;
			}

		}
		if(n>2){
			System.out.println(n);
		}
		
	}
	
   public static void main(String[] args) {
	   getPrimeFactor(5000);
	  
   }	
	
}
