package abc.xyz.String;

public class CountSubStrStrEndWith1 {

	int countSubStr(char s[], int n){
		int res=0;
		for(int i =0;i<n;i++){
			if(s[i]=='1')
				res++;
		}
		return res*(res-1)/2;
	}
	
	public static void main(String[] args) 
    {
		CountSubStrStrEndWith1 count = new CountSubStrStrEndWith1();
        String string = "00100101";
        char str[] = string.toCharArray();
        int n = str.length;
        System.out.println(count.countSubStr(str, n));
    }
}
