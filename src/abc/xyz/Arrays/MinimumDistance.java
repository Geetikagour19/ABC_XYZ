package abc.xyz.Arrays;

public class MinimumDistance {

	
	int minDist(int arr[], int n , int x, int y){
		int i;
		int prev=0;
		int min_dist=Integer.MAX_VALUE;
		for(i=0;i<n;i++){
			if(arr[i]==x || arr[i]==y){
				prev=i;
				break;
			}
		}
		for(;i<n;i++){
			if(arr[i]==x || arr[i]==y){
				if(arr[i]!=arr[prev] && (i-prev < min_dist)){
				min_dist = i-prev;
				prev=i;
				}
				else
					prev=i;
			}
			
		}
		return min_dist;
	}
	public static void main(String[] args) {
        MinimumDistance min = new MinimumDistance();
        int arr[] = {3, 5, 4, 2, 6, 5, 6, 6, 5, 4, 8, 3};
        int n = arr.length;
        int x = 3;
        int y = 6;
 
        System.out.println("Minimum distance between " + x + " and " + y
                + " is " + min.minDist(arr, n, x, y));
    }
}
