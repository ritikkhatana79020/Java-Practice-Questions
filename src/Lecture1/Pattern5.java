package Lecture1;

import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int nst=1;
		int row=1;
		while(row<=n)
		{
			int cst=n;
			while(cst>=nst)
			{
				System.out.print("*");
			    cst=cst-1;
			}
			System.out.println();
			nst=nst+1;
			row=row+1;
		
		}

	}

}
