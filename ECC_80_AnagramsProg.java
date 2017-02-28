import java.util.Arrays;
public class ECC_80_AnagramsProg {
    public static void main(String[] args) {
        String str1 = "creative";
        String str2 = "reactive";
        System.out.println(validateStrings(str1, str2));
        if (validateStrings(str1, str2) == 1) {
            System.out.println(isAnagrams(str1, str2));
        }
    }

    // validate the given two string, return 1 if they are valid

    public static int validateStrings(String str1, String str2) {
    	 if(str1.length()==0 || str2.length()==0)
    		 return -1;
    else if(str1.contains(" ") || str2.contains(" "))
     		 return 2;
    	 
    	 else 
    	 return 1;
       
    }

    // check the given two strings are anagrams are not
    public static boolean isAnagrams(String str1, String str2) {
    	 boolean status = true;
    	 
         if(str1.length() != str2.length())
         {
             //Setting status as false if copyOfs1 and copyOfs2 doesn't have same length
  
             status = false;
         }
         else
         {
             //Changing the case of characters of both copyOfs1 and copyOfs2 and converting them to char array
  
             char[] s1Array = str1.toLowerCase().toCharArray();
  
             char[] s2Array = str2.toLowerCase().toCharArray();
  
             //Sorting both s1Array and s2Array
  
             Arrays.sort(s1Array);
  
             Arrays.sort(s2Array);
  
             //Checking whether s1Array and s2Array are equal
  
             status = Arrays.equals(s1Array, s2Array);
         }
         if(status)
         {
             return true;
         }
         else
         {
             return false;
         }
         
     }
  
       
    }


