package javaBasicProgram;

public class practise {

	public static void main(String[] args)
	{
	  String s="success";
	  char ch []=s.toCharArray();
	  for(int i=0;i<s.length();i++)
	  {
		  for(int j=i+1;j<s.length();j++)
		  {
			  if(ch[i]==ch[j])
			  {
				  System.out.print(ch[i]+" ");
				  break;
			  }
		  }
		  
	  }
	}

}
