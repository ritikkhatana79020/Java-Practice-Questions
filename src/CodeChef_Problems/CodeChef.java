package CodeChef_Problems;

import java.util.Scanner;

public class CodeChef {

	public static void main(String[] args) {
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0){
		    int N=sc.nextInt();
		    int[][] matrix=new int[N][N];
		    for(int i=0;i<N;i++){
		        for(int j=0;j<N;j++){
		            matrix[i][j]=sc.nextInt();
		        }
		    }
		      for(int x=0;x<N;x++){
		       for(int i=0;i<x;i++){
		        for(int j=0;j<x;j++){
		            matrix[i][j]=matrix[j][i];
		            if(matrix[i][j]>matrix[i+(j)][j] && j<N){
		                System.out.println("Before Break");
		            	break;
		            	System.out.println("After Break");
		            }
		          }
		         }
		       }
		      System.out.println("Last Break");
		}
	}

}
