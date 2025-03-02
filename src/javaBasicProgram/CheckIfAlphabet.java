package javaBasicProgram;
import java.util.Scanner;
public class CheckIfAlphabet {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the character to check if it is alphabet or not");
		char c=sc.next().charAt(0);
		if((c>='a'&&c<='z')||(c>='A'&&c<='Z'))
		{
			System.out.println("It is an alphabet");
		}
		else {
			System.out.println("It is not an alphabet");
		}
		sc.close();
	}

}


