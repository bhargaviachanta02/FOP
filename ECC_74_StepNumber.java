
public class ECC_74_StepNumber {

	public static void main(String[] args) {
		System.out.println(ECC_74_StepNumber.isStepNumber(98765));
	}

	public static boolean isStepNumber(int num) {
		// if (num >= 0 && num <= 9) return true;
		    while (num >= 10) {
		        if (Math.abs(num % 10 - (num / 10) % 10) != 1) { // compare last two digits
		            return false;
		        }
		        num = num / 10;
		    }
		    return true;
		}
	}
		/*boolean result = true;
	String res = Integer.toString(num);
	int i =0;
	String a ="";
   String b = "";
	for (i=0; i<res.length()-1;i++){
	      
		 if((res.charAt(i+1))- (res.charAt(i))==1) {
			 res = "true";
			 result = res.equalsIgnoreCase("true");
	      }
		 else if((res.charAt(i))- (res.charAt(i+1))!=1)  {
			 
		res = "false";
		 result = res.equalsIgnoreCase("false");
		 
       }
     }
	return result;
 }
}
*/