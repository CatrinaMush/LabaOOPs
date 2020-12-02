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
}
