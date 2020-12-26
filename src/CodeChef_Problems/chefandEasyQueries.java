package CodeChef_Problems;

import java.util.*;

public class chefandEasyQueries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test-->0) {
		    int t=0;
		    int n=sc.nextInt();
		    int k=sc.nextInt();
		    int[] arr=new int[n];
            	    
		    
		    for (int i=0;i<n;i++){
		       arr[i]=sc.nextInt();
		    }
 
            long carry = 0, days = 0;
            for (int j : arr) {
                if (j + carry < k)
                    break;
                days += 1;
                carry = j + carry - k;
            }
            days += carry / k;
            System.out.println(days + 1);

		    

	
		}
        
	}

}
