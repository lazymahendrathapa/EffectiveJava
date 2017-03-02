package chapter03.item08;

public class ColorPoint {

	private final Color color;
	private final Point point;

	public ColorPoint(int x, int y, Color color) {

		if (color == null)
			throw new NullPointerException();

		this.point = new Point(x, y);
		this.color = color;
	}

	public Point asPoint() {
		return point;
	}

	@Override
	public boolean equals(Object o) {
		if (!(o instanceof ColorPoint))
			return false;

		ColorPoint cP = (ColorPoint) o;

		return cP.point.equals(point) && cP.color.equals(color);
	}

	@Override
	public int hashCode() {
		return point.hashCode() * 33 + color.hashCode();
	}

	public static void main(String[] args) {

		ColorPoint p1 = new ColorPoint(1, 1, Color.YELLOW);
		ColorPoint p2 = new ColorPoint(1, 1, Color.BLUE);
		ColorPoint p3 = new ColorPoint(1, 1, Color.YELLOW);
		ColorPoint p4 = new ColorPoint(2, 4, Color.BLUE);

		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(p3));
		System.out.println(p2.equals(p4));
		System.out.println(p1.equals(null));

	}
}