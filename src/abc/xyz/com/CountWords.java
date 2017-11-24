package abc.xyz.com;

import java.util.HashMap;
import java.util.Map;

public class CountWords {
	/* count words which appear exactly twice in array */
 static int countWords(String arr[], int size){
	 HashMap<String, Integer> hm = new HashMap<String, Integer>();
	// int count=0;
	 for(int i=0;i<size;i++){
		 if(hm.containsKey(arr[i])){
			 int count = hm.get(arr[i]);
			 hm.put(arr[i], count+1);
		 }
		 else
			 hm.put(arr[i], 1);
	 }
	 int res=0;
	 for(Map.Entry<String, Integer> s : hm.entrySet()){
		if(s.getValue()==2)
			res++;
	 }
	 return res;
 }
	public static void main(String args[])
    {
        String s[] = { "hate", "love", "peace", "love",
                       "peace", "hate", "peace",
                        "peace" };
        int n = s.length;
        System.out.println( countWords(s, n));
    }
}
