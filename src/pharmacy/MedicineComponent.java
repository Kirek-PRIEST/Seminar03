package pharmacy;

public abstract class MedicineComponent implements Comparable<MedicineComponent>{
    protected   String name;
    protected   float weight;
    protected int power;

    public MedicineComponent(String name, float weight, int power) {
        this.name = name;
        this.weight = weight;
        this.power = power;
    }

    @Override
    public String toString() {
        return "MedicineComponent{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", power=" + power +
                '}';
    }

    public float getWeight() {
        return weight;
    }
    public int getPower(){
        return power;
    }

    @Override
    public int compareTo(MedicineComponent o) {
        //return name.compareTo(o.name);
        return power - o.power;
    }
}

