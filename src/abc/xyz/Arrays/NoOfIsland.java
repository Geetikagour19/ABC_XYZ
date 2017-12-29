package abc.xyz.Arrays;

public class NoOfIsland {

	static final int ROW = 5, COL = 5;
	boolean isSafe(int m[][], int row, int col, boolean visited[][]){
		return(row>=0 && row<ROW && col>=0 &&col<COL && m[row][col]==1 && !visited[row][col]);
	}
	void DFS(int m[][], int row, int col, boolean visited[][]){
		int rowNbr[]={-1, -1, -1, 0, 0, 1, 1, 1};
		int colNbr[]={-1, 0, 1, -1, 1, -1, 0, 1};
		
		visited[row][col]=true;
		for(int k =0;k<8;++k)
			if(isSafe(m, row+rowNbr[k], col+colNbr[k],visited ))
				
				DFS(m, row+rowNbr[k], col+colNbr[k],visited);
	}
	int countIslands(int m[][]){
		boolean visited[][]=new boolean[ROW][COL];
		
		int count=0;
		for(int i=0;i<ROW;++i){
			for(int j=0;j<COL;++j){
				if(m[i][j]==1 && !visited[i][j]){
					DFS(m, i, j, visited);
					++count;
				}
			}
		}
		return count;
	}
	public static void main (String[] args) throws java.lang.Exception
	 {
	        int M[][]=  new int[][] {{1, 1, 0, 0, 0},
	                                 {0, 1, 0, 0, 1},
	                                 {1, 0, 0, 1, 1},
	                                 {0, 0, 0, 0, 0},
	                                 {1, 0, 1, 0, 1}
	                                };
	        NoOfIsland I = new NoOfIsland();
	        System.out.println("Number of islands is: "+ I.countIslands(M));
	    }
}
