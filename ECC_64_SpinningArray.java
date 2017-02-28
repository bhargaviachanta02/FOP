
public class ECC_64_SpinningArray {

	public static void main(String[] args) {
		int[] arr = new int[]{1,2,3,4,5};
		ECC_64_SpinningArray.rotate(arr, 3);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			
		}
	}

	public static int[] rotate(int[] arr, int nop) {
		// ADD YOUR CODE HERE
		int count  = nop;
		int temp = 0;
		if (arr == null) {
			return null;
		}
		if (nop == 0) {
			return arr;
		}
		else {
			while (count != 0) {
				temp = arr[arr.length-1];
				arr[arr.length-1] = 0;
				for(int i = arr.length-1 ; i > 0  ; i--) {
					arr[i] = arr[i-1];
				}
				arr[0] = temp;
				count--;
			}
			return arr;
		}		
	}

}
