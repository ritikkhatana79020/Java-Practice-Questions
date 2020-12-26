package DSA;

public class reverseArray {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4};
		for(int i=0;i<arr.length;i++) {
		   System.out.print(arr[i]+" ");
			}
		System.out.println();		
		  System.out.println("Reversed Array");
		reverse(arr,0,arr.length-1);  
		for(int i=0;i<arr.length;i++) {
			   System.out.print(arr[i]+" ");
				}
		}

	private static void reverse(int[] arr, int start, int end) {
		int temp;
		while(start<end) {
			temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		
	}

	}


