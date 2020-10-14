package ru.ssau.tk.oop.propro;

public class NewPerson {

    public static void main(String[] args) {
        Person Karina = new Person();
        Karina.setFirstName("Karina");
        Karina.setLastName("Mushankova");
        Karina.setPassportId(1002011002);
        String stringKarinaPassportId = String.valueOf(Karina.getPassportId());

        Person Helen = new Person();
        Helen.setFirstName("Helen");
        Helen.setLastName("Shishova");
        Helen.setPassportId(1002011003);
        String stringHelenPassportId = String.valueOf(Helen.getPassportId());

        System.out.println(Karina.getFirstName() + ' ' + Karina.getLastName() + ' ' +  stringKarinaPassportId);
        System.out.println(Helen.getFirstName() + ' ' + Helen.getLastName() + ' ' +  stringHelenPassportId);
    }
}
