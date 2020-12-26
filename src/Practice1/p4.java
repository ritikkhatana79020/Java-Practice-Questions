package Practice1;

import java.util.Scanner;

public class p4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int nst=n;
		int nsp=1;
		int row=1;
		while(row<=n)
		{
			for(int cst=1;cst<=nst;cst++)
			{
				System.out.print("*");
			}
			for(int csp=n;csp<=nsp;csp--)
			{
				System.out.print(" ");
			}
			System.out.println();
			
			nsp++;
			nst--;
			row++;
		}

	}

}
