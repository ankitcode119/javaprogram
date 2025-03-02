package javaBasicProgram;
import java.util.Scanner;
public class ReverseNum 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt(); //num=1234
		int rem;
		int ans=0;
		while(num>0)
		{
			rem=num%10;
			ans=ans*10+rem;
			num/=10;
		}
		System.out.println(ans);
	}

}
