package Practice1;

import java.util.Arrays;

public class Leetcode1 {

	public static void main(String[] args) {
		
		int[][] matrix = {
			      {0, 1, 1, 1}, 
			      {1, 1, 1, 1}, 
			      {0, 1, 1, 1}, 
			};
		countSquares(matrix);
		
	}
	public static int countSquares(int[][] matrix) {
		
		int row=matrix.length;
		int col=matrix[0].length;
		
		//System.out.println(row);
		//System.out.println(col);
		
		int[][] dp=new int[row][col];
		
		for(int i=0;i<row;i++) {
			dp[i][0]=matrix[i][0];
			//System.out.println(dp[i][0]);
		}
		
		for(int i=0;i<col;i++) {
			dp[0][i]=matrix[0][i];
			//System.out.println(dp[0][i]);
		}
		
//		for(int i=0;i<row;i++) {
//			for(int j=0;j<col;j++) {
//				System.out.print(" "+matrix[i][j]);
//				
//			}
//			System.out.println();
//		}
//		

		for(int i=1; i<row; i++) {
			for(int j=1; j<col; j++) {
				if(matrix[i][j]==1) {
					dp[i][j]=Math.min(dp[i][j-1], Math.min(dp[i-1][j], dp[i-1][j-1]))+1;
					System.out.println(dp[i][j]);
 
				}
				else
					dp[i][j]=0;
			}
		}
		
		return 0;
		
	}

	
}
