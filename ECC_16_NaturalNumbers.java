
public class ECC_16_NaturalNumbers
{

  public static void main(String[] arg ) {
		int num1 = 10;
		int num2 = 20;
        
  
		//String result = " ";
		System.out.println(getNaturalNumbers(num1, num2));
	}

   public static String getNaturalNumbers(int num1,int num2)
	{
	   if (num1<0 || num2<0)
		   return "-1";
	   else if (num1 == 0 || num2==0)
            return "-2";
	   
	   
	        String res = "";
            while(num1 <= num2) {
   	       // String res = " ";
     	        res =  res +num1+ " ";

                //System.out.println(res);
 		               num1++;
             } return res.trim();
		
	}
}

