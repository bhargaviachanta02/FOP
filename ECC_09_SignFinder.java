public class ECC_09_SignFinder {
    public static void main(String[] args) {
        int num = 34;
        System.out.println(findSign(num));
    }

    public static int findSign(int num) {
    	if (num >0)
    	return 1;
    	if  (num<0)
    	return -1;
    	if (num == 0)
    	 return 0;
    else
    	return 0; 
        // ADD YOUR CODE HERE
    }
}

