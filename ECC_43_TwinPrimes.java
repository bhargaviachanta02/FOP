import java.util.ArrayList;
import java.util.ListIterator;

public class ECC_43_TwinPrimes {

	public static void main(String args[]) {
		int num1=10;
		int num2=50;
		
		System.out.println(getTwinPrimes(num1, num2));
		
	}
	
	public static String getTwinPrimes(int num1, int num2) {
		
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		int prime1 = 0, prime2=0;
		String result="", twinPrime="";
		
		if(num1<=0 || num2<=0 || num1>100 || num2>100 || num1>=num2)
			return "Error";
		else {
			int flag;
						
			for(int j=num1;j<=num2;j++){
				
				flag=0;
				
				for(int i=1;i<=j;i++){
					if(j%i==0)
						flag++;
				}
			//	System.out.println(j +" "+ flag);
				
				if(flag<=2)
					al.add(j);
			
			}
			
			for(int k=0; k<al.size()-1; k++){
				
				if(al.get(k+1)-al.get(k)==2){
					prime1=al.get(k);
					prime2=al.get(k+1);
					twinPrime=Integer.toString(prime1)+","+Integer.toString(prime2)+";";
					
				}
				else
					twinPrime="";
				result+=twinPrime;
			
			}
			
			if(result.equalsIgnoreCase(""))
				return "No Twin Primes Found";
			else{
		//		int index=result.lastIndexOf(";");
		//		result=result.substring(0,index);
				return result;
			}	
		}
				
	}

}