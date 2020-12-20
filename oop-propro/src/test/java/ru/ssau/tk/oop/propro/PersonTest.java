package ru.ssau.tk.oop.propro;

import junit.framework.TestCase;
import org.junit.Test;

public class PersonTest extends TestCase {

    Person firstPerson = new Person("Karina", "Mushankova");
    Person secondPerson = new Person("Helena", "Shishova", 25413);
    Person thirdPerson = new Person(452623);

    public void testGetFirstName() {
        assertEquals(firstPerson.getFirstName(), "Karina");
        assertEquals(secondPerson.getFirstName(), "Helena");
        assertNull(thirdPerson.getFirstName());
    }

    public void testGetLastName() {
        assertEquals(firstPerson.getLastName(), "Mushankova");
        assertEquals(secondPerson.getLastName(), "Shishova");
        assertNull(thirdPerson.getLastName());
    }

    public void testPassportId() {
        assertEquals(secondPerson.getPassportId(), 25413);
        assertEquals(thirdPerson.getPassportId(), 452623);
        assertEquals(firstPerson.getPassportId(), 0);
    }

    @Test
    public void testToString() {
        assertEquals(firstPerson.toString(), "Karina Mushankova");
        assertEquals(secondPerson.toString(), "Helena Shishova");
        firstPerson.setFirstName("");
        firstPerson.setLastName("");
        assertEquals(firstPerson.toString(), "");
        secondPerson.setLastName("");
        assertEquals(secondPerson.toString(), "Helena");
    }
}
