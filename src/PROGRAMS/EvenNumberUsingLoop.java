package PROGRAMS;

public class EvenNumberUsingLoop {

	public static void main(String[] args) {
		String s="selenium tanvi";
		String rev="";
		int len=s.length();
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		System.out.println(s);
	}
	
}
	/*
public static void main(String[] args) {
	for(int i=1;i<=20;i++) {
		if( i%2==0)
		{
		System.out.println("even:"+i);
		}
	}
}
}
	
	
	public static void main(String[] args) {
		for(int i=1;i<=20;i++)
		{
			if(i%2==0)
			{
				System.out.println("even number:"+i);
			}
		}
	}
	
}
}
public static void main(String[] args) {
	for(int i=1;i<=20;i++)
	{
		if(i%2==0)
		{
			System.out.println("even number"+i);
		}
	}
}
}
*/