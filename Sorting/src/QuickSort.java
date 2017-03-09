import java.util.Scanner;

public class QuickSort {
 private static void quickSort(int[] array,int left,int right)
 {
	if((right-left)<=1)
		return;
	
	int index= partition(array,left,right);
	 if(left < index-1)
	 quickSort(array,left,index-1);
	 
	 if(right >index)
	 quickSort(array,index,right);
}
 
 private static int partition(int[] array,int left_pointer,int right_pointer)
 {
	 int pivot= left_pointer+(right_pointer-left_pointer)/2; // to avoid integer overflow
	 
	 
	 while(left_pointer<=right_pointer)
	 {
	     while(array[left_pointer]<array[pivot])
		 left_pointer++;
	 
	     while(array[right_pointer]>array[pivot])
		 right_pointer--;
	     	if(left_pointer<=right_pointer)
	     	{
				 int temp=array[left_pointer];
				 array[left_pointer]=array[right_pointer];
				 array[right_pointer]=temp;
				 
				 left_pointer++;
				 right_pointer--;
	     	}
	 }
	 
	 return left_pointer;
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
		 for(int j=0;j<n;j++)
		 {
			 System.out.print(array[j]+ " ");
		 }
		 
		 quickSort(array,0,array.length-1);
		 
		
		 System.out.println("Array after sorting");
		 for(int k=0;k<n;k++)
		 {
			 System.out.print(array[k] +" ");
		 }
	}
 }
