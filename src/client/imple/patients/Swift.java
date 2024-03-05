package client.imple.patients;

import client.Animal;
import client.interfaces.forAnimals.Flyable;
import client.imple.owners.Owner;

import java.time.LocalDate;

public class Swift extends Animal implements Flyable {
    public Swift(String name, float weight, LocalDate age, Owner owner, String diagnosis) {
        super(name, weight, age, owner, diagnosis);

    }

    public Swift() {
    }


    @Override
    public double fly() {
        return 60;
    }
}
