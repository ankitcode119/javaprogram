package javaBasicProgram;

import java.util.Scanner;

public class CheckIfNumberIsPalindrome {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt(); //num=1234
		int ans=0;
		int palin=ans;
		int rem;
		while(num>0)
		{
			rem=num%10;
			ans=ans*10+rem;
			num/=10;
		}
		System.out.println(ans);
		if(palin==num)
		{
			System.out.println("provided number is a palindrome");
		}
		else 
		{
			System.out.println("provided number is not a palindrome");
		}
		sc.close();
	}

}
