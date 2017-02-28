public class ECC_83_StringsWithPattern {
    /* This program should print the list of string matching with pattern, if no string found matching pattern then print "No Strings Found with Pattern" */

    public static void main(String[] args) {
        String[] words = {"South Africa", "Afghanistan", "Sri Lanka", "New Zealand", "West Indies", "England", "India", "Australia", "Pakistan", "Bangladesh"};
        String pattern = "an";
        String[] words_pattern = getWordsContainsPattern(words, pattern);
        if (words_pattern.length > 0) {
            for (String word : words_pattern) {
                System.out.println(word);
            }    
        } else {
            System.out.println("No Strings Found with Pattern");
        }
    }
 
    // returns the array of string, containing strings with pattern matching
    public static String[] getWordsContainsPattern(String[] words, String pattern) {
         // ADD YOUR CODE HERE
    	String str = "";
    	String[] args = {};
    	for (int i = 0 ; i < words.length ; i++) {
    		if((words[i].toLowerCase()).contains(pattern.toLowerCase())) {
    			str = str + words[i] + ",";
    		}
    	}
    	if(str.isEmpty()) {
    		return args;
    	}
    	str = str.trim();
    	args = str.split(",");
    	for (int i = 0  ; i < args.length ; i++) {
    		args[i] = args[i].toUpperCase();
    	}
    	return args;
    }
}
