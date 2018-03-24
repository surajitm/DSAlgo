package ds.algo.Array;

import java.util.Arrays;

public class TwoSum {
	//BruteForce - O(n^2)
	public static void getIndexOf2Sum(final int A[],int target){
		int len=A.length-1;
		for(int i=0;i<len-1;i++){
			for(int j=1;j<len;j++){
				if((A[i]+A[j])==target){
					System.out.println("Index 1:"+i+","+"Index 2:"+j);
					
				}
				
			}
		}
	}
	
	//complexity -
	public static void getIndexOf2Sum1(int A[],int target){
		int low=0;
		int high=A.length-1;
		int sum;
		if(A==null || A.length==0){
			return;
		}else{
		  Arrays.sort(A);
		}
		while(low<high){
			sum=A[low]+A[high];
			if(sum==target){
				System.out.println("Pair found");
				System.out.println("Index1:"+low+",Index:"+high);
				return;
			}else if(sum<target){
				low++;
			}else{
				high--;
			}
		}
	}
	
	public static void main(String[] args) {
		int A[]={2,7,4,5,3,8};
		getIndexOf2Sum(A, 9);
	}
	
}
