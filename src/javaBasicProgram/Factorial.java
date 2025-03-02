package javaBasicProgram;

public class Factorial {

	public static void main(String[] args) 
	{
		
		//4!=1*2*3*4
        int num=4;
        int ans=1;
        
        for(int i=1;i<=num;i++)
        {
        	ans=ans*i;
        }
        System.out.println(ans);
	}
}
