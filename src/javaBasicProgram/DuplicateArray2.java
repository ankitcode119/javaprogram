package javaBasicProgram;

public class DuplicateArray2 
{
		 public static void main(String[] args) 
		    {
		        int a[] = {1, 2, 3, 4, 5};
		        int b[] = new int[a.length];

		        // Copy elements from 'a' to 'b'
		        for (int i = 0; i < a.length; i++) {
		            b[i] = a[i];
		        }

		        // Print original array 'a'
		        System.out.println("Original Array:");
		        for (int i = 0; i < a.length; i++) {
		            System.out.print(a[i] + " ");
		        }
		        System.out.println();

		        // Print duplicate array 'b'
		        System.out.println("Duplicate Array:");
		        for (int i = 0; i < b.length; i++) {
		            System.out.print(b[i] + " ");
		        }
		    }
}
