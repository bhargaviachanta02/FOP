public class ECC_98_SumOfAmicablePairs {
    public static void main(String[] args) {
        System.out.println(sumOfAmicablePairs());
    }
    // return the sum of all amicable pairs till 1 Million.
    public static int sumOfAmicablePairs() {
        // ADD YOUR CODE HERE
    	int sum = 0;
    	
    	for(int  i = 1 ; i < 1000000 ; i++) {
    		int sumfactOfi = getSumOfProperDivisors(i); 
        	//double d1 = i;
        	//int d =(int) Math.pow(d1, 2);
        	if(sumfactOfi > i && sumfactOfi < 1000000) {
        		int sumfactOfsqr = getSumOfProperDivisors(sumfactOfi);
        		if(sumfactOfsqr == i) {
        			sum = sum + i + sumfactOfi;
        			//System.out.println("sum value of " + i + "th is : " + sum);
        		}
        	}
    	}
    	return sum;
    }

    // return the sum of proper divisors for the given number
    public static int getSumOfProperDivisors(int num) {
        // ADD YOUR CODE HERE
    	int sum = 0;
    	for ( int i = 1 ; i < num ; i++) {
    		if (num % i == 0) {
    			sum = sum + i;
    		}
    	}
    	return sum;
    }
}