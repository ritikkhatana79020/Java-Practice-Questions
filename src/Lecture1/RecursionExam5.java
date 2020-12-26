package Lecture1;

public class RecursionExam5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		int[] arr= {1,2,3,5,3,6,7,1};
		System.out.println(FirstIndex(arr,0,3));
	}
	public static int FirstIndex(int[] arr,int si,int data) {
		if(si==arr.length) {
			return -1;
		}
		if(arr[si]==data) {
			return si;
		}else {
			int restAns=FirstIndex(arr,si+1,data);
			return restAns;
		}
	}

}
