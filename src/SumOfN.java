import java.util.Scanner;

public class SumOfN {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any Number");
		int n=sc.nextInt();
		int sum=0;
		while(n>0)
		{
		   sum=sum+n;
			n--;
			
		}
		System.out.println(sum);
	}

}
