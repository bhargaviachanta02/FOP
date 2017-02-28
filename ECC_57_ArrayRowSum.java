
public class ECC_57_ArrayRowSum {

	public static void main(String[] args) {
		try {
			int[] res = getRowSum(new int[][]{});
			if(res == null) {
				System.out.println(res);
			}
			else {
				for(int i = 0 ; i < res.length ; i++){
					System.out.println(i);
				}
			}
		}catch (Exception e) {
			System.out.println("null");
		}
	}
	
	public static int[] getRowSum(int[][] arr){
		// ADD YOUR CODE HERE
		try {
			int sum = 0;
			if(arr == null) {
				return null;
			}
			int []ar = new int[arr.length];
			if(arr.length != 3) {
				return null;
			}
			else {
				for(int i = 0 ; i < arr.length ; i++) {
					if(arr[i].length != 3) {
						return null;
					}
				}
			}
			for(int i = 0; i < arr.length ; i++) {
				for(int  j = 0 ; j < arr[i].length ; j++) {
					sum  = sum + arr[i][j];
				}
				ar[i] = sum;
				sum = 0;
			}
			return ar;
		}catch (Exception e) {
			return null;
		}
	}
}
