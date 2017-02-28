public class ECC_76_ArrayMinValue {
    public static void main(String[] args) {
        int arr[] = {10, 20, 40, 50, 60, 40, 60, 3, 55, 76};
        System.out.println(getMinValue(arr));
    }
    // return the miminum value from an array named arr
    public static int getMinValue(int[] arr) {
    	if (arr.length == 0)
    		return 0;
    	int i=0;
    
    	for(i=1;i<arr.length;i++){ 
    		if(arr[i]<=0)
    			return -1;
    	}
    	 int minValue = arr[0]; 
    	    for( i=1;i<arr.length;i++){ 
    	      if(arr[i] < minValue){ 
    	        minValue = arr[i]; 
    	      } 
    	    } 
    	    return minValue; 
    	  } 
    	}
