public class ECC_92_PositiveString {
        //Don't change the code in the main, to test your code you can change the value for String str.
    public static void main(String[] args) {
        String str = "Apple";
        if (isValidString(str)) {
            System.out.println(isPositiveString(str));
        } else {
            System.out.println("Invalid String");
        }
    }

    //return true if the given string contains only alphabits
    public static boolean isValidString(String str) {
        // ADD YOUR CODE HERE
    	String temp = str.toLowerCase();
    	char ch[] = temp.toCharArray();
    	int count = 0;
    	for (int  i = 0 ; i < ch.length ; i++) {
    		if (ch[i] < 96 || ch[i] > 120) {
    			count++;
    		}
    	}
    	if (count == 0) {
    		//System.out.println("true str not hav num");
    		return true;
    	}
    	else {
    		//System.out.println(" str having numbers flase");
    		return false;
    	}
    }

    //return true if the given string is positive string
    public static boolean isPositiveString(String str) {
       // ADD YOUR CODE HERE
    	//System.out.println();
    	String  temp = str.toLowerCase();
    	char ch[] = temp.toCharArray();
    	int count = 0;
    	for(int  i = 0 ; i < ch.length-1 ; i++) {
    		if (ch[i] > ch[i+1]){
    			count++;
    		}
    	}
    	if(count == 0) {
    		return true;
    	}
    	else {
    		return false;
    	}
    	//return false;
    }

}
