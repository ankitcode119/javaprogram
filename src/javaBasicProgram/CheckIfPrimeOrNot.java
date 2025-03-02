package javaBasicProgram;

import java.util.Scanner;

public class CheckIfPrimeOrNot {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt(); //num=11
		int i;
		for(i=2;i<=num;i++)
		{
			if(num%i==0)
			{
				break;
			}
		}
		
		if(num==i)
		{
			System.out.println("Prime Number");
		}
		else 
		{
			System.out.println("Not a prime");
		}
		
		sc.close();		
	}


}
