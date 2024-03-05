package client.imple.patients;

import client.Animal;
import client.interfaces.forAnimals.Flyable;
import client.imple.owners.Owner;
import client.interfaces.forAnimals.Swimable;

import java.time.LocalDate;

public class FlyingFish extends Animal implements Swimable, Flyable {
    public FlyingFish(String name, float weight, LocalDate age, Owner owner, String diagnosis) {
        super(name, weight, age, owner, diagnosis);
    }

    public FlyingFish() {
    }



    @Override
    public double swim() {
        return 65;
    }

    @Override
    public double fly() {
        return 30;
    }
}
