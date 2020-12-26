package DSA;
import java.util.*;

public class bubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  long start = System.currentTimeMillis(); 
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
          for(int i=0;i<n-1;i++) {
              for(int j=0;j<n-1-i;j++) {
            	  if(arr[j]>arr[j+1]) {
            		  int temp=arr[j+1];
            		  arr[j+1]=arr[j];
            		  arr[j]=temp;
            	  }
              }
          }
          System.out.println("After Sorting");
          for(int i=0;i<n;i++) {
        	  System.out.print(" | "+arr[i]+" | ");
          }
          System.out.println();
          long end = System.currentTimeMillis(); 
          System.out.println("Time taken " + 
                                      (end - start) + "ms"); 
          
	}

}
