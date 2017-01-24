	
public class ECC_26_CheckArmStrong {
	 public static void main(String[] args) {
	       
	       int inputNumber = 99594;
	      // int num = 164;
			System.out.println(checkArmStrong(inputNumber));
	   }
	
	 public static String checkArmStrong(int inputNumber) {
			if ( inputNumber <= 0 )
				return"-1";
			
			else if (inputNumber<=999|| inputNumber >=9999)
				
				return "-2";
			
			else
			{
				String inputAsString =  inputNumber + "";
				int numberOfDigits = inputAsString.length();
				int copyOfInput =  inputNumber;
				int sum = 0;
				while (copyOfInput != 0) {
					int lastDigit = copyOfInput % 10;
					sum = sum + (int) Math.pow(lastDigit, numberOfDigits);
					copyOfInput = copyOfInput / 10;
				}
				if (sum ==  inputNumber) {
					return "ArmStrong Number";
	            } else {
	    	        return "Not ArmStrong Number" ;
	       }
	   }

	  
	}
}