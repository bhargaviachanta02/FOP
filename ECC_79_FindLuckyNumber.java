public class ECC_79_FindLuckyNumber {
    public static void main(String[] args) {
        String date = "27-March-1994";
        System.out.println(getLuckyNumber(date));
    }
    // return the lucky number, based on date of birth
    public static int getLuckyNumber(String date) {
        // ADD YOUR CODE HERE
    	String arr[] = date.split("-");
    	int dt = Integer.parseInt(arr[0]);
    	String str = arr[1];
    	int year = Integer.parseInt(arr[2]);
    	int sum = getSumOfDigits(dt) + getSumOfDigits(convertMMMtoMM(str)) + getSumOfDigits(year);
    	while (sum >= 10) {
    		sum = getSumOfDigits(sum);
    	}
    	return sum;
    }

    // convert the given month in to number format(given "JAN" return 1)
    public static int convertMMMtoMM(String mon) {
        // ADD YOUR CODE HERE
    	int temp = 0;
    	String str[] = {"jan","feb","mar","apr","may","jun", "jul","aug", "sept","oct", "nov","dec"};
    	String str1[] = {"january","february","march","april","may","june","july","august","september","october","november","december"};
    	String str2[] = {"JAN","FEB","MAR","APR","MAY","JUN","JUL","AUG","SEP","OCT","NOV","DEC"};
    	String str3[] = {"JANUARY","FEBRUARY","MARCH","APRIL","MAY","JUNE","JULY","AUGUST","SEPTEMBER","OCTOBER","NOVEMBER","DECEMBER"};
    	for (int i = 0 ; i < str.length ; i++) {
    		if(str[i].equals(mon.toLowerCase()) || str1[i].equals(mon.toLowerCase())|| str2[i].equals(mon.toUpperCase())||str3[i].equals(mon.toUpperCase())) {	
    			temp =  i+1;
    		}
    	}
    	return temp;
    }
    
    
    
    // add the sum of all digits for the given number
    public static int getSumOfDigits(int num) {
        // ADD YOUR CODE HERE
    	int temp = num;
    	int rem = 0;
    	int sum = 0;
    	while (temp != 0) {
    		rem = temp % 10;
    		sum = sum + rem;
    		temp = temp / 10;
    	}
    	return sum;
    }
}
