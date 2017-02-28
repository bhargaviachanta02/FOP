
public class ECC_50_CricketScores {

	public static String getDisplayDetails(int runs, float Overs){
		// ADD YOUR CODE HERE
		float x = ((Overs * (float)10) % (float)10) + (float)((Math.floor((double)Overs)) * 6);
		int ball = (int) x;
		if(runs < 100 || ball < 100) {
			float rate =(float) runs/(float)ball;
			rate = Math.round(rate * (float)100.0)/(float)100.0;
			return runs + " runs in " +  ball + " balls @ " + rate + " runs per ball";
		}
		else {
			float rate =(float) runs/(float)Overs;
			rate = Math.round(rate * (float)100.0)/(float)100.0;
			return runs + " runs in " +  Overs + " Overs @ " + rate + " runs per over";			
		}
		//System.out.println(ball);
		//return null;
	}
	
	
	public static void main(String[] args) {
		// Test your code here
		int runs = 130; 
		float Overs = 10.5f;
		System.out.println(getDisplayDetails(runs, Overs));

	}

}
