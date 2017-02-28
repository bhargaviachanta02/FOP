public class ECC_67_NthTermQSequence {

	public static void main(String[] args) {
		System.out.println(ECC_67_NthTermQSequence.getNthTerm(10));
	}

	public static int getNthTerm(int n) {
		int  input =n;
		 int res =0 ;
				 int  count =0;
		 if (input < 0 || input == 0) {
		        return -1;
		      }
	      for (int i = 1; i<= input;i++) {
	        res = (((i)*(i+1))/2);
	      count =(res);
	        }
	      	return (count);
	     
	     
	      
	    
		// ADD YOUR CODE HERE
	}
	
	

}
