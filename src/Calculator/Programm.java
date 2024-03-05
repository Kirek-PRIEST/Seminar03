package Calculator;

import java.util.HashMap;
import java.util.Map;

public class Programm {
    public static class Main {
        public static void main(String[] args) {
            Calculator calc = new Calculator();
            System.out.println(calc.calculate("-", 2, 4));
            Foo foo = new Foo(){

                @Override
                public double plus(int a, int b) {
                    return 0;
                }

                @Override
                public double minus(int a, int b) {
                    return 0;
                }
            };
        }
    }

}

class Calculator {
    Map<String, Calculable> map = new HashMap<>();

    public Calculator() {
       fill();
    }

    private void fill(){
        map.put("+", new Addition());
        map.put("-", (args) ->  args[0] - args[1]);
        map.put("*", (args) ->  args[0] * args[1]);
//        Calculable calculable = new Calculable() {
//            @Override
//            public double calculate(String operation, double... args) {
//                return 0;
//            }
//        };
//        Calculable calculable = (operation, args) ->  map.get(operation).calculate(operation, args[0], args[1]);


    }
    public double add(double a, double b) {
    return a + b;
    }
    public double subtract(double a, double b) {
    return a - b;
    }
    public double mult( double a, double b){
        return a * b;
    }
    public double calculate (String operator, double a, double b){
        return  map.get(operator).calculate(a, b);
    }
}
class Addition implements Calculable{

    @Override
    public double calculate(double... args) {
        if (args.length < 2){
            throw new RuntimeException("Мало аргументов");
        }
        return args[0] + args[1];
    }
}
interface Calculable {
    double calculate(double ... args);
}
interface Foo{
    double plus(int a, int b);
    double minus (int a, int b);
}