package CodeChef_Problems;

import java.util.*;

public class numberReversed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int reversed=0;
        while(num!=0) {
        	int digit=num%10;
        	num=num/10;
        	reversed=reversed*10 + digit;
        }
        System.out.println(reversed);
	}

}
