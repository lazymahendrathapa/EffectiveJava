package chapter02.item05;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Person {

	private final Date birthDate;

	public Person(Date birthDate){
		this.birthDate = birthDate;
	}
	private static final Date BOOM_START;
	private static final Date BOOM_END;
	
	static{
		Calendar gmtCal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
		gmtCal.set(1970, Calendar.JANUARY,1,0,0,0);
		BOOM_START = gmtCal.getTime();
		gmtCal.set(1980, Calendar.JANUARY,1,0,0,0);
		BOOM_END = gmtCal.getTime();
	}
	
	public boolean isBabyBoomer(){
		return birthDate.compareTo(BOOM_START) >=0 && birthDate.compareTo(BOOM_END) < 0;
	}
	
	public static void main(String[] args){
		Person person = new Person(new Date(2000));
		System.out.println(person.isBabyBoomer());
	}
}
