package client.imple.patients;

import client.*;
import client.imple.owners.Owner;
import client.interfaces.forAnimals.Flyable;
import client.interfaces.forAnimals.Goable;
import client.interfaces.forAnimals.Swimable;

import java.time.LocalDate;

public class Duck extends Animal implements Swimable, Flyable, Goable {
    public Duck(String name, float weight, LocalDate age, Owner owner, String diagnosis) {
        super(name, weight, age, owner, diagnosis);
    }

    public Duck() {
    }



    @Override
    public double swim() {
        return 3;
    }

    @Override
    public double fly() {
        return 90;
    }

    @Override
    public double run() {
        return 1;
    }
}
