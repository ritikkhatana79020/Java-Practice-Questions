package Lecture1;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[n];

		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}

		for (int i = 0; i < array.length; i++) {
			System.out.println("enter element at " + i + "index");
			System.out.println(array[i]);
		}
		System.out.println("enter the item that you want to search");
		int item = sc.nextInt();
		int res = linearSearch(array, item);
		System.out.println(res);

	}

	public static int linearSearch(int[] arr, int item) {

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == item) {
				return i;
			} 

			
		}
               return -1;		
 
	}
}
