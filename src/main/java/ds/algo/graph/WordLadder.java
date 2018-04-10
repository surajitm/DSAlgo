package ds.algo.graph;

import java.util.ArrayDeque;
import java.util.ArrayList;

/*
 * Given two words (start and end), and a dictionary, find the length of shortest transformation sequence from 
 * start to end, such that only one letter can be changed at a time and each 
 * intermediate word must exist in the dictionary. For example, given:
 * 
 * start = "hit"
   end = "cog"
   dict = ["hot","dot","dog","lot","log"]
 */



public class WordLadder {

	public static int getLengthChain(String startWord,String endWord,ArrayList<String> dict){
		
		ArrayDeque<WordNode> q=new ArrayDeque<>();
		WordNode beginWord=new WordNode(startWord, 1);
		q.add(beginWord);
		dict.add(endWord);
		//Apply BFS
		while(!q.isEmpty()){
			WordNode top=q.remove();
			String word=top.getWord();
			System.out.print(word+"->"); 
			if(word.equals(endWord)){
				return top.getStep();
			}
			char[] ch=word.toCharArray();
			char temp;
			for(int i=0;i<ch.length;i++){
				for(char j='a';j<='z';j++){
					temp=ch[i];
					if(ch[i]!=j){
						ch[i]=j;
					}
					String newWord=String.valueOf(ch);
					if(dict.contains(newWord)){
						q.add(new WordNode(newWord,top.getStep()+1));
						dict.remove(newWord);
					}
					ch[i]=temp;
				}
			}
		}
		
	       	return 0;
	}
	
	public static void main(String[] args) {
		ArrayList<String> dict=new ArrayList<String>();
		dict.add("hot");
		dict.add("dot");
		dict.add("dog");
		dict.add("lot");
		dict.add("log");
		int d=getLengthChain("hit", "cog", dict);
		System.out.println("\n"+d);
	}
}

//Create a class word node
class WordNode{
	private String word;
	private int step;
	
	public String getWord() {
		return word;
	}

	public int getStep() {
		return step;
	}

	public WordNode(String word,int step) {
		this.word=word;
		this.step=step;
	}
}
