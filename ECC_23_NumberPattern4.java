public class ECC_23_NumberPattern4
{

	public static void main(String[] arg) {
		int rows = 20;
		System.out.println(createNumberPattern(rows));
	}

	public static String createNumberPattern(int rows)
	{
		// ADD YOUR CODE HERE
		String str = "* ";
		String args[] ;
		args = str.split(" ", 2);
		str = args[1];
		if (rows < 0) {
			return "-1";
		}
		if (rows == 0) {
			return "-2";
		}
		else {
			for (int i = 1 ; i <= rows ; i++) {
				for (int j = 1 ; j <= i ; j++) {
					if( j == i) {
						str = str + Integer.toString(i*j);
					}
					else {
						str = str + Integer.toString(i*j);
						str = str + " ";
					}
				}
				if (i != rows) {
					str = str + "\n";
				}
			}
			return str;
		}
	}
}
