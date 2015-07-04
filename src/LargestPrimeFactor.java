
public class LargestPrimeFactor {

		public static void main(String args[]){
			long num =GetLargestFactor(600851475143L);
			System.out.println(num);
			
		}
		
		public static long GetLargestFactor(long value){
			int count = 2;
			while(value!= 1){
				if(value%count == 0)
					value = value/count;
				else
					count++;
			}
			
			return count;
		}
		
}
