package Lecture1;

import java.util.Scanner;

public class Conversion2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		int db=sc.nextInt();
		int res=decimalToAnyBase( num, db);
		System.out.println(res);

	}

	public static int decimalToAnyBase(int num, int db) {

		
		int mult=1;
		int ans=0;
		while(num!=0)
		{
			
			int rem=num%db;
		    ans=ans+(rem*mult);
		    mult=mult*10;
		    num=num/db;
	
			
		}
		return ans;
	}

}
