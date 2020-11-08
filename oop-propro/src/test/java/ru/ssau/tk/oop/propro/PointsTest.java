package ru.ssau.tk.oop.propro;

import junit.framework.TestCase;

import static org.junit.Assert.assertThrows;
import static ru.ssau.tk.oop.propro.Points.*;

public class PointsTest extends TestCase {

    public void testSum() {
        Point firstPoint = new Point(1.5, 2, 3);
        Point secondPoint = new Point(8, 9.5, 2.6);
        Point resultPoint = sum(firstPoint, secondPoint);

        assertEquals(resultPoint.x, 9.5);
        assertEquals(resultPoint.y, 11.5);
        assertEquals(resultPoint.z, 5.6);
    }

    public void testSubtract() {
        Point firstPoint = new Point(1.5, 2, 3);
        Point secondPoint = new Point(8, 9.5, 2.6);
        Point resultPoint = subtract(firstPoint, secondPoint);

        assertEquals(resultPoint.x, -6.5, 0.00001);
        assertEquals(resultPoint.y, -7.5, 0.00001);
        assertEquals(resultPoint.z, 0.4, 0.00001);
    }

    public void testMultiply() {
        Point firstPoint = new Point(1.5, -2, 0);
        Point secondPoint = new Point(8, 9.5, 2.6);
        Point resultPoint = multiply(firstPoint, secondPoint);

        assertEquals(resultPoint.x, 12, 0.00001);
        assertEquals(resultPoint.y, -19, 0.00001);
        assertEquals(resultPoint.z, 0, 0.00001);
    }

    public void testDivide() {
        Point firstPoint = new Point(16, -1.5, 3);
        Point secondPoint = new Point(8, 3, 3);
        Point resultPoint = divide(firstPoint, secondPoint);

        assertEquals(resultPoint.x, 2, 0.00001);
        assertEquals(resultPoint.y, -0.5, 0.00001);
        assertEquals(resultPoint.z, 1, 0.00001);

        Point thirdPoint = new Point(0, 0, 0);
        assertThrows(ArithmeticException.class, () -> divide(firstPoint, thirdPoint));
    }

    public void testEnlarge() {
        Point firstPoint = new Point(1, -2, 0);
        double myFirstConstant = 5.1;
        Point resultPoint = enlarge(firstPoint, myFirstConstant);

        assertEquals(resultPoint.x, 5.1, 0.00001);
        assertEquals(resultPoint.y, -10.2, 0.00001);
        assertEquals(resultPoint.z, 0, 0.00001);
    }

    public void testLenght() {
        Point firstPoint = new Point(3, 4, 0);
        assertEquals(lenght(firstPoint), 5, 0.00001);
    }

    public void testOpposite() {
        Point firstPoint = new Point(3, 4, 0);
        Point resultPoint = opposite(firstPoint);
        assertEquals(resultPoint.x, -3, 0.00001);
        assertEquals(resultPoint.y, -4, 0.00001);
        assertEquals(resultPoint.z, 0, 0.00001);
    }

    public void testInverse() {
        Point firstPoint = new Point(10, 2, 5);
        Point resultPoint = inverse(firstPoint);
        assertEquals(resultPoint.x, 0.1);
        assertEquals(resultPoint.y, 0.5);
        assertEquals(resultPoint.z, 0.2);

        Point secondPoint = new Point(10, 0, 5);
        assertThrows(ArithmeticException.class, () -> inverse(secondPoint));
    }
}
