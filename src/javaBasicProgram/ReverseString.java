package javaBasicProgram;

public class ReverseString {

	
	public static void main(String[] args) 
	{
		
		String s="Ankit";
		for(int i=s.length()-1;i>=0;i--)
		{
			char rev=s.charAt(i);
			System.out.print(rev);
		} 
		
	}
	

}
