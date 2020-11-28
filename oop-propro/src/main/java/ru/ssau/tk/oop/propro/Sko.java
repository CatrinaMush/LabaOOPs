package ru.ssau.tk.oop.propro;

import java.util.Scanner;

import static java.lang.Math.*;

public class Sko {

    public static void main(String[] args) {

        Scanner inputN = new Scanner(System.in); //ввод числа измерений
        System.out.print("Input a number of measurements: ");
        int n = inputN.nextInt();

        double[] arrayValues = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Input a value: ");
            Scanner inputValues = new Scanner(System.in); //ввод значений величины
            double values = inputValues.nextDouble();
            arrayValues[i] = values;
        }

        MyArrays myPerfectArray = new MyArrays();
        double avarage = myPerfectArray.meanValueArray(arrayValues);
        double sko = sqrt(n * myPerfectArray.dispertionValueArray(arrayValues) / (n - 1)); //находим ско

        System.out.print("Avarage value: " + avarage + "\n");
        System.out.print("Sko: " + sko + "\n");

        System.out.print("Input a coefficient Student : ");  //ввод коэффициента Стъюдента
        Scanner inputCoefStudent = new Scanner(System.in); //ввод значений величины
        double coefStudent = inputCoefStudent.nextDouble();
        System.out.print("Result value: " + avarage + " ± " + sko * coefStudent);
    }
}
