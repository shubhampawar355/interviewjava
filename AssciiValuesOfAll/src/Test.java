import java.util.Scanner;

public class Test {

	public static Scanner sc=new Scanner(System.in) ;
	public static void main(String[] args) {

		System.out.println("press btn to continue");
		printAssci();
		
	}
	private static void printAssci() {
		
		char a='!';
		int b=a;
		System.out.println(" Char : Ascii");
		for(int i=33;i<126;i++)
		{
			System.out.printf("   %s  :   %d\n",a,b);
			a++;
			b=a;
		}
	}
	
}
