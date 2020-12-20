package ru.ssau.tk.oop.propro;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyExceptionTest {

    @Test
    public void getObjectPerson() {
        Person p1 = new Person("Karina", "Mushankova");
        assertEquals(MyException.getObjectPerson(p1), "Karina Mushankova");
        Person p2 = new Person(null, null);
        Assert.assertThrows(NullPointerException.class, () -> {
            MyException.getObjectPerson(p2);
        });
    }

    @Test
    public void getSymbolOnIndex() {
        String[] str = {"I", "believe", "i", "can", "fly"};
        assertEquals(MyException.getSymbolOnIndex(str, 0), new String[]{"I", "b", "i", "c", "f"});
        Assert.assertThrows(StringIndexOutOfBoundsException.class,
                () -> assertEquals(MyException.getSymbolOnIndex(str, 1),
                        new String[]{"", "e", "", "a", "l"}));
        Assert.assertThrows(NullPointerException.class,
                () -> MyException.getSymbolOnIndex(null, 0));
        String[] str1 = {null, "null"};
        Assert.assertThrows(NullPointerException.class,
                () -> MyException.getSymbolOnIndex(str1, 0));
    }

    @Test
    public void getCharOnIndex() {
        String[] str = new String[]{"I", "believe", "i", "can", "fly"};
        assertEquals(MyException.getCharOnIndex(str, 0, 0), 'I');
        Assert.assertThrows(StringIndexOutOfBoundsException.class,
                () -> MyException.getCharOnIndex(str, 30, 0));
        Assert.assertThrows(ArrayIndexOutOfBoundsException.class,
                () -> MyException.getCharOnIndex(str, 0, 30));
    }

    @Test
    public void getIntOfString() {
        System.out.println(MyException.getIntOfString("10", "5"));
        Assert.assertThrows(ArithmeticException.class,
                () -> MyException.getIntOfString("10", "0"));
        Assert.assertThrows(NumberFormatException.class,
                () -> MyException.getIntOfString("r", "1"));
        Assert.assertThrows(NumberFormatException.class,
                () -> MyException.getIntOfString("r", "a"));
    }
}
