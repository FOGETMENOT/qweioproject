package SB;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class program44_Avragedoubledemo {

	public static void main(String[] args) {
		List<Double> numberlist=Arrays.asList(2.3,34.6,4.5,6.7);
		 double average=numberlist.stream().collect(Collectors.averagingDouble(number->number));
		 System.out.println("averageof numberlist:"+average);
	}
}
