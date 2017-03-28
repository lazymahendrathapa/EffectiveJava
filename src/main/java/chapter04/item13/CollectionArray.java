package chapter04.item13;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionArray {

	private static final Double[] PRIVATE_VALUE = { 1.0, 2.0, 3.0 };

	public static final List<Double> VALUES = Collections.unmodifiableList(Arrays.asList(PRIVATE_VALUE));

	public static void main(String[] args){
		
		for(Double d : CollectionArray.VALUES){
			System.out.println(d);
		}
	}
	
}
