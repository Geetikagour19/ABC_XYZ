package abc.xyz.String;

public class CheckPanagram {

	static int mark[]=new int[26];
	
	 static boolean checkPanagram(String str){
		for(int i =0;i<str.length();i++){
			int index=str.charAt(i)-'a';
			mark[index]=1;
		}
		for (int i=0; i<=25; i++)
	        if (mark[i] == 0)
	            return (false);
	 
	    // If all characters were present
	    return (true);
	}
	public static void main(String ares[]){
		String str = "the quick brown fox jumps over the lazy dog";
		
		str=str.replace(" ","");
		str=str.toLowerCase();
		System.out.println(str);
		
		for(int i =0;i<26;i++)
			mark[i]=0;
		
		if(checkPanagram(str)){
			System.out.println("String is Panagram");
			
		}
		else
			System.out.print("No");
	}
}
