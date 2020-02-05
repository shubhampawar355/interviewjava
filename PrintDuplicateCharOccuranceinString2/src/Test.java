import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Test {

	public static Scanner sc=new Scanner(System.in) ;
	public static void main(String[] args) {

		System.out.println("Enter String");
		String str=sc.nextLine();
		
		String result=Test.removeDuplicates(str);
		System.out.println(result);
	}
	private static String removeDuplicates(String string) {
		Set<Character> set=new HashSet<>();
		StringBuffer res=new StringBuffer();
		char[] str = string.toCharArray();
		
		for(int i=0;i<string.length();i++) {
			char c=str[i];
			if(!set.contains(c)) {
				set.add(c);
				res.append(c);
			}
		}
		return res.toString();
	}

}
