class pair{
	
	public int firstNum;
	public int secondNum;
	public int product;
}

public class LargestPallindrome {
	
	public static void main(String args[]){
		pair a = findLargestPallindrome();
		System.out.println(a.firstNum+ " "+ a.secondNum + " " +a.product);
		
	}
	
	public static pair findLargestPallindrome()
	{
		int product;
		int maxsofar=-1;
		pair retval = new pair();
		for(int i = 999 ; i > 0 ; i--){
			for(int j = 999 ; j > 0 ; j--){
				product = i*j;
				if(checkPallindrome(product) && product > maxsofar)
				{
					System.out.println(product);
					maxsofar=product;
					retval.firstNum = i;
					retval.secondNum = j;
					retval.product = product;
				}
			}	
		}	
		return retval;
	}
	
	public static boolean checkPallindrome(int num)
	{	
		String value = Integer.toString(num);
		char temp[] = value.toCharArray();
		//System.out.println(value);

		int itr = temp.length/2;
		int beginning =0;
		if(temp.length%2 != 0)
			return false;
		else
		{	
			for(int i = 0 ; i < temp.length/2; i++) //not -1
			{
				temp[temp.length/2+i] = temp[i]; //rearrange
			}
			//System.out.println(temp);

			while(itr < temp.length)
			{
				if(temp[beginning]==temp[itr])
					itr++;
				else
					return false;
			}
			return true;
		}
	}
}

