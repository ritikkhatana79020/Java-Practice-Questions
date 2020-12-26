package CodeChef_Problems;

import java.util.Arrays;
import java.util.Scanner;

public class Cleaning_Up {

	public static void main(String[] args) {
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t-->0){
			int sum=0;
			int row=sc.nextInt();
		    int col=sc.nextInt();
		    int X=sc.nextInt();
		    int Y=sc.nextInt();
		    int[][] matrix=new int[row][col];
		    for(int i=0;i<row;i++){
		        for(int j=0;j<col;j++){
		            if((i+j)%2==0){
		            matrix[i][j]=X;
		            }else{
		                matrix[i][j]=Y-X;
		            }
		        }
		    }
		    for(int i=0;i<row;i++){
		        for(int j=0;j<col;j++){
		            sum=sum+matrix[i][j];
		        }
		    }
		    System.out.println(sum);
		    
		    
		}
	}

}
