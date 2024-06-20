package file;

import java.util.Scanner;

public class largestamong3 {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter num1:");
	int a=sc.nextInt();
	System.out.println("enter num2:");
	int b=sc.nextInt();
	System.out.println("enter num3:");
	int c=sc.nextInt();
	
	if((a>b)&&(a>c))
	{
		System.out.println("a is largest");
	}
	else if((b>c)&&(b>a))
	{
		System.out.println("larget number is b");
	}
	else if((c>a)&&(c>b))
	{
		System.out.println("largest number is c");
	}
	
}
}
