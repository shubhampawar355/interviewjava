import java.util.Scanner;

public class Test {

	public static Scanner sc=new Scanner(System.in) ;
	public static void main(String[] args) {

		System.out.println("Enter String");
		String str=sc.nextLine();
		System.out.println(Test.isPalindrome(str));
		
	}
	private static boolean isPalindrome(String string) {
		String rev="";
		for(int i=string.length()-1;i>=0;i--)
			rev+=string.charAt(i);
		System.out.println(rev);
		return string.equals(rev);
	}
	
}
