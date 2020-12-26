package DSA;

import java.util.Scanner;

public class insertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Now, Enter elements into the Array");
        for(int i=0;i<n;i++) {
      	  arr[i]=sc.nextInt();
        }
        System.out.println("Before Sorting");
        for(int i=0;i<n;i++) {
      	  System.out.print(" | "+arr[i]+" | ");     	  
        }
        System.out.println();
        
       
        
        //Here is the Part Where Sorting Happens
        for(int i=1;i<n;i++) {
        	int val=arr[i];
        	int j=i-1;
        	while(j>=0 && arr[j]>val) {
        		arr[j+1]=arr[j];
        		j--;
        	}
        	arr[j+1]=val;
        }
        
    
        
        System.out.println("After Sorting");
        for(int i=0;i<n;i++) {
      	  System.out.print(" | "+arr[i]+" | ");
        }
	}

}
