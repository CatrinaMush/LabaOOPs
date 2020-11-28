package ru.ssau.tk.oop.propro;

import static java.lang.Math.sin;

public class MonteCarlo {

    public double integrate(double xFrom, double xTo, int numPoints) {

        double distributionFunction = 1 / (xTo - xFrom);
        double randomValue;
        double sumArrayValue = 0;

        for (int i = 0; i < numPoints; i++) {
            randomValue = Math.random() / distributionFunction;
            sumArrayValue += sin(randomValue);

        }
        return (sumArrayValue / numPoints) / distributionFunction;
    }
}
