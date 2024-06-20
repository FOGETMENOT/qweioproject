package PROGRAMS;

public class stringregex {
public static void main(String[] args) {
	String st="874568jjh djfhkj $$%%%^&^%%$^^&*";
	st=st.replaceAll("[^0-9]", "");
	System.out.println(st);
}
}
/*	//p10
public static void main(String[] args) {
	String st="54837676 $$$%%%^^&&&&&";
	st=st.replaceAll("[^0-9]","");
	System.out.println(st);
}
}
	//p9
 public static void main(String[] args) {
	String st="djfbv 456465";
	st=st.replaceAll("[^0-9]","");
	System.out.println(st);}
}
	/*
public static void main(String[] args) {
	String st="jhbfvjh 45768";
	st=st.replaceAll("[^0-9]","");
	System.out.println(st);
}
}

 
 p7
	public static void main(String[] args) {
		String st="djkfgdj ##@@$$%%% 7543484 AASDGRHTYMYU";
		st=st.replaceAll("[^a-z0-9]","");
		System.out.println(st);
	}
}
	//p7 
public static void main(String[] args) {
	String st="djgfdhgfh 3487@@@###$$%%^^";
	st=st.replaceAll("[^a-z0-9-A-Z]","");
	System.out.println(st);
		
}
}
	/*
	 /p6
public static void main(String[] args) {
	String st="selenium1232  23343643 @@@@##$$$%%";
	st=st.replaceAll("[^a-z0-9A-Z]","");
	System.out.println(st);
}
}
	
	//p5
public static void main(String[] args) {
	String st="selenium @@@##345";
	st=st.replaceAll("[^a-z0-9]", "");
	System.out.println(st);
}
}
	
	 //p2
public static void main(String[] args) {
	String St="38756 ejhrg 1223422 @@@#####";
	St=St.replaceAll("[^0-9]", "");
	System.out.println(St);


}
}
//p1
	public static void main(String[] args) {
	 
	String str="##@@@@selnium 1237498";

	str=str.replaceAll("[^a-zA-Z0-7]", "");
	System.out.println(str);
}
}
	 
	 */

