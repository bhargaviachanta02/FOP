
public class ECC_37_Adder
{

	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 20;
		System.out.println(getSum(n1, n2));

	}

	public static String getSum(int num1, int num2){
		String res2 = "";
		if (num1<=0 || num2<=0)
			return "Error"; 
		if (num1>0 && num2>0) {
		int res =  num1 +num2;
		 res2= Integer.toString(res);
		}
		return res2;
		
	}
	
	
}
