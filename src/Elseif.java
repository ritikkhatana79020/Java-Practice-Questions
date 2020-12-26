import java.util.Scanner;

public class Elseif {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Age");
		int age=sc.nextInt();
		if(age<=11)
		{
			System.out.println("Child");
		}else if(age>11 && age<=18)
		{
			System.out.println("teenager");
		}else if(age>18 && age<=45)
		{
			System.out.println("Adult");
		}else if(age>45)
		{
			System.out.println("old");
		}
	}

}
