public class ECC_47_OddSum {
	public static void main(String[] args) {
		int[] array = {1,3,5,4,2};
		System.out.print(getOddSum(array));
		
	}
	public static int getOddSum(int[] array)
	{
		 int i =0;
		 int count = 0;
		 int sum = 0;
		if(array==null)
			return -4;
		 else if (array.length !=5)
			return -1;
		 else if (contains(array))
			return -2;
		 else{
				for( i = 0; i <array.length; i++) {
					
					if(array[i] % 2 != 0) {
						sum = sum +array[i];
						//System.out.println("" +array[i]);
						count++;
					}
					
				 }
				if (count == 0)
					return -3;
				else
					return (sum);
			
		}
	


	
		//return 0;
	}
	
	
	public static boolean contains(int[] array) {
		boolean res = true;
	      for (int n : array) {
	         if (n<=0) {
	        	 res =  true;
	        	 break;
	         }
	         else
	        	 res = false;
	      }
	      return  res;
	   }
}
