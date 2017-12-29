package abc.xyz.String;

import java.util.HashMap;
import java.util.Map;

public class CountWord_Occurence2 {

	static int countWords(String str[], int n){
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		for(int i =0; i<n;i++){
			if(hm.containsKey(str[i])){
				int val = hm.get(str[i]);
				hm.put(str[i], val+1);
			}
			else
				hm.put(str[i], 1);
		}
		
		int res = 0;
		for(Map.Entry<String, Integer> it : hm.entrySet()){
			if(it.getValue()==2)
				res++;
		}
		return res;
	}
	
	 public static void main(String args[])
	    {
	        String s[] = { "hate", "love", "peace", "love",
	                       "peace", "hate", "love", "peace",
	                       "love", "peace" };
	        int n = s.length;
	        System.out.println( "Word which ocurred twice :" +countWords(s, n));
	    }
}
