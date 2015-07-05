//Jordan Schultz
//Find the difference between the sum of the squares of the 
//first one hundred natural numbers and the square of the sum.


public class SumOfSquaredDifferences {
	public static void main(String args[]){
		int a = computeSquaredSum(100);
		int b = computeSumSquares(100);
		
		System.out.println(a-b);
		
	}
	
	public static int computeSquaredSum(int upto){
		int sum = 0;
		while(upto != 0){
			sum += upto;
			upto--;
		}
		
		return (sum*sum);
	}
	public static int computeSumSquares(int upto){
		int sum = 0;
		int temp;
		while(upto != 0 ){
			temp = (upto*upto);
			sum += temp;
			upto--;
		}
		
		return sum;
		
	}
}
