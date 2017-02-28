
public class ECC_44_GeneratePalindrome {
    
	    static int reverseNumber(int number)
	    {
	        int reverse = 0;
	         
	        int rem = 0;
	         
	        while (number != 0)
	        {
	            rem = number % 10;
	             
	            reverse = (reverse*10) + rem;
	             
	            number = number/10;
	        }
	         
	        return reverse;
	    }
	     
	    //Method To Check For Palindrome
	     
	    static boolean checkPalindrome(int number)
	    {
	        int reverse = reverseNumber(number);
	         
	        if(reverse == number)
	        {
	            return true;
	        }
	        else
	        {
	            return false;
	        }
	    }
	     
	    //Method To Reverse And Add Given Number Until You Get A Palindrome
	     
	    static String getPalindromeList(int number)
	    {
	    	String S=" ";
	    	if(number<=0){
	    		return "Error";
	    	}
	    	if(number<100 || number>999){
	    		return "Error";
	    	}
	    	if(number>=1000){
	    		return "Error";
	    	}
	    	else  
	    		
	    		
	    		if(checkPalindrome(number))
	        {
	            System.out.println(number);
	            
	        }
	        else
	        {
	        	System.out.print(number);
	            while (!checkPalindrome(number))
	            	
	            {
	                int reverse = reverseNumber(number);
	                 
	                int sum = number + reverse;
	                 
	                System.out.print(","+reverse+","+sum);
	                 
	                number = sum;
	            }
	            System.out.println("\n");
	            //System.out.println("The last number is a PALINDROME");
	        }
	        return S.trim()+"num";
	    }
	
	    public static void main(String[] args) 
	    {
	        int inputNumber =165;
	        //invalidInputs(inputNumber);
	        getPalindromeList(inputNumber);
	      
	       
	    }
	}

