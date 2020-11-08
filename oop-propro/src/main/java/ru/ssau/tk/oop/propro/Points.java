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
}
