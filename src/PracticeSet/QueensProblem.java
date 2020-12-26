package PracticeSet;

public class QueensProblem {
	static int count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		//QueenPermutation(new boolean[4] , 0 , 2 ," ");
		QueenCombination(new boolean[4] , 0 , 2 ," ",-1);
	}
	
	public static void QueenPermutation(boolean[] boxes,int qpsf,int tq,String ans) {
		
		if(qpsf==tq){
			count++;
			System.out.println(count+"."+ans);
			return;
		}
		
		for(int i=0;i<boxes.length;i++) {
			if(boxes[i]==false) {
			boxes[i]=true;
			QueenPermutation(boxes,qpsf+1,tq,ans+"q"+qpsf+"b"+i+" " );
			boxes[i]=false;
		}
		}
	}
	
	public static void QueenCombination(boolean[] boxes,int qpsf,int tq,String ans,int lastboxused) {
		
		if(qpsf==tq){
			count++;
			System.out.println(count+"."+ans);
			return;
		}
		
		for(int i=lastboxused+1;i<boxes.length;i++) {
			boxes[i]=true;
			QueenCombination(boxes,qpsf+1,tq,ans+"q"+qpsf+"b"+i,i);
		}
	}

}
