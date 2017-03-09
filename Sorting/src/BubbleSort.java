import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

	private static void bubblesort(int[] array)
	{   int temp=0;
		for(int i=0;i<array.length;i++)
		{
			for(int j=1;j<array.length-i ;j++)
			{
				if(array[j-1]>array[j])
				{
					temp=array[j-1];
					array[j-1]=array[j];
					array[j]=temp;
					
				}
			}
		}
		
		
		
		
	}
	
	public static void main(String args[])
	{
		 System.out.println("enter number of elements in array");
		 Scanner sc= new Scanner(System.in);
		 int n=sc.nextInt();
		 int array[] = new int[n];
		 
		 System.out.println("Enter " + n +" elements in array " );
		
		 try {
			for(int i=0;i<n;i++)
			 {
			 array[i] = sc.nextInt();
			 }
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 sc.close();
		 
		 System.out.println("Array before sorting");
		 System.out.print(Arrays.toString(array));
		 
		 bubblesort(array);
		 
		
		 System.out.println("Array after sorting");
		
			 System.out.print(Arrays.toString(array));
		 
	}	
		
		
	}

