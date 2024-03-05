package client.imple.personal;

import client.interfaces.forPersonal.Healable;
import client.Personal;

import java.time.LocalDate;

public class Doctor extends Personal implements Healable {
    public Doctor(String position, String name, LocalDate age, String address, String specialization, LocalDate dateOfEmployment) {
        super(position, name, age, address, specialization, dateOfEmployment);
    }

    public Doctor() {
        super();
    }

    @Override
    public void heal() {
        System.out.println("Удаляю аппендикс");
    }
}
