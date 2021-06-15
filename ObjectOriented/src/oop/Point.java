package oop;

public class Point {

	private int x;
	private int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "(" + x + "," + y + ")";
	}

//	@Override
//	public int hashCode() {
//		return (x + y) * 2;
//	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			;
		if (!(obj instanceof Point)) {
			return false;
		}
		Point other = (Point) obj;
		return (this.x == other.x && this.y == other.y);
	}
}