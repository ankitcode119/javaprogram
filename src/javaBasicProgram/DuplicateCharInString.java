package javaBasicProgram;

public class DuplicateCharInString 
{

	public static void main(String[] args) 
	{
		String str = "beautiful sea";
	      char[] ch = str.toCharArray();
	      System.out.println("The string is: " + str);
	      System.out.print("Duplicate Characters in above string are: ");
		  // nested for loop to print duplicate characters
	      for (int i = 0; i <ch.length; i++) 
	      {
	         for (int j = i + 1; j < ch.length; j++) 
	         {
	            if (ch[i] == ch[j]) 
	            {
	              System.out.print(ch[j] + " ");
	               break;
	            }
	         }
	         
    	 }
	      
	}
}

