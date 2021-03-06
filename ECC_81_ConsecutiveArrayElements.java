public class ECC_81_ConsecutiveArrayElements {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 6, 8, 5, 9, 2};
        int target = 11;
        if (validateInputs(arr, target) == 1) {
            System.out.println(containsConsecutiveElements(arr, target));
        } else {
            System.out.println("Invalid Inputs");
        }
    }

    public static int validateInputs(int[] arr, int target) {
        if(arr.length==0){
        	return -1;
        }
        for(int i=0;i<=arr.length-1;i++)
        if(arr[i]<0){
        	return -2;
        }
        else if(target<=0){
        	return -3;
        }
        
        	return 1;
        
    }

    public static boolean containsConsecutiveElements(int[] arr, int target) {
    	
    	for(int i=0;i<arr.length;i++){
    		int sum=0;
        	for(int j=i;j<arr.length;j++){
        		sum=sum+arr[j];
        		
        		if(sum==target){
        		return true;	
        		}
        		}
        		
        	}
        return false;
        }
    }


