
public class ECC_68_SpinningString {

	public static void  main(String[] arg) {
		System.out.println(ECC_68_SpinningString.rotate("talent", 1));
		System.out.println(ECC_68_SpinningString.rotate("talent", 2));
		System.out.println(ECC_68_SpinningString.rotate("talent", 3));
		
		
	}

	public static String rotate(String str, int no_of_positions) {
		// ADD YOUR CODE HERE
		String temp = "";
		String strmain = "";
		if (str == null || str.isEmpty()) {
			return null;
		}
		if (no_of_positions <= 0) {
			return str;
		}
		if(no_of_positions > str.length()) {
			return str;
		}
		else {
			while ( no_of_positions > 0) {
				temp = temp + str.charAt(str.length()-1);
				str = str.substring(0, str.length()-1);
				strmain	 = strmain + temp;
				strmain=strmain.concat(str);
				str= strmain;
				strmain = "";
				temp = "";
				no_of_positions--;
			}
			return str;
		}
		
		
	
	}
}