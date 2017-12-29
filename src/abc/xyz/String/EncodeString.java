package abc.xyz.String;

public class EncodeString {

	static String encode_str(String str){
		int n = str.length();
		int i, count;
		String encode="";
		for(i=0;i<n;i++){
			encode=encode+str.charAt(i);
			count=1;
		while(i+1<n && str.charAt(i)==str.charAt(i+1)){
			count++;
			i++;
		}
		encode=encode+String.valueOf(count);
		}
		return encode;
	}
	public static void main (String[] args)
	{
	    String str = "aabcccdee";
	    
		System.out.println( encode_str(str) );
	}
}
