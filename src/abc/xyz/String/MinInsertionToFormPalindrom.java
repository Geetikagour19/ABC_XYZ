package abc.xyz.String;

public class MinInsertionToFormPalindrom {

	static int findMinInsertionsDP(char str[], int n){
		int l, h, i;
		int table[][]=new int[n][n];
		
		for(i=1;i<n;++i){
			for(l=0,h=i;h<n;++l,++h){
				table[l][h]=(str[l]==str[h]?table[l+1][h+1]: min(table[l][h-1],table[l+1][h])+1);
			}
		}
		return table[0][n-1];
	}
	
	static int min(int x, int y){
		return (x<y?x:y);
	}
	 public static void main(String args[])
	    {
	        String str = "geeks";
	        System.out.println(
	        findMinInsertionsDP(str.toCharArray(), str.length()));
	    }
}
