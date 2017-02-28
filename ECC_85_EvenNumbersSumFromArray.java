public class ECC_85_EvenNumbersSumFromArray {
    public static void main(String[] args) {
        int[] arr = {10, 15, 20, 25, 30, 35, 40, 45, 50};
        System.out.println(getSumOfEvenNumbers(arr));
    }

    // return the sum of even element from an array
    public static int getSumOfEvenNumbers(int[] arr) {
        // ADD YOUR CODE HERE
    	int sum = 0;
    	if (arr.length == 0) {
    		return -3;
    	}
    	for (int i : arr) {
    		if (i < 0) {
    			return -1;
    		}
    		if ( i == 0) {
    			return -2;
    		}
    	}
    	for (int i : arr) {
    		if ( i % 2 == 0) {
    			sum = sum + i;
    		}
    	}
    	return sum;
    }
}











