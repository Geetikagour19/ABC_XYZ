package abc.xyz.String;

public class LongestPalindromSubStr {

	static int longestPalSubstr(String str){
		int len = str.length();
		int maxLen=0;
		int start=0;
		int low, high;
		
		for(int i =1;i<len;++i){
			low=i-1;
			high=i;
			
			while(low>=0 && high<len && str.charAt(low)==str.charAt(high)){
				if(high-low+1>maxLen){
					start=low;
					maxLen=high-low+1;
				}
				--low;
				++high;
			}
			low=i+1;
			high=i+1;
			
			while(low>=0 && high<len && str.charAt(low)==str.charAt(high)){
				if(high-low+1>maxLen){
					start=low;
					maxLen=high-low+1;
				}
				--low;
				++high;
			}
		}
		System.out.print("Longest palindrome substring is: ");
        printSubStr(str, start, start + maxLen - 1);
 
        return maxLen;
	}
	
	 static void printSubStr(String str, int low, int high) {
	        System.out.println(str.substring(low, high + 1));
	    }
	
	public static void main(String[] args) {
        
        String str = "forgeeksskeegfor";
        System.out.println("Length is: " + 
                           longestPalSubstr(str));
    }
}
