package client.interfaces.forPersonal;

public interface Cearable {
    void care();
    default void action(){
        System.out.println("кормлю кроликов");
    }
}
