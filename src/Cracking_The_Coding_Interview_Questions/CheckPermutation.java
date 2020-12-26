package Cracking_The_Coding_Interview_Questions;
import java.util.*;

public class CheckPermutation {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str1=sc.nextLine();
		String str2=sc.nextLine();
		System.out.println(permutaionCheck(str1,str2));
	}

	private static boolean permutaionCheck(String str1, String str2) {
		// TODO Auto-generated method stub
		boolean check=sort(str1).equals(sort(str2));
		return check;
	}

	private static Object sort(String str) {
		// TODO Auto-generated method stub
		char[] arr=str.toCharArray();
		Arrays.sort(arr);
		return new String(arr);
	}
}
