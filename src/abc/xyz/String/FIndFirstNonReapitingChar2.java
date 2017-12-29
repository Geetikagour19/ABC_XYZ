package abc.xyz.String;

import java.util.ArrayList;
import java.util.List;

public class FIndFirstNonReapitingChar2 {
	final static int MAX_CHAR = 256;
	static void findFirstNonRepeating(){
		List<Character> list = new ArrayList<Character>();
		
		boolean[] repeated = new boolean[MAX_CHAR];
		 String stream = "geeksforgeeksandgeeksquizfor";
	        for (int i=0;i < stream.length();i++){
	        	char x = stream.charAt(i);
	            System.out.println("Reading "+ x +" from stream ");
	            
	            if(!repeated[x]){
	            	if(!list.contains(x)){
	            		list.add(x);
	            		
	            	}else{
	            		list.remove((Object)x);
	            		repeated[x]=true;
	            	}
	            }
	            if(list.size() != 0)
	            {
	                System.out.print("First non-repeating character so far is ");
	                System.out.println(list.get(0));
	            }
	        }
	}
	 public static void main(String[] args) 
	    {
	        findFirstNonRepeating();
	    }
}
