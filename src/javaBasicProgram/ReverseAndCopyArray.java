package javaBasicProgram;

public class ReverseAndCopyArray {

	public static void main(String[] args) 
	{
	int a[]= {1,2,3,4,5};
	int b[]=new int[a.length];
	int rev=a.length-1;
	for(int i=0;i<a.length;i++)
	{
		b[rev]=a[i];
		rev--;
	}
	for(int j=0;j<b.length;j++)
	{
		System.out.println(b[j]);
	}
	}

}
