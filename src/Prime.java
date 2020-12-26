import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int divisor=2;
	    boolean flag=true;
	    while(divisor<=n-1)
	    {
	    	if(n%divisor==0)
	    	{
	    		flag=false;
	    	}
	    	divisor++;
	    }
	    if(flag==true)
	    {
	    	System.out.println("Prime");
	    }else
	    	System.out.println("Non Prime");
		
	}

}
