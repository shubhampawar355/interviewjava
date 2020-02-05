import java.util.Scanner;

public class Test {

	public static Scanner sc=new Scanner(System.in) ;
	public static void main(String[] args) {

		System.out.println("enter array size");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("enter elements");
		for(int i=0;i<size;i++)
			arr[i]=sc.nextInt();
		System.out.println("Before sort :");
		Test.printArray(arr);

		int[] res = mergeSort(arr);
		
		System.out.println("\nAfter sort :");
		Test.printArray(res);

	}
	private static void printArray(int[] arr)
	{
		for (int i : arr) {
			System.out.print(" "+i+" ");
		}
	}
	
	private static int[] mergeSort(int[] arr) {

		if(arr.length<=1)
			return arr;
		//divide logic
		int midpoint=arr.length/2;
		
		int[] left=new int[midpoint];
		int[] right;
		if(arr.length%2==0)
			right=new int[midpoint];
		else
			right=new int[midpoint+1];
		
		for(int i=0;i<midpoint;i++)
		{
			left[i]=arr[i];
		}
		for(int j=0;j<right.length;j++)
		{
			right[j]=arr[midpoint+j];
		}
		
		
		left=Test.mergeSort(left);//recursive call for left 
		right=Test.mergeSort(right);//recursive call for right
		
		//merge logic
		return Test.merge(left, right);
	}
	
	public static int[] merge(int[] left,int[] right)
	{
		int[] result=new int[left.length+right.length];
		
		int leftptr,rightptr,resultptr;
		leftptr=rightptr=resultptr=0;
		
		while(leftptr<left.length || rightptr<right.length)
		{
			if(leftptr<left.length && rightptr<right.length)
			{
				if(left[leftptr]<right[rightptr]) 
				{
					result[resultptr++]=left[leftptr++];
				}
				else
				{
					result[resultptr++]=right[rightptr++];
				}
			}
			else if(leftptr<left.length)
			{
				result[resultptr++]=left[leftptr++];
			}
			else if(rightptr<right.length)
			{
				result[resultptr++]=right[rightptr++];
			}
		}
		
		return result;
	}
}





















