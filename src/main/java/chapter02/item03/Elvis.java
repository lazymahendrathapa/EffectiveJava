package chapter02.item03;

public enum Elvis {

	INSTANCE;
	
	public void leaveTheBuilding(){
		System.out.print("Whoa baby, I'm outta here! ");
	}
	
	public static void main(String[] args){
		Elvis elvis = Elvis.INSTANCE;
		elvis.leaveTheBuilding();
	}
}
