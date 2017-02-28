
public class ECC_65_ProductPanlindrome {

	public static void main(String[] args) {
		System.out.println(ECC_65_ProductPanlindrome.getCount());
	}

	public static boolean isPalindrome(int n) {
		int rev=0,m=n;
		while(n!=0) {
			int rem=n%10;
			rev=rev*10+rem;
			n/=10;
		}
		
		if(rev==m) return true;
		else return false;
	}


	public static int getCount() {
		// ADD YOUR CODE HERE
		int count=0;
		for(int i=11;i<=99;i++)
		for(int j=11;j<=99;j++)
		if(isPalindrome(i*j)==true)
		 count++;

		return count;
	}	

}