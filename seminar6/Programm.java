package seminar6;

import seminar6.srp.Point;
import seminar6.srp.Square;
import seminar6.srp.SquareDrawer;
import seminar6.srp1.Order;

public class Programm {
	public static void main(String[] args) {
		// region Square
		// Square square = new Square(10, new Point(2, 3));
		// System.out.println("Square area: " + square.getArea());
		// SquareDrawer draw = new SquareDrawer(square, 1);
		// draw.draw();
		// endregion

		// region Order
		Order order = new Order("AAAA", "BBBBBB", 1, 300);
		System.out.println(order);
		order.saveToJSON();
		// endregion

	}
}
