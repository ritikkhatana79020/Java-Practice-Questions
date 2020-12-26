package PracticeSet;

import java.util.Scanner;

public class ArrayPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No. of TestCases");
		int t=sc.nextInt();
		while(t-->0) {
			System.out.println("Enter size of Array");
			int n=sc.nextInt();
			System.out.println("Enter No. of steps want to shift");
			int d=sc.nextInt();
			int[] arr=new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
			}
			int[] temp=new int[d];
			for(int i=0;i<d;i++) {
				temp[i]=arr[i];
			}
			for(int i=0;i<n-d;i++) {
				arr[i]=arr[i+d];
			}		
			int j=0;
			for(int i=d-1;i<n;i++) {
				arr[i]=temp[j++];
			}
			for(int i=0;i<n;i++) {
				System.out.print(arr[i]+" ");
			}			
			
			
		}
		

	}

}
