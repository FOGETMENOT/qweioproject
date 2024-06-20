57package file;

public class tocheckstringpalindrome {
public static void main(String[] args) {
	String s="naman";
	String rev="";
	int len=s.length();
	for(int i=len-1;i>=0;i--)
	{
		rev=rev+s.charAt(i);
	}
	System.out.println(s);
	System.out.println(rev);
	if(s.equalsIgnoreCase(rev))
	{
		System.out.println("palindrome string");
	}
	else
	{
		System.out.println(" not palindrome");
	}
}
}
