
public class ECC_46_OddCount {

	
		public static void main(String[] args) {
			// TEST YOUR CODE HERE
			int[] array = {2,4,0,-4,1};
			System.out.print(getOddCount(array));
		}
		/*public static boolean checkEven(int[] array) {
			boolean res = true;
			for( int i = 0; i <array.length; i++) {
		         if (array[i] % 2 == 0) {
		           res =  true;
		            break;
		         }
		         else
		        	 res = false;
		      }
		
		      return  res;
		   }
		*/
		
		
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
		
		
		
		public static String getOddCount(int[] array)
	     { 
			int i =0;
			 int count = 0;
			if(array==null)
				return "-4";
			 else if (array.length !=5)
				return "-1";
			 else if (contains(array))
				return "-2";
			 else{
					for( i = 0; i <array.length; i++) {
						
						if(array[i] % 2 != 0) {
							count++;
						}
						
					 }
					if (count == 0)
						return "-3";
					else
						return Integer.toString(count);
				
			}
		
     }
}

