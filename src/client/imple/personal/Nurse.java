package client.imple.personal;

import client.Personal;

import java.time.LocalDate;

public class Nurse extends Personal {
    public Nurse(String position, String name, LocalDate age, String address, String specialization, LocalDate dateOfEmployment) {
        super(position, name, age, address, specialization, dateOfEmployment);
    }

    public Nurse() {
        super();
    }


}
