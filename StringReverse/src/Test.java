import java.util.Scanner;


public class Test {
	
	public static Scanner sc=new Scanner(System.in);
public static void main(String[] args) {
	
	

	String str=new String();
	
	System.out.println("Enter string to reverse");
	
	str = sc.nextLine();
	System.out.println(Test.mystrLen(str));
	String res = Test.reverseByWord(str);
	System.out.println(res);
	System.out.println(Test.mystrLen(res));

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
	if(str==null || Test.mystrLen(str)<=1)
		return str;
	return reverseString(Test.substr(str, 1))+str.charAt(0);
	
}


private static String reverseByWord(String str) {
	String result="";
	
	String splitArr[]=Test.mySplit(str,' ');
	for(int i=splitArr.length-1;i>=0;i--) {
		if(splitArr[i]!="")
			result+=splitArr[i]+" ";
	}
	return result;
}



private static int mystrLen(String str) {
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

public static String[] mySplit(String str, char delimiter)
{
    String[] result = new String[str.length()];//crating sting to store result
    char temp, delim;
    int index = 0;

    //Initializes all the string[] values to "" so when the string
    //and char concatonates, 'null' doesn't appear.
    for(int i=0; i<str.length(); i++) {
        result[i] = "";
    }
    
    //Puts the str values into the split array and concatonates until
    //a delimiter is found, then it moves to the next array index.
    for(int i=0; i<str.length(); i++)
    {
        temp = str.charAt(i);
        delim = delimiter;

            if(!(temp == delim)) 
            {
                result[index] += str.charAt(i);
            } 
            else 
           {
                index++;
//                result[index] += str.charAt(i);
                index++;
            }
    }
    return result;
}


}
