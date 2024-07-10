package StringPrograms;
class MultipleString
{
	void ReverseString(String x)
	{  
		String rev=" ";
		char c[]=x.toCharArray();
		int len=c.length-1;
		
		for(int i=len;i>=0;i--)
		{
			
			rev=rev+c[i];
		}
		
		 
		System.out.println("1 Reverse String is:"+rev);	
		 String[] words = x.split(" ");
		String r="";
		for(int i=0;i<words.length;i++)
		{
			r=r+words[i];
		}
		System.out.println("1 Remove space String is:"+r);
		String s1="n";
		boolean b=x.endsWith(s1);
		System.out.println("endwith------"+b);
	}
	void reverseEachWordOfString(String x)
    {
        String[] words = x.split(" ");
         
        String reverseString ="";
         
        for (int i = 0; i < words.length; i++) 
        {
            String word = words[i];
             
            String reverseWord ="";
             
            for (int j = word.length()-1; j >= 0; j--) 
            {
                reverseWord = reverseWord + word.charAt(j);
            }
             
            reverseString = reverseString + reverseWord +" ";
        }        
        System.out.println("2 Reverse String is:"+reverseString);
    }
	void reversePositionOfWords(String x)
	{
		 String[] words = x.split(" ");
         
	        String reverseString ="";
	         
	        for (int i= words.length-1; i>=0; i--) 
	        {
	            String word = words[i];
	            reverseString =reverseString+word+" ";
	        }
	        System.out.println("3 reverse string:"+reverseString);
	     
	}
	void capitalN(String x)
	{
		 String[] words = x.split(" ");
		 String reverseString = "";
         
	        for (int i= words.length-1; i>=0; i--) 
	        {
	            String word = words[i];
	            reverseString =reverseString+word+" ";
	        }
         StringBuffer str=new StringBuffer(reverseString);
        
		 str.replace(1,3,"ND");
		
		 System.out.println("4 Reverse string:"+str);
	}
	void deletechar(String x,int index,int a)//(string x.int start ,int end;
	{
//		String reverseString= "";
//		for(int i=0;i<x.length();i++)
//		{
//			if(i<index)
//			{
//		     	reverseString=reverseString+x.charAt(i);
//		     }
//	    }
//		System.out.println(reverseString);
		StringBuffer str=new StringBuffer(x);
//		 str.indexOf(x);
//		 System.out.println("555555 reverse string:"+str);
		str.delete(a, index);
		
		System.out.println("5 reverse string:"+str);
		
	}
}
public class MultipleStringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleString m=new MultipleString();
		m.ReverseString("I am Indian");
		m.reverseEachWordOfString("I am Indian");
		m.reversePositionOfWords("I am Indian");
		m.capitalN("I am Indian");
		m.deletechar("I am Indian",12,7);
	}

}
