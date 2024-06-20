package SB;

public class program_45Stringcomparisiondemo {
public static void main(String[] args) {
	String firstText="samiksha";
	String secondtext="SAMIKSHA";
	int result=firstText.compareToIgnoreCase(secondtext);
	if(result==0)
	{
		System.out.println("String equals");
	}
	else
	{
		System.out.println("string not equal");
	}
}
}
