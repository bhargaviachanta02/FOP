public class ECC_89_KaprekarNumber {
    public static void main(String[] args) {
        int num = 0;
        System.out.println(isKaprekarNumber(num));
    }

    public static String isKaprekarNumber(int num) {
        // ADD YOUR CODE HERE
    	if(num < 0) {
    		return "-1";
    	}
    	if (num == 0) {
    		return "-2";
    	}
    	else {
    		int sqr = num * num;
    		String str = Integer.toString(sqr);
    		String str1 = str.substring(0, str.length()/2);
    		str = str.substring((str.length()/2), str.length());
    		int x = Integer.parseInt(str1);
    		int y = Integer.parseInt(str);
    		if(num == (x + y)) {
    			return "True";
    		}
    		else {
    			return "False";
    		}
    	}
    }
}