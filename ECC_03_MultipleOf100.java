
public class ECC_03_MultipleOf100 {

	public static void main(String[] args) {
        int num = 123;
        System.out.println(getNextMultipleOf100(num));
    }
    
    public static int getNextMultipleOf100(int x) {
    	if (x<= 0)
    		return -1;
     else
    	 return ( (x/100 + 1)  * 100);
         // ADD YOUR CODE HERE
    }
}
