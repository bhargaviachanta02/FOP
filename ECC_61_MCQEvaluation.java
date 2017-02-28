
public class ECC_61_MCQEvaluation {

	public static void main(String[] args) {
		
		System.out.println(ECC_61_MCQEvaluation.evaluate(new char[]{'a','b','c','d','a','b','c','d','a'}, new char[]{'a','b','b','d','a','b','c','b','a'}));
		System.out.println(ECC_61_MCQEvaluation.evaluate(new char[]{'a','b','c','d','a','b','c','d','a'}, new char[]{'a','b','b','d','a','b','a'}));	

	}
	
	// 2 marks for right answer
	// No nagative marks
	
	public static int evaluate(char[] attempt, char[] key){
		// ADD YOUR CODE HERE
		int marks = 0;
		if(attempt.length != key.length){
			return -1;
		}
		else {
			for(int i = 0 ; i < attempt.length ; i++) {
				if(attempt[i] == key[i]) {
					marks = marks + 2;;
				}
			}
			return marks;
		}
	}
}
