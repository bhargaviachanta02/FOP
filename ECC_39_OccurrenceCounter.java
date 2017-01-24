
public class ECC_39_OccurrenceCounter {
	
	public static void main(String[] args) {
		//Exception in thread "main" java.lang.NullPointerException
        int[] arr = {1, 2, 3, 7, 5, 6, 7, 8, 7, 0};
        int searchValue = 7;
        System.out.println(getCount(arr, searchValue));
	}
	public static int getCount(int[] arr, int givenNumber){
		int count = 0;
		if (arr == null) 
			return -1;
		else  if (arr.length == 0) 
			 return -1;
		else{
	        for(int i = 0; i < arr.length; i++)

        {

            if(arr[i] == givenNumber)

            {

                count++;

            }

        }return count;
		
		//return 0;
	}
	


   }
}