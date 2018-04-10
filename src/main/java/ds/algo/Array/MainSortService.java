package ds.algo.Array;

import java.util.Arrays;
/*
 * 1)Implements below sort service
 * 2)Test the complexity
 * SortService->
 *  1.Bubble,Selection,Insertion -> Comparison based sort
 *  2.QuickSort,MergeSort,quick selection sort -> Divide and conquire
 *  3.Linear sort ->count sort,Bucket sort.
 */

abstract class SortService{
	public void swap(int[] arr,int i,int j){
		int tmp;
		tmp=arr[i];
		arr[i]=arr[j];
		arr[j]=tmp;
	}
	public abstract int[] sort(int[] arr);
}

/*
 * MergeSort Application: Java uses merge sort for sorting objects and for primitive data type java uses quick sort.
 * Java doc suggest that we should use a stable sort.
 * On the other hand quick sort is not stable ,if the list is already sorted then it will not stay unchanged.
 * If there is duplicate quick sort may change the order of the element.
 * 
 *  1.Java uses quick sort for primitive data type as it is time efficient.
 *  2.Java uses merge sort for Object sorting.
 *  
 */
class MergeSortService extends SortService{

	@Override
	public int[] sort(int[] arr) {
		
		return null;
	}
	
}

class SelectionSort extends SortService{


	@Override
	public int[] sort(int[] arr) {
		if(arr==null){
			return new int[]{};
		}
		int len=arr.length;
		int min=0;
		for(int i=0;i<len-1;i++){
			min=i;
			for(int j=i+1;j<len;j++){
				if(arr[j]<arr[min]){
					min=j;
				}
			}
			swap(arr,i,min);
		}
		return arr;
	}
}

class InsertionSort extends SortService{

	@Override
	public int[] sort(int[] arr) {
		if(arr==null){
			return new int[]{};
		}
		int n=arr.length;
		int key,j;
		for(int i=1;i<n;i++){
			key=arr[i];
			j=i-1;
			while(j>=0 && arr[j]>key){
				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1]=key;
		}
		return arr;
	}
	
}


class BubbleSortService extends SortService{

	/*
	 * (non-Javadoc)
	 * @see ds.algo.Array.SortService#sort(int[])
	 * I/p: arr[]={2,7,5,10,1}  O/P: arr[]={1,2,5,7,10}
	 * Use nested loop technique.
	 * ASD sort
	 * 1.(2,7)->OK,(7,5)->swap(5,7)->{2,5,7,10,1},(7,10)->OK,(10,1)->swap(10,1)->{2,5,7,1,10}
	 * 2.(2,5)->OK,(5,7)->OK,(7,1)->swap(7,1)->{2,5,1,7,10},(7,10)->OK
	 * 3.(5,1)->swap(5,1)->{2,1,5,7,10}
	 * 4.(2,1)->swap(2,1)->{1,2,5,7,10}
	 * 
	 * Complexity: Best,avg,worst=(n-1)+(n-2)+(n-3)+(n-4)+.....+3+2+1=n*(n+1)/2=O(n^2)
	 * 
	 */

	
	@Override
	public int[] sort(int[] arr) {
		if(arr==null){
			return new int[]{};
		}
      	int n=arr.length;	
		for(int pass=0;pass<n-1;pass++){
			for(int i=1;i<n;i++){
				if(arr[i-1]>arr[i]){
					swap(arr,i,i-1);
				}
			}
		}
		return arr;
	}
	
}
/*
 * In the best case if the array is already sorted.
 */

class ImprovedBubbleSort extends SortService{
	
	@Override
	public int[] sort(int[] arr) {
		if(arr==null){
			return new int[]{};
		}
		boolean swap=true;
		int n=arr.length;
		for(int i=0;i<n-1 && swap;i++){
			swap=false;
			for(int j=1;j<n;j++){
				if(arr[j-1]>arr[j]){
					swap(arr,j-1,j);
					swap=true;
				}
			}
		}
		return arr;
	}
	
}

public class MainSortService {
    public static void main(String[] args) {
    	 SortService bsort=new BubbleSortService();
    	 SortService ibsort=new ImprovedBubbleSort();
    	 SortService ssort=new SelectionSort();
    	 SortService isort=new InsertionSort();
    	 
    	 
    	 int[] arr= bsort.sort(new int[]{2,7,5,10,1});
    	 int[] arr1=ibsort.sort(new int[]{2,7,5,10,1});
    	 int[] arr2=ssort.sort(new int[]{2,7,5,10,1});
    	 int[] arr3=isort.sort(new int[]{2,7,5,10,1});
    	 
    	 System.out.println(Arrays.toString(arr));
    	 System.out.println(Arrays.toString(arr1));
    	 System.out.println(Arrays.toString(arr2));
    	 System.out.println(Arrays.toString(arr3));
    	 
    	
    	}
	}

