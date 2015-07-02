//Find the sum of all multiples of 3 or 5 below 1000
public class MultiplesOf3and5 {

	public static void main(String args[]){

		int threes = Summultiplesofthree(1000);
		int fives = Summultiplesoffive(1000);
		
		System.out.println("Answer is "+ threes +" "+ fives +" "+ (threes+fives));
	}
	
	public static int Summultiplesofthree(int threshold){
		int temp = 0;
		
		for(int i = 0 ; i < threshold; i++)
			if(i % 3 == 0){
				temp+=i;
				//System.out.println(i);
			}
		return temp;
	}
	public static int Summultiplesoffive(int threshold){
		int temp = 0;
		
		for(int i = 0 ; i < threshold; i++)
			if(i % 5 == 0 && i%15 !=0){ // account for one set of 15 multiples
				temp+=i;
				//System.out.println(i);

			}
		return temp;
	}
}
