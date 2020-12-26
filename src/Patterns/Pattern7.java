package Patterns;

import java.util.Scanner;

public class Pattern7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int nsp=n/2;
		int nst=1;
		
		int row=1;
		
		while(row<=n)
		{
		 
			for(int csp=1; csp<=nsp; csp++)
			{
				System.out.print(" ");
			}
			
			for(int cst=1; cst<=nst ;cst++)
			{
				System.out.print("*");
			}
			
			for(int csp=1; csp<=nsp; csp++)
			{
				System.out.print(" ");
			}
		  
			System.out.println();
			
			if(row<=n/2)
			{
				nst=nst+2;
				nsp=nsp-1;
			}else
			{
				nst=nst-2;
				nsp=nsp+1;
			}
			row=row+1;
		}
	}

}
