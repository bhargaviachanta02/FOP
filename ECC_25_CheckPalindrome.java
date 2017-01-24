
public class ECC_25_CheckPalindrome
{

	public static void main(String[] arg) {
		int num = 124;
		System.out.println(checkPalindrome(num));
	}

	public static String checkPalindrome(int num)
	{
		if (num <0 ){
			return"-1";
			
		}
		if (num >= 0  && num <=9)
			return "-2";
		   int palindrome = num; 
	        int reverse = 0;

	        while (palindrome != 0) {
	            int remainder = palindrome % 10;
	            reverse = reverse * 10 + remainder;
	            palindrome = palindrome / 10;
	        }

	        // if original and reverse of number is equal means
	        // number is palindrome in Java
	        if (num == reverse) {
	            return "true";
	        }
	        return "false";
	    
	}
		
		
	
}

