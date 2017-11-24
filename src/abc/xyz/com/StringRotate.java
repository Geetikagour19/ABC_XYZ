package abc.xyz.com;

public class StringRotate {
static boolean isRotate(String str1, String str2){
	String clock_rot="";
	String anticlock_rot="";
	if(str1.length()!=str2.length())
		return false;
	int len = str2.length();
	clock_rot=clock_rot+ str2.substring(2)+ str2.substring(0,2);
	anticlock_rot=anticlock_rot+ str2.substring(len-2, len) + str2.substring(0,len-2);
	return(str1.equals(clock_rot)||str1.equals(anticlock_rot));
}

public static void main(String args[]){

	String str1 = "geeks";
	String str2 = "eksge";
	System.out.println(isRotate(str1, str2)?"Yes":"No");
}
}