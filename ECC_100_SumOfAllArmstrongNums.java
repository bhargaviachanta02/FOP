public class ECC_100_SumOfAllArmstrongNums {
    public static void main(String[] args) {
        int start_val = 100;
        int end_val = 10000;
        System.out.println(getSumOfAllArmstrongNums(start_val, end_val));
    //    System.out.println(containsAllOddDigits(3057));
    }

    // return the sum of all armstrong numbers which contains all odd digits with in the given range
    public static int getSumOfAllArmstrongNums(int start_val, int end_val) {
         // ADD YOUR CODE HERE
    	int sum = 0;
    	if(start_val >  end_val) {
    		return -3;
    	}
    	if(start_val < 0 || end_val < 0) {
    		return -1;
    	}
    	if(start_val == 0 || end_val == 0) {
    		return -2;
    	}
    	for (int i = start_val ; i <= end_val ; i++) {
    		if(containsAllOddDigits(i)) {
    			if(isArmstrong(i)) {
    				sum = sum + i;
    			}
    		}
    	}
    	return sum;
    }

    // return true if the given number is armstrong
    public static boolean isArmstrong(int num) {
         // ADD YOUR CODE HERE
    	if(num == sumOfPowersOfDigits(num)) {
    		return true;
    	}else {
    		return false;
    	}
    }

    // return the sum of powers of digits of the given number
    public static int sumOfPowersOfDigits(int num) {
         // ADD YOUR CODE HERE
    	String str = "";
    	str = str + num;
    	int pwr = str.length();
    	int sum = 0;
    	int temp = num;
    	int rem = 0;
    	double d = 0.0; 
    	while(temp!=0) {
    		rem = temp % 10;
    		d = Math.pow(rem, pwr);
    		sum = sum + (int)d;
    		temp = temp / 10;
    	}
    	
    	return sum;
    }

    // return an array contains the digits of the number in the same order
    // if num = 153 return {1, 5, 3}
    public static int[] getDigits(int num) {
         // ADD YOUR CODE HERE
    	int j = 0;
    	String str = "";
    	str = str + num;
    	int arr[] = new int[str.length()];
    	int arr1[] = new int[arr.length];
    	int temp = num;
    	int rem = 0;
    	int i = 0;
    	while(temp!=0) {
    		rem = temp % 10;
    		temp = temp / 10;
    		arr[i] = rem;
    		i++;
    	}
    	i = 0;
    	for(i = arr.length-1 ; i >= 0; i--) {
    		arr1[j] = arr[i];
    		j++;
    	}
    	return arr1;
    }

    // return true if the number contains all odd digits.
    public static boolean containsAllOddDigits(int num) {
        // ADD YOUR CODE HERE
    	int count = 0;
    	int arr[] = getDigits(num);
    	for(int i = 0 ; i < arr.length ; i++) {
    		if(arr[i] % 2 != 0 || arr[i] == 0) {
    			count++;
    		}
    	}
    	if(count == arr.length) {
    		return true;
    	}
    	else {
    		return false;
    	}
    	
    }
}