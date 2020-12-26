package Lecture1;

public class RecursionExam1 {

	public static void main(String[] args) {
    System.out.println(Fact(4));
	}

	public static int Fact(int n) {
       
		if(n==1) {
		 return 1;	
		}
		int fnum1=Fact(n-1);
       int fn=n*fnum1;
       return fn;
	}

}
