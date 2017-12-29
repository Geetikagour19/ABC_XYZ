package abc.xyz.String;

import java.util.Comparator;
import java.util.PriorityQueue;

/*Minimum sum of squares of character counts in a given string after removing k characters*/
public class MinSumSquare {
	static final int MAX_CHAR = 26;
	
	static class IntCompare implements Comparator<Integer>{
		 @Override
		public int compare(Integer a1, Integer a2){
			if(a1>a2)
				return -1;
			else if(a2>a1)
				return 1;
			else
				return 0;
		}
	}
	static int minStringValue(String str, int k){
		int l = str.length();
		if(k>=l)
			return 0;
		int freq[]=new int[MAX_CHAR];
		
		for(int i =0;i<l;i++)
			freq[str.charAt(i)-'a']++;
		
		Comparator<Integer> c = new IntCompare();
		
		//PriorityQueue<Integer> q = new PriorityQueue<>(c);
		PriorityQueue<Integer> q = new PriorityQueue<>();
		for(int i =0;i<MAX_CHAR;i++){
			if(freq[i]!=0)
				q.add(freq[i]);
		}
		
		while(k!=0){
			int temp=q.peek();
			q.poll();
			temp = temp-1;
			q.add(temp);
			k--;
		}
		int res = 0;
		while(!q.isEmpty()){
			int temp=q.peek();
			res+=temp*temp;
			q.poll();
			
		}
		return res;
	}
	
	public static void main(String args[])
    {
        String str = "abbccc";   // Input 1
        int k = 2;
        System.out.println(minStringValue(str, k));
      
        str = "aaab";           // Input 2
        k = 2;
        System.out.println(minStringValue(str, k));
    }
}
