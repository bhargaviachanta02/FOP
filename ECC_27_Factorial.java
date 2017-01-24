public class ECC_27_Factorial
{

	public static void main(String[] arg) {
		int num = -3;
		System.out.println(getFactorial(num));
	}

	public static int getFactorial(int num)
	{
		if ( num < 0 )
			return -1;
		if ( num == 0 )
			return -2;
	
		int res = 1;
		for(int i = 1; i<=num; i++){
			res = res *  i;
			
		} 
		
		// ADD YOUR CODE HERE
		return res ;
	}
}
