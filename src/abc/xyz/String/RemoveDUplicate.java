package abc.xyz.String;

import java.util.LinkedHashSet;

public class RemoveDUplicate {

	
	void removeDuplicates(String str){
		LinkedHashSet<Character> s = new LinkedHashSet<Character>();
		for(int i =0;i<str.length();i++)
			s.add(str.charAt(i));
		for(Character ch : s)
			System.out.print(ch);
	}
	 public static void main(String args[])
	    {
	        String str = "geeksforgeeks";
	        RemoveDUplicate r = new RemoveDUplicate();
	        System.out.print(str);
	        System.out.print("\n");
	        r.removeDuplicates(str);
	    }
}
