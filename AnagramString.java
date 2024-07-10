package StringPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter string");
       String str1=sc.next();
       String str2=sc.next();
       char[] ch1=str1.toCharArray();
       char[] ch2=str2.toCharArray();
       Arrays.sort(ch1);
       Arrays.sort(ch2);
       boolean b=Arrays.equals(ch1,ch2);
       if(b=true)
    	   {
    	   System.out.println("It is anagram String");
    	   }
       else
       {
    	   System.out.println("It is not");
       }
	}

}
