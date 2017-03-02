package chapter03.item09;

import java.util.HashMap;
import java.util.Map;

public class App {

	public static void main(String[] args){
		
		Map<PhoneNumber, String> phoneNumber = new HashMap<>(); 
		Map<BrokenPhoneNumber, String> brokenPhoneNumber = new HashMap<>();
		
		phoneNumber.put(new PhoneNumber(977, 1, 1234), "Hello");
		brokenPhoneNumber.put(new BrokenPhoneNumber(977, 1, 1234), "Hello");
		
		System.out.println(phoneNumber.get(new PhoneNumber(977,1,1234)));
		System.out.println(brokenPhoneNumber.get(new BrokenPhoneNumber(977,1,1234)));
	}
}
