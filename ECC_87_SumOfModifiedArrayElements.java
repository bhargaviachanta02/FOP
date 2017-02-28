public class ECC_87_SumOfModifiedArrayElements {
    public static void main(String[] args) {
        int[] arr = {10, 15, 20, 25, 30, 35, 40, 45, 50};
        System.out.println(getSumOfModifiedElements(arr));
    }

    public static int getSumOfModifiedElements(int[] arr) {
         // ADD YOUR CODE HERE
    	int sum = 0;
    	if(arr.length == 0) {
    		return -1;
    	}
    	for(int i : arr) {
    		if(i < 0) {
    			return -2;
    		}
    		if(i == 0) {
    			return -3;
    		}
    	}
    	for(int i = 0 ; i < arr.length ; i++ ) {
    		if(arr[i] % 2 == 0) {
    			sum = sum + (arr[i]*2);
    		}
    		else {
    			sum = sum + (arr[i] / 2);
    		}
    	}
    	return sum;
    }

}
