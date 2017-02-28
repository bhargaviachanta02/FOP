
public class ECC_73_GCD {

	public static void main(String[] args) {
		System.out.println(ECC_73_GCD.getGCD(123, -345));
	}

	public static int getGCD(int i, int j) {
		if (i <= 0 || j <= 0)
			return -1;
		int r = 0;
		while(j != 0)
        {
            r = i % j;
            i = j;
            j = r;
        }
        return i;
    }
}
