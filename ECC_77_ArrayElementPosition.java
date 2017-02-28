public class ECC_77_ArrayElementPosition {
	//public class JJ {
		public static void main(String[] args) {
			int[] arr = { 10, 20, 30, 40, 50, 60, 70 };
			int s_val = 50;// search value
			System.out.println(getElePosition(arr, s_val));
			
			int t= (minusonepos(arr, s_val));
			if(t ==0)
				t = -1;
			
		}
		public static int getNum(int[]arr,int s_val) {
			int ind =0;
			int x1 =0;
			for (ind =0; ind <arr.length; ind++)
	        {
	    		 if (arr[ind] <=0 ){
	    			x1 =  -4;
	    		 break;
	    		 }
	        }
			return x1;
		}
		public static int minusonepos(int[]arr,int s_val) {
			int ind =0;
			int x3 =0;
			for (ind = 0; ind <= arr.length - 1; ind++) {
				if (arr[ind] != s_val ) 
					x3 = -1;
		}
			return x3;
		}

		public static int getElePosition(int[] arr, int s_val) {
			int x = 0;
			if (s_val <= 0)
				return -3;
			else if (arr.length == 0)
				return -2;
			else {

				int ind = 0;
				int a = 0;

				for (ind = 0; ind <= arr.length - 1; ind++) {
					if (arr[ind] == s_val){
						a = ind + 1;
					x = a;
					break;
	            }
				}
				//int minusone = (minusonepos(arr,s_val));
				 int x2 =(getNum(arr,s_val));
				 int t = 0;
				if ( x2 == -4 ) {
					 x = x2;
					
				 }
				 else if (t== -1) {
					 x = t; 
				 }
				return x;
			}

		}
		
	}
