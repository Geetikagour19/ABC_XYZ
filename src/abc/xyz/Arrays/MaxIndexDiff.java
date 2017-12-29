package abc.xyz.Arrays;

public class MaxIndexDiff {

	
	int min(int x, int y){
		return (x<y?x:y);
	}
	int max(int x, int y){
		return (x>y?x:y);
	}
	
	int maxIndexDiff(int arr[], int n){
		int maxdiff;
		
		int i, j;
		int Rmax[]=new int[n];
		int Lmin[]=new int[n];
		Lmin[0]=arr[0];
		for(i=1;i<n;++i){
			Lmin[i]=min(arr[i], Lmin[i-1]);
		}
		Rmax[n-1]=arr[n-1];
		for(j=n-2;j>=0;--j){
			Rmax[j]=max(arr[j],Rmax[j+1]);
		}
		i=0;j=0; maxdiff=-1;
		
		while(j<n && i<n){
			if(Lmin[i]<Rmax[j]){
				maxdiff=max(maxdiff, j-i);
				j=j+1;
			}
			else
				i=i+1;
		}
		return maxdiff;
	}
	public static void main(String[] args) 
    {
		MaxIndexDiff max = new MaxIndexDiff();
        int arr[] = {9, 2, 3, 4, 5, 6, 7, 8, 18, 0};
        int n = arr.length;
        int maxDiff = max.maxIndexDiff(arr, n);
        System.out.println(maxDiff);
    }
}
