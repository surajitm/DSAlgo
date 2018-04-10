package ds.algo.Array;

import java.util.ArrayList;
public class ThreeSum {
	/*
	 * Complexity will be - O(n^2)
	 */
     public void getTriplet(int arr[],int target){
    	 int n=arr.length,l,r,sum;
    	 ArrayList<Integer> nlist=new ArrayList<>();
    	 for(int i=0;i<n;i++){
    		 //i->1st pointer
    		 //l->2nd pointer
    		 //r->3rd pointer
    		  l=i+1;
    		  r=n-1;
    		  while(l<=r){
    	    	sum=arr[i]+arr[l]+arr[r];
    	    	if(target==sum){
    	    		nlist.add(arr[i]);
    	    		nlist.add(arr[l]);
    	    		nlist.add(arr[r]);
    	    		break;
    	    	}else if(sum<target){
    	    		l++;
    	    	}else{
    	    		r--;
    	    	}
    	     }
    	 }
     }
     
     public static void main(String... args){
    	 //System.out.print(null);
    	 
     }
}
