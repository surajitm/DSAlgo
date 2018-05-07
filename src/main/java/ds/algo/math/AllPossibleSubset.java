package ds.algo.math;

import java.util.ArrayList;

public class AllPossibleSubset {

	//Getting all possible subset of 
	static ArrayList<ArrayList<Integer>> getSubSets(int[] s){
		ArrayList<ArrayList<Integer>> prevResult=new ArrayList<>();
		
		for(int i=0;i<s.length;i++){
			ArrayList<ArrayList<Integer>> tmp=new ArrayList<>();
			//Add previous result in tmp
			System.out.println(prevResult);
			for(ArrayList<Integer> a:prevResult){
				//System.out.println(a);
				tmp.add(new ArrayList<Integer>(a));
			}
			//create new set
			for(ArrayList<Integer> a:tmp){
				//System.out.println(a);
			   a.add(s[i]);
			}
			//creating single set
			ArrayList<Integer> single=new ArrayList<>();
			single.add(s[i]);
			tmp.add(single);
			
			//Now put all new set into main set
			prevResult.addAll(tmp);
		}
		return prevResult;
	}
	
	public static void main(String[] args) {
		System.out.println(getSubSets(new int[]{1,2,3}));
	}
	
}
