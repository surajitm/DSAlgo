package ds.algo.Array;

import java.util.ArrayList;

/*
 * Input: arr[] = {1, 4, 20, 3, 10, 5}, sum = 33
Ouptut: Sum found between indexes 2 and 4

Input: arr[] = {1, 4, 0, 0, 3, 10, 5}, sum = 7
Ouptut: Sum found between indexes 1 and 4

Input: arr[] = {1, 4}, sum = 0
Output: No subarray found
 */


public class SubArraySum {

	//#Find all the subarray sum and check if it is matching with with the target sum.
	//#If the currentSum>targetSum then we don't need to check for any other subarray of 
	//that particular order.
	//# O(n^2) complexity for nested loop->O(n*n)->O(n^2)
	
	public static ArrayList<Integer> getSubarrySum(int[] arr,int tsum){
		int n=arr.length;
		int csum;
		ArrayList<Integer> nlist=new ArrayList<>();
		boolean isExist = false;
		for(int i=0;i<n && !isExist;i++){
			csum=arr[i];
			nlist.clear();
			nlist.add(csum);
			for(int j=i+1;j<n ;j++){
				csum=csum+arr[j];
				nlist.add(arr[j]);
				if(csum==tsum){
					isExist=true;
					break;
				}
				if(csum>tsum){
					break;
				}
			}
			
		}
		
		return nlist;
	}
	
	/*
	 * Now reduce the fucking complexity..
	 * Using two pointer
	 * 1.start=0,cur=1,list
	 * 2.loop(1..n){
	 *    if(i<n){
	 *    csum+=arr[i];
	 *    list.add(arr[i]);
	 *    }
	 *    //Removing trailing elements
	 *    while(csum>sum && start<i-1){
	 *      csum=csum-arr[start];
	 *      list.remove(arr[start]);
	 *      start++;
	 *    }
	 *    if(csum==sum){
	 *       print(start,i-1);
	 *    }
	 *    
	 * }
	 */
	static ArrayList<Integer> getSubarraySumImp(int[] arr,int tsum){
		//initialize the pointers
		int start=0,n=arr.length,csum=arr[0];
		ArrayList<Integer> list=new ArrayList<>();
		list.add(csum);
		for(int i=1;i<n;i++){
			
			while(csum>tsum && start<i-1){
				csum=csum-arr[start];
				start++;
			}
			
			if(csum==tsum){
				//System.out.println(list);
				break;
			}
			
			if(i<n){
				csum+=arr[i];
				list.add(arr[i]);
			}
			
			
		}
		return list;
		
	}
	
	public static void main(String[] args) {
		System.out.println(getSubarrySum(new int[]{1, 4, 20, 3, 10, 5}, 33));
		System.out.println(getSubarraySumImp(new int[]{1, 4, 20, 3, 10, 5}, 33));
	}
}
