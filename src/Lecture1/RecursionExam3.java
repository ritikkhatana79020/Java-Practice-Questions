package Lecture1;

public class RecursionExam3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println(Fib(5));  
		
	}
	public static int Fib(int n) {
		if(n==0) {
			return n;
		}
		if(n==1) {
			return n;
		}
		int fnum1=Fib(n-1);
		int fnum2=Fib(n-2);
		int fn=fnum1+fnum2;
		return fn;
	}
    
}
