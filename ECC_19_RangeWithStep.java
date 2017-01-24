public class ECC_19_RangeWithStep {
   
   public static void main(String[] args) {
       
    int n1 = 10;
       int n2 = 30;
       int step = 2;
       System.out.println(getNumbersInRange(n1, n2, step));
   }
   
public static String getNumbersInRange(int num1, int num2, int step) {

String result = "";

if(num1<0 || num2<0 || step<0)
return "-1";
else if(num1==num2)
return "-2";
else if(num2<num1)
return "-3";
else{
num1++;
while(num1<num2){
result+=Integer.toString(num1)+" ";
num1+=step;
}
return result.trim();
}

}
}