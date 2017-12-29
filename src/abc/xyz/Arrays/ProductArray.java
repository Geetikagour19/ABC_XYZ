package abc.xyz.Arrays;

public class ProductArray {

	void productArray(int arr[], int n){
		int prod[]=new int[n];
		int i , temp=1;
		for(int j=0;j<n;j++)
			prod[j]=1;
		for(i=0;i<n;i++){
			prod[i]=temp;
			temp=temp*arr[i];
			
		}
		temp=1;
		for(i=n-1;i>=0;i--){
			prod[i]=prod[i]*temp;
			temp=temp*arr[i];
		}
		for(i=0;i<n;i++)
			System.out.print(prod[i]+ " ");
	}
	
	public static void main(String[] args) {
        ProductArray pa = new ProductArray();
        int arr[] = {10, 3, 5, 6, 2};
        int n = arr.length;
        System.out.println("The product array is : ");
        pa.productArray(arr, n);
    }
}
