public class ECC_33_ListPrimes
{

	public static void main(String[] arg) {
		int num1 = 10;
		int num2 = 30;
		System.out.println(getPrimeNumbers(num1, num2));
	}

	public static String getPrimeNumbers(int num1,int num2)
	
	{
       String z = "";
		if (num1 <0 || num2 <0 )
			return "-1";
		else if (num1 >= num2)
			return "-2";
		
		else if (num1<num2) 
			
		
		  for(int i=num1;i<=num2;i++)
	     	{
			int flag=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					flag=1;
				}
			}
			if(flag==0)
				 z +=(+i+ " " );
	     	}
			
		
		//System.out.println();
		return z.trim();

	}	
}

/*import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ECC_33_ListPrimes
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("\nEnter the range : ");
		//int range=Integer.parseInt(br.readLine());
		//System.out.println();
		int num1 = 10;
		int num2 = 20;
		for(int i=num1;i<=num2;i++)
		{
			int flag=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					flag=1;
				}
			}
			if(flag==0)
				System.out.print(i+" ");
		}
		System.out.println();

	}
}
*/