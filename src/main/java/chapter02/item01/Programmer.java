package chapter02.item01;

public class Programmer {

	private boolean life;
	
	private Programmer(boolean life){
		this.life = life;
	}
	
	public static Programmer createProgrammerWithLife(){
		return new Programmer(true);
	}

	public static Programmer createProgrammerWithoutLife(){
		return new Programmer(false);
	}
	
	public boolean getLife(){
		return life;
	}
	
	public static void main(String[] args){
	
		Programmer lifeProgrammer = Programmer.createProgrammerWithLife();
		Programmer withoutLifeProgrammer = Programmer.createProgrammerWithoutLife();
		
		System.out.println(lifeProgrammer.getLife());
		System.out.println(withoutLifeProgrammer.getLife());
		
	}
}
