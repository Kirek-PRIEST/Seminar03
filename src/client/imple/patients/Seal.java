package client.imple.patients;

import client.Animal;
import client.interfaces.forAnimals.Goable;
import client.imple.owners.Owner;
import client.interfaces.forAnimals.Swimable;

import java.time.LocalDate;

public class Seal extends Animal implements Swimable, Goable {

    public Seal(String name, float weight, LocalDate age, Owner owner, String diagnosis) {
        super(name, weight, age, owner, diagnosis);
    }

    public Seal() {
        super();
    }



    @Override
    public double swim() {
        return 24;
    }

    @Override
    public double run() {
        return 2;
    }
}
