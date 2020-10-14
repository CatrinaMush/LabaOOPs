package ru.ssau.tk.oop.propro;

public class Point {
    public final double x;
    public final double y;
    public final double z;

    public Point(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public static void main(String[] args) {
        Point firstPoint = new Point(1.502, 2.306, 5.201);
        Point secondPoint = new Point(1.025, 3.598, 8.561);
        System.out.print(firstPoint.x + " " + firstPoint.y + " " + firstPoint.z + '\n');
        System.out.print(secondPoint.x + " " + secondPoint.y + " " + secondPoint.z);
    }
}