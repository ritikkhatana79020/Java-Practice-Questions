package DSA;
import java.util.*;

public class selectionSort {

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
          
          for(int i=0;i<1;i++) {
        	  int minimum=i;
        	  for(int j=i+1;j<n-1;j++) {
        		  if(arr[j]<arr[minimum]) {
                       minimum = j;
        		  }
        	  }	  
        	  if(minimum!=i) {
        		  int temp=arr[i];
        		  arr[i]=arr[minimum];
        		  arr[minimum]=temp;
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
        public static void swap(int x,int y) {
        	int temp=x;
        	x=y;
        	y=temp;
        }
}
