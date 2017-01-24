public class ECC_29_SumOfFactors
{

	public static void main(String[] arg) {
		int num = 1;
		System.out.println(getSumOfFactors(num));
	}

	public static int getSumOfFactors(int num)
	{
		if (num < 0)
            return -1;
        if (num == 0)
            return -2;
		int i=1;
        int sum=0;
        while(i<=num)
        {
            if(num%i==0)
            sum=sum+i;
            i++;
        }
       // System.out.println(+sum);
        return sum;
    }
}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		int sum = 1;
		int c = 0;
		if (num < 0)
			return -1;
		if (num == 0)
			return -2;
		for(int i = 1; i <= num; i++) {
			if(num%i == 0) {
				System.out.print(i+"\t");
				
				sum = sum + i;
				c++;
				System.out.println(+ c);
				return sum;
				
				 
		}
		
	}
		return 0;

*/
		
		
		// ADD CODE HERE// ADD YOUR CODE HERE
	