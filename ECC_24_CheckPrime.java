public class ECC_24_CheckPrime
{
	
	public static void main(String[] arg) {
		int num = 0;
		System.out.println(checkPrime(num));		
	}

	public static String checkPrime(int num)
	{
		String res = "";
		if (num <0 )
			return"-1";
			
		
		else if (num ==0 || num == 1) 
			return "-2";
		else {
		 for(int i=2; i<=num/2; i++){
		
	            if(num % i == 1){
	                return  res = "true";
	            } else {
	            	return res = "false";
	            }
	            
		 }
		 return res;
	}
}
}
	
		  
		   
		       
		  
	       
		 

	

