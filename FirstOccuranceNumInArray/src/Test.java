
public class Test {

	public static void main(String[] args) {

		Integer arr[]= {1,2,3,4,1,5,6};
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println(arr[i]);
					return;
				}
			}
		}
		
	}

}
