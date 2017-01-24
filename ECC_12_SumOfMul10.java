public class ECC_12_SumOfMul10 {
    public static void main(String[] args) {
        int A = 10, B = 19, C = 19;
        System.out.println(sumOfMultiples(A, B, C));
    }

    public static int sumOfMultiples(int a, int b, int c) {

    	//if ( a <= 0 && b<=0 && c<=0 )
    	 //return -1;
        int res;
        int val1;
        int val2;
        int val3;
        
        if (a <= 0)  { 
            return -1;
        }
        else { 
          val1=(((a +9)/10) *(10));
          
        }
        if (b <= 0) { 
      		return -1;
        }
        else { 
          val2 = (((b +9)/10) *(10));
        }
        if (c <= 0) { 
      		return -1;
        }
        else { 
          val3=(((c +9)/10) *(10));
          
        }
        
         
      return res = val1+val2+val3;
      }
  
}                  
    	
    	
    	
    	
    	
    	/*
    	if ((a%10) != 0) 
    	return (a = (a+ 9) / 10 * 10);
    	else if(a % 10 == 0 )
    		return a;
    	// for b:
    	if ((b%10) != 0) 
        	return (b = (a+ 9) / 10 * 10);
        else if(b % 10 == 0 )
        		return b;
    	// for c:
    	if ((c%10) != 0) 
        	return (c = (a+ 9) / 10 * 10);
        else if(a % 10 == 0 )
        		return c;
    */
    //	return 0;
        // ADD YOUR CODE HERE
    
