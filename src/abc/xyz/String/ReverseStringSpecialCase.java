package abc.xyz.String;

public class ReverseStringSpecialCase {

	static String string = "Ab,c,de!$";
	static char[] chars = string.toCharArray();
	static StringBuilder reversed = new StringBuilder();
	private static boolean isAlphabetic(char ch) {
		return (ch > 64 && ch < 91) || (ch > 96 && ch < 123);
		}
	public static void main(String args[]){
		
		
			for (int i = 0; i < string.length(); i++) {
			if (isAlphabetic(string.charAt(i))) {
			reversed.append(string.charAt(i));
			}
			}
			reversed.reverse();
			for (int i = 0; i < chars.length; i++) {
			if (isAlphabetic(string.charAt(i))) {
			chars[i] = reversed.charAt(0);
			reversed.deleteCharAt(0);
			}
			}
			System.out.println("chars = " + String.valueOf(chars));
			}
		
	
}
