public class ECC_62_MatchingParenthesis {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.out.println(isMatchingParenthesis("(2+3)"));
		System.out.println(isMatchingParenthesis("((a + b) * c)"));
		System.out.println(isMatchingParenthesis("(a + b) * c)"));
		System.out.println(isMatchingParenthesis(")(a + b) * c))"));
		
	}

	public static boolean isMatchingParenthesis(String text) {
		// ADD YOUR CODE HERE
		int  count = 0;
		int count1 = 0;
		if(text == null) {
			return false;
		}
		if(text.isEmpty()){
			return true;
		}
		if(text.charAt(0) == ')'){
			return false;
		}
		else {
			for(int i = 0 ; i < text.length() ; i++) {
				if(text.charAt(i) == '(') {
					count++;
				}
				if(text.charAt(i) == ')') {
					count1++;
				}
			}
			if(count == count1) {
				return true;
			}
			else {
				return false;
			}
		}
	}

}
