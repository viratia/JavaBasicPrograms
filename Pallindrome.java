package StringPrograms;

import java.util.Scanner;

public class Pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter String");
		String str=sc.nextLine();
		boolean flag=true;
		int left=0;
		int right=str.length()-1;
		char [] ch=str.toCharArray();
		while(left<right)
		{
			if(ch[left]!=ch[right])
			{
				flag=false;
			}
			left++;
			right--;
		}
		if(flag)
		{
			System.out.println("it is pallindrome");
		}
		else
		{
			System.out.println("it is not pallindrome");
		}
	}

}
