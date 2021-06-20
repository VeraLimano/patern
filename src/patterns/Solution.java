package patterns;

import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Solution {

    public static void main(String[] args) {

        UnaryOperator<Integer> square = x -> x*x;
        System.out.println(square.apply(9));
        System.out.println(square.apply(40));

        Consumer<String> name = x -> System.out.println("Hi " + x + "!");
        name.accept("Masha");
        name.accept("Natasha");

        Car audi = new Audi();
        audi.drive();

        Factory factory = new Factory();
        Car bmw = factory.create("BMW");
        bmw.drive();
    }
}

interface Car {
    void drive();
}

class Audi implements Car {
    @Override
    public void drive() {
        System.out.println("drive Audi");
    }
}

class BMW implements Car {
    @Override
    public void drive() {
        System.out.println("drive BMW");
    }
}

class Factory {
    public Car create(String typeOfCar) {
        switch (typeOfCar) {
            case "Audi" : return new Audi();
            case "BMW" : return new BMW();
            default : return null;
        }
    }
}