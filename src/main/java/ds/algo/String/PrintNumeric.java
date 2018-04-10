package ds.algo.String;

public class PrintNumeric {
	
	public static String getNumericalString(String str){
		char[] ch=str.toCharArray();
		int len=ch.length;
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<len;i++){
			if(ch[i]>='0' && ch[i]<='9'){
				sb.append(ch[i]);
				//System.out.println(ch[i]);
			}
		}
	    return sb.toString();	
	}
	
	
	public static void main(String[] args) {
      
       System.out.println(getNumericalString("12AS5"));
	}
	
	
}
