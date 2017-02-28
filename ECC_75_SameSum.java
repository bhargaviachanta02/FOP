
public class ECC_75_SameSum {

	public static void main(String[] args) {
		System.out.println(ECC_75_SameSum.isSameSum(-2222));

	}

	public static boolean isSameSum(int n) {
		// ADD YOUR CODE HERE
		if(n < 0) {
			n = n * (-1);
		}
		int temp = n;
		int count = 0;
		int sume = 0;
		int sumo = 0;
		int rem = 0;
		while (temp != 0) {
			rem = temp % 10;
			count++;
			if ( count % 2 == 0) {
				sume = sume + rem;
			}
			else {
				sumo = sumo + rem;
			}
			temp = temp / 10;
		}
		if (sume == sumo) {
			return true;
		}
		else {
			return false;
		}
	}

}
