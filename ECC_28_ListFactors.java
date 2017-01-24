public class ECC_28_ListFactors{
    public static void main(String[] args) {
        int num = 28;
        System.out.println(getFactors(num));
    }
        public static String getFactors(int num) {
               String z = "";
               int i;
                if (num < 0)
                        return "-1";
                
                else if (num == 0)
                        return "-2";
                              
               else {
                	for( i = 1; i <= num; i++) {
                        	if(num%i == 0) {
                        		//System.out.print(i + " ");
                        		z += ( Integer.toString(i) + " ");
                        	}
                      } 
                     //  z ="";
                    return z.trim();
               }

}

}
		// ADD CODE HERE
	

