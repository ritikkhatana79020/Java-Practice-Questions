package Lecture1;

import java.util.Scanner;

public class Pattern6 {

	public static void main(String args[]) {
      Scanner scn=new Scanner(System.in);
      int n=scn.nextInt();
      
      int nst=n/2;
      int nsp=1;
      int row=1;
      
      while(row<=n)
      {
    	  
        for(int cst=1 ; cst<=nst ; cst++)
        {
        	System.out.print("*");
        }
        
        for(int csp=1 ; csp<=nsp ; csp++)
        {
        	System.out.print(" ");
        	
        }
        
        for(int cst=1 ; cst<=nst ; cst++)
        {
        	System.out.print("*");
        }
        
    	System.out.println();
    	
    	if(row<=n/2)
    	{
    		nst=nst-1;
    		nsp=nsp+2;
    	}else
    	{
    		nst=nst+1;
    		nsp=nsp-2;
    		
    	}
      }

	}

}
