package abc.xyz.com;

public class CountTriplets {

	static int countTriplets(int a[], int sum){
		int n = a.length;
		int ans=0;
		for(int i=0; i <n-2;i++){
			for(int j=i+1; j<n-1;j++){
				for(int k =j+1;k<n;k++)
					if(a[k]+a[j]+a[i]<sum)
						ans++;
				
			}
		}
		return ans;
	}
	public static void main(String[] args) 
    {
		int arr[] = new int[]{5, 1, 3, 4, 7};
        int sum = 12; 
        System.out.println(countTriplets(arr, sum));
    }
}
