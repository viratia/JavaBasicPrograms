package StringPrograms;

public class firstNonRepeatingChar {
	
	    public char firstNonRepeatingChar(String s) {
	        for (int i = 0; i < s.length(); i++) {
	            char currentChar = s.charAt(i);
	            boolean repeated = false;
	            
	            // Check if currentChar repeats in the string
	            for (int j = 0; j < s.length(); j++) {
	                if (i != j && s.charAt(j) == currentChar) {
	                    repeated = true;
	                    break;
	                }
	            }
	            
	            // Return the first non-repeating character
	            if (!repeated) {
	                return currentChar;
	            }
	        }
	        
	        return '\0'; // Return '\0' if no non-repeating character found
	    }

	    public static void main(String[] args) {
	    	firstNonRepeatingChar solution = new firstNonRepeatingChar();
	        String s = "leetcode";
	        char firstNonRepeating = solution.firstNonRepeatingChar(s);
	        System.out.println("First non-repeating character: " + firstNonRepeating); // Output: 'l'
	    }
	}
