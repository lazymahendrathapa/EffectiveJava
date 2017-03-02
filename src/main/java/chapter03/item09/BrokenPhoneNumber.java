package chapter03.item09;

public class BrokenPhoneNumber {

	private final short areaCode;
	private final short prefix;
	private final short lineNumber;

	public BrokenPhoneNumber(int areaCode, int prefix, int lineNumber) {

		rangeCheck(areaCode, 999, "area code");
		rangeCheck(prefix, 999, "prefix");
		rangeCheck(lineNumber, 9999, "line number");

		this.areaCode = (short) areaCode;
		this.prefix = (short) prefix;
		this.lineNumber = (short) lineNumber;

	}

	@Override
	public boolean equals(Object o) {

		if (o == this)
			return true;
		if (!(o instanceof PhoneNumber))
			return false;

		BrokenPhoneNumber pn = (BrokenPhoneNumber) o;

		return pn.areaCode == areaCode && pn.prefix == prefix && pn.lineNumber == lineNumber;
	}
	
	private static void rangeCheck(int arg, int max, String name) {
		if (arg < 0 || arg > max)
			throw new IllegalArgumentException(name + ": " + arg);
	}

}
