package javaBasicProgram;
import java.util.Scanner;
public class CheckIfEvenOdd {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to check if it is even/odd");
		int num=sc.nextInt();
		if(num%2==0)
		{
			System.out.println("It is Even number");
		}
		else  
		{
			System.out.println("It is Odd number");
		}
		sc.close();
	}

}
