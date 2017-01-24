import java.util.Arrays;

public class ECC_49_FindMaximum {
	
	public static void main(String[] args) {
		
		int[] array={23,67,-34,56,-234,65,23,76,2};
		System.out.println(findMax(array));
		
	}
	
	public static int findMax(int[] input) {
		
		if(input==null)
			return 0;
		else if(checkNegativeCount(input))
			return -1;
		else {
			int max=input[0];
			for(int i=0;i<input.length-1; i++){
				if(input[i]<input[i+1])
					max=input[i+1];
			}
			return max;
		}
		
		
		
	}

	public static boolean checkNegativeCount(int[] input){
		int negCount=0;
		boolean result=false;
		for(int i=0; i<input.length;i++){
			if(input[i]<0)
				negCount++;
			if(negCount<3)
				result=true;
			else
				result=false;
		}
		return result;
	}
}

