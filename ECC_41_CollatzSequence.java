public class ECC_41_CollatzSequence {
	public static void main(String[] args) {
		int number =5;
		System.out.println(getCollatzSequence(number));
	}




	public static String getCollatzSequence(int n) {
		if (n<=0)
			return "Error";
		int x =0;
		int result =0;
		//while (n <= 1);
	//int m=n;
/*
        while ( m != 1 )
        {
            if ( m % 2 == 0 )
            {
                m = m/2;
            }
            else
            {
                m = 3 * m + 1;
            }

		count++;
		if(m<1)  break;
        }

	System.out.println(count);
	if(count>=100) return "Does not Converge";
  */     String str=Integer.toString(n)+" ";
        while ( n != 1 )
        {
        	
            if ( n % 2 == 0 )
            {
                n = n/2;
                str+=n +" ";
                x++;
            }
            else
            {
                n = 3 * n + 1;
                str+=n + " ";
                x++;
            }

	 
           //x++;
           if (x>=100) {
        	   str = "Does not Converge";
           break;
           }
           
          
        }
        return str.trim();
           
         
        
        
           
    // System.out.println("Terminated after " + x + " steps. \n");
        	  
	}
}