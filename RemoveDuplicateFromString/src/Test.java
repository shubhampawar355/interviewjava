import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Test {

	public static Scanner sc=new Scanner(System.in) ;
	public static void main(String[] args) {

		System.out.println("Enter String");
		String str=sc.nextLine();
		
		Test.removeDuplicates(str);
	}
	private static void removeDuplicates(String string) {
		Map<Character, Integer> map=new HashMap<>();
		char[] str = string.toCharArray();
		for (char c : str) {
			if(!map.containsKey(c)) {
				map.put(c, 1);
			}
			else {
				map.put(c, map.get(c)+1);
			}
			
		}
		Set<Map.Entry<Character,Integer>> entryset=map.entrySet();
		System.out.println("Character : Occurance ");
		for (Map.Entry<Character, Integer> entry : entryset) {
			if(entry.getKey()==' ')
				System.out.println("  blank"+entry.getKey()+"  :     "+entry.getValue());
			else
				System.out.println("    "+entry.getKey()+"     :     "+entry.getValue());
		}
	}

}
