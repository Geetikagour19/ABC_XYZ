package abc.xyz.Arrays;

public class SortedSubSequence {

	static void find3Numbers(int arr[]){
		int n = arr.length;
		int max=n-1;
		int min=0;
		int i;
		
		int smaller[]=new int[n];
		smaller[0]=-1;
		for(i=1;i<n;i++){
			if(arr[i]<arr[min]){
				min=i;
				smaller[i]=-1;
			}
			else
				smaller[i]=min;
		}
		
		int greater[]=new int[n];
		greater[0]=-1;
		for(i=n-2;i>=0;i--){
			if(arr[i]>=arr[max]){
				max=i;
				greater[i]=-1;
			}
			else
				greater[i]=max;
		}
		for(i=0;i<n;i++){
			if(smaller[i]!=-1 && greater[i]!=-1){
				System.out.println(arr[smaller[i]]+" : "+ arr[i]+ " : "+arr[greater[i]]);
				return;
			}
				
		}
		System.out.println("No such triplet found");
        return;
	}
	
	public static void main (String[] args)
    {
        int arr[] = {12, 11, 10, 5, 6, 2, 30};
        find3Numbers(arr);
    }
}
