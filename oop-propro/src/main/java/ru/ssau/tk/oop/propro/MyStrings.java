package ru.ssau.tk.oop.propro;

public class MyStrings {

    public void outputMyString(String myString) {
        for (int i = 0; i < myString.length(); i++) {
            System.out.println(myString.charAt(i));
        }
    }

    public void byteMyString(String myString) {
        byte[] myStringBytes = myString.getBytes();
        for (byte myByte : myStringBytes) {
            System.out.println(myByte);
        }
    }

    public boolean palindromeCheck(String myString) {
        return myString.equals(new StringBuilder(myString).reverse().toString());
    }

    public int findSubstringInString(String firstString, String secondString) {
        return firstString.indexOf(secondString);
    }

    public int findSubstringInSecondHalfString(String firstString, String secondString) {
        return firstString.indexOf(secondString, firstString.length() / 2);
    }


    public int lastInFirstLineOfFirstLine(String firstString, String secondString) {
        return firstString.lastIndexOf(secondString, firstString.length() / 2);
    }

    public String newString(String firstString, String secondString, String thirdString) {
        for (int i = 0; i < 100 && firstString.contains(secondString); i++) {
            firstString = firstString.replaceAll(secondString, thirdString);
        }
        return firstString;
    }

    public boolean isSameRegister(String firstString, String secondString) {
        return firstString.equalsIgnoreCase(secondString) && !firstString.equals(secondString);
    }

    public int countStrings(String[] array, String prefix, String postfix) {
        int count = 0;
        for (String str : array) {
            if (str.startsWith(prefix) && str.endsWith(postfix)) {
                count++;
            }
        }
        return count;
    }

    public int newCountOfStrings(String[] array, String prefix, String postfix) {
        int number = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i].trim();
        }
        for (String str : array) {
            if (str.startsWith(prefix) && str.endsWith(postfix)) {
                number++;
            }
        }
        return number;
    }

    public String getSubstringInString(String str, int from, int to) {
        if (from < 0) {
            from = 0;
        }
        if (to > str.length()) {
            to = str.length();
        }
        if (from == to) {
            return "";
        }
        return str.substring(from, to);
    }

    public static String getUnifiedStr(String[] array) {
        return String.join(", ", array);
    }
}
