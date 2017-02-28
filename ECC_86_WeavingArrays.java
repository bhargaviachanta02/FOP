public class ECC_86_WeavingArrays {
    public static void main(String[] args) {
        int[] arr1 = {10, 20, 30, 40};
        int[] arr2 = {15, 25, 35, 45, 55, 65};
        int[] res = weavingArrayElements(arr1, arr2);
        for (int n : res) {
            System.out.print(n + " ");
        }
    }

    public static int[] weavingArrayElements(int[] a1, int[] a2) {
        // ADD YOUR CODE HERE
    	int[] arr;
    	int  j = 0;
    	int  k = 0;
    	//int len;
    	if (a1.length < a2.length) {
    		arr = new int[a1.length*2];
    		//len = a1.length;
    	}
    	else {
    		arr = new int[a2.length*2];
    		//len = a2.length;
    	}
    	for (int i = 0 ; i < arr.length ; i++) {
    		if (i % 2 == 0) {
    			arr[i] = a1[j];
    			j++;
    		}
    		else {
    			arr[i] = a2[k];
    			k++;
    		}
    	}
    	return arr;
    }

}
