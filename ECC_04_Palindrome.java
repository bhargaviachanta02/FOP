public class ECC_04_Palindrome {
    public static void main(String[] args) {
        int num = 2441;
        System.out.println(isPalindrome(num));
    }
   

    public static int isPalindrome(int x) {
          
    	if (x <= 0)
    		return -1;
      else if  (x>=999 || x<=99) 
    	return -2;

        int palindrome = x; // copied number into variable
        int reverse = 0;

        while (palindrome != 0) {
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
        }

        
        if (x == reverse) {
            return 1;
        }
        return 0;
    }

}


      
