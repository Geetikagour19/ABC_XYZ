package abc.xyz.Stack;

import java.util.Stack;

public class CelebrityProblem {

	 static int MATRIX[][] = { { 0, 0, 0, 1 },
         { 0, 0, 0, 1 },
         { 0, 0, 0, 1}, 
         { 0, 0, 0, 1 } };
	 
	 static boolean knows(int a , int b ){
		return MATRIX[a][b]==1 ? true  : false;
		 
	 }
	 static int findCelebrity(int n){
		 Stack<Integer> s = new Stack<Integer>();
		 int c;
		 for(int i =0 ;i<n; i++)
			 s.push(i);
		 while(s.size()>1){
			 int a = s.pop();
			 int b = s.pop();
			 if(knows(a,b))
				 s.push(b);
			 else
				 s.push(a);
		 }
		 c=s.pop();
		 for(int i =0; i<n;i++){
			 if(i!=c && (knows(c,i)||!knows(i,c)))
				 return -1;
		 }
		 return c;
	 }
	public static void main(String[] args) 
    {
        int n = 4;
        int result = findCelebrity(n);
        if (result == -1) 
        {
            System.out.println("No Celebrity");
        } 
        else
            System.out.println("Celebrity ID " + result);
    }
}

