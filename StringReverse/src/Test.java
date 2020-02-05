import java.util.Scanner;


public class Test {
	
	public static Scanner sc=new Scanner(System.in);
public static void main(String[] args) {
	
	

	String str=new String();
	
	System.out.println("Enter string to reverse");
	
	str = sc.nextLine();
	
	String[] res = Test.mySplit(str," ");
	for (String s : res) {
		System.out.println(s);
	}
	
}

private static String substr(String str,int index) {
	
	char[] strarr = str.toCharArray();
	String res=new String();
	while(index<strarr.length) {
		res+=strarr[index];
		index++;
	}
	return res;
}

private static String reverseString(String str) {
	if(str==null || Test.strLen(str)<=1)
		return str;
	return reverseString(Test.substr(str, 1))+str.charAt(0);
	
}


/*private static String reverseByWord(String str) {
	String result=new String();
	String splitArr[]=str.split(" ");
	for(int i=splitArr.length-1;i>=0;i--)
		result+=splitArr[i]+" ";
	return result;
}
*/

private static String[] splitString(String str) {
	char[] strarr = str.toCharArray();
	String[] res=new String[strarr.length];
	int flag=0,index=1;
	while(flag<strarr.length)
	{
		String temp=new String();
		while(strarr[flag]!=' ' && strarr[flag]!='\u0000')
		{
			temp+=strarr[flag];
			flag++;
		}
		res[index]=temp;
		index++;
	}
	return res;
}

private static int strLen(String str) {
	int len=0;
	char[] strarr = str.toCharArray();
	if(str.isEmpty())
		return len;
	else
	{
		for (char c : strarr)
				len+=1;
		return len;
	}
}

public static String[] mySplit(String str, String delimiter)
{
    String[] storeSplit = new String[str.length()];
    char compare1, compare2;
    int counter = 0;

    //Initializes all the string[] values to "" so when the string
    //and char concatonates, 'null' doesn't appear.
    for(int i=0; i<str.length(); i++) {
        storeSplit[i] = "";
    }

    //Puts the str values into the split array and concatonates until
    //a delimiter is found, then it moves to the next array index.
    for(int i=0; i<str.length(); i++) {
        compare1 = str.charAt(i);
        compare2 = delimiter.charAt(0);

            if(!(compare1 == compare2)) {
                storeSplit[counter] += ""+str.charAt(i);
            } else {
                counter++;
                storeSplit[counter] = ""+str.charAt(i);
                counter++;
            }
    }
    return storeSplit;
}


}
