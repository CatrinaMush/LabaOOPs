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
            assertNull(p2);
        });
    }
}
