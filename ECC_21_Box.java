public class ECC_21_Box
{
	public static void main(String[] args) {
		int rows = 4;
		int cols = -0;
		System.out.println(createBoxPattern(rows, cols));
	}



	public static String createBoxPattern(int rows,int cols)
	{
		if (rows < 0 || cols <0){
			return "1";
		}
		if (rows == 0 || cols == 0) {
			return "-2";
		}
		 for(int j=1; j<=rows; j++)
		  {  
		    for(int i=1; i<=cols; i++)
		    {
		         if(j ==1 || j==rows || i==1 || i==cols)  
		          {
		             System.out.print("*");
		           }
		      
		         else
		          {
		           System.out.print(" ");
		           }
		    }
		     System.out.println();
		 
		  } 
		 return "";
   }
}

		// ADD YOUR CODE HERE
