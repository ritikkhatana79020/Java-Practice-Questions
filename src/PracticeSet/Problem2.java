package PracticeSet;
import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner sc=new Scanner(System.in);
	    String s=sc.nextLine();
        String res=reverseString(s);         
        System.out.println(res); 
	}
	public static String reverseString(String s) {
		
		char[] ch=s.toCharArray();//{'H','e','l','l','o'}
		int i=0;
		int j= s.length() - 1;
		while(i<j) {
			char temp=ch[i];
			     ch[i++]=ch[j];
			     ch[j--]=temp;
		}
		
		return new String(ch);
    	
    }

}
