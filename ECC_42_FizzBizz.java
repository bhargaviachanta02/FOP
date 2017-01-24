public class ECC_42_FizzBizz {
    public static void main(String[] args) {
    	 int num = 25;
        System.out.println(getFizzBizz(num));
     
       // if ( num <= 0)
         //   System.out.print("Error");                // count from 1 to 100
           
        
          /*
        
        	 */
    
    }
	public static String getFizzBizz(int num) {
		if (num <=0){
			return "Error";     
        }
		
	        if (((num% 5) == 0) &&((num% 3) == 0))       return "FIZZBIZZ";
	          else if ((num % 5) == 0)					  return "BIZZ" ; // else a multiple of 5?
	          else if ((num % 3) == 0) 					  return "FIZZ";// else a multiple of 7?
	          else if (((num% 3) != 0) && ((num% 5) != 0)) return Integer.toString(num);

	return Integer.toString(0);
	}
}

