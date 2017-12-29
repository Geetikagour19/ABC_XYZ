package abc.xyz.String;

public class CheckString0between1 {

	static boolean checkString(String s){
		int len = s.length();
		
		int first =0;
		for(int i =0;i<len;i++){
			if(s.charAt(i)=='1'){
				first=i;
				break;
				
			}
		}
		int last =0;
		for(int i=len-1;i>=0;i--){
			if(s.charAt(i)=='1'){
				last =i;
				break;
			}	
		}
		for(int i = first;i<=last;i++){
			if(s.charAt(i)=='0')
				return false;
		}
		return true;
	}
	
	public static void main(String args[]) 
	 {
         String s = "00011111111100000";
         System.out.println(checkString(s)? "VALID" : "NOT VALID");
    }
}
