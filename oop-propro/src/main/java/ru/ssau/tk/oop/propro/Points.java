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

    public static Point enlarge(Point firstPoint, double k) {
        return new Point(firstPoint.x * k, firstPoint.y * k, firstPoint.z * k);
    }
}
