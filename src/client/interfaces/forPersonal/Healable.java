package client.interfaces.forPersonal;

public interface Healable {
    void heal();
    default void action (){
        System.out.println("Удаляю аппендикс");
    }
}
