package chapter03.item12;

import java.util.NavigableSet;
import java.util.Random;
import java.util.TreeSet;

public class PhoneNumber implements Cloneable, Comparable<PhoneNumber> {

	private final short areaCode;
	private final short prefix;
	private final short lineNumber;
	
	public PhoneNumber(int areaCode, int prefix, int lineNumber){
	
		rangeCheck(areaCode, 999, "area code");
		rangeCheck(prefix, 999, "prefix");
		rangeCheck(lineNumber, 9999, "line number");
		this.areaCode = (short)areaCode;
		this.prefix = (short)prefix;
		this.lineNumber = (short)lineNumber;
		
	}
	
	private static void rangeCheck(int arg, int max, String name){
		if(arg < 0 || arg > max)
			throw new IllegalArgumentException(name + " : " + arg);
	}
	
	@Override
	public boolean equals(Object o){
		if(o == this)
			return true;
		if(!(o instanceof PhoneNumber))
			return false;
		
		PhoneNumber pn = (PhoneNumber)o;
		
		return pn.areaCode == areaCode && pn.lineNumber == lineNumber && pn.prefix == prefix;
	}
	
	@Override
	public int hashCode(){
	
		int result = 17;
		result = 31 * result + areaCode;
		result = 31 * result + prefix;
		result = 31 * result + lineNumber;
		
		return result;
	}
	
	@Override
	public String toString(){
		return String.format("(%03d) %03d-%04d", areaCode, prefix, lineNumber);
	}

	@Override
	public PhoneNumber clone(){
		try{
			return (PhoneNumber)super.clone();
		}catch(CloneNotSupportedException e){
			throw new AssertionError();
		}
	}
	
	public int compareTo(PhoneNumber pn){
		
		int areaCodeDiff = areaCode - pn.areaCode;
		if(areaCodeDiff != 0 )
			return areaCodeDiff;
		
		int prefixDiff = prefix - pn.prefix;
		if(prefixDiff != 0 )
			return prefixDiff;
		
		return lineNumber - pn.lineNumber;
	}
	public static void main(String[] args){
	
		NavigableSet<PhoneNumber> s = new TreeSet<>();
	
		for(int i=0; i<10; ++i){
			s.add(randomPhoneNumber());
		}
		
		System.out.println(s.toString());
	}
	
	private static final Random random = new Random();

	private static PhoneNumber randomPhoneNumber(){
	
		return new PhoneNumber((short)random.nextInt(1000), (short)random.nextInt(1000), (short)random.nextInt(1000));
	}
}
