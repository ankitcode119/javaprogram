package javaBasicProgram;

public class SecondlargestNumberInArray {

	public static void main(String[] args) 
	{
		int temp ;
	      int a[] = {-2,-5,-1,-3,-6,-7};
	      for(int i = 0; i<a.length; i++ )
	      {
	         for(int j = i+1; j<a.length; j++)
	         {
	           if(a[i]>a[j])
	            {
	               temp = a[i];  
	               a[i] = a[j]; 
	               a[j] = temp; 
	            }
	         }
	      }
	      System.out.println("second largest number is:: "+a[a.length-2]);
	}

}
