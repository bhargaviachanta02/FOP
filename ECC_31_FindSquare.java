public class ECC_31_FindSquare
{

	public static void main(String[] arg) {
		int num = 6;
		System.out.println(getSquare(num));
	}

	public static int getSquare(int num)
	{ 
		int res =0;
		if (num == 0)
				return -1;
		if (num<0 )
             return -2;
		if (num>0)
			return num *num;
		/*if (num>0) {
		    double Squareroot = Math.sqrt(num); 
		     res = (int)Math.round(Squareroot);
		 
	    }
	return res;
	*/
		return 0;
	}	
	}
/*double t;

double squareRoot = num / 2;

do {
	t = squareRoot;
	squareRoot = (t + (num / t)) / 2;
} while ((t - squareRoot) != 0);
int y = (int)Math.round(squareRoot);
return y;/*/