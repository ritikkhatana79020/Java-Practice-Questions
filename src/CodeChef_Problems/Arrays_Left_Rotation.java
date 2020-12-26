package CodeChef_Problems;



import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Arrays_Left_Rotation
{
	public static void main(String[] args) 
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    
		    int sum=0;
		    int n=sc.nextInt();
		    int[] arr=new int[n];
		    int k=sc.nextInt();
		    for(int i=0;i<n;i++){
		        arr[i]=sc.nextInt();
		  
		    }
		    int count=1;
		    for(int i=0;i<n;i++){
		        if(arr[i]>k){
		            System.out.println("-1");
		            break;
		        }else if(arr[i]<k || sum<k){
		               sum++;
		               count=sum;
		            }
		        }	       
		        System.out.println(count);
		        count=0;
		        sum=0;
		        
		    }
		}
	}


