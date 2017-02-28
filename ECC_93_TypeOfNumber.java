public class ECC_93_TypeOfNumber {
    public static void main(String[] args) {
        int num = 28;
        int res = sumOfProperDivisors(num);
        if (res == 0)
            System.out.println("Perfect Number");
        else if (res == 1) 
            System.out.println("Abundant Number");
        else if (res == -1)
            System.out.println("Deficient Number");
        else
            System.out.println("Please Enter Positive Number");
    }

    public static int sumOfProperDivisors(int num) {
         // ADD YOUR CODE HERE
    	  // ADD YOUR CODE HERE
    	int sum = 0;
    	if (num == 0) {
    		return -3;
    	}
    	if (num < 0) {
    		return -2;
    	}
    	else {
    		for (int i = 1 ; i < num ; i++) {
    			if (num % i == 0) {
    				sum = sum + i;
    			}
    		}
    		if (sum == num) {
    			return 0;
    		}
    		else if (sum  > num) {
    			return 1;
    		}
    		else {
    			return -1;
    		}
    	}    	
    }
}

