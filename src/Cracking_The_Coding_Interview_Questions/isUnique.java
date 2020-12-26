/*
 * ISUNIQUE
 Is the given string unique or not. If String is unique return True else False.
 Example:  Coding->True,
             NanoCar->False,
               Syllabus->False.
  
 */


package Cracking_The_Coding_Interview_Questions;

import java.util.Scanner;

public class isUnique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
        System.out.println(str+"-->"+isUniqueString(str));
	}
	 
	public static boolean isUniqueString(String str) {
		boolean[] arr=new boolean[128];
		for(int i=0;i<str.length();i++) {
			int val=str.charAt(i);
			if(arr[val]) {
				return false;
			}
			arr[val]=true;
			
		}
		return true;
	}

}
