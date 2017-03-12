package chapter04.item14;

public class Point {

	private double x;
	private double y;
	
	public Point(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	public double getX(){
		return this.x;
	}
	
	public double getY(){
		return this.y;
	}
	
	public static void main(String[] args){
		
		Point p = new Point(12,12);
		System.out.println(p.getX());
		System.out.println(p.getY());
	}
}
