package ru.ssau.tk.oop.propro;

import junit.framework.TestCase;

import static org.junit.Assert.assertThrows;
import static ru.ssau.tk.oop.propro.Points.*;

public class PointsTest extends TestCase {

    static public double myError = 0.00001;

    public void testSum() {
        Point firstPoint = new Point(1.5, 2, 3);
        Point secondPoint = new Point(8, 9.5, 2.6);
        Point resultPoint = sum(firstPoint, secondPoint);

        assertEquals(resultPoint.x, 9.5, myError);
        assertEquals(resultPoint.y, 11.5, myError);
        assertEquals(resultPoint.z, 5.6, myError);
    }

    public void testSubtract() {
        Point firstPoint = new Point(1.5, 2, 3);
        Point secondPoint = new Point(8, 9.5, 2.6);
        Point resultPoint = subtract(firstPoint, secondPoint);

        assertEquals(resultPoint.x, -6.5, myError);
        assertEquals(resultPoint.y, -7.5, myError);
        assertEquals(resultPoint.z, 0.4, myError);
    }

    public void testMultiply() {
        Point firstPoint = new Point(1.5, -2, 0);
        Point secondPoint = new Point(8, 9.5, 2.6);
        Point resultPoint = multiply(firstPoint, secondPoint);

        assertEquals(resultPoint.x, 12, myError);
        assertEquals(resultPoint.y, -19, myError);
        assertEquals(resultPoint.z, 0, myError);
    }

    public void testDivide() {
        Point firstPoint = new Point(16, -1.5, 3);
        Point secondPoint = new Point(8, 3, 3);
        Point resultPoint = divide(firstPoint, secondPoint);

        assertEquals(resultPoint.x, 2, myError);
        assertEquals(resultPoint.y, -0.5, myError);
        assertEquals(resultPoint.z, 1, myError);

        Point thirdPoint = new Point(0, 0, 0);
        assertThrows(ArithmeticException.class, () -> divide(firstPoint, thirdPoint));
    }

    public void testEnlarge() {
        Point firstPoint = new Point(1, -2, 0);
        double myFirstConstant = 5.1;
        Point resultPoint = enlarge(firstPoint, myFirstConstant);

        assertEquals(resultPoint.x, 5.1, myError);
        assertEquals(resultPoint.y, -10.2, myError);
        assertEquals(resultPoint.z, 0, myError);
    }

    public void testLenght() {
        Point firstPoint = new Point(3, 4, 0);
        assertEquals(lenght(firstPoint), 5, myError);
    }

    public void testOpposite() {
        Point firstPoint = new Point(3, 4, 0);
        Point resultPoint = opposite(firstPoint);
        assertEquals(resultPoint.x, -3, myError);
        assertEquals(resultPoint.y, -4, myError);
        assertEquals(resultPoint.z, 0, myError);
    }

    public void testInverse() {
        Point firstPoint = new Point(10, 2, 5);
        Point resultPoint = inverse(firstPoint);
        assertEquals(resultPoint.x, 0.1, myError);
        assertEquals(resultPoint.y, 0.5, myError);
        assertEquals(resultPoint.z, 0.2, myError);

        Point secondPoint = new Point(10, 0, 5);
        assertThrows(ArithmeticException.class, () -> inverse(secondPoint));
    }

    public void testScalarProduct() {
        Point firstVector = new Point(1, 2, 5);
        Point secondVector = new Point(2, 0, 3);
        assertEquals(scalarProduct(firstVector, secondVector), 17, myError);
    }

    public void testVectorProduct() {
        Point firstVector = new Point(1, 2, 5);
        Point secondVector = new Point(2, 0, 3);
        assertEquals(vectorProduct(firstVector, secondVector).x, 6, myError);
        assertEquals(vectorProduct(firstVector, secondVector).y, 7, myError);
        assertEquals(vectorProduct(firstVector, secondVector).z, -4, myError);
    }
}
