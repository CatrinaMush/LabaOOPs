package ru.ssau.tk.oop.propro;

public class Points {

    private Points() {
    }

    public static Point sum(Point firstPoint, Point secondPoint) {
        return new Point(firstPoint.x + secondPoint.x, firstPoint.y + secondPoint.y, firstPoint.z + secondPoint.z);
    }

    public static Point subtract(Point firstPoint, Point secondPoint) {
        return new Point(firstPoint.x - secondPoint.x, firstPoint.y - secondPoint.y, firstPoint.z - secondPoint.z);
    }

    public static Point multiply(Point firstPoint, Point secondPoint) {
        return new Point(firstPoint.x * secondPoint.x, firstPoint.y * secondPoint.y, firstPoint.z * secondPoint.z);
    }

    public static Point divide(Point firstPoint, Point secondPoint) {
        if (secondPoint.x == 0 || secondPoint.y == 0 || secondPoint.z == 0) {
            throw new ArithmeticException("Dividing by zero");
        }
        return new Point(firstPoint.x / secondPoint.x, firstPoint.y / secondPoint.y, firstPoint.z / secondPoint.z);
    }

    public static Point enlarge(Point firstPoint, double myConstant) {
        return new Point(firstPoint.x * myConstant, firstPoint.y * myConstant, firstPoint.z * myConstant);
    }

    public static double lenght(Point point) {
        return point.length();
    }

    public static Point opposite(Point firstPoint) {
        return new Point(-firstPoint.x, -firstPoint.y, -firstPoint.z);
    }

    public static Point inverse(Point firstPoint) {
        if (firstPoint.x == 0 || firstPoint.y == 0 || firstPoint.z == 0) {
            throw new ArithmeticException("Dividing by zero");
        }
        return new Point(1 / firstPoint.x, 1 / firstPoint.y, 1 / firstPoint.z);
    }

    public static double scalarProduct(Point firstVector, Point secondVector) {
        return firstVector.x * secondVector.x + firstVector.y * secondVector.y + firstVector.z * secondVector.z;
    }

    public static Point vectorProduct(Point firstVector, Point secondVector) {
        double resultX = firstVector.y * secondVector.z - firstVector.z * secondVector.y;
        double resultY = firstVector.z * secondVector.x - firstVector.x * secondVector.z;
        double resultZ = firstVector.x * secondVector.y - firstVector.y * secondVector.x;
        return new Point(resultX, resultY, resultZ);
    }
}
