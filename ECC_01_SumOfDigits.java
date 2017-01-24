
public class ECC_01_SumOfDigits {

	public static void main(String[] args) {
        int num = -1;
        System.out.println(getSumOfDigits(num));
    }

    public static int getSumOfDigits(int x){
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
      if ( (x >10 )&& (x<= 99) )   
          return( (x / 10 ) + (x%10) );
         else 
         return 0;
        // ADD YOUR CODE HERE
    }
}

