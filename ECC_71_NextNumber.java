public class ECC_71_NextNumber {

	public static void main(String[] args) {
		System.out.println(ECC_71_NextNumber.nextNum(123467));
		System.out.println(ECC_71_NextNumber.nextNum( 12465));
	}

	public static int nextNum(int num) {
		int input = num;
		int neven = 0;
		int nodd = 0;
		while(num != 0) {
			if(num % 2 == 0)
				neven++;
			else
				nodd++;
			num /= 10;
        }
		if (nodd > neven){
		if (input%2==1)
			return ((input) + 2);
		else 
			return ((input) + 1);

		}
		else if (neven > nodd){
			if (input %2==0)
			return ((input) + 2);
			else 
				return ((input) + 1);
		}
		
			return input;
		
	}
}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*int digit = 0, neven = 0, nodd = 0, input = num;
		while (num > 0) {
			digit = num % 10;
			if (digit % 2 == 1) {
				nodd++;
			} else {
				neven++;
			}
			num /= 10;
		}
		if (nodd > neven)
			return ((input) + 2);
		else if (neven > nodd)
			return ((input) + 2);

		else {
			return input;
		}
	}
}*/
