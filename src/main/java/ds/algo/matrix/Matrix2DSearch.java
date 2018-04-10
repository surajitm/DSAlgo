package ds.algo.matrix;
/*
 * Search in a 2-D sorted matrix .
 */
public class Matrix2DSearch {

	
	//BinarySearch technique
	//O(log(n))
	public static boolean isAvail(int[][] M,int target){
		int m=M.length;
		int n=M[0].length;
		
		int start=0;
		int end=(m*n)-1;
		
		while(start<=end){
			int mid=(start)+(end-start)/2;
			int midx=mid/n;
			int midy=mid%n;
			
			if(M[midx][midy]==target){
				return true;
			}else if(M[midx][midy]<target){
				start=mid+1;
			}else{
				end=mid-1;
			}
		}
		
		
		return false;
	}
	public static void main(String[] args) {
		int[][] M={{1,2,3},
				   {4,5,6},
				   {7,8,9}
		};
		System.out.println(isAvail(M, 15));
	}	
	
	
}
