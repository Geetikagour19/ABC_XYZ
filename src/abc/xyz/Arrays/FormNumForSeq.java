package abc.xyz.Arrays;

import java.util.Stack;

public class FormNumForSeq {

	public static void PrintMinNumberForPattern(String str){
		String result="";
		Stack<Integer> s = new Stack<Integer>();
		
		for(int i = 0; i<=str.length();i++){
			s.push(i+1);
			if(i==str.length() || str.charAt(i)=='I'){
				while(!s.isEmpty()){
					result+=(s.peek()).toString();
					result+=" ";
					s.pop();
				}
			}
		}
		System.out.println(result);
	}
	public static void main(String args[]){
		PrintMinNumberForPattern("IDID");
	    PrintMinNumberForPattern("I");
	    PrintMinNumberForPattern("DD");
	    PrintMinNumberForPattern("II");
	    PrintMinNumberForPattern("DIDI");
	    PrintMinNumberForPattern("IIDDD");
	    PrintMinNumberForPattern("DDIDDIID");
	}
}
