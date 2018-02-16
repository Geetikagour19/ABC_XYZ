package abc.xyz.String;

import java.util.Arrays;

public class WidCraedPetternMatching {

	static boolean strmatch(String str, String pettern, int n , int m){
		if(m==0)
			return (n==0);
		boolean[][]lookup=new boolean[n+1][m+1];
		/*for(int i =0;i<n+1;i++)
			Arrays.fill(lookup[i],	false);*/
		lookup[0][0]=true;
		for (int j = 1; j <= m; j++)
            if (pettern.charAt(j - 1) == '*')
                lookup[0][j] = lookup[0][j - 1];
		for(int i =1; i<=n;i++){
			for(int j=1;j<=m;j++){
				if(pettern.charAt(j-1)=='*')
					lookup[i][j]=lookup[i][j-1]||lookup[i-1][j];
				else if(pettern.charAt(j-1)=='?' || str.charAt(i-1)==pettern.charAt(j-1))
					lookup[i][j]=lookup[i-1][j-1];
				else
					lookup[i][j]=false;
			}
		}
		return lookup[n][m];
	}
	
	 public static void main(String args[])
	    {
	        String str = "baaabab";
	        String pattern = "*****ba*****ab";
	        // String pattern = "ba*****ab";
	        // String pattern = "ba*ab";
	        // String pattern = "a*ab";
	        // String pattern = "a*****ab";
	        // String pattern = "*a*****ab";
	        // String pattern = "ba*ab****";
	        // String pattern = "****";
	        // String pattern = "*";
	        // String pattern = "aa?ab";
	        // String pattern = "b*b";
	        // String pattern = "a*a";
	        // String pattern = "baaabab";
	        // String pattern = "?baaabab";
	        // String pattern = "*baaaba*";
	      
	        if (strmatch(str, pattern, str.length(),
	                             pattern.length()))
	            System.out.println("Yes");
	        else
	            System.out.println("No");
	      
	    }
}
