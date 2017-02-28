public class ECC_84_ArrayNearestMinValue {
    public static void main(String[] args) {
        int[] arr = {10, 20, -2, 34, -23, 24};
        System.out.println(getNearestMinValue(arr));
    }
     
    // return the nearest minimum value, which is not present in the array
    public static int getNearestMinValue(int[] arr) {
        // ADD YOUR CODE HERE
    	int  min = arr[0];
    	for(int i = 1 ; i < arr.length ; i++) {
    		if(arr[i] < min) {
    			min = arr[i];
    		}
    	}
    	return min-1;
    }
}
