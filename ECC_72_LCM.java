public class ECC_72_LCM {

	public static void main(String[] args) {
		System.out.println(ECC_72_LCM.lcm(10, -20));
		System.out.println(ECC_72_LCM.lcm(3, 5));
	}

	public static int lcm(int i, int j) {
		if (i <= 0 || j <= 0)
			return -1;

		int max = i > j ? i : j;
		int min = i < j ? i : j;

		int x = 0;
		int lcm = 0;
		for (int k = 1; k <= min; k++) {
			x = max * k;
			if (x % min == 0) {
				lcm = x;
				break;
			}
		}
		return lcm;
	}

}
