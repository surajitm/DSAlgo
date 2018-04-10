package ds.algo.String;

public class FirstNCharacter {

	public static String  getFirstNCharacter(String str,int N){
		//Take a character array
		//traverse till n
		   //while traversing add it into Stringbuilder
		
		char[] ch=str.toCharArray();
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<N;i++){
			sb.append(ch[i]);
		}
		return sb.toString();
	}
	
	
	public static String getLastNCharacter(String str,int N){
		//start=str.length()-N
		   //str.substring(start,str.length())
		int start=str.length()-N;
		return str.substring(start);
	}
	
	
	public static void main(String[] args) {
		System.out.println(getFirstNCharacter("surajit", 4));
		System.out.println(getLastNCharacter("surajit", 4));
	}
	
}
