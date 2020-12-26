package Lecture1;

import java.util.Scanner;

public class Conversion1 {

	public static void main(String[] args) {
		// AnyBase To Decimal
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		int sb=sc.nextInt();
		int res=anyBaseToDecimal(num,sb);
		System.out.println(res);

	}

	public static int anyBaseToDecimal(int num, int sb) {
		
		int mult=1;
		int ans=0;
		while(num!=0)
		{
			
		int rem=num%10;
		ans=ans+rem*mult;
		num=num/10;
		mult=mult*sb;
		
		}
		return ans;
	}

}
