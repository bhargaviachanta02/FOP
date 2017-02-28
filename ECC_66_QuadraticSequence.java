
public class ECC_66_QuadraticSequence {

	public static void main(String[] args) {
		System.out.println(ECC_66_QuadraticSequence.getQuadricSequence(10));
	}

	public static String getQuadricSequence(int n) {
		 int input =n, res =0 , count =0;
		 String res1 = "";
	      if (input <=0 ) 
	        return null;
	      
	      for (int i = 1; i<= input;i++) {
	        res = (((i)*(i+1))/2);
	        res1+=(res+",");
	        }
	      res1 = res1.replaceAll(",$","");
	      return (res1);
    }
}
