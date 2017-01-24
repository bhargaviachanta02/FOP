public class ECC_30_EvenNumberTester
{

	public static void main(String[] arg) {
		int num1 = 10;
		int num2 = 20;
		
		System.out.println(getEvenNumbers(num1, num2));
	}

	public static String getEvenNumbers(int num1,int num2)
	{
		String res = "";
		 if (num1 <0 || num2 <0)
             return "-1";
		 
       if ((num1 ==0 ||num2 == 0) ||(num1==num2)) 
             return "-2";
                
      while(num1<= num2){

        if ((num1 % 2) == 0 && (num2 %2) == 0){
            
          res =  res + Integer.toString(num1)+ " ";
        
                     num1 = num1 + 2;
    } 
       
      }
      while( num2<= num1){

          if ((num2 % 2) == 0 && (num1 %2) == 0){
             
             res =  res +Integer.toString(num2)+ " ";
        
                       num2 = num2 + 2;
      } 
         
        }
      return  res.trim();
}
}


