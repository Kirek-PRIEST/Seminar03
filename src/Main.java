import pharmacy.Medicine;
import pharmacy.Medicine2;
import pharmacy.MedicineComponent;
import pharmacy.imple.Azitromid;
import pharmacy.imple.Peniciline;
import pharmacy.imple.Vetbicid;

import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        MedicineComponent azit = new Azitromid("Азитромид", 1, 70);
        MedicineComponent pen = new Peniciline("Пеницилин", 500, 100);
        MedicineComponent ved = new Vetbicid("Ветбицид", 10, 50);
        MedicineComponent ved1 = new Vetbicid("Ветбицид", 5, 50);
//        Medicine2 medicine1 = new Medicine2();
//        medicine1.addComponent(azit).addComponent(pen).addComponent(ved);
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


//        for (MedicineComponent component : medList) {
//            System.out.println(component);
//        }
//        System.out.println();

//        Collections.sort(medList, (comp1, comp2) -> (int)(comp1.getPower() - comp2.getPower()));
//        System.out.println(medList);
        Medicine2 medicine1 = new Medicine2();
        Medicine2 medicine = new Medicine2();
        Medicine2 medicine2 = new Medicine2();

        medicine1.addComponent(azit).addComponent(ved).addComponent(pen).addComponent(ved1);
        medicine.addComponent(azit).addComponent(azit).addComponent(azit).addComponent(azit);
        medicine2.addComponent(ved).addComponent(ved).addComponent(ved1).addComponent(ved1);
        ArrayList<Medicine2> med = new ArrayList<>();
        med.add(medicine2);
        med.add(medicine1);
        med.add(medicine);
        for (Medicine2 medicineComponents : med) {
            System.out.println(medicineComponents.getWeight());
            for (MedicineComponent component : medicineComponents) {
                System.out.println(component);
            }
            System.out.println();
        }
        Collections.sort(med);
        System.out.println("После сортировки");
        for (Medicine2 medicineComponents : med){
            System.out.println(medicineComponents.getWeight());
            for (MedicineComponent component : medicineComponents) {
                System.out.println(component);
            }
        }
        System.out.println(med);
    }
}