
public class ECC_70_ZeroCounter {

	public static void main(String[] args) {
		
		System.out.println(ECC_70_ZeroCounter.countZeros(1200));
		System.out.println(ECC_70_ZeroCounter.countZeros(1000));
		System.out.println(ECC_70_ZeroCounter.countZeros(0));

	}

	public static int countZeros(int num) {
		// ADD YOUR CODE HERE
		int count = 0;
		if ( num == 0) {
			return 1;
		}
		if (num < 0) {
			num = (-1) * num;
		}
		int temp = num;
		int rem = 0;
		while (temp != 0) {
			rem = temp % 10 ;
			if (rem == 0) {
				count++;
			}
			temp = temp/10;
		}
		return count;		
	}

}

