package ru.ssau.tk.oop.propro;

import static java.lang.Math.abs;
import static java.lang.Math.pow;
import static java.lang.StrictMath.sqrt;

public class MyArrays {

    public int[] arrayLength(int l) {
        return new int[l];
    }

    public int[] nearlyOnesArray(int l) {
        int[] myArray = new int[l];
        for (int i = 0; i < l; i++) {
            myArray[i] = 1;
        }
        myArray[0] = 2;
        myArray[l - 1] = 2;
        return myArray;
    }

    public int[] increasingOddNumArray(int l) {
        int[] myArray = new int[l];
        int k = 1;
        for (int i = 0; i < l; i++) {
            myArray[i] = k;
            k = k + 2;
        }
        return myArray;
    }

    public int[] decreasingEvenNumArray(int l) {
        int[] myArray = new int[l];
        int k = 2 * l;
        for (int i = 0; i < l; i++) {
            myArray[i] = k;
            k = k - 2;
        }
        return myArray;
    }

    public int[] fibonacciNumArray(int l) {
        int[] fibArray = new int[l];
        fibArray[0] = 1;
        fibArray[1] = 1;
        for (int i = 2; i < l; i++) {
            fibArray[i] = fibArray[i - 1] + fibArray[i - 2];
        }
        return fibArray;
    }

    public int[] sqrIndexArray(int l) {
        int[] mySqrIndexArray = new int[l];
        for (int i = 0; i < l; i++) {
            mySqrIndexArray[i] = i * i;
        }
        return mySqrIndexArray;
    }

    public double[] quadraticEquationResult(double a, double b, double c) {
        double discriminant = b * b - 4 * a * c;
        if ((discriminant == 0) & (a > 0)) {
            double[] result = new double[1];
            result[0] = -b / (2 * a);
            return result;
        }
        if ((discriminant > 0) & (a > 0)) {
            double[] result = new double[2];
            result[0] = (-b - sqrt(discriminant)) / (2 * a);
            result[1] = (-b + sqrt(discriminant)) / (2 * a);
            return result;
        }
        if (a == 0) {
            double[] result = new double[1];
            result[0] = -c / b;
            return result;
        }
        return new double[0];
    }

    public int[] numbersNotDivisibleByThree(int l) {
        int[] myNumbersNotDivisibleByThree = new int[l];
        int k = 1;
        for (int i = 0; i < l; i++) {
            myNumbersNotDivisibleByThree[i] = k;
            k++;
            if (k % 3 == 0) {
                k++;
            }
        }
        return myNumbersNotDivisibleByThree;
    }

    public double[] arithmeticProgressionArray(int n, double firstNum, double stepArithmeticProgression) {
        double[] myArithmeticProgression = new double[n];
        myArithmeticProgression[0] = firstNum;
        for (int i = 1; i < n; i++) {
            myArithmeticProgression[i] = myArithmeticProgression[i - 1] + stepArithmeticProgression;
        }
        return myArithmeticProgression;
    }

    public double[] geometricProgressionArray(int n, double firstNum, double denominatorOfProgression) {
        double[] myGeometricProgression = new double[n];
        myGeometricProgression[0] = firstNum;
        for (int i = 1; i < n; i++) {
            myGeometricProgression[i] = myGeometricProgression[i - 1] * denominatorOfProgression;
        }
        return myGeometricProgression;
    }

    public void changeSignArray(int[] anotherSignArray) {
        for (int i = 0; i < anotherSignArray.length; i++) {
            anotherSignArray[i] = -1 * anotherSignArray[i];
        }
    }

    public boolean findNumberInArray(int[] array, int n) {
        for (int j : array) {
            if (j == n) {
                return true;
            }
        }
        return false;
    }

    public boolean checkNullArray(Integer[] array) {
        for (Integer j : array) {
            if (j == null) {
                return true;
            }
        }
        return false;
    }

    public int countEvenNumbers(int[] numbers) {
        int k = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                k++;
            }
        }
        return k;
    }

    public Integer findMax(int[] arrayValues) {
        if (arrayValues.length > 0) {
            int maxValue = arrayValues[0];
            for (int i = 1; i < arrayValues.length; i++) {
                if (arrayValues[i] > maxValue) {
                    maxValue = arrayValues[i];
                }
            }
            return maxValue;
        }
        return null;
    }

    public int sumOfEvenIndex(int[] arrayValues) {
        int sum = 0;
        for (int i = 0; i < arrayValues.length; i++) {
            if (i % 2 == 0) {
                sum += arrayValues[i];
            }
        }
        return sum;
    }

    public boolean countingDivisors(int[] arrayValues) {
        int countForFirstValue = 0;
        int countForLastValue = 0;
        for (int value : arrayValues) {
            if (value % arrayValues[0] == 0) {
                countForFirstValue++;
            }
            if (value % arrayValues[arrayValues.length - 1] == 0) {
                countForLastValue++;
            }
        }
        return countForFirstValue > countForLastValue;
    }

    public int[] symmetricArray(int l) {
        if (l == 0) {
            return null;
        }
        int[] symmetric = new int[l];
        for (int i = 0; i <= (l / 2); i++) {
            symmetric[i] = i + 1;
        }
        if (l % 2 != 0) {
            int j = l / 2;
            for (int i = l / 2 + 1; i < l; i++) {
                symmetric[i] = j;
                j--;
            }
        }
        if (l % 2 == 0) {
            int j = (l / 2);
            for (int i = l / 2; i < l; i++) {
                symmetric[i] = j;
                j--;
            }
        }
        return symmetric;
    }

    public int[] getArrayDivisors(int c) {
        int count = 0;
        for (int i = 1; i <= (int) sqrt(abs(c)); i++) {
            if (abs(c) % i == 0) {
                count += 1;
            }
        }
        count = 2 * count - (sqrt(abs(c)) == (int) sqrt(abs(c)) ? 1 : 0);
        count *= 2;
        int[] arrayDivisors = new int[count];
        for (int j = 0, k = 0; j != (int) sqrt(abs(c)); j++) {
            if (abs(c) % (j + 1) == 0) {
                arrayDivisors[k] = j + 1;
                arrayDivisors[count - 1 - k] = abs(c) / (j + 1);
                k += 1;
            }
            if (abs(c) % (j + 1) == 0) {
                arrayDivisors[k] = -(j + 1);
                arrayDivisors[count - 1 - k] = -(abs(c) / (j + 1));
                k += 1;
            }
        }
        return arrayDivisors;
    }

    public int findIndexOfNumber(int[] arrayvValues, int number) {
        for (int i = 0; i < arrayvValues.length; i++) {
            if (arrayvValues[i] == number) {
                return i;
            }
        }
        return 0;
    }

    public void exchangedMaxAndMin(int[] array) {
        int min = array[0];
        int indexMin = 0;
        int max = array[0];
        int indexMax = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                indexMax = i;
            }
            if (array[i] < min) {
                min = array[i];
                indexMin = i;
            }
        }
        array[indexMax] = min;
        array[indexMin] = max;
    }

    public void bitWiseNegation(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = ~array[i];
        }
    }

    public double meanValueArray(double[] arrayValues) {
        double sum = 0;
        for (double arrayValue : arrayValues) {
            sum += arrayValue;
        }
        return sum / arrayValues.length;
    }

    public double dispertionValueArray(double[] arrayValues) {
        double sumSqrValues = 0;
        for (double arrayValue : arrayValues) {
            sumSqrValues += pow(arrayValue, 2);
        }
        double meanSqrValues = sumSqrValues / arrayValues.length;
        return meanSqrValues - pow(meanValueArray(arrayValues), 2);
    }

    public int[] arrayBitwiseNot(int[] yesArray) {
        int[] notArray = new int[yesArray.length];
        for (int i = 0; i < yesArray.length; i++) {
            notArray[i] = ~yesArray[i];
        }
        return notArray;
    }

    public int findMostCommonElement(int[] numbers) {
        int num = numbers[0];
        int max_common = 1;
        for (int i = 0; i < numbers.length - 1; i++) {
            int common = 1;
            for (int k = i + 1; k < numbers.length; k++) {
                if (numbers[i] == numbers[k]) {
                    common += 1;
                }
                if (common > max_common) {
                    max_common = common;
                    num = numbers[i];
                    return numbers[i];
                }
            }
        }
        return 0;
    }

    public boolean[] findEvenNumbers(int[] array) {
        boolean[] bool = new boolean[array.length];
        for (int i = 0; i < array.length; i++) {
            bool[i] = array[i] % 2 == 0;
        }
        return bool;
    }

    public int[] convertLongToTwoInts(long number) {
        return new int[]{(int) (number >> 32), (int) number};
    }

    public long convertTwoIntsToLong(int first, int last) {
        return ((long) last | (long) first << 32);
    }

    public int[] getCycleOfNaturalNumbers(int size, int startingIndex) {
        if (startingIndex < 0 || startingIndex >= size) {
            throw new IllegalArgumentException("Invalid starting index!");
        }
        int[] array = new int[size];
        int diff = startingIndex - 1;
        for (int i = 0; i != size; i++, startingIndex++) {
            array[startingIndex % size] = startingIndex - diff;
        }
        return array;
    }

    public int[][] createTwoDimensionalArray(int n) {
        int[][] array = new int[n][];
        int m = n;
        int k = 1;
        for (int i = 0; i < n; i++) {
            array[i] = new int[m];
            for (int j = 0; j < m; j++) {
                array[i][j] = k;
                k++;
            }
            m--;
        }
        return array;
    }
}
