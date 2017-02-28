public class ECC_82_AdamNumber {
    public static void main(String[] args) {
        int num = 311;
        System.out.println(isAdamNumber(num));
    }
    
    // return true if the given number is an Adam Number
    public static boolean isAdamNumber(int num) {
        // ADD YOUR CODE HERE
    	int temp = getSquare(num);
    	int temp1 = getReverse(getSquare(getReverse(num)));
    	if (temp == temp1) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }

    // return the reverse of the given number
    public static int getReverse(int n) {
        // ADD YOUR CODE HERE
    	int sum = 0 ;
    	int rem = 0;
    	int temp = n;
    	while (temp != 0) {
    		rem = temp % 10;
    		sum = sum * 10 + rem;
    		temp = temp / 10;
    	}
    	return sum;
    }

    // return the square of the give number
    public static int getSquare(int n) {
        // ADD YOUR CODE HERE
    	return n * n;
    }
}
