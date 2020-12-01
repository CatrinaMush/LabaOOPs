package ru.ssau.tk.oop.propro;

public class MyStrings {

    public void outputMyString(String myString) {
        for (int i = 0; i < myString.length(); i++) {
            System.out.println(myString.charAt(i));
        }
    }

    public static void main(String[] args) {
        MyStrings myFirstString = new MyStrings();
        myFirstString.outputMyString("I do not have time for anything :(");
        System.out.println("");
    }
}
