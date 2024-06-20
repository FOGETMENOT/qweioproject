package file;

import java.util.Scanner;



public class areaofrectangle {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter length:");
	int len=sc.nextInt();
	System.out.println("enter base:");
	int bth=sc.nextInt();
	double area=len*bth;
	System.out.println("AREA OF RECTANGLE :+"+area);
}
}
