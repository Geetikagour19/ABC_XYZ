package abc.xyz.com;

public class RotateArray {
	
	void leftRotate(int arr[], int d)
	{
		for(int i=0;i<d;i++){
			leftRotateByOne(arr, arr.length);
			
		}
		
	}
	
	void leftRotateByOne(int arr[], int n){
		int temp = arr[0];
		for(int i=0; i<n-1;i++){
			temp=arr[i];
			arr[i]= arr[i+1];
			arr[i+1]=temp;
		}
	}
	
	void printArray(int arr[]){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i] + ", ");
		}
	}
	public static void main(String[] args) 
    {
        RotateArray rotate = new RotateArray();
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        rotate.leftRotate(arr, 2);
        rotate.printArray(arr);
    }
}
