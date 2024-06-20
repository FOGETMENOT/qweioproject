package PROGRAMS;

public class CounterProgram {
public static void main(String[] args) {
	int counter=0;
	for(char ch='a';ch<='z';ch++)
	{
		if((ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u'))
		{
			System.out.println("vowels:"+ch);
			counter++;
		}
		else
		{
			System.out.println("consonants"+ch);
		}
	}
	System.out.println("vowels:"+counter);
}	
}
	/*
	
public static void main(String[] args) {
	 int counter=0;
	 int vcount=0;
	  
	for(char ch='a';ch<='z';ch++)
	{
	if((ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u')) {
		System.out.println("vowels: "+ch);
		counter++;
		vcount++;
	}
	else {
		System.out.println("consonants:" +ch);
		counter++;
	}
	}
	System.out.println(counter);
	System.out.println("vowels count:"+vcount);
	int consonants=counter-vcount;
	System.out.println(consonants);
}
}
*/