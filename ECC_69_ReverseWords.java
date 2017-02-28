
public class ECC_69_ReverseWords {

	public static void main(String[] args) {
		System.out.println(ECC_69_ReverseWords.reverse("talent sprint"));
	}

	public static String reverse(String str) {
		if (str == null)
			return null;
		else if (str == "")
			return null;
		else {
		String inputString = str;
		 String[] words = inputString.split(" ");
         
	        String reverseString = "";
	         
	        for (int i = 0; i < words.length; i++) 
	        {
	            String word = words[i];
	             
	            String reverseWord = "";
	             
	            for (int j = word.length()-1; j >= 0; j--) 
	            {
	                reverseWord = reverseWord + word.charAt(j);
	            }
	             
	            reverseString = reverseString + reverseWord + " ";
	        }
	         
	        
	       
	       return reverseString.trim();
		} 
	      
	    }
}