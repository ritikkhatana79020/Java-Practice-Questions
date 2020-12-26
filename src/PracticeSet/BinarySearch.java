package PracticeSet;
public class BinarySearch {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {4,2,6,8,1,3,6};
		System.out.println("Before Sorting");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		binarySort(arr);
		System.out.println("After Sorting");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}
	private static void binarySort(int[] arr) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j] >= arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}

}
