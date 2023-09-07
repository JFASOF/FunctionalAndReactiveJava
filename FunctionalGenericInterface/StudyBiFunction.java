package FunctionalGenericInterface;

import java.lang.reflect.Proxy;
import java.util.function.BiFunction;
import java.util.function.Function;

public class StudyBiFunction {
    public static void main(String[] args) {
        BiFunction<String, String, String> biFunction = (a, b) -> (a + " " + b);
        System.out.println(biFunction.apply("Merhaba", "Dünya"));
        Double sum = 0.0;
        BiFunction<Rectangle, Square, Double> biFunction2 = (r, s) -> r.getArea(5, 10) + s.getArea(5);
        //System.out.println(biFunction2.apply(Rectangle::new, Square::new));

    }
}

class Rectangle {
    private double height;
    private double width;

    public Rectangle() {
        super();
    }

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    protected double getArea(double height, double width) {
        return height * width;
    }
}

class Square {
    private double edge;

    public Square() {
        super();
    }

    public Square(double edge) {
        this.edge = edge;
    }

    protected double getArea(double edge) {
        return Math.pow(edge, 2);
    }
}