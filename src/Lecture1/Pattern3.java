package Lecture1;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		n=sc.nextInt();
		int nst=n;
		int row=1;
		while(row<=n)
		{
			int cst=1;
			while(cst<=nst)
			{
				System.out.print("*");
				cst=cst+1;
			}
			System.out.println();
			nst=nst-1;
			row=row+1;
		}

	}

}
