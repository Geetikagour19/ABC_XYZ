package abc.xyz.String;

public class RemoveSpace {

	public static void main(String args[]){
		String str = "g  eeks   for ge  eeks  ";
		System.out.println(str);
		System.out.println("After removing space");
		
		str=str.replace(" ", "");
				System.out.println(str);	
	}
}
