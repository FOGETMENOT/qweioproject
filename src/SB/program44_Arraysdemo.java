package SB;

import java.util.Arrays;

public class program44_Arraysdemo {
public static void main(String[] args) {
	int[] originalArrays= {34,78,5,89};
	int[] copyArray=Arrays.copyOfRange(originalArrays, 1, 3);
	for(int number:copyArray)
	{
		System.out.println(number);
	}
	
}
}
