package abc.xyz.Arrays;

public class RotateMatrix {
	
	static void rotateMatrix(int n, int mat[][]){
		for(int i = 0;i<n/2;i++){
			for(int j=i;j<n-i-1;j++){
				int temp = mat[i][j];
				mat[i][j] = mat[j][n-i-1];
				mat[j][n-i-1] = mat[n-i-1][n-j-1];
				mat[n-i-1][n-j-1]=mat[n-j-1][i];
				mat[n-j-1][i] = temp;
			}
		}
	}
	static void displayMatrix(int n, int mat[][]){
		for(int i=0;i<n; i++){
			for(int j=0;j<n;j++){
				System.out.print(" "+mat[i][j]);
			}
			System.out.print("\n");
		}
		System.out.println();
	}

	 public static void main (String[] args) 
	    {
	        int N = 4;
	         
	        // Test Case 1
	        int mat[][] =
	        {
	            {1, 2, 3, 4},
	            {5, 6, 7, 8},
	            {9, 10, 11, 12},
	            {13, 14, 15, 16}
	        };
	      
	      
	        // Tese Case 2
	        /* int mat[][] = {
	                            {1, 2, 3},
	                            {4, 5, 6},
	                            {7, 8, 9}
	                        };
	         */
	      
	        // Tese Case 3
	        /*int mat[][] = {
	                        {1, 2},
	                        {4, 5}
	                    };*/
	      
	        // displayMatrix(mat);
	      
	        rotateMatrix(N,mat);
	      
	        // Print rotated matrix
	        displayMatrix(N,mat);
	    }
}
