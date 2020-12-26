package Cracking_The_Coding_Interview_Questions;
import java.util.*;

public class URLify {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine(); //   str = Mr John Smith;
        str=str.trim();
        int index=str.length();
        System.out.println(replace(str,index));
        
        
	}

	private static String replace(String str,int index) {
		// TODO Auto-generated method stub
		char[] c_arr=str.toCharArray();
		char space=' ';
	
		for(int i=str.length()-1;i>0;i--) {
		   int check=Character.compare(c_arr[i],space);
			if(check==0) {
				c_arr[index - 1] = '0';
				c_arr[index - 2] = '2';
				c_arr[index - 3] = '%';
			}	   
		}
		return new String(c_arr);
	}
	

}
