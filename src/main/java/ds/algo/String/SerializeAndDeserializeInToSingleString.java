package ds.algo.String;

import java.util.ArrayList;

public class SerializeAndDeserializeInToSingleString {

	/*
	 * 1.To serialize input will be ArrayList<String> list and output will be a single  string.
	 *     I)First we traverse every string int list input and add to the StringBuffer with delimeter " "
	 *     II)Return the String
	 * 2.To Deserialize we need i/p the serialized string and o/p will be ArrayList<String> list
	 *     I)We will check for the space
	 *        I)If character != space then add it to a StringBuffer and return StringBufefr.toString() 
	 */
	
	
	/*
	 * Serialized method
	 */
	public static String getSerialize(ArrayList<String> input){
		if(input==null||input.size()==0){
			return "";
		}
		StringBuffer sb=new StringBuffer();
		for(String str:input){
			sb.append(str);
			sb.append(" ");
		}
		return sb.toString();
	}

	public static ArrayList<String> getDeserialize(String str){
		char ch[]=str.toCharArray();
		ArrayList<String> list=new ArrayList<String>();
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<ch.length;i++){
			if(ch[i]!=' '){
				sb.append(ch[i]);
			}else{
				list.add(sb.toString());
				sb.delete(0, sb.length());
			}
		}
		return list;
	}
	
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<>();
		list.add("ab");list.add("abc");list.add("bc");list.add("abcd");
		String ser=getSerialize(list);
		System.out.println(getDeserialize(ser));
		System.out.println(list);
	}
	
}
