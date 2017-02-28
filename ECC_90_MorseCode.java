public class ECC_90_MorseCode {
	
	public static void main(String[] args) {
        String text = "";
		System.out.println(getMorseCode(text));
    }
	
	public static String getMorseCode(String text) {
		 // ADD YOUR CODE HERE
		char[] chr = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		String[] str = {".-","-...","-.-.","-..",".","..-.","--.","...." ,".." , ".---","-.-" ,".-.." ,"--" ,"-."  , "---" ,".--." ,"--.-" ,".-." ,"...","-" ,"..-","...-",".--","-..-","-.--", "--.."};
		String str1 = "";
		if(text == null){
			return "Null String";
		}
		if(text.isEmpty()) {
			return "Empty String";
		}
		for(int i = 0 ;i < text.length() ; i++) {
			if(text.charAt(i) < 97 || text.charAt(i) > 122) {
				return "Invalid Letters";
			}
		}
		for(int  i = 0 ; i < text.length() ; i++) {
			for(int  j = 0 ; j <  chr.length ; j++) {
				if(text.charAt(i) == chr[j]) {
					//System.out.println(str[j]);
					str1 = str1 + str[j];
					break;
				}
			}
		}
		return str1;
	}
}