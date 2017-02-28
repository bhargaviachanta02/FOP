public class ECC_95_ValidateEmailID {
    public static void main(String[] args) {
        String email = "target@mail.com";//"testmail@mailme.com";
        if (isValidMailID(email).equals("Valid")) {
            System.out.println("Valid EmailID");
        } else {
            System.out.println("Invalid EmailID");
        }
        System.out.println(isValidMailID(email));
    }

    public static String isValidMailID(String email) {
         // ADD YOUR CODE HERE
    	String args[] = email.split("@");
    	//char ch1 = 46;
    	//System.out.println(email.charAt(0));
    	if (email.charAt(0) < 97 || email.charAt(0) > 122){
    		return "-1";
    	}
    	if (!(email.contains("@"))) {
    		return "-2";
    	}
    	if(email.contains("@")) {
    		String srgs[] = email.split("@");
    		if(srgs.length > 2) {
    			//System.out.println("email having multiple @ symbol");
    			return "-3";
    		}
    	}
    	if(!(email.endsWith(".com")) && !(email.endsWith(".co.in"))) {
    		return "-4";
    	}
    	String srgs[] = email.split(".c");
    	if(email.contains("_") || args[0].contains(".") || srgs[0].contains(".")){
    		return "-5";
    	}
    	char ch[] = email.toCharArray();
    	for (int i = 0 ; i < ch.length ; i++) {
            if (ch[i] == 64 || ch[i] == 46) {
    		    continue;	
    		}
    		if (ch[i] < 97 || ch[i] >122 ) {
    			return "-5";
    		}
    	}    		
    	return "Valid";
    }
}
