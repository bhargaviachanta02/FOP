public class ECC_23_NumberPattern4
{
	public static void main(String[] arg) {
		int rows = 6;
		System.out.println(createNumberPattern(rows));
	}
	public static String createNumberPattern(int rows)
	{
		if (rows <0 ){
			return"-1";
			
		}
		if (rows ==0) {
			return "-2";
		}
		int count = 1;
		for (int i = 1; i <= rows; i++)
        {
			System.out.println("\r");
            for (int j = 1; j <= i; j++)
            {
             String z =("\r"+count+"\t ");
                count++;
                System.out.print(z.trim());   
           }
             
            System.out.println();
        }
         
		return "";
		}
	
 }