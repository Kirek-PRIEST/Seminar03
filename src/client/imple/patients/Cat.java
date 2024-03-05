package client.imple.patients;

import client.Animal;
import client.interfaces.forAnimals.Goable;
import client.imple.owners.Owner;

import java.time.LocalDate;

public class Cat extends Animal implements Goable{


    public Cat(String name, float weight, LocalDate age, Owner owner, String diagnosis) {
        super(name, weight, age, owner, diagnosis);
    }

    public Cat() {
        super();
    }



    @Override
    public double run() {
        return 13;
    }
}
