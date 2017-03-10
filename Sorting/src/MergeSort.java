import java.util.Arrays;
import java.util.Scanner;

//Merge sort is the standard algo java uses to sort objects as 
//against quicksort to sort primitive data types.

public class MergeSort {
	private static void merge(Comparable[] a,Comparable[] aux,int lo,int mid,int hi)
	{
		for(int k=lo;k<=hi;k++)
		{
			aux[k]=a[k];
		}
		
		int i=lo,j=mid+1;
		
		for(int k=lo;k<=hi;k++)
		{
			if(i>mid) a[k]=aux[j++];
			else if(j>hi) 
				 a[k]=aux[i++];
			else if(less(aux[j],aux[i]))
				 a[k]=a[j++];
			else a[k]=a[i++];
		}
	}
	
	private static boolean less(Comparable comparable, Comparable comparable2)
	{
		return true;
	}

	private static void sort(Comparable[] a,Comparable[] aux,int lo,int hi)
	{
		if(hi<=lo)
			return;
		int mid=lo+(hi-lo)/2;
		sort(a,aux,lo,mid);
		sort(a,aux,mid+1,hi);
		merge(a,aux,lo,mid,hi);
	}
	//creation of array in a method which is getting recursively called is costly so need another method
	public static void sort(Comparable[] a)
	{    
		Comparable[] aux;
		aux=new Comparable[a.length];
		sort(a,aux,0,a.length-1);
	}
	public static void main(String args[])
	{	
		System.out.println("enter number of elements in array");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		Comparable[] a=new Comparable[n];
		System.out.println("enter" + n +"elements in array");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.next();
		}
		
		
		System.out.println("array before sorting");
		System.out.println(Arrays.toString(a));
		sort(a);
		System.out.println("array after sorting");
		System.out.println(Arrays.toString(a));
		sc.close();
	}
}
