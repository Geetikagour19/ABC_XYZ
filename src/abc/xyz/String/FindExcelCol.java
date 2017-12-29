package abc.xyz.String;

public class FindExcelCol {

	
	public static void main (String[] args) {
		int n = 676;
		String ans = "";
		while(n>0){
    		int x = n%26;
    		
    		if(x==0){
    		    ans+=(String.valueOf((char)(96+26)));
    		    n=(n/26)-1;
    		} else {
    		    n=(n/26);
    		    ans+=(String.valueOf((char)(96+x)));
    		}
		}
		System.out.println(new StringBuilder(ans).reverse().toString()); // actual answer is reverse of 'ans'
	}
}
