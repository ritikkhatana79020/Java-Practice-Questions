package Lecture1;

import java.util.Scanner;

public class SearchBinary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[n];
		for (int i = 0; i < array.length; i++) {
			System.out.println("enter element at " + i + "index");
			array[i] = sc.nextInt();
		}

		for (int i = 0; i < array.length; i++) {

			System.out.println(array[i]);
		}
		System.out.println("Enter the Item you want to find ");
		int item = sc.nextInt();
		int res = binarySearch(array, item);
		System.out.println(res);

	}

	public static int binarySearch(int[] arr, int item) {
		int low = 0;
		int high = arr.length - 1;
	    while(low<=high)
	    {
		int mid=(low+high)/2;
		if(item<arr[mid])
		{
			high=mid-1;
		}else if(item>arr[mid])
		{
			low=mid+1;
		}else
		{
			return mid; 
		}
	    }
		return -1;
		

	}

}
