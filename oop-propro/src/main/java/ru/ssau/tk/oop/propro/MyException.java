package ru.ssau.tk.oop.propro;

public class MyException {

    public static String getObjectPerson(Person obj) {
        if (obj.getFirstName() == null || obj.getLastName() == null) {
            throw new NullPointerException();
        }
        return obj.toString();
    }

    public static String[] getSymbolOnIndex(String[] str, int n) {
        String[] newStr = new String[str.length];
        for (String s : str) {
            if (n > s.length()) {
                throw new StringIndexOutOfBoundsException();
            }
        }
        for (String s : str) {
            if (s == null) {
                throw new NullPointerException();
            }
        }
        for (int i = 0; i < str.length; i++) {
            newStr[i] = str[i].substring(n, n + 1);
        }
        return newStr;
    }

    public static char getCharOnIndex(String[] arrayStr, int n, int m) {
        if (n > arrayStr.length) {
            throw new StringIndexOutOfBoundsException();
        }
        if (m > arrayStr.length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return arrayStr[n].charAt(m);
    }

    public static int getIntOfString(String str1, String str2) {
        if (Integer.parseInt(str2) == 0) {
            throw new ArithmeticException();
        }
        if (!Character.isDigit(str1.charAt(0)) || !Character.isDigit(str2.charAt(0))) {
            throw new NumberFormatException();
        }
        return Integer.parseInt(str1) / Integer.parseInt(str2);
    }
}
