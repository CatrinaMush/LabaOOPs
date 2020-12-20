package ru.ssau.tk.oop.propro;

public class MyException {

    public static String getObjectPerson(Person obj) {
        if (obj.getFirstName() == null || obj.getLastName() == null) {
            throw new NullPointerException();
        }
        return obj.toString();
    }
}
