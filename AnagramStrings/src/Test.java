import java.util.Arrays;
import java.util.Scanner;

public class Test {

	public static Scanner sc=new Scanner(System.in) ;
	public static void main(String[] args) {

		System.out.println("Enter String 1");
		String str1=sc.nextLine();

		System.out.println("Enter String 2");
		String str2=sc.nextLine();
		System.out.println(Test.isAnagram(str1,str2));
		
	}
	private static boolean isAnagram(String str1,String str2) {
		
		char[] str11 = str1.toCharArray();
		char[] str22 = str2.toCharArray();
		Arrays.sort(str11);
		Arrays.sort(str22);
		return Arrays.equals(str11,str22);
	}
	
}
