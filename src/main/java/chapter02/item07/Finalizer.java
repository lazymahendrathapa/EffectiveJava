package chapter02.item07;

public class Finalizer {

	protected void finalize() throws Throwable {
		try {
			System.out.println("Finalize of Sub Class");
		} catch (Throwable t) {
			throw t;
		} finally {
			System.out.println("Calling finalize of Super class");
			super.finalize();
		}
	}
	
	public static void main(String[] args){
		Finalizer finalizer = new Finalizer();
		try {
			finalizer.finalize();
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
	
}
