package Lecture1;
import java.util.*;

public class Function2 {

	public static void main(String[] args) {
		System.out.println("Tax Calculation App");
		System.out.println(" ----WELCOME----");
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter total Person Count");
		
		int t=sc.nextInt();
		
		long[] income=new long[t];
		
		String[] strArray = new String[t];
		
		int i=1;
		
		
		while(t>0) {
			
			System.out.println("Enter name"+ i +":");
			
			String name1=sc.next();
			
			
			System.out.println("Enter "+ name1 +"'s Annual Income:");
			
			long inc=sc.nextLong();
			
			long res=getTax(inc);
			
			System.out.println(res);
		      
			t=t-1;
			i++;
		}
		    		
	}

	public static long getTax(long inc) {
		if(inc>=300000) {
			inc*=0.2;
		}
		else if(inc>=100000 && inc<=300000) {
			inc*=0.1;
		}
		else if(inc<100000) {
			return 0;
		}
		
		
		return inc;
		
	}
	
	
		
	}

