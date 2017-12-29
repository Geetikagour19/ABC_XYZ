package abc.xyz.Arrays;

public class FIndMissingNumber {

	static int getMissingNo(int a[], int n){
		int x1=a[0];
		int x2=1;
		int i;
		for(i =1;i<n;i++)
			x1=x1^a[i];
		for(i=2;i<=n+1;i++)
			x2=x2^i;
		return x1^x2;
	}
	 public static void main(String args[])
	    {
	        int a[] = {1,2,4,5,6};
	        int miss = getMissingNo(a,5);
	        System.out.println(miss);
	    }
}
