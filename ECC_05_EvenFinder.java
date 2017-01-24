 public class ECC_05_EvenFinder {
    public static void main(String[] args) {
        int num = 24;
        System.out.println(isEven(num));
    }
    
    public static int isEven(int x) { 
    	if (x<=0)
    		return -1;
    	else if (x % 2 == 0)
    		return 1;
    	else 
    	return 0;
    	
    	
        // ADD YOUR CODE HERE
    }
}
