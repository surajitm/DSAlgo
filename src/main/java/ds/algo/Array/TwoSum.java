package ds.algo.Array;

import java.util.ArrayList;
import java.util.Arrays;

public class TwoSum {

	public static ArrayList<Integer>  getPairSum(int[] arr,int target){
		//Use #BruteForce
		//Complexity-O(n^2)
        ArrayList<Integer> nlist=new ArrayList<>();
		int len=arr.length;
		for(int i=0;i<len;i++){
			for(int j=i+1;j<len;j++){
				if(arr[i]+arr[j]==target){
					nlist.add(arr[i]);
					nlist.add(arr[j]);
					break;
				}
			}
		}
		return nlist;
	}
 //Let's reduce the complexity
 //Complexity - O(logn)	
	public static ArrayList<Integer> getPairSumImp(int[] arr,int target){
		ArrayList<Integer> nlist=new ArrayList<>();
		int len=arr.length;
		int l=0;
		int r=len-1;
		//Sort the array->applying binary search
		Arrays.sort(arr);
		while(l<=r){
			int sum=arr[l]+arr[r];
			if(sum==target){
				nlist.add(arr[l]);
				nlist.add(arr[r]);
				break;
			}else if(sum<target){
				l++;
			}else{
				r--;
			}
		}
		return nlist;
	}
	
	
	
	public static void main(String[] args) {
		System.out.println(getPairSum(new int[]{1, 4, 45, 6, 10, -8},16));
		System.out.println(getPairSumImp(new int[]{1, 4, 45, 6, 10, -8},16));
		
	}
	
	
}
