
public class ECC_63_AverageWordLength {

	public static void main(String[] args) {
		System.out.println(ECC_63_AverageWordLength.getAverageWordLength("Hi mom"));
		System.out.println(ECC_63_AverageWordLength.getAverageWordLength("hi everyone"));
	}

	public static int getAverageWordLength(String str) {		
		// ADD YOUR CODE HERE
		int count = 0;
		int count1 = 0;
		if (str == null) {
			return -1;
		}
		if (str.isEmpty()) {
			return 0;
		}
		else {
			String []str1 = str.split(" ");
			//System.out.println("no of word : " + str1.length);
			for (int i = 0 ; i < str.length() ; i++) {
				if (str.charAt(i) == ' ') {
					count1++;
				}
				else {
					count++;
				}
			}
			//System.out.println("no of space :" + count1);
			//System.out.println("no of character :" + count);
			return count/str1.length;
		}
		//return 0;
	}

}
