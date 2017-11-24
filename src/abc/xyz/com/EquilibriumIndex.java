package abc.xyz.com;

public class EquilibriumIndex {

	int  equilibrium(int arr[], int n){
		int sum = 0;
		int leftSum = 0;
		for(int i=0;i<n;++i)
			sum += arr[i];
		for(int i=0;i<n;++i){
			sum -=arr[i];
			if(leftSum==sum)
				return i;
			leftSum +=arr[i];
		}
			
		return -1;
	}
	public static void main(String[] args)
    {
        EquilibriumIndex equi = new EquilibriumIndex();
        int arr[] = {-7, 1, 5, 2, -4, 3, 0};
        int arr_size = arr.length;
        System.out.println("First equilibrium index is " + 
                           equi.equilibrium(arr, arr_size));
    }
}
