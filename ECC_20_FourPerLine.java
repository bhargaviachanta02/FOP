






public class ECC_20_FourPerLine {

	public static void main(String[] arg) {
		int num = 12;
		System.out.println(getFourPerLine(num));
	}
	
	public static String getFourPerLine(int num)
	{	
		String result="";
		
		if(num<0)
			return "-1";
		else if(num==0)
			return "-2";
		else if(num>99)
			return "-3";
		else{
			
			for(int i=1;i<=num;i++){
				
				result+=Integer.toString(i)+" ";
				
				if(i%4==0){
					result=result.trim()+"\n";
				}
			}
			return result.trim();
		}
	}
}









































/*public class ECC_20_FourPerLine
{

	public static void main(String[] arg) {
		int num = 12;
		System.out.println(getFourPerLine(num));
	}

	public static String getFourPerLine(int num)
	{
		 String z = " ";
		 String res = " ";
		 //String res = "";
		 
		if (num <0) {
		return "-1";
		}
		if (num==0){
			return "-2";
		}
		if (num > 99){
			return "-3";
			
		}
		int enter = 0;
		  for (int x = 1; x <= 12; x++) {

		        if (enter == 4){
		        	System.out.println();
		          enter = 0;
		         
		        }enter++;
		        
		       z =(Integer.toString(x)+ "");
		     
		     //  System.out.print("");
		       System.out.print(z+" " );
		        
		        
		         res = z.trim();
		      
		     }
		  res = "";
		  
		
		    
		 
		   return res.trim();
      }
}
*/