package abc.xyz.Arrays;

public class FindLeaderInArray {

	void printLeaders(int arr[], int n){
		int max_from_right = arr[n-1];
		System.out.println(max_from_right+" ");
		for(int i =n-2;i>0;i--){
			if(max_from_right<arr[i]){
				max_from_right=arr[i];
				System.out.println(max_from_right+" ");
			}
		}
	}
	public static void main(String[] args) 
    {
		FindLeaderInArray lead = new FindLeaderInArray();
        int arr[] = new int[]{16, 17, 4, 3, 5, 2};
        int n = arr.length;
        lead.printLeaders(arr, n);
    }
}
