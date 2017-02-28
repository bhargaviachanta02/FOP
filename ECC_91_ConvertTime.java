public class ECC_91_ConvertTime {
    public static void main(String[] args) {
        String time = "17:45:32";
        System.out.println(convertTime12Hrs(time));
    }

    public static String convertTime12Hrs(String time) {
        // ADD YOUR CODE HERE
    	int count = 0;
    	String temp = "";
    	String args[] = time.split(":");
    	if(args.length == 1) {
    		return "Invalid Time";
    	}
    	else {
    		int x = Integer.parseInt(args[0]);
    		if(Integer.parseInt(args[0]) > 12) {
    			x = x - 12;
    			if(x < 10) {
    			    temp = "0" + x;
    				count++;
    			}
    			if(count == 0) {
    				args[0] = Integer.toString(x);
    			}
    			else {
    				args[0] = temp;
    			}
    			time = "";
        		for (int i = 0 ; i <  args.length ; i++) {
        			if(i ==  args.length-1) {
        				time = time + args[i];
        			}
        			else {
        				time = time + args[i] + ":";
        			}
        		}
        		time = time + " " + "PM";
        		return time;
    		}
    		else if(Integer.parseInt(args[0]) == 12) {
    			return time + " " + "PM";
    		}
    		else {
    			return time + " " + "AM";
    		}
    	}
    	
    }

}
