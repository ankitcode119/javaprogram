package javaBasicProgram;

public class CountOfCharInString {

	public static void main(String[] args) 
	{
		String s="welcome to my apartment";
		   int count=1;
		   for(int i=0;i<s.length()-1;i++)
		   {
			    if((s.charAt(i)!=' '))
			    {
			      count++;	
			    } 
		   }
		   System.out.println(count);
		}
	}
