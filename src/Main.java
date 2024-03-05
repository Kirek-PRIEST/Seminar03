import client.*;
import client.imple.owners.Owner;
import client.imple.patients.*;
import client.imple.personal.Doctor;
import client.imple.personal.Nurse;
import pharmacy.Medicine;
import pharmacy.Medicine2;
import pharmacy.MedicineComponent;
import pharmacy.imple.Azitromid;
import pharmacy.imple.Peniciline;
import pharmacy.imple.Vetbicid;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        //Создание персонала
//        Doctor doc = new Doctor();
//        Doctor doc2 = new Doctor("Врач", "Джеймс Хэриот", LocalDate.of(1921, 5, 14),
//                                "Йоркшир", "Ассистент", LocalDate.of(1939, 5, 30));
//        Nurse nurse = new Nurse("Сестра", "миссис Холл", LocalDate.of(1912, 1, 16),
//                                "Йоркшир", "Экономка", LocalDate.of(1940, 6, 18));
//        //Создание пациентов
//        Swift swift = new Swift("Тейлоу", 3, LocalDate.of(2012, 7, 18), new Owner(), "Летает слишком быстро");
//        Seal seal = new Seal("Сил", 15, LocalDate.of(1936, 8, 21), new Owner(), "Дискинеия задних конечностей");
//        Cat cat = new Cat("Кот", 5, LocalDate.of(2022, 11, 23), new Owner(), "Опупение 5 степени");
//        Duck duck = new Duck("Псайдак", 4, LocalDate.of(2020, 6, 22), new Owner(), "Не болит голова");
//        FlyingFish flyingFish = new FlyingFish("Летучка", 1, LocalDate.of(2023, 1, 30), new  Owner(), "Не может приводниться");
//        Straus straus = new Straus("Дудорио", 82, LocalDate.of(2019, 04, 6), new Owner(), "Не могут сооброзить на троих");
//        //Создание клиники и наполнение песоналом
//        VeterinaryClinic clinic = new VeterinaryClinic();
//        clinic.toHire(doc);
//        clinic.toHire(doc2);
//        clinic.toHire(nurse);
//        //Наполнение пациентами
//        clinic.toAccept(swift);
//        clinic.toAccept(seal);
//        clinic.toAccept(cat);
//        clinic.toAccept(duck);
//        clinic.toAccept(flyingFish);
//        clinic.toAccept(straus);
//        //Список персонала
//        System.out.println("Персонал:");
//        for (int i = 0; i < clinic.personals.size(); i++) {
//            System.out.println(clinic.personals.get(i));
//        }
//        clinic.toFire(); //Уволить персонал
//        System.out.println();
//        //Список пациентов
//        System.out.println("Пациенты:");
//        for (int i = 0; i < clinic.patients.size(); i++) {
//            System.out.println(clinic.patients.get(i));
//        }
//        clinic.toDischarge(); //Выписать пациента
//        //Списки пациентов по способностям
//        clinic.sweeming();
//        clinic.going();
//        clinic.flying();
        ArrayList<MedicineComponent> medList = new ArrayList<>();
        MedicineComponent azit = new Azitromid("Азитромид", 1, 70);
        MedicineComponent pen = new Peniciline("Пеницилин", 500, 100);
        MedicineComponent ved = new Vetbicid("Ветбицид", 10, 50);
        Medicine2 medicine1 = new Medicine2();
        medicine1.addComponent(azit).addComponent(pen).addComponent(ved);
//        for (MedicineComponent component : medicine1) {
//
//        }
//        Iterator<MedicineComponent> med = medicine1;
//        while ((medicine1.hasNext())){
//            System.out.println(med.next());
//        }
//        for (MedicineComponent component: medicine1) {
//            System.out.println(component);
//
//        }
        medList.add(azit);
        medList.add(pen);
        medList.add(ved);
        System.out.println(medList);
        Collections.sort(medList, (comp1, comp2) -> (int)(comp1.getWeight() - comp2.getWeight()));
        System.out.println(medList);


    }
}