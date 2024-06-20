package file;

public class primenumber1to100 {
public static void main(String[] args) {
	int counter=0;
	for( int num=1;num<=100;num++)
	{
		int temp = 0;
		for(int i=2;i<=num-1;i++)
		{
			if(num%i==0)
			{
				temp=temp+1;
			}
		}
			if(temp==0)
			{
				System.out.println("prime"+num);
				counter++;
			}
	
			else
			{
			//	System.out.println("not prime"+num);
				temp=0;
			//	counter++;
			}
			
		}		System.out.println("total prime number in 1 to 100:"+counter);
}
}
