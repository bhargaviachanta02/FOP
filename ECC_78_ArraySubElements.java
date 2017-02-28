public class ECC_78_ArraySubElements {
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 50, 60, 70, 80};
        int start_index = 4;
        int end_index = 7;
        if (validateData(a, start_index, end_index) == 1) {
            int[] res = getSubElementsOfArray(a, start_index, end_index);
            for (int val : res) {
                System.out.println(val);
            }
        } else {
            System.out.println("Enter Valid Data");
        }
    }

    public static int validateData(int[] arr, int startIndx, int endIndx) {
         // ADD YOUR CODE HERE
    	if(arr.length == 0) {
    		return -1;
    	}
    	if ((startIndx < 0 || startIndx > arr.length-1) || (endIndx < 0 || endIndx > arr.length-1)) {
    		return -2;
    	}
    	if(startIndx >= endIndx) {
    		return -3;
    	}
    	else {
    		return 1;
    	}
    }
    public static int[] getSubElementsOfArray(int[] arr, int startIndex, int endIndex) {
         // ADD YOUR CODE HERE
    	int arr1[] = new int[(endIndex- startIndex) + 1];
    	int j = 0;
    	for (int  i = startIndex ; i <= endIndex ; i++) {
    		arr1[j] = arr[i];
    		j++;
    	}
    	return arr1;
    	
    }
}




