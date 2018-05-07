package ds.algo.math;

import java.util.ArrayList;

public class PrintAllPrimeLessThanNumber {

	//iterative
	//Use flag technique
	static int printPrime(int n){
		n=n-1;
		ArrayList<Integer> primes=new ArrayList<>();
		if(n<=1){
			return 0;
		}else if(n==2){
			return 1;
		}else if(n==3){
			return 2;
		}
		primes.add(2);
		primes.add(3);
		for(int i=4;i<=n;i++){
			boolean isPrime=true;
			for(int p:primes){
				if(i%p==0){
					isPrime=false;
					break;
				}
			}
			if(isPrime){
				System.out.println(i);
				primes.add(i);
			}
		}
		System.out.println(primes);
		return primes.size();
	}
	
	//Using sieve of eratosthes
	//O(nloglog(n))
	static int countPrime(int n){
		if(n<=1){
			return 0;
		}
		//create a boolean array to track of prime number
		boolean prime[]=new boolean[n+1];
		int count=0;
		//initiate the array by making all the index true
		for(int i=2;i<n;i++){
			prime[i]=true;
		}
		//
		for(int i=2;i<Math.sqrt(n);i++){
			if(prime[i]){
				for(int j=2*i;j<n;j+=i){
					prime[j]=false;
				}				
			}
		}
		for(int i=2;i<prime.length;i++){
			if(prime[i]){
				count++;
			}
		}
		return count;
	}
	
	
	public static void main(String[] args) {
		System.out.println(printPrime(100));
		//System.out.println(countPrime(5));
	}
	
	
}
