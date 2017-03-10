import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
private static void insertionsort(int[] array)
    {
	if(array.length<=1)
		return;
	for(int i=1;i<array.length;i++)
	{
		int key=array[i];
		int j=i-1;
		while((array[j]>key) && (j>-1))
		{
			array[j+1]=array[j];
			j--;
		}
		array[j+1]=key;
		
		
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
	 
	 insertionsort(array);
	 
	
	 System.out.println("Array after sorting");
	
		 System.out.print(Arrays.toString(array));

}
}
