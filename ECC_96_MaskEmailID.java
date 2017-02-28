public class ECC_96_MaskEmailID {
    public static void main(String[] args) {
        String email = "testmail@mailme.com";
        System.out.println(maskMailID(email));
    }

    public static String maskMailID(String email) {
         // ADD YOUR CODE HERE
    	int count = 0;
    	int  count1 = 0;
    	char ch[] = email.toCharArray();
    	for(int  i = 0 ; i < ch.length ; i++) {
    		if(ch[i] == 64) {
    			count++;
    		}
    		if(ch[i] == 46) {
    			count1++;
    		}
    	}
    	if(count == count1) {
    		String str = "";
    		String args[] = email.split("@");
    		for (int i = 0 ; i < args[0].length() ; i++) {
    			if(i < 2) {
    				str = str + args[0].charAt(i);
    			}
    			else {
    				str = str + "X";
    			}
    		}
    		str = str + "@" + args[1];
    		return str;
    	}
    	else {
    		return "Invalid Email";
    	}
    }

}
 	