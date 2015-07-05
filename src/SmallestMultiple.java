//Jordan Schultz
//What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?


public class SmallestMultiple {
	public static void main(String args[])
	{
		findMultiple(20);
		
	}
public static void findMultiple(int upto){
	boolean flag = true;
	while(flag){ // brute force
		if(upto % 20 == 0 && upto % 19 == 0 && upto % 18 == 0 && upto % 17 == 0 
				&& upto % 16 == 0 && upto % 15 == 0 && upto % 14 == 0 && upto % 13 == 0 
				&& upto % 12 == 0 && upto % 11 == 0 && upto %10 == 0){
			
			System.out.println(upto);
			flag = false;
		}//if
		else
			upto++;
		
	}//while
	System.out.println(upto);
	
}
}