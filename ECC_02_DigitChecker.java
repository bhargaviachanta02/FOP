
public class ECC_02_DigitChecker {

	  public static void main(String[] args) {
	        int num = 83;
	        System.out.println(getDiffOfDigits(num));
	    } 
	  public static int getDiffOfDigits(int x){
	    	// first case:
	    	if (x < 0)
	    		return -3;
	      // second case:
	    	else if (x>99) 
	    	return -2;
	          // third case:
	    	if ( (x >=0) && (x<=9) )
	    		return -1;
	    	
	          // fourth case:
            else
	           return( x /10 - x %10  );
	          //return( x %10 - x /10  );
	         //else 
	         //return 0;
	        // ADD YOUR CODE HERE
	    }
	}
