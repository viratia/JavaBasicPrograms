package StringPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicateElementInString {

	 public static int remove(char[] a)
     {
	  int i=0;
	  for(int j=i+1;j<a.length;j++)
	  {
		  if(a[i]!=a[j])
		  {
			  i++;
			  a[i]=a[j];
		  }
	  }
   	  return i+1;
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter string:-");
         String str=sc.next();
         
         char[] ch=str.toCharArray();
         Arrays.sort(ch);
         int len=remove(ch);
         for(int i=0;i<len;i++)
         {
        	 System.out.print(ch[i]);
         }
	}

}
