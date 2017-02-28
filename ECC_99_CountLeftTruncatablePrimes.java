public class ECC_99_CountLeftTruncatablePrimes {
    public static void main(String[] args) {
        int start_val = 1;
        int end_val = 1000; 
        System.out.println(getCountOfLeftTruncatablePrimes(start_val, end_val));
    }

    public static int getCountOfLeftTruncatablePrimes(int start_val, int end_val) {
         // ADD YOUR CODE HERE
    	int count = 0;
    	if(start_val > end_val) {
    		return -1;
    	}
    	if(start_val < 0 || end_val < 0) {
    		return -2;
    	}
    	if(start_val == 0 || end_val == 0) {
    		return -3;
    	}
    	for(int i = start_val ; i <= end_val ; i++) {
    		if(isLeftTruncatablePrime(i)) {
    			count++;

				// System.out.println(count + "th left truncarable number is : " + i);
    		}
    	}
    	return count;
    }
    
    // return true if the number is an LeftTruncatablePrime
    public static boolean isLeftTruncatablePrime(int num) {
        // ADD YOUR CODE HERE
    	String str = Integer.toString(num);
    	String str1 = "";
    	int count = 0;
    	char ch[] = str.toCharArray();
    	for(int i = 0 ; i < ch.length ; i++) {
    		if((ch[i]-48) == 0){
    			return false;
    		}
    	}
    	for(int i = 0 ; i < ch.length ; i++) {
    		for (int j = i ; j < ch.length ; j++) {
    			 str1 = str1 + (ch[j] - 48);
    			 //System.out.println("str1 is : " + str1);
    			 if(isPrime(Integer.parseInt(str1))) {
    				 count++;
    			 }
    		}
    	}
    	if(count == ch.length) {
    		return true;
    	}
    	else return false;
    }
   
    // return true if the number is a prime
    public static boolean isPrime(int num) {
        // ADD YOUR CODE HERE
    	for (int i = 2; i < num ; i++) {
    		if(num % i == 0) {
    			return false;
    		}
    	}
    	return true;
    }
}
