public class ECC_44_GeneratePalindrome {

	public static void main(String args[]) {
		
		int number=165;
		System.out.println(getPalindromeList(number));
		
	}
	
	public static String getPalindromeList(int num) {
		
		if(num<=0)
			return "Error";
		else if(num<=100 || num>=1000)
			return "Error";
		else{
			String number, reverse, result=Integer.toString(num)+",";;
			StringBuffer strbuffer;
			String a = "";
			int count=0;
			boolean con;
			while(count<10){	
				number=Integer.toString(num);
				strbuffer=new StringBuffer(number);
				reverse=strbuffer.reverse().toString();
				
				con=number.equals(reverse);

				//if(count<=10){
					if(con==false){
						result+=reverse+",";
						num=num+(Integer.parseInt(reverse));
						//System.out.println(a+" ");
						result+=num + ",";
						// a = result.substring(0, result.lastIndexOf(","));
						 
					}
					else {

						break;
					}
					count++;
				
				//else 
				//	result=null;
				
			}
			if (count==10 ){
				result = result.substring(0, result.lastIndexOf(","));
				result = result.substring(0, result.lastIndexOf(","));
			}else
				result = result.substring(0, result.lastIndexOf(","));
			return result;
		}
		
	}

	
}


































































/*
public class ECC_44_GeneratePalindrome {

	public static void main(String args[]) {
		int input = 42;
		System.out.print (getPalindromeList( input));
		
	}
	public static String getPalindromeList(int input) {
		
         int add =0;
		int num = input;

		int rev_num=0; 
		
		
		while(num!=0){

		rev_num=rev_num*10 + num%10;
		num=num/10;

		}
		

		if(rev_num !=input){
			add =  rev_num + input;
		System.out.println(" " +add);
		}
		
		
	    if (add!=0){
             
			rev_num=rev_num*10 + add%10;
			add=add/10;

			}
		if(rev_num == add)
			System.out.println("true");
		
		
		
	
		return " true it is palindrome";
	}

}
*/