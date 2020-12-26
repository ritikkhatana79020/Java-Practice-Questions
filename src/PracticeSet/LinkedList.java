package PracticeSet;

import java.util.Arrays;
import java.util.Scanner;

public class LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		String str1=sc.nextLine();
		String str2=sc.nextLine();
		
		System.out.println(isAnagram(str1,str2));
		}

	
	public static boolean isAnagram(String str1, String str2) {
		
		char[] arr1=str1.toCharArray();
		char[] arr2=str2.toCharArray();
		
	    Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        
        String s = new String(arr1);
        String t = new String(arr2);
        return s.equals(t);
		
	}
}
