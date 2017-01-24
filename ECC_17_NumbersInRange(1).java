public class ECC_17_NumbersInRange {

	public static void main(String[] arg) {
		int num1 = 10;
		int num2 = 20;
		System.out.println(getNumbersInRange(num1, num2));
	}

	public static String getNumbersInRange(int num1,int num2)
	{

		String result = "";
		
		if(num1<0 || num2<0)
			return "-1";
		else if(num1==num2)
			return "-2";
		else if(num1>=num2)
			return "-3";
		
		else{
			while(num1<num2-1){
				num1++;
				result+=Integer.toString(num1)+" ";
				
			}
			return result.trim();
		}

	}
}





































/*public class ECC_17_NumbersInRange {

  public static void main(String[] arg ) {
		int num1 =10;
		int num2 = 20;
        
  
		
		System.out.println(getNumbersInRange(num1, num2));
	}

   public static String getNumbersInRange(int num1,int num2)
	{
	   String res = " ";
		if(num1<0 || num2<0)
			return "-1";
		else if(num1==num2)
			return "-2";
		else if(num1>=num2)
			return "-3";
		else {
           String res1 = "";
            while(num1 < num2-1) {
   	      //  String res = " ";
     	        res =  res +num1+ " ";

               // System.out.println(res);
 		               num1++;
             } return res;
		// ADD YOUR CODE HERE
//		return  null;
	}
  }
}
*/