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
		
		bubbleSort(arr);
		for (int i : arr) {
			System.out.print(" "+i+" ");
		}
		
	}
	private static void bubbleSort(int[] arr) {
		
		int temp;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=1;j<arr.length-1;j++)
			{
				if(arr[j-1]>arr[j])
				{
					temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
}
