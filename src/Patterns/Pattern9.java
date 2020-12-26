package Patterns;

import java.util.Scanner;

public class Pattern9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		int nst=1;
		int nsp=n-1;
		
		int row=1;
		
		 while(row<=n)
		 {
			 int val=row;
			 
			 for(int  csp=1;csp<=nsp;csp++)
			 {
				 System.out.print(" ");
			 }
			  
			 
		       for(int cst=1;cst<=nst;cst++)
		       {
		       System.out.print(val); 
		       }
		       
		      
		      
		       
		       System.out.println();
		       nst=nst+2;
		       nsp=nsp-1;
		       row++;
		 }
	}

}
