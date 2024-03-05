package client;

import java.time.LocalDate;

public abstract class Personal {
    protected String position;
    protected String name;
    protected LocalDate age;
    protected String address;
    protected String specialization;
    protected LocalDate dateOfEmployment;

    public Personal(String position, String name, LocalDate age, String address, String specialization, LocalDate dateOfEmployment) {
        this.position = position;
        this.name = name;
        this.address = address;
        this.age = age;
        this.specialization = specialization;
        this.dateOfEmployment = dateOfEmployment;
    }

    public Personal() {
        this("Врач","Зигфрид Фарнон", LocalDate.of(1911, 4, 22), "Йоркшир", "Хирург", LocalDate.of(1935, 6, 1));
    }

    @Override
    public String toString() {
        return String.format("Должность = %s,\tИмя = %s,\tДата рождения = %s,\tАдрес проживания = %s,\tСпециализация = %s,\tДата приёма на работу = %s", position, name, age, address, specialization, dateOfEmployment);
    }
}
