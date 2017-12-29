package abc.xyz.Arrays;
/*Given two sorted arrays such the arrays may have some common elements. 
 * Find the sum of the maximum sum path to reach from beginning of any array to
 *  end of any of the two arrays. We can switch from one array to another array
 *   only at common elements.*/
public class MaxSum2Array {
 int max(int x, int y){
	 return (x>y?x:y);
 }
	int maxPathSum(int a1[], int a2[], int m, int n){
		int i=0,j=0;
		int result = 0, sum1=0,sum2=0;
		
		while(i<m && j<n){
			if(a1[i]<a2[j])
				sum1+=a1[i++];
			else if(a1[i]>a2[j])
				sum2+=a2[j++];
			else
			{
				result+=max(sum1, sum2);
				sum1=0;sum2=0;
				
				while(i<m && j<n &&a1[i]==a2[j]){
					result=result+a1[i++];
					j++;
				}
			}
		}
		while(i<m)
			sum1+=a1[i++];
		while(j<n)
			sum2+=a2[j++];
		result+=max(sum1,sum2);
		return result;
	}
	public static void main(String[] args) 
    {
		MaxSum2Array sumpath = new MaxSum2Array();
        int ar1[] = {2, 3, 7, 10, 12, 15, 30, 34};
        int ar2[] = {1, 5, 7, 8, 10, 15, 16, 19};
        int m = ar1.length;
        int n = ar2.length;
        System.out.println("Maximum sum path is :" + 
                                       sumpath.maxPathSum(ar1, ar2, m, n));
    }
}
