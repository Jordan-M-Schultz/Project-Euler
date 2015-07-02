//By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.


public class EvenFibonacci {
	public static void main(String args[]){
		int previous= 2 ;
		int last= 1;
		int current = 3;
		int sum = 2;
		while(current < 4000000){
		
			if(current%2 == 0)
				sum += current;
			last = previous;
			previous = current;
			current  = previous+last;
		}
		System.out.println(sum);

	}
}
