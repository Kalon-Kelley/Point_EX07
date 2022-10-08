/**
 * CS 105 Theory & Practice
 * CRN: 62498
 * Assignment: Streams
 * 
 * Statement of code ownership: I hereby state that I have written all of this
 * code and I have not copied this code from any other person or source.
 * 
 * @author [Lucas Kelley]
 */
package edu.sbcc.cs105;

/**
 * This code is a solution for the Streams assignment.
 *
 */
public class Point {
	private double _x = 0;
	private double _y = 0;

	private void _setX(double x) { _x = x; }
	private void _setY(double y) { _y = y; }

	public Point() {
	}

	public Point(double x, double y) {
		_x = x;
		_y = y;
	}

	public double getX() { return _x; }
	public double getY() { return _y; }

	public void translate(double dx, double dy) {
		translateX(dx);
		translateY(dy);
	}

	public void translateX(double dx) {
		// Put your code here to translate (addition) _x by dx
		_x += dx;
	}

	public void translateY(double dy) {
		// Put your code here to translate (addition) _y by dy
		_y += dy;
	}

	public void scale(double sx, double sy) {
		scaleX(sx);
		scaleY(sy);
	}

	public void scaleX(double sx) {
		// Put your code here to scale (multiply) _x by sx
		_x *= sx;
	}

	public void scaleY(double sy) {
		// Put your code here to scale (multiply) _y by sy
		_y *= sy;
	}


	public double distance(Point p) {
		double x = p.getX() - getX();
		double y = p.getY() - getY();

		// Change the 0.0 below to the distance formula Math.sqrt(x * x + y * y)
		double distance = Math.sqrt(x*x + y*y);
		return distance;
	}

	public static void main(String args[]) {
		Point origin = new Point();
		Point p1 = new Point(0, 4);

		System.out.println(origin.distance(p1));

		System.out.println("p1.x: " + p1.getX() + ", p1.y: " + p1.getY());
	}

}