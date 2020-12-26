package PracticeSet;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
        System.out.print(isAnagram(s1,s2));
	}

	public static boolean isAnagram(String s1, String s2) {   //s1=aba    s2=baa
		// TODO Auto-generated method stub
		if(s1.length()!=s2.length()) {
			return false;
		}
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		
		int[] letters=new int[256];  //letters=[ , , , , ,  ]
		
		for(char c: s1.toCharArray()) {
			letters[c]++;                  //
		}
		
		for(char c: s2.toCharArray()) {
			letters[c]--;
		}
		
		for(int i: letters) {
			if(i!=0)
				return false;
		}
		
		return true;
			
	}

}
