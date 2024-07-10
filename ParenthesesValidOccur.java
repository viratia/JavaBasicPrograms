package StringPrograms;
import java.util.Scanner;
import java.util.Stack;
public class ParenthesesValidOccur {
	 public static boolean isValid(String s) {
	        Stack<Character> stack = new Stack<Character>();
	        for (char c : s.toCharArray()) {
	        	//System.out.println(c);
	            if (c == '(' || c == '{' || c == '[') {
	                stack.push(c);
	            } 
	            else if(c == ')' || c == '}' || c == ']')
	            {
	                if (stack.isEmpty()) return false;
	                char top = stack.pop();
	                if ((c == ')' && top != '(') || (c == '}' && top != '{') || (c == ']' && top != '[')) {
	                    return false;
	                }
	            }
	        }
	        System.out.println(stack);
	        return stack.isEmpty();
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   Scanner sc=new Scanner(System.in);
		   System.out.println("enter any string");
		   String s1=sc.nextLine();
		   boolean b=isValid(s1);
		   if(b)
		   {
			   System.out.println("Valid Sequence");
		   }
		   else
		   {
			   System.out.println("Invalid Sequence");
		   }
		}

	}


