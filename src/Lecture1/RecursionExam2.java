package Lecture1;

import java.util.Scanner;

public class RecursionExam2 {

	public static void main(String[] args) {	
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Factorial of "+n+" is "+ fact(n));
	}
  public static int fact(int n) {
	 if(n==1) {
		 return 1;
	 }
	  return n*fact(n-1);
  }

}
