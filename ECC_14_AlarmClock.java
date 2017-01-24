
public class ECC_14_AlarmClock {
    public static void main(String[] args) {
        int day_of_week = 1;
        boolean onVac = true;
        System.out.println(ringAlarm(day_of_week, onVac));
    }

    public static String ringAlarm(int dayOfWeek, boolean onVac) {
    	
    	if(dayOfWeek<0 || dayOfWeek>6 || (onVac!=true && onVac!=false))
    		return "Invalid Inputs";
    	else if((dayOfWeek>=1 && dayOfWeek<=5) && onVac==true)
    		return "10:00";
    	else if((dayOfWeek>=1 && dayOfWeek<=5) && onVac==false)
    		return "07:00";
    	else if((dayOfWeek==0 || dayOfWeek==6) && onVac==true)
    		return "OFF";
    	else if((dayOfWeek==0 || dayOfWeek==6) && onVac==false)
    		return "10:00";
    	else 
    		return null;
    }

    }
  
    	
    	
        	
    	/*if (dayOfWeek >= 7){
    		return "Invalid Inputs"; 
    	}
    	if (onVac != true && onVac != false) {
    		return "Invalid Inputs"; 
    	}
    	if ((dayOfWeek >=1  || dayOfWeek <=5 ) || (dayOfWeek ==0)||(dayOfWeek ==6)) {
            return onVac ? "10:00" : "7:00"; 
        } else {
            return onVac ? "off" : "10:00";
        } 
      /*if (((dayOfWeek ==0)||(dayOfWeek ==6)) &&  (!onVac)){
           return "10:00";
          }
       else if (((dayOfWeek !=0)||(dayOfWeek !=6)) && (!onVac)){
          return "7:00"; 
       }
       */
    	
       
        // ADD YOUR CODE HERE
