package client.imple.patients;

import client.Animal;
import client.interfaces.forAnimals.Goable;
import client.imple.owners.Owner;

import java.time.LocalDate;

public class Straus extends Animal implements Goable {
    public Straus(String name, float weight, LocalDate age, Owner owner, String diagnosis) {
        super(name, weight, age, owner, diagnosis);
    }

    public Straus() {
    }




    @Override
    public double run() {
        return 60;
    }
}


