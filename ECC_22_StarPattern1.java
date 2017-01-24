





public class ECC_22_StarPattern1{

	public static void main(String[] arg) {
		int num = 5;
		System.out.println(createStarPattern(num));
	}

	public static String createStarPattern(int rows)
	{
		String pattern="";
		
		if(rows<0)
			return "-1";
		else if(rows==0)
			return "-2";
		else{
			for(int i=1;i<=rows;i++){
				for(int j=1;j<=i;j++){
					pattern+="* ";
					
				}
				pattern=pattern.trim();
				if(rows!=i)
					pattern+="\n";
			}
		}
		return pattern;
	}
}





















/*public class ECC_22_StarPattern1
{

	public static void main(String[] arg) {
		int num = 4;
		System.out.println(createStarPattern(num));
	}

	public static String createStarPattern(int num)
	{
		String z1=" ";
		if (num <0 ){
			return"-1";
			
		}
		if (num ==0) {
			return "-2";
		}
		int i;
		for(i=0; i<=num; i++)
		{
		   for(int j=0; j<i; j++)
		    {
		     System.out.print("* " + " ");
		    }
		System.out.println();
		
		}int z = i -num; 
		 z1 = Integer.toString(z) + " ";
		 z1 = "";
		return z1;
		}
	
 }

		// ADD YOUR CODE HERE
*/