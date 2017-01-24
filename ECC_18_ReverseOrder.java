public class ECC_18_ReverseOrder
{
 public static void main(String[] arg ) {
                int num1 = 20;
                int num2 = 10;


               // String result = " ";
                System.out.println(getNumbersInRange(num1, num2));
        }

   public static String getNumbersInRange(int num1,int num2)
        {
           //String res1 = "";
	   if (num1<0 ||num2<0)
		   return "-1";
	   if(num1 ==num2)
		   return "-2";
	   if(num1<num2)
		   return "-3";
	   if((num1 -num2) <=1)
		   return "-4";
	   String res = " ";
          int  res2 =  num1 -1;
            while(res2 > num2 ){
            	res =  res +res2+ " ";

                //System.out.println(res);
                               res2--;
             } 
            return res.trim();
                // ADD YOUR CODE HERE
//              return  null;
        }
}


