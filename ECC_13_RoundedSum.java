public class ECC_13_RoundedSum {
    public static void main(String[] args) {
        int a = 23, b = 34, c = 66;
        System.out.println(sumOfRoundedValues(a, b, c));
    }

    public static int sumOfRoundedValues(int a, int b,int c) {

       int res;
       int val1 =0;
       int val2 = 0;
       int val3 = 0;
       if(a <=0 || b<=0 || c<=0)
           return -1;
         
      if (a %10 == 0) {
         val1 = ((((a +9)/10) *(10)));
      }
          else if ((a %10) < 5) {
            val1 = ((((a +9)/10) *(10)) - 10);
            
            }
             else if  ( (a %10) >= 5){
               val1 =  (((a +9)/10) *(10));

              }

              // for b:
            if (b %10 == 0) {
         val2 = ((((b +9)/10) *(10)));
          }
          else if ((b %10) < 5) {
           val2 =  ((((b +9)/10) *(10)) - 10);
            
            }
             else if  ( (b %10) >= 5){
              val2 = (((b +9)/10) *(10));
            
              }
            
            // for c:
      
        if (c %10 == 0) {
         val3 = ((((c +9)/10) *(10)));
         }
  
        else if ((c %10) < 5) {
           val3 =  ((((c +9)/10) *(10)) - 10);
            return val1 + val2 + val3;
               
            }
             else if  ( (c %10) >= 5){
              val3 = (((c +9)/10) *(10));
                
              }    
      
       
        return val1 + val2 + val3;
       
    }
}

      
      