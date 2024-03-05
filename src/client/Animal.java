
package client;

import client.imple.owners.Owner;

import java.time.LocalDate;


public abstract class Animal {
    protected String name;
    protected float weight;
    protected LocalDate age;
    protected Owner owner;
    protected String diagnosis;

    public Animal(String name, float weight, LocalDate age, Owner owner, String diagnosis) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.owner = owner;
        this.diagnosis = diagnosis;

    }

    public Animal() {
        this("Имя", 0, LocalDate.now(), new Owner(), "лапка бо-бо");

    }



    @Override
    public String toString() {
        return String.format("Имя = %s, Вес = %s, Возраст = %s года, Хозяин = %s, Диагноз = %s ", name, weight, LocalDate.now().getYear() - age.getYear(), owner, diagnosis);
    }
}
