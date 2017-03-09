import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
private static void selectionsort(int[] array)
  {	
	for(int i=0;i<array.length-1;i++)
		{
		 int index= i;
		
		 for(int j=i+1;j<array.length;j++)
		 {
			 if(array[j]<array[i])
				{
				 index=j;
				}
		 }
		     int temp=array[i];
		     array[i]=array[index];
		     array[index]=temp;
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
	 
	 selectionsort(array);
	 
	
	 System.out.println("Array after sorting");
	
		 System.out.print(Arrays.toString(array));
	}
}
