package sk.it.second_type;

import java.util.function.BiFunction;

public class Example {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Double> function = MyClass::calculateDiagonal;
        double diagonal = function.apply(8,7);
        System.out.println("Diagonal is " + diagonal);
    }
}
