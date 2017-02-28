public class ECC_94_SumOfDigitsOfDecimalPoint {
    public static void main(String[] args) {
        double val = 1202.5202;
        System.out.println(concateSumOfDigits(val));
    }
    // should return the sum as String in the following format Left side sum:Right side sum
    public static String concateSumOfDigits(double val) {
        // ADD YOUR CODE HERE
    	String str = Double.toString(val);
    	String str1 = "";
    	char ch[] = str.toCharArray();
    	//System.out.println(ch.length);
    	String sum = "";
    	String sum1 = "";
    	int count = 0;
    	for (int i = 0; i < ch.length ; i++) {
    		if(ch[i] == '.') {
    			count++;
    			continue;
    		}
    		if(count == 0) {
    			sum = sum  + ch[i];
    		}
    		else {
    			sum1 = sum1 +  ch[i];
    		}
    	}
    	//System.out.println(Integer.parseInt(sum));
    	int x = getSumOfDigits(Integer.parseInt(sum));
    	str1 = str1 + x;
    	//System.out.println(str1);
    	x = getSumOfDigits(Integer.parseInt(sum1));
    	str1 = str1 + ":" + x;
    	return str1;
    }
    // return the sum of digits of a number
    public static int getSumOfDigits(int num) {
        // ADD YOUR CODE HERE
    	int sum = 0;
    	int temp = num;
    	int rem = 0;
    	while(temp != 0) {
    		rem = temp % 10;
    		sum = sum + rem;
    		temp = temp / 10;
    	}
    	return sum;
    }



}
