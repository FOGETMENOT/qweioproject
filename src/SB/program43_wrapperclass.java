package SB;

public class program43_wrapperclass {
public static void main(String[] args) {
	//wrapping value using 0f methods
	Integer number=Integer.valueOf(30);
	System.out.println("wrapping object value:"+number);
	
	
	// unwrapping object to get rpimitive value
	int value=number.intValue();
	System.out.println("unwrapping value"+value);
	
	
}
}
