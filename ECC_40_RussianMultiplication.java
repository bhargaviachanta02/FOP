
public class ECC_40_RussianMultiplication {
	static boolean odd(int num1)

	{

		if ((num1%2)!=0)

		{

			return true;

		}

		else

		{

			return false;

		}

	}

	public static void main(String[] args) {
        int num1 = 11;
         int num2 = 12;

		
		System.out.println(getProduct( num1,  num2));

		
		// Test your code here


	}


	public static int getProduct(int num1, int num2){
		
         if (num1 <=0 ||  num2 <=0)
        	 return -1;
       
	     int sum=0;
		// ADD YOUR CODE HERE
		while(num1!=0)

		{

			if(odd(num1))
			{

				sum=sum+num2;

			}
			//else 
				//return 0;

			num1=num1/2;

			num2=num2*2;

		}

		

		return sum;
	} 
	}
		













/*import java.io.*;
public class ECC_40_RussianMultiplication {

	static boolean odd(int number1)

	{

		if ((number1%2)!=0)

		{

			return true;

		}

		else

		{

			return false;

		}

	}

	public static void main(String[] args)throws IOException {

		// TODO Auto-generated method stub

		int number1,number2,i,j,k,sum=0;

		//DataInputStream in =new DataInputStream(System.in);

		//System.out.println("Enter the number1");

		number1= 20;

		//System.out.println("Enter the number2");

		number2 = 40; 

		while(number1!=0)

		{

			if(odd(number1))

			{

				sum=sum+number2;

			}

			number1=number1/2;

			number2=number2*2;

		}

		

		System.out.println("Value is:"+sum);

		

	}

}
*/