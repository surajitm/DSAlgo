package ds.algo.String;
import java.util.*;
public class FindUniqueCharacter {

	public static void main(String args[]){
       List<Character> chars=new ArrayList<>();
       chars.add('A');
       chars.add('Z');
       chars.add('A');
       chars.add('B');
       chars.add('Z');
       chars.add('F');
       System.out.println(chars);
       
       LinkedHashSet<Character> set=new LinkedHashSet<>(chars);
       System.out.println(set);
       
       TreeSet<Character> tree=new TreeSet<>(chars);
       System.out.println(tree);
	}
	
	
	
}
